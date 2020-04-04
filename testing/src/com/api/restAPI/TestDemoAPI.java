package com.api.restAPI;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDemoAPI extends FWUtils{
	
	String Uri;
	RestAPIClient rac;
	
	@BeforeMethod
	public void setup() {
		Uri=URL+SERVICE_URL;		
	}
	
	@Test
	public void TestDemoAPI1() {
		rac=new RestAPIClient();
		
		try {
			rac.get(Uri);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
