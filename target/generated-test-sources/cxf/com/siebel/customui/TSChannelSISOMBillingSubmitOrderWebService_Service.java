package com.siebel.customui;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T15:39:19.764+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "TSChannelSISOMBillingSubmitOrderWebService",
                  wsdlLocation = "file:/C:/Siebel_20.1/fixed-testframework/siebel-api-test/src/test/resources/wsdlfiles/TSChannelSISOMBillingSubmitOrderWebService_v2.2.WSDL",
                  targetNamespace = "http://siebel.com/CustomUI")
public class TSChannelSISOMBillingSubmitOrderWebService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/CustomUI", "TSChannelSISOMBillingSubmitOrderWebService");
    public final static QName TSChannelSISOMBillingSubmitOrderWebService = new QName("http://siebel.com/CustomUI", "TSChannelSISOMBillingSubmitOrderWebService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Siebel_20.1/fixed-testframework/siebel-api-test/src/test/resources/wsdlfiles/TSChannelSISOMBillingSubmitOrderWebService_v2.2.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TSChannelSISOMBillingSubmitOrderWebService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Siebel_20.1/fixed-testframework/siebel-api-test/src/test/resources/wsdlfiles/TSChannelSISOMBillingSubmitOrderWebService_v2.2.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public TSChannelSISOMBillingSubmitOrderWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TSChannelSISOMBillingSubmitOrderWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TSChannelSISOMBillingSubmitOrderWebService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TSChannelSISOMBillingSubmitOrderWebService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TSChannelSISOMBillingSubmitOrderWebService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TSChannelSISOMBillingSubmitOrderWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TSChannelSISOMBillingSubmitOrderWebService
     */
    @WebEndpoint(name = "TSChannelSISOMBillingSubmitOrderWebService")
    public TSChannelSISOMBillingSubmitOrderWebService getTSChannelSISOMBillingSubmitOrderWebService() {
        return super.getPort(TSChannelSISOMBillingSubmitOrderWebService, TSChannelSISOMBillingSubmitOrderWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TSChannelSISOMBillingSubmitOrderWebService
     */
    @WebEndpoint(name = "TSChannelSISOMBillingSubmitOrderWebService")
    public TSChannelSISOMBillingSubmitOrderWebService getTSChannelSISOMBillingSubmitOrderWebService(WebServiceFeature... features) {
        return super.getPort(TSChannelSISOMBillingSubmitOrderWebService, TSChannelSISOMBillingSubmitOrderWebService.class, features);
    }

}
