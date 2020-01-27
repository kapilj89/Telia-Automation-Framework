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
 * 2020-01-24T13:42:52.477+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "TSTransferWebService",
                  wsdlLocation = "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/TSTransferWebService_Updated.WSDL",
                  targetNamespace = "http://siebel.com/CustomUI")
public class TSTransferWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://siebel.com/CustomUI", "TSTransferWebService");
    public final static QName TSC2BTransferOrderProcess = new QName("http://siebel.com/CustomUI", "TSC2BTransferOrderProcess");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/TSTransferWebService_Updated.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TSTransferWebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/TSTransferWebService_Updated.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public TSTransferWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TSTransferWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TSTransferWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TSTransferWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TSTransferWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TSTransferWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TSC2BTransferOrderProcess
     */
    @WebEndpoint(name = "TSC2BTransferOrderProcess")
    public TSC2BTransferOrderProcess getTSC2BTransferOrderProcess() {
        return super.getPort(TSC2BTransferOrderProcess, TSC2BTransferOrderProcess.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TSC2BTransferOrderProcess
     */
    @WebEndpoint(name = "TSC2BTransferOrderProcess")
    public TSC2BTransferOrderProcess getTSC2BTransferOrderProcess(WebServiceFeature... features) {
        return super.getPort(TSC2BTransferOrderProcess, TSC2BTransferOrderProcess.class, features);
    }

}