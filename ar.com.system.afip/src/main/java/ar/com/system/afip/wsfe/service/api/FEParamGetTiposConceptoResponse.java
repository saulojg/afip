package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FEParamGetTiposConceptoResult" type="{http://ar.gov.afip.dif.FEV1/}ConceptoTipoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"feParamGetTiposConceptoResult"})
@XmlRootElement(name = "FEParamGetTiposConceptoResponse")
public class FEParamGetTiposConceptoResponse {
    @XmlElement(name = "FEParamGetTiposConceptoResult")
    @Element(name = "FEParamGetTiposConceptoResult")
    protected ConceptoTipoResponse feParamGetTiposConceptoResult;

    /**
     * Obtiene el valor de la propiedad feParamGetTiposConceptoResult.
     *
     * @return possible object is {@link ConceptoTipoResponse }
     */
    public ConceptoTipoResponse getFEParamGetTiposConceptoResult() {
        return feParamGetTiposConceptoResult;
    }

    /**
     * Define el valor de la propiedad feParamGetTiposConceptoResult.
     *
     * @param value allowed object is {@link ConceptoTipoResponse }
     */
    public void setFEParamGetTiposConceptoResult(ConceptoTipoResponse value) {
        this.feParamGetTiposConceptoResult = value;
    }

}