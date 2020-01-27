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
 * 2020-01-27T16:36:01.616+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "TSC2BMoveOrderWebService",
                  wsdlLocation = "file:/C:/Siebel_20.1/telia-automation-framework/siebel-api-test/src/test/resources/wsdlfiles/TSC2BMoveOrderWebService.WSDL",
                  targetNamespace = "http://siebel.com/CustomUI")
public class TSC2BMoveOrderWebService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/CustomUI", "TSC2BMoveOrderWebService");
    public final static QName TSC2BMoveOrderWebService = new QName("http://siebel.com/CustomUI", "TSC2BMoveOrderWebService");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Siebel_20.1/telia-automation-framework/siebel-api-test/src/test/resources/wsdlfiles/TSC2BMoveOrderWebService.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TSC2BMoveOrderWebService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Siebel_20.1/telia-automation-framework/siebel-api-test/src/test/resources/wsdlfiles/TSC2BMoveOrderWebService.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public TSC2BMoveOrderWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TSC2BMoveOrderWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TSC2BMoveOrderWebService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TSC2BMoveOrderWebService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TSC2BMoveOrderWebService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TSC2BMoveOrderWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TSC2BMoveOrderWebService
     */
    @WebEndpoint(name = "TSC2BMoveOrderWebService")
    public TSC2BMoveOrderWebService getTSC2BMoveOrderWebService() {
        return super.getPort(TSC2BMoveOrderWebService, TSC2BMoveOrderWebService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TSC2BMoveOrderWebService
     */
    @WebEndpoint(name = "TSC2BMoveOrderWebService")
    public TSC2BMoveOrderWebService getTSC2BMoveOrderWebService(WebServiceFeature... features) {
        return super.getPort(TSC2BMoveOrderWebService, TSC2BMoveOrderWebService.class, features);
    }

}
