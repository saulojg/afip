
package ar.com.orbital.afip.wsfex.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEXGetPARAM_MON_CON_COTIZACIONResult" type="{http://ar.gov.afip.dif.fexv1/}FEXResponse_Mon_CON_COTIZACION" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fexGetPARAMMONCONCOTIZACIONResult"
})
@XmlRootElement(name = "FEXGetPARAM_MON_CON_COTIZACIONResponse")
public class FEXGetPARAMMONCONCOTIZACIONResponse {

    @XmlElement(name = "FEXGetPARAM_MON_CON_COTIZACIONResult")
    protected FEXResponseMonCONCOTIZACION fexGetPARAMMONCONCOTIZACIONResult;

    /**
     * Gets the value of the fexGetPARAMMONCONCOTIZACIONResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXResponseMonCONCOTIZACION }
     *     
     */
    public FEXResponseMonCONCOTIZACION getFEXGetPARAMMONCONCOTIZACIONResult() {
        return fexGetPARAMMONCONCOTIZACIONResult;
    }

    /**
     * Sets the value of the fexGetPARAMMONCONCOTIZACIONResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXResponseMonCONCOTIZACION }
     *     
     */
    public void setFEXGetPARAMMONCONCOTIZACIONResult(FEXResponseMonCONCOTIZACION value) {
        this.fexGetPARAMMONCONCOTIZACIONResult = value;
    }

}
