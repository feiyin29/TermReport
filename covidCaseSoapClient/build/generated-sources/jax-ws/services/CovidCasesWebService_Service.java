
package services;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "covidCasesWebService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:8080/covidCaseSoapService/covidCasesWebService?WSDL")
public class CovidCasesWebService_Service
    extends Service
{

    private final static URL COVIDCASESWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException COVIDCASESWEBSERVICE_EXCEPTION;
    private final static QName COVIDCASESWEBSERVICE_QNAME = new QName("http://service/", "covidCasesWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/covidCaseSoapService/covidCasesWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COVIDCASESWEBSERVICE_WSDL_LOCATION = url;
        COVIDCASESWEBSERVICE_EXCEPTION = e;
    }

    public CovidCasesWebService_Service() {
        super(__getWsdlLocation(), COVIDCASESWEBSERVICE_QNAME);
    }

    public CovidCasesWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COVIDCASESWEBSERVICE_QNAME, features);
    }

    public CovidCasesWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, COVIDCASESWEBSERVICE_QNAME);
    }

    public CovidCasesWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COVIDCASESWEBSERVICE_QNAME, features);
    }

    public CovidCasesWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CovidCasesWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CovidCasesWebService
     */
    @WebEndpoint(name = "covidCasesWebServicePort")
    public CovidCasesWebService getCovidCasesWebServicePort() {
        return super.getPort(new QName("http://service/", "covidCasesWebServicePort"), CovidCasesWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CovidCasesWebService
     */
    @WebEndpoint(name = "covidCasesWebServicePort")
    public CovidCasesWebService getCovidCasesWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "covidCasesWebServicePort"), CovidCasesWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COVIDCASESWEBSERVICE_EXCEPTION!= null) {
            throw COVIDCASESWEBSERVICE_EXCEPTION;
        }
        return COVIDCASESWEBSERVICE_WSDL_LOCATION;
    }

}
