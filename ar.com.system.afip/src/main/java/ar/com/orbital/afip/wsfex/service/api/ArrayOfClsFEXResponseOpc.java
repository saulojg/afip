
package ar.com.orbital.afip.wsfex.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsFEXResponse_Opc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsFEXResponse_Opc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsFEXResponse_Opc" type="{http://ar.gov.afip.dif.fexv1/}ClsFEXResponse_Opc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsFEXResponse_Opc", propOrder = {
    "clsFEXResponseOpc"
})
public class ArrayOfClsFEXResponseOpc {

    @XmlElement(name = "ClsFEXResponse_Opc", nillable = true)
    protected List<ClsFEXResponseOpc> clsFEXResponseOpc;

    /**
     * Gets the value of the clsFEXResponseOpc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsFEXResponseOpc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsFEXResponseOpc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsFEXResponseOpc }
     * 
     * 
     */
    public List<ClsFEXResponseOpc> getClsFEXResponseOpc() {
        if (clsFEXResponseOpc == null) {
            clsFEXResponseOpc = new ArrayList<ClsFEXResponseOpc>();
        }
        return this.clsFEXResponseOpc;
    }

}
