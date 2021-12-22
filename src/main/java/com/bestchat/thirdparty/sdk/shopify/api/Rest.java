package com.bestchat.thirdparty.sdk.shopify.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bestchat.thirdparty.sdk.shopify.net.ShopifyClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;

public class Rest {

	private static final Logger LOGGER = LoggerFactory.getLogger(Rest.class);

	private ObjectMapper objectMapper = new ObjectMapper();

	protected String baseUrl;
	protected String accessToken;

	protected <T> T jsonToObj(String json, Class<T> valueType) {
		try {
			objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
			return objectMapper.readValue(json, valueType);
		} catch (JsonProcessingException e) {
			LOGGER.error("jsonToObj error", e);
		}

		return null;
	}

	protected JsonNode strToJsonNode(String str) {
		try {
			return objectMapper.readTree(str);
		} catch (JsonProcessingException e) {
			LOGGER.error("strToJsonNode error", e);
		}

		return null;
	}

	protected ShopifyClient getShopifyClient() {
		return new ShopifyClient(accessToken);
	}
}
