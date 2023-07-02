
package MyPersonService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "MyPersonService.PersonService", targetNamespace = "http://MyPersonService/", wsdlLocation = "file:/C:/Users/Hien/IdeaProjects/jaxws1_top_down/src/main/resources/personservice.wsdl")
public class MyPersonServicePersonService
    extends Service
{

    private final static URL MYPERSONSERVICEPERSONSERVICE_WSDL_LOCATION;
    private final static WebServiceException MYPERSONSERVICEPERSONSERVICE_EXCEPTION;
    private final static QName MYPERSONSERVICEPERSONSERVICE_QNAME = new QName("http://MyPersonService/", "MyPersonService.PersonService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Hien/IdeaProjects/jaxws1_top_down/src/main/resources/personservice.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYPERSONSERVICEPERSONSERVICE_WSDL_LOCATION = url;
        MYPERSONSERVICEPERSONSERVICE_EXCEPTION = e;
    }

    public MyPersonServicePersonService() {
        super(__getWsdlLocation(), MYPERSONSERVICEPERSONSERVICE_QNAME);
    }

    public MyPersonServicePersonService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYPERSONSERVICEPERSONSERVICE_QNAME, features);
    }

    public MyPersonServicePersonService(URL wsdlLocation) {
        super(wsdlLocation, MYPERSONSERVICEPERSONSERVICE_QNAME);
    }

    public MyPersonServicePersonService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYPERSONSERVICEPERSONSERVICE_QNAME, features);
    }

    public MyPersonServicePersonService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyPersonServicePersonService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServiceImplPort")
    public PersonService getPersonServiceImplPort() {
        return super.getPort(new QName("http://MyPersonService/", "PersonServiceImplPort"), PersonService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServiceImplPort")
    public PersonService getPersonServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://MyPersonService/", "PersonServiceImplPort"), PersonService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYPERSONSERVICEPERSONSERVICE_EXCEPTION!= null) {
            throw MYPERSONSERVICEPERSONSERVICE_EXCEPTION;
        }
        return MYPERSONSERVICEPERSONSERVICE_WSDL_LOCATION;
    }

}