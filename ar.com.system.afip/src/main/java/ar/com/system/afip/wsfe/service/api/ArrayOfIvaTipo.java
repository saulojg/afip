package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.ElementList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Clase Java para ArrayOfIvaTipo complex type.
 *
 *
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="ArrayOfIvaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IvaTipo" type="{http://ar.gov.afip.dif.FEV1/}IvaTipo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIvaTipo", propOrder = {"ivaTipo"})
public class ArrayOfIvaTipo {
    @XmlElement(name = "IvaTipo", nillable = true)
    @ElementList(name = "IvaTipos", entry = "IvaTipo", type = IvaTipo.class, inline = true)
    protected List<IvaTipo> ivaTipo;

    /**
     * Gets the value of the ivaTipo property.
     *
     *
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the ivaTipo property.
     *
     *
     * For example, to add a new item, do as follows:
     *
     * <pre>
     * getIvaTipo().add(newItem);
     * </pre>
     *
     *
     *
     * Objects of the following type(s) are allowed in the list {@link IvaTipo }
     */
    public List<IvaTipo> getIvaTipo() {
        if (ivaTipo == null) {
            ivaTipo = new ArrayList<IvaTipo>();
        }
        return this.ivaTipo;
    }

}
