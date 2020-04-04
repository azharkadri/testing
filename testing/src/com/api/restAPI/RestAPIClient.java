package com.api.restAPI;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestAPIClient {
	public void get(String Uri) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		
		HttpGet httpGet=new HttpGet(Uri); //Get request
		
		CloseableHttpResponse httpResponse = httpClient.execute(httpGet); // hit Uri
		
		int statusCode = httpResponse.getStatusLine().getStatusCode(); // get status code
		System.out.println("status code: "+statusCode);
		
		String jsonResponse = EntityUtils.toString(httpResponse.getEntity(),"UTF-8"); // get json
		JSONObject jsonObjectResponse=new JSONObject(jsonResponse); // convert into json readable text
		
		System.out.println("json response from API :"+jsonObjectResponse);
		
		Header[] headersArray=httpResponse.getAllHeaders(); // get all the headers
		
		HashMap<String,String> hm=new HashMap<String,String>();
		
		for(Header header : headersArray) {
			hm.put(header.getName(), header.getValue());
		}
		System.out.println("all headers :"+hm);
	}
}
