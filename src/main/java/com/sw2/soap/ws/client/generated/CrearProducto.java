
package com.sw2.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para crearProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="crearProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreProducto" type="{http://soap.sw2.com/}producto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crearProducto", propOrder = {
    "nombreMarca",
    "nombreProducto"
})
public class CrearProducto {

    protected String nombreMarca;
    protected Producto nombreProducto;

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

    /**
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link Producto }
     *     
     */
    public Producto getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Producto }
     *     
     */
    public void setNombreProducto(Producto value) {
        this.nombreProducto = value;
    }

}
