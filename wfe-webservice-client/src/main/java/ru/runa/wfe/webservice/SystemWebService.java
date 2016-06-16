
package ru.runa.wfe.webservice;

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
 * JAX-WS RI 2.2-12/14/2009 02:16 PM(ramkris)-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SystemWebService", targetNamespace = "http://impl.service.wfe.runa.ru/", wsdlLocation = "http://localhost:8080/wfe-service-4.3.0-SNAPSHOT/SystemWebService/SystemAPI?wsdl")
public class SystemWebService
    extends Service
{

    private final static URL SYSTEMWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException SYSTEMWEBSERVICE_EXCEPTION;
    private final static QName SYSTEMWEBSERVICE_QNAME = new QName("http://impl.service.wfe.runa.ru/", "SystemWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wfe-service-4.3.0-SNAPSHOT/SystemWebService/SystemAPI?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SYSTEMWEBSERVICE_WSDL_LOCATION = url;
        SYSTEMWEBSERVICE_EXCEPTION = e;
    }

    public SystemWebService() {
        super(__getWsdlLocation(), SYSTEMWEBSERVICE_QNAME);
    }

    public SystemWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SYSTEMWEBSERVICE_QNAME, features);
    }

    public SystemWebService(URL wsdlLocation) {
        super(wsdlLocation, SYSTEMWEBSERVICE_QNAME);
    }

    public SystemWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SYSTEMWEBSERVICE_QNAME, features);
    }

    public SystemWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SystemWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SystemAPI
     */
    @WebEndpoint(name = "SystemAPIPort")
    public SystemAPI getSystemAPIPort() {
        return super.getPort(new QName("http://impl.service.wfe.runa.ru/", "SystemAPIPort"), SystemAPI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SystemAPI
     */
    @WebEndpoint(name = "SystemAPIPort")
    public SystemAPI getSystemAPIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.wfe.runa.ru/", "SystemAPIPort"), SystemAPI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SYSTEMWEBSERVICE_EXCEPTION!= null) {
            throw SYSTEMWEBSERVICE_EXCEPTION;
        }
        return SYSTEMWEBSERVICE_WSDL_LOCATION;
    }

}
