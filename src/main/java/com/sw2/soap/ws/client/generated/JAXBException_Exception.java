
package com.sw2.soap.ws.client.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "JAXBException", targetNamespace = "http://soap.sw2.com/")
public class JAXBException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private JAXBException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public JAXBException_Exception(String message, JAXBException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public JAXBException_Exception(String message, JAXBException faultInfo, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sw2.soap.ws.client.generated.JAXBException
     */
    public JAXBException getFaultInfo() {
        return faultInfo;
    }

}