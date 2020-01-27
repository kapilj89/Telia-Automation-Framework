package com.siebel.ordermanagement.order;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-24T13:42:46.389+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "OrderWebService",
                  wsdlLocation = "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/OrderWebService_v2.7.WSDL",
                  targetNamespace = "http://siebel.com/OrderManagement/Order")
public class OrderWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/OrderManagement/Order", "OrderWebService");
    public final static QName OrderPort = new QName("http://siebel.com/OrderManagement/Order", "OrderPort");
    public final static QName OrderItemPort = new QName("http://siebel.com/OrderManagement/Order", "OrderItemPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/OrderWebService_v2.7.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderWebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/OrderWebService_v2.7.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public OrderWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OrderWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns OrderPort
     */
    @WebEndpoint(name = "OrderPort")
    public OrderPort getOrderPort() {
        return super.getPort(OrderPort, OrderPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderPort
     */
    @WebEndpoint(name = "OrderPort")
    public OrderPort getOrderPort(WebServiceFeature... features) {
        return super.getPort(OrderPort, OrderPort.class, features);
    }


    /**
     *
     * @return
     *     returns OrderItemPort
     */
    @WebEndpoint(name = "OrderItemPort")
    public OrderItemPort getOrderItemPort() {
        return super.getPort(OrderItemPort, OrderItemPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderItemPort
     */
    @WebEndpoint(name = "OrderItemPort")
    public OrderItemPort getOrderItemPort(WebServiceFeature... features) {
        return super.getPort(OrderItemPort, OrderItemPort.class, features);
    }

}