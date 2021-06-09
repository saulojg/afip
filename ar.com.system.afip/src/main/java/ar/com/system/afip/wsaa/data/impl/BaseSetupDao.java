package ar.com.system.afip.wsaa.data.impl;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import ar.com.system.afip.wsaa.business.api.Service;
import ar.com.system.afip.wsaa.data.api.SetupDao;

abstract class BaseSetupDao implements SetupDao {
	Service billingService;
	
	public BaseSetupDao(Service billingService) {
		checkNotNull(billingService);
		// Orbital
		//checkArgument(billingService == Service.WSFE || billingService == Service.WSMTXCA,
		checkArgument(billingService == Service.WSFE || billingService == Service.WSMTXCA || billingService == Service.WSFEX,
				"Invalid billing service: %s", billingService);
		this.billingService = billingService;
	}

}
