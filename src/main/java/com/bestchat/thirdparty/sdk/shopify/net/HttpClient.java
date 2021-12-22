package com.bestchat.thirdparty.sdk.shopify.net;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 网络请求
 *
 */
public class HttpClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(HttpClient.class);
	
	private List<NameValuePair> headers = new LinkedList<>();

	public String get(String url) {
		return execute(Request.get(url));
	}

	public String get(String url, Map<String, String> params) {
		List<NameValuePair> list = new LinkedList<>();
		for (Entry<String, String> entry : params.entrySet()) {
			NameValuePair np = new BasicNameValuePair(entry.getKey(), entry.getValue());
			list.add(np);
		}

		return execute(Request.get(url).bodyForm(list));
	}

	public String post(String url, String jsonString) {
		return execute(Request.post(url).bodyString(jsonString, ContentType.APPLICATION_JSON));
	}

	public String put(String url, String jsonString) {
		return execute(Request.put(url).bodyString(jsonString, ContentType.APPLICATION_JSON));
	}

	public String delete(String url) {
		return execute(Request.delete(url));
	}
	
	protected void addHeader(String name, String value) {
		headers.add(new BasicNameValuePair(name, value));
	}

	private String execute(Request request) {

		LOGGER.info("request: {}", request);

		String content = null;

		try {
			
			for (NameValuePair nameValuePair : headers) {
				request.addHeader(nameValuePair.getName(), nameValuePair.getValue());
			}
			
			content = request.execute().returnContent().asString();

			LOGGER.info("response: {}", content);
		} catch (IOException e) {
			LOGGER.error("execute error", e);
		}

		return content;
	}
}
