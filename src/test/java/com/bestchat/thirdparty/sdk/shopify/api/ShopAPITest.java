package com.bestchat.thirdparty.sdk.shopify.api;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bestchat.thirdparty.sdk.shopify.model.Shop;

public class ShopAPITest {
	
	String baseUrl = "https://{XXX}.myshopify.com/admin/api/2021-10/";
	String accessToken = "{XXX}";

	@Test
	public void testGet() {
		ShopAPI shopAPI = new ShopAPI(baseUrl, accessToken);
		
		Shop shop = shopAPI.get();
		
		assertTrue(shop.getId() > 0);
	}

}
