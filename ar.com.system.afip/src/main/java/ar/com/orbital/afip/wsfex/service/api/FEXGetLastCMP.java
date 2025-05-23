
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
 *         &lt;element name="Auth" type="{http://ar.gov.afip.dif.fexv1/}ClsFEX_LastCMP" minOccurs="0"/>
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
    "auth"
})
@XmlRootElement(name = "FEXGetLast_CMP")
public class FEXGetLastCMP {

    @XmlElement(name = "Auth")
    protected ClsFEXLastCMP auth;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link ClsFEXLastCMP }
     *     
     */
    public ClsFEXLastCMP getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsFEXLastCMP }
     *     
     */
    public void setAuth(ClsFEXLastCMP value) {
        this.auth = value;
    }

}
