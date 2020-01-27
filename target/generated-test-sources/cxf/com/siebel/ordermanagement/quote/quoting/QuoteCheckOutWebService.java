package com.siebel.ordermanagement.quote.quoting;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-24T13:42:48.866+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "QuoteCheckOutWebService",
                  wsdlLocation = "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/QuoteCheckOutWebService.WSDL",
                  targetNamespace = "http://siebel.com/OrderManagement/Quote/Quoting")
public class QuoteCheckOutWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/OrderManagement/Quote/Quoting", "QuoteCheckOutWebService");
    public final static QName QuoteCheckOutPort = new QName("http://siebel.com/OrderManagement/Quote/Quoting", "QuoteCheckOutPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/QuoteCheckOutWebService.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QuoteCheckOutWebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/QuoteCheckOutWebService.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public QuoteCheckOutWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QuoteCheckOutWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QuoteCheckOutWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public QuoteCheckOutWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public QuoteCheckOutWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public QuoteCheckOutWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns QuoteCheckOutPort
     */
    @WebEndpoint(name = "QuoteCheckOutPort")
    public QuoteCheckOutPort getQuoteCheckOutPort() {
        return super.getPort(QuoteCheckOutPort, QuoteCheckOutPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuoteCheckOutPort
     */
    @WebEndpoint(name = "QuoteCheckOutPort")
    public QuoteCheckOutPort getQuoteCheckOutPort(WebServiceFeature... features) {
        return super.getPort(QuoteCheckOutPort, QuoteCheckOutPort.class, features);
    }

}