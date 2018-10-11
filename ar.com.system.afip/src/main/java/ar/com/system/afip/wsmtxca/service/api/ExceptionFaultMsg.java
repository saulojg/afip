
package ar.com.system.afip.wsmtxca.service.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "exceptionResponse", targetNamespace = "http://impl.service.wsmtxca.afip.gov.ar/service/")
public class ExceptionFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ExceptionResponseType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ExceptionFaultMsg(String message, ExceptionResponseType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ExceptionFaultMsg(String message, ExceptionResponseType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ar.gov.afip.wsmtxca.service.impl.service.ExceptionResponseType
     */
    public ExceptionResponseType getFaultInfo() {
        return faultInfo;
    }

}