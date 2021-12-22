package com.bestchat.thirdparty.sdk.shopify.api;

import com.bestchat.thirdparty.sdk.shopify.model.Shop;

public class ShopAPI extends Rest {

	private static final String END_POINTS = "shop.json";

	public ShopAPI(String baseUrl, String accessToken) {
		super.baseUrl = baseUrl;
		super.accessToken = accessToken;
	}

	public Shop get() {
		String response = getShopifyClient().get(baseUrl + END_POINTS);

		return jsonToObj(strToJsonNode(response).get("shop").toString(), Shop.class);
	}

}
