package ar.com.orbital.afip.wsfex.business.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import ar.com.orbital.afip.wsfex.business.api.WsfexManager;
import ar.com.orbital.afip.wsfex.service.api.ClsFEXAuthRequest;
import ar.com.orbital.afip.wsfex.service.api.ClsFEXErr;
import ar.com.orbital.afip.wsfex.service.api.ClsFEXGetCMP;
import ar.com.orbital.afip.wsfex.service.api.ClsFEXLastCMP;
import ar.com.orbital.afip.wsfex.service.api.ClsFEXRequest;
import ar.com.orbital.afip.wsfex.service.api.FEXGetCMPResponse2;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseAuthorize;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseLastCMP;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseLastID;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseUmed;
import ar.com.orbital.afip.wsfex.service.api.ServiceSoap;
import ar.com.system.afip.wsaa.business.api.CredentialsException;
import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.business.api.WsaaTemplate;
import ar.com.system.afip.wsaa.data.api.WsaaDao;
import ar.com.system.afip.wsfe.business.impl.WsfeException;
import ar.com.system.afip.wsfe.service.api.WsfeError;

public class WsfexManagerImpl implements WsfexManager {
	private static final int CREDENTIALS_ERROR_CODE = 600;
    private final WsaaTemplate wsaaTemplate;
    private final ServiceSoap serviceSoap;
    private final String cuit;

    @Inject
    public WsfexManagerImpl(@Nonnull WsaaTemplate.Factory wsaaTemplateFacory,
                            @Nonnull ServiceSoap serviceSoap,
                            @Nonnull WsaaDao wsaaDao) {
        this.wsaaTemplate = checkNotNull(wsaaTemplateFacory)
                .create(Service.WSFEX);
        this.serviceSoap = checkNotNull(serviceSoap);
        this.cuit = checkNotNull(wsaaDao)
                .loadActiveCompanyInfo()
                .getCuit();
    }

    @Override
    public FEXResponseAuthorize fexAuthorize(ClsFEXRequest cmp) {
        return wsaaTemplate.runAuhtenticated(credentials -> {
        	ClsFEXAuthRequest auth = new ClsFEXAuthRequest();
        	auth.setToken(credentials.getToken());
        	auth.setSign(credentials.getSign());
        	auth.setCuit(Long.parseLong(cuit));

        	FEXResponseAuthorize result = serviceSoap.fexAuthorize(auth, cmp);
        	checkError(result.getFEXErr());

        	return result;
        });
    }

    @Override
    public FEXGetCMPResponse2 fexGetCMP(ClsFEXGetCMP cmp) {
        return wsaaTemplate.runAuhtenticated(credentials -> {
        	ClsFEXAuthRequest auth = new ClsFEXAuthRequest();
        	auth.setToken(credentials.getToken());
        	auth.setSign(credentials.getSign());
        	auth.setCuit(Long.parseLong(cuit));

        	FEXGetCMPResponse2 result = serviceSoap.fexGetCMP(auth, cmp);
        	checkError(result.getFEXErr());

        	return result;
        });
    }

    @Override
    public FEXResponseLastID fexGetLastID() {
        return wsaaTemplate.runAuhtenticated(credentials -> {
        	ClsFEXAuthRequest auth = new ClsFEXAuthRequest();
        	auth.setToken(credentials.getToken());
        	auth.setSign(credentials.getSign());
        	auth.setCuit(Long.parseLong(cuit));

        	FEXResponseLastID result = serviceSoap.fexGetLastID(auth);
        	checkError(result.getFEXErr());

        	return result;
        });
    }

    @Override
    public FEXResponseLastCMP fexGetLastCMP(int ptoVenta, short cbteTipo) {
        return wsaaTemplate.runAuhtenticated(credentials -> {
        	ClsFEXLastCMP auth = new ClsFEXLastCMP();
        	auth.setToken(credentials.getToken());
        	auth.setSign(credentials.getSign());
        	auth.setCuit(Long.parseLong(cuit));
        	auth.setPtoVenta(ptoVenta);
        	auth.setCbteTipo(cbteTipo);

        	FEXResponseLastCMP result = serviceSoap.fexGetLastCMP(auth);
        	checkError(result.getFEXErr());

        	return result;
        });
    }

    @Override
    public FEXResponseUmed fexGetPARAMUMed() {
        return wsaaTemplate.runAuhtenticated(credentials -> {
        	ClsFEXAuthRequest auth = new ClsFEXAuthRequest();
        	auth.setToken(credentials.getToken());
        	auth.setSign(credentials.getSign());
        	auth.setCuit(Long.parseLong(cuit));

        	FEXResponseUmed result = serviceSoap.fexGetPARAMUMed(auth);
        	checkError(result.getFEXErr());

        	return result;
        });
    }

    private void checkError(ClsFEXErr responseError) {
        checkResponseError(responseError);
    }

    private static void checkResponseError(ClsFEXErr responseError) {
        throwError(getError(responseError));
    }

    private static void throwError(WsfeError error) {
        if (error != null) {
            if (error.getCode() == CREDENTIALS_ERROR_CODE) {
            	throw new CredentialsException(Service.WSFE
            			+ " - "
            			+ error.getCode()
            			+ " - "
            			+ error.getMsg());
            }

            List<WsfeError> errors = new ArrayList<>();
            errors.add(error);
            throw new WsfeException(errors);
        }
    }

    private static WsfeError getError(ClsFEXErr responseError) {
        if ((responseError != null) && (responseError.getErrCode() != 0)) {
            return new WsfeError() {
				@Override
				public String getMsg() {
					return responseError.getErrMsg();
				}
				
				@Override
				public int getCode() {
					return responseError.getErrCode();
				}
			};
        } else {
            return null;
        }
    }
}