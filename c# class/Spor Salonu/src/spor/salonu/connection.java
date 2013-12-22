/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spor.salonu;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import javax.xml.ws.WebServiceClient;
import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.HttpConnectionMetricsImpl;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;





/**
 *
 * @author MERKAN
 */
public class connection {
    private String apiURL;
   
    
    String KontrolUser(String ad,String password)
    {
        try
        {
            String url="http://localhost/Software/SoftwareWebService.svc";
            HttpClient c=new DefaultHttpClient();
            HttpPost p=new HttpPost(url);
            p.setEntity(new StringEntity("/UserKontrol/{\"username\":\""+ad+"\",\"userpass\":\"" +password+"\"}",ContentType.create("application/json")));
            HttpResponse r = c.execute(p);
            BufferedReader rd = new BufferedReader(new InputStreamReader(r.getEntity().getContent()));
            String line = "",a="";
            while ((line = rd.readLine()) != null) {
               //Parse our JSON response               
               JSONParser j = new JSONParser();
               JSONObject o = (JSONObject)j.parse(line);
               Map response = (Map)o.get("response");
               a+=response.get("somevalue");
               System.out.println(response.get("somevalue"));
            }
            
           return a;
           
            
        }
        catch(Exception err)
        {
            return null;
        }
        
    }
    
}
