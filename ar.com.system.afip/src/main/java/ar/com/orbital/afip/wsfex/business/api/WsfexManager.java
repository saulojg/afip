package ar.com.orbital.afip.wsfex.business.api;

import ar.com.orbital.afip.wsfex.service.api.ClsFEXGetCMP;
import ar.com.orbital.afip.wsfex.service.api.ClsFEXRequest;
import ar.com.orbital.afip.wsfex.service.api.FEXGetCMPResponse2;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseAuthorize;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseLastCMP;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseLastID;
import ar.com.orbital.afip.wsfex.service.api.FEXResponseUmed;

public interface WsfexManager {
	FEXResponseAuthorize fexAuthorize(ClsFEXRequest cmp);
	FEXGetCMPResponse2 fexGetCMP(ClsFEXGetCMP cmp);
	FEXResponseLastID fexGetLastID();
	FEXResponseLastCMP fexGetLastCMP(int ptoVenta, short cbteTipo);
	FEXResponseUmed fexGetPARAMUMed();
}