package com.siebel.service.fs.assets;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2020-01-24T13:42:44.617+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "AssetManagementComplex",
                  wsdlLocation = "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/AssetManagementComplex_v2.1.WSDL",
                  targetNamespace = "http://www.siebel.com/Service/FS/Assets")
public class AssetManagementComplex extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.siebel.com/Service/FS/Assets", "AssetManagementComplex");
    public final static QName AssetManagementComplexPort = new QName("http://www.siebel.com/Service/FS/Assets", "AssetManagementComplexPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/AssetManagementComplex_v2.1.WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AssetManagementComplex.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/siebel_encrypt/siebel-api-test/src/test/resources/wsdlfiles/AssetManagementComplex_v2.1.WSDL");
        }
        WSDL_LOCATION = url;
    }

    public AssetManagementComplex(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AssetManagementComplex(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AssetManagementComplex() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AssetManagementComplex(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AssetManagementComplex(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AssetManagementComplex(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns AssetManagementComplexPort
     */
    @WebEndpoint(name = "AssetManagementComplexPort")
    public AssetManagementComplexPort getAssetManagementComplexPort() {
        return super.getPort(AssetManagementComplexPort, AssetManagementComplexPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AssetManagementComplexPort
     */
    @WebEndpoint(name = "AssetManagementComplexPort")
    public AssetManagementComplexPort getAssetManagementComplexPort(WebServiceFeature... features) {
        return super.getPort(AssetManagementComplexPort, AssetManagementComplexPort.class, features);
    }

}
