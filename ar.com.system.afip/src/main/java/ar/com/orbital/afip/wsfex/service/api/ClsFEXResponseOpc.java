
package ar.com.orbital.afip.wsfex.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXResponse_Opc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXResponse_Opc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Opc_Id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Opc_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opc_vig_desde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Opc_vig_hasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXResponse_Opc", propOrder = {
    "opcId",
    "opcDs",
    "opcVigDesde",
    "opcVigHasta"
})
public class ClsFEXResponseOpc {

    @XmlElement(name = "Opc_Id")
    protected short opcId;
    @XmlElement(name = "Opc_Ds")
    protected String opcDs;
    @XmlElement(name = "Opc_vig_desde")
    protected String opcVigDesde;
    @XmlElement(name = "Opc_vig_hasta")
    protected String opcVigHasta;

    /**
     * Gets the value of the opcId property.
     * 
     */
    public short getOpcId() {
        return opcId;
    }

    /**
     * Sets the value of the opcId property.
     * 
     */
    public void setOpcId(short value) {
        this.opcId = value;
    }

    /**
     * Gets the value of the opcDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcDs() {
        return opcDs;
    }

    /**
     * Sets the value of the opcDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcDs(String value) {
        this.opcDs = value;
    }

    /**
     * Gets the value of the opcVigDesde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcVigDesde() {
        return opcVigDesde;
    }

    /**
     * Sets the value of the opcVigDesde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcVigDesde(String value) {
        this.opcVigDesde = value;
    }

    /**
     * Gets the value of the opcVigHasta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcVigHasta() {
        return opcVigHasta;
    }

    /**
     * Sets the value of the opcVigHasta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcVigHasta(String value) {
        this.opcVigHasta = value;
    }

}
