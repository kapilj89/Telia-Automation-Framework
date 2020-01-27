package com.siebel.ordermanagement.quote;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T15:39:17.115+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "QuoteAddItemsWS",
                  wsdlLocation = "file:/C:/Siebel_20.1/fixed-testframework/siebel-api-test/src/test/resources/wsdlfiles/QuoteAddItemsWS.WSDL",
                  targetNamespace = "http://siebel.com/OrderManagement/Quote")
public class QuoteAddItemsWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/OrderManagement/Quote", "QuoteAddItemsWS");
    public final static QName QuoteAddItemsPort = new QName("http://siebel.com/OrderManagement/Quote", "QuoteAddItemsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Siebel_20.1/fixed-testframework/siebel-api-test/src/test/resources/wsdlfiles/QuoteAddItemsWS.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QuoteAddItemsWS.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Siebel_20.1/fixed-testframework/siebel-api-test/src/test/resources/wsdlfiles/QuoteAddItemsWS.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public QuoteAddItemsWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QuoteAddItemsWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QuoteAddItemsWS() {
        super(WSDL_LOCATION, SERVICE);
    }

    public QuoteAddItemsWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public QuoteAddItemsWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public QuoteAddItemsWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns QuoteAddItemsPort
     */
    @WebEndpoint(name = "QuoteAddItemsPort")
    public QuoteAddItemsPort getQuoteAddItemsPort() {
        return super.getPort(QuoteAddItemsPort, QuoteAddItemsPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QuoteAddItemsPort
     */
    @WebEndpoint(name = "QuoteAddItemsPort")
    public QuoteAddItemsPort getQuoteAddItemsPort(WebServiceFeature... features) {
        return super.getPort(QuoteAddItemsPort, QuoteAddItemsPort.class, features);
    }

}
