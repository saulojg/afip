package ar.com.orbital.afip.jre.wsfex.service;

import static com.google.common.base.Preconditions.checkNotNull;

import java.net.MalformedURLException;
import java.net.URL;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ar.com.orbital.afip.wsfex.service.api.ServiceSoap;
import ar.com.system.afip.wsaa.data.api.SetupDao;

import com.google.common.base.Throwables;

public class ServiceSoapProvider implements Provider<ServiceSoap> {
	private final SetupDao setupDao;

	@Inject
	public ServiceSoapProvider(SetupDao setupDao) {
		this.setupDao = checkNotNull(setupDao);
	}

	@SuppressWarnings("deprecation")
	@Override
	public ServiceSoap get() {
		try {
			String SERVICE_NAMESPACE = "http://ar.gov.afip.dif.fexv1/";
			String SERVICE_NAME = "Service";
			String PORT_NAME = "ServiceSoap";

			Service service = Service.create(new URL(setupDao.readSetup()
					.geBillingWsdl()), new QName(SERVICE_NAMESPACE,
					SERVICE_NAME));
			return service.getPort(new QName(SERVICE_NAMESPACE,
					PORT_NAME), ServiceSoap.class);
		} catch (MalformedURLException e) {
			throw Throwables.propagate(e);
		}
	}
}
