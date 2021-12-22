# Shopify API Library for Java：
Rest API.

# Requirements：
- Java 1.8 or Higher
- Maven
- have a Shopify Partner account
- have a Shopify APP
- use OAuth get Shopify access token

# Use
`ShopAPI shopAPI = new ShopAPI("https://{YOUR SHOPIFY STORE}.myshopify.com/admin/api/2021-10/", accessToken);`
		
`Shop shop = shopAPI.get();`