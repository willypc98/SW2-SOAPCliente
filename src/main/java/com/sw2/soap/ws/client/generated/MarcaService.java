
package com.sw2.soap.ws.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MarcaService", targetNamespace = "http://soap.sw2.com/", wsdlLocation = "http://localhost:8080/soap/ws/service?wsdl")
public class MarcaService
    extends Service
{

    private final static URL MARCASERVICE_WSDL_LOCATION;
    private final static WebServiceException MARCASERVICE_EXCEPTION;
    private final static QName MARCASERVICE_QNAME = new QName("http://soap.sw2.com/", "MarcaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/soap/ws/service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MARCASERVICE_WSDL_LOCATION = url;
        MARCASERVICE_EXCEPTION = e;
    }

    public MarcaService() {
        super(__getWsdlLocation(), MARCASERVICE_QNAME);
    }

    public MarcaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MARCASERVICE_QNAME, features);
    }

    public MarcaService(URL wsdlLocation) {
        super(wsdlLocation, MARCASERVICE_QNAME);
    }

    public MarcaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MARCASERVICE_QNAME, features);
    }

    public MarcaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MarcaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Servidor
     */
    @WebEndpoint(name = "ServidorPort")
    public Servidor getServidorPort() {
        return super.getPort(new QName("http://soap.sw2.com/", "ServidorPort"), Servidor.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Servidor
     */
    @WebEndpoint(name = "ServidorPort")
    public Servidor getServidorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.sw2.com/", "ServidorPort"), Servidor.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MARCASERVICE_EXCEPTION!= null) {
            throw MARCASERVICE_EXCEPTION;
        }
        return MARCASERVICE_WSDL_LOCATION;
    }

}
