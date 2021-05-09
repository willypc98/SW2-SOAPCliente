
package com.sw2.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para exportarMarca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="exportarMarca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportarMarca", propOrder = {
    "nombreMarca"
})
public class ExportarMarca {

    protected String nombreMarca;

    /**
     * Obtiene el valor de la propiedad nombreMarca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMarca() {
        return nombreMarca;
    }

    /**
     * Define el valor de la propiedad nombreMarca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMarca(String value) {
        this.nombreMarca = value;
    }

}
