package com.bestchat.thirdparty.sdk.shopify.net;

public class ShopifyClient extends HttpClient {

	public ShopifyClient(String accessToken) {
		addHeader("X-Shopify-Access-Token", accessToken);
	}
}
