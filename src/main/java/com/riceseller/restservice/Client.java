package com.riceseller.restservice;

import java.net.URI;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HttpClient client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 15000); // Timeout
																				// Limit
		HttpResponse response;
		try {
			HttpPost post = new HttpPost();
            URI uri = new URI("http://localhost:8080/RestWebServices/rest/entrycontroller/json");
			post.setURI(uri);
			post.setHeader(new BasicHeader("Content-type", "application/json"));

			String str1 = "\"{\\\"uniqueID\\\":\\\"355921042567196\\\",\\\"devicetype\\\":\\\"android\\\",\\\"devicetoken\\\":\\\"APA91bH5PY7q5XkHmx2J6M6o4Mo_HRHKvjQDBZErMR17A_4UEay26EDbdmn3DX2UlDGZNVQqqigv25botYsPC72duouD1NqR873o2tdjwcLztb-kEgYXqkOcYomms79_ZheUzmd9HmI4\\\"}\"";
			StringEntity se = new StringEntity(str1);

			post.setEntity(se);

			response = client.execute(post);
			// Checking response
			if (response != null) {

				String employeeJson = EntityUtils
						.toString(response.getEntity());
				System.err.println(employeeJson);

			}

		} catch (Exception exception) {

		}
	}
}
