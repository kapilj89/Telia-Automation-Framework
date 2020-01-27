/**
 * 
 */
package coreFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Base64;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import net.sf.json.JSONArray;

/**
 * @author kaviag
 *
 */
public class JIRAConnector {private char[] jira;

public JIRAConnector() {
    }

public static void pushJiraResult() {

    try {

      BufferedReader br = new BufferedReader(new FileReader("target/cucumber_report/siebel-api-test-cucumber_report.json"));
      String jsonData = org.apache.commons.io.IOUtils.toString(br);

      JSONArray arr = new JSONArray();
      arr.add(jsonData);
      String credentials = ORUtil.getConfigValue("jiraUser") + ":" + ORUtil.getConfigValue("jiraPassword");
//      byte[] encoding = Base64.encodeBase64(credentials.getBytes());
      
      HttpClient client = HttpClientBuilder.create().build();
      HttpPost postSet = new HttpPost("https://diva.teliacompany.net/jira/browse/RXDODTA-1315/rest/raven/1.0/import/execution/cucumber");
//      postSet.addHeader("Username", "kavia.g@capgemini.com");
//      postSet.addHeader("Password", "Kavg@capg96");
//      postSet.addHeader("Authorization", "Basic ");
//      postSet.addHeader("Content-Type", "application/json");
//      postSet.addHeader( Base64.getUrlEncoder().encodeToString("kavia.g@capgemini.com:Kavg@capg96".getBytes()));
      postSet.setHeader("Authorization", "Basic " + Base64.getUrlEncoder().encodeToString("MKG761:Copper@1234".getBytes()));
//      postSet.setHeader("Authorization", "Basic " + new String(encoding));

      postSet.setEntity(new StringEntity(arr.toString(), ContentType.APPLICATION_JSON));
      HttpResponse rawResponse = client.execute(postSet);

      if (rawResponse.getStatusLine().getStatusCode() != 200) {
        int status = rawResponse.getStatusLine().getStatusCode();
        System.out.println(rawResponse.toString());
        System.out.println("STATUS " + status);
      } else {
          System.out.println("STATUS 200!! \n Success \n Updated results in JIRA" );

        }


    } catch (Exception e) {

    }

  }



}
