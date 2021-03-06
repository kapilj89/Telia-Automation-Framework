package se.telia.siebel;

import java.io.IOException;

import coreFramework.ORUtil;
import coreFramework.TrippleDes;


/*
* This class set upp test in the Befor annotated method.
* For example, the environment endpoint and username/password is set here
* By picking upp system properties wich should have that specifyed.
* */

import cucumber.api.java.Before;
import se.telia.siebel.data.DataStorage;
import se.telia.siebel.interceptor.Credentials;
import se.telia.siebel.interceptor.SiebelSession;

public class EntryPoint {

    DataStorage dataStorage;
    String username, password, siebelEndpointURL;

    public EntryPoint(DataStorage dataStorage) {
        System.out.println("EntryPoint contrstuctor");
        this.dataStorage=dataStorage; // dataStorage is injected by Pico-container dependency injection.
    }

    @Before
    public void init() throws Throwable {
        System.out.println("init-method");
        TrippleDes pass_set = new TrippleDes();
        String AT_UserName = ORUtil.getConfigValue("AT_UserName");
        String AT_Password = pass_set.decrypt( ORUtil.getConfigValue("AT_Password"));
        String SIT_UserName = ORUtil.getConfigValue("SIT_UserName");
        String SIT_Password = pass_set.decrypt( ORUtil.getConfigValue("SIT_Password"));
        String ST9_UserName = ORUtil.getConfigValue("ST9_UserName");
        String ST9_Password = pass_set.decrypt(ORUtil.getConfigValue("ST9_Password"));
        String BU7_UserName = ORUtil.getConfigValue("BU7_UserName");
        String BU7_Password = pass_set.decrypt(ORUtil.getConfigValue("BU7_Password"));
        String BU4_UserName = ORUtil.getConfigValue("BU4_UserName");
        String BU4_Password = pass_set.decrypt(ORUtil.getConfigValue("BU4_Password"));
        String EndPoint_URL_BU7 = ORUtil.getConfigValue("BU7_EndURL");
        String EndPoint_URL_BU4 = ORUtil.getConfigValue("BU4_EndURL");
        String EndPoint_URL_AT = ORUtil.getConfigValue("AT_EndURL");
        String EndPoint_URL_ST = ORUtil.getConfigValue("ST1_EndURL");
        String EndPoint_URL_SIT = ORUtil.getConfigValue("SIT_EndURL");
        String EndPoint_URL_ST9 = ORUtil.getConfigValue("ST9_EndURL");
        String Environment = ORUtil.getConfigValue("Environment");

        String channel= (System.getProperty("channel") == null)  ? "TELIASE" : System.getProperty("channel");
		if (Environment.equals("SIT")) {
			username = (System.getProperty("username") == null) ? SIT_UserName
					: System.getProperty("username");
			password = (System.getProperty("password") == null) ? SIT_Password
					: System.getProperty("password");
			siebelEndpointURL = (System.getProperty("siebelEndpointURL") == null) ? EndPoint_URL_SIT
					: System.getProperty("siebelEndpointURL");

		}
		if (Environment.equals("AT")) {
         username= (System.getProperty("username") == null)  ? AT_UserName : System.getProperty("username");
         password= (System.getProperty("password") == null)  ? AT_Password : System.getProperty("password");
         siebelEndpointURL= (System.getProperty("siebelEndpointURL") == null)  ? EndPoint_URL_AT : System.getProperty("siebelEndpointURL");
		}
		if (Environment.equals("ST1")) {
	         username= (System.getProperty("username") == null)  ? AT_UserName : System.getProperty("username");
	         password= (System.getProperty("password") == null)  ? AT_Password : System.getProperty("password");
	         siebelEndpointURL= (System.getProperty("siebelEndpointURL") == null)  ? EndPoint_URL_ST : System.getProperty("siebelEndpointURL");
			}
		if (Environment.equals("ST9")) {
	         username= (System.getProperty("username") == null)  ? ST9_UserName : System.getProperty("username");
	         password= (System.getProperty("password") == null)  ? ST9_Password : System.getProperty("password");
	         siebelEndpointURL= (System.getProperty("siebelEndpointURL") == null)  ? EndPoint_URL_ST9 : System.getProperty("siebelEndpointURL");
			}
		if (Environment.equals("BU7")) {
	         username= (System.getProperty("username") == null)  ? BU7_UserName : System.getProperty("username");
	         password= (System.getProperty("password") == null)  ? BU7_Password : System.getProperty("password");
	         siebelEndpointURL= (System.getProperty("siebelEndpointURL") == null)  ? EndPoint_URL_BU7 : System.getProperty("siebelEndpointURL");
			}
		if (Environment.equals("BU4")) {
	         username= (System.getProperty("username") == null)  ? BU4_UserName : System.getProperty("username");
	         password= (System.getProperty("password") == null)  ? BU4_Password : System.getProperty("password");
	         siebelEndpointURL= (System.getProperty("siebelEndpointURL") == null)  ? EndPoint_URL_BU4 : System.getProperty("siebelEndpointURL");
			}
        dataStorage.setSiebelEndpointURL(siebelEndpointURL);
        dataStorage.setLoginName(username);
        Credentials credentials = new Credentials(channel,username,password);
        SiebelSession session = new SiebelSession(SiebelSession.TYPE_STATELESS,credentials);
        dataStorage.setSiebelSession(session);
        System.out.println("siebelsession is now in dataStorage");
        System.out.println("Using the following settings in the test: \n"+
            "channel="+channel+"\n"+
             "username="+username+"\n"+
             "password="+password+"\n"+
             "siebelEndpointURL="+siebelEndpointURL+"\n"
        );
    }

}

