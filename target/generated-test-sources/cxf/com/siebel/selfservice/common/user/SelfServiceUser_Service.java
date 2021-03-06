package com.siebel.selfservice.common.user;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-27T16:36:01.429+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "SelfServiceUser",
                  wsdlLocation = "file:/C:/Siebel_20.1/telia-automation-framework/siebel-api-test/src/test/resources/wsdlfiles/SelfServiceUser_v1.4.WSDL",
                  targetNamespace = "http://siebel.com/SelfService/Common/User")
public class SelfServiceUser_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/SelfService/Common/User", "SelfServiceUser");
    public final static QName SelfServiceUser = new QName("http://siebel.com/SelfService/Common/User", "SelfServiceUser");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Siebel_20.1/telia-automation-framework/siebel-api-test/src/test/resources/wsdlfiles/SelfServiceUser_v1.4.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SelfServiceUser_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Siebel_20.1/telia-automation-framework/siebel-api-test/src/test/resources/wsdlfiles/SelfServiceUser_v1.4.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public SelfServiceUser_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SelfServiceUser_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SelfServiceUser_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SelfServiceUser_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SelfServiceUser_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SelfServiceUser_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SelfServiceUser
     */
    @WebEndpoint(name = "SelfServiceUser")
    public SelfServiceUser getSelfServiceUser() {
        return super.getPort(SelfServiceUser, SelfServiceUser.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SelfServiceUser
     */
    @WebEndpoint(name = "SelfServiceUser")
    public SelfServiceUser getSelfServiceUser(WebServiceFeature... features) {
        return super.getPort(SelfServiceUser, SelfServiceUser.class, features);
    }

}
