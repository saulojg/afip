package ar.com.system.afip.wsfe.service.api;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.*;

/**
 * <p>
 * Clase Java para FECabResponse complex type.
 * <p>
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="FECabResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cuit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PtoVta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CbteTipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FchProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CantReg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Resultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reproceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FECabResponse", propOrder = {"cuit", "ptoVta", "cbteTipo",
        "fchProceso", "cantReg", "resultado", "reproceso"})
@XmlSeeAlso({FECAECabResponse.class, FECAEACabResponse.class})
public class FECabResponse {
    @XmlElement(name = "Cuit")
    @Element(name = "Cuit")
    protected long cuit;
    @XmlElement(name = "PtoVta")
    @Element(name = "PtoVta")
    protected int ptoVta;
    @XmlElement(name = "CbteTipo")
    @Element(name = "CbteTipo")
    protected int cbteTipo;
    @XmlElement(name = "FchProceso")
    @Element(name = "FchProceso")
    protected String fchProceso;
    @XmlElement(name = "CantReg")
    @Element(name = "CantReg")
    protected int cantReg;
    @XmlElement(name = "Resultado")
    @Element(name = "Resultado")
    protected String resultado;
    @XmlElement(name = "Reproceso")
    @Element(name = "Reproceso")
    protected String reproceso;

    /**
     * Obtiene el valor de la propiedad cuit.
     */
    public long getCuit() {
        return cuit;
    }

    /**
     * Define el valor de la propiedad cuit.
     */
    public void setCuit(long value) {
        this.cuit = value;
    }

    /**
     * Obtiene el valor de la propiedad ptoVta.
     */
    public int getPtoVta() {
        return ptoVta;
    }

    /**
     * Define el valor de la propiedad ptoVta.
     */
    public void setPtoVta(int value) {
        this.ptoVta = value;
    }

    /**
     * Obtiene el valor de la propiedad cbteTipo.
     */
    public int getCbteTipo() {
        return cbteTipo;
    }

    /**
     * Define el valor de la propiedad cbteTipo.
     */
    public void setCbteTipo(int value) {
        this.cbteTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad fchProceso.
     *
     * @return possible object is {@link String }
     */
    public String getFchProceso() {
        return fchProceso;
    }

    /**
     * Define el valor de la propiedad fchProceso.
     *
     * @param value allowed object is {@link String }
     */
    public void setFchProceso(String value) {
        this.fchProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad cantReg.
     */
    public int getCantReg() {
        return cantReg;
    }

    /**
     * Define el valor de la propiedad cantReg.
     */
    public void setCantReg(int value) {
        this.cantReg = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     *
     * @return possible object is {@link String }
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     *
     * @param value allowed object is {@link String }
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad reproceso.
     *
     * @return possible object is {@link String }
     */
    public String getReproceso() {
        return reproceso;
    }

    /**
     * Define el valor de la propiedad reproceso.
     *
     * @param value allowed object is {@link String }
     */
    public void setReproceso(String value) {
        this.reproceso = value;
    }

}
