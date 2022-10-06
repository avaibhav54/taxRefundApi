package com.example.demo.service;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.newrelic.agent.deps.okhttp3.MediaType;
import com.newrelic.agent.deps.okhttp3.OkHttpClient;
import com.newrelic.agent.deps.okhttp3.Request;
import com.newrelic.agent.deps.okhttp3.RequestBody;
import com.newrelic.agent.deps.okhttp3.Response;
import com.newrelic.agent.deps.okhttp3.ResponseBody;
@Service
public class RefundService extends Thread{
	
	public static String getRefundStatusData(String pan, int year, String authToken) throws IOException

	{
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse("application/json");
				RequestBody body = RequestBody.create(mediaType,
						"{"
						+ "\"header\":"
						+ "{\"formName\":\"FO-013-DSBRD\"},"
						+ "\"entityNum\":\""+pan+"\","
						+ "\"assmentYear\":"+year
						+ "}");
				
				
				Request request = new Request.Builder()
				  .url("https://eportal.incometax.gov.in/iec/itrweb/auth/v0.1/returns/demand/refund")
				  .method("POST", body)
				  .addHeader("Accept", "application/json, text/plain, */*")
				  .addHeader("Accept-Language", "en-IN,en-GB;q=0.9,en-US;q=0.8,en;q=0.7")
				  .addHeader("Connection", "keep-alive")
				  .addHeader("Content-Type", "application/json")
				  .addHeader("Cookie", authToken)
				  .addHeader("Origin", "https://eportal.incometax.gov.in")
				  .addHeader("sn", "NA")
				  .build();
				Response execute = client.newCall(request).execute();
				if(execute.isSuccessful())
				return execute.body().string();
				else return "No data";
		
	}
	
}
