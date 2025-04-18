
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
 *         &lt;element name="FEXGetCMPResult" type="{http://ar.gov.afip.dif.fexv1/}FEXGetCMPResponse" minOccurs="0"/>
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
    "fexGetCMPResult"
})
@XmlRootElement(name = "FEXGetCMPResponse")
public class FEXGetCMPResponse {

    @XmlElement(name = "FEXGetCMPResult")
    protected FEXGetCMPResponse2 fexGetCMPResult;

    /**
     * Gets the value of the fexGetCMPResult property.
     * 
     * @return
     *     possible object is
     *     {@link FEXGetCMPResponse2 }
     *     
     */
    public FEXGetCMPResponse2 getFEXGetCMPResult() {
        return fexGetCMPResult;
    }

    /**
     * Sets the value of the fexGetCMPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEXGetCMPResponse2 }
     *     
     */
    public void setFEXGetCMPResult(FEXGetCMPResponse2 value) {
        this.fexGetCMPResult = value;
    }

}
