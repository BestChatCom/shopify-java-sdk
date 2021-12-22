package com.bestchat.thirdparty.sdk.shopify.model;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Shop {
	private long id;
	private String name;
	private String email;
	private String domain;
	private String province;
	private String country;
	private String address1;
	private String zip;
	private String city;
	private String source;
	private String phone;
	private double latitude;
	private double longitude;
	private String primaryLocale;
	private String address2;
	private Date createdAt;
	private Date updatedAt;
	private String countryCode;
	private String countryName;
	private String currency;
	private String customerEmail;
	private String timezone;
	private String ianaTimezone;
	private String shopOwner;
	private String moneyFormat;
	private String moneyWithCurrencyFormat;
	private String weightUnit;
	private String provinceCode;
	private boolean taxesIncluded;
	private String autoConfigureTaxInclusivity;
	private String taxShipping;
	private boolean countyTaxes;
	private String planDisplayName;
	private String planName;
	private boolean hasDiscounts;
	private boolean hasGiftCards;
	private String myshopifyDomain;
	private String googleAppsDomain;
	private String googleAppsLoginEnabled;
	private String moneyInEmailsFormat;
	private String moneyWithCurrencyInEmailsFormat;
	private boolean eligibleForPayments;
	private boolean requiresExtraPaymentsAgreement;
	private boolean passwordEnabled;
	private boolean hasStorefront;
	private boolean eligibleForCardReaderGiveaway;
	private boolean finances;
	private long primaryLocationId;
	private String cookieConsentLevel;
	private String visitorTrackingConsentPreference;
	private boolean checkoutApiSupported;
	private boolean multiLocationEnabled;
	private boolean setupRequired;
	private boolean preLaunchEnabled;
	private List<String> enabledPresentmentCurrencies;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getPrimaryLocale() {
		return primaryLocale;
	}

	public void setPrimaryLocale(String primaryLocale) {
		this.primaryLocale = primaryLocale;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getIanaTimezone() {
		return ianaTimezone;
	}

	public void setIanaTimezone(String ianaTimezone) {
		this.ianaTimezone = ianaTimezone;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getMoneyFormat() {
		return moneyFormat;
	}

	public void setMoneyFormat(String moneyFormat) {
		this.moneyFormat = moneyFormat;
	}

	public String getMoneyWithCurrencyFormat() {
		return moneyWithCurrencyFormat;
	}

	public void setMoneyWithCurrencyFormat(String moneyWithCurrencyFormat) {
		this.moneyWithCurrencyFormat = moneyWithCurrencyFormat;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public boolean isTaxesIncluded() {
		return taxesIncluded;
	}

	public void setTaxesIncluded(boolean taxesIncluded) {
		this.taxesIncluded = taxesIncluded;
	}

	public String getAutoConfigureTaxInclusivity() {
		return autoConfigureTaxInclusivity;
	}

	public void setAutoConfigureTaxInclusivity(String autoConfigureTaxInclusivity) {
		this.autoConfigureTaxInclusivity = autoConfigureTaxInclusivity;
	}

	public String getTaxShipping() {
		return taxShipping;
	}

	public void setTaxShipping(String taxShipping) {
		this.taxShipping = taxShipping;
	}

	public boolean isCountyTaxes() {
		return countyTaxes;
	}

	public void setCountyTaxes(boolean countyTaxes) {
		this.countyTaxes = countyTaxes;
	}

	public String getPlanDisplayName() {
		return planDisplayName;
	}

	public void setPlanDisplayName(String planDisplayName) {
		this.planDisplayName = planDisplayName;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public boolean isHasDiscounts() {
		return hasDiscounts;
	}

	public void setHasDiscounts(boolean hasDiscounts) {
		this.hasDiscounts = hasDiscounts;
	}

	public boolean isHasGiftCards() {
		return hasGiftCards;
	}

	public void setHasGiftCards(boolean hasGiftCards) {
		this.hasGiftCards = hasGiftCards;
	}

	public String getMyshopifyDomain() {
		return myshopifyDomain;
	}

	public void setMyshopifyDomain(String myshopifyDomain) {
		this.myshopifyDomain = myshopifyDomain;
	}

	public String getGoogleAppsDomain() {
		return googleAppsDomain;
	}

	public void setGoogleAppsDomain(String googleAppsDomain) {
		this.googleAppsDomain = googleAppsDomain;
	}

	public String getGoogleAppsLoginEnabled() {
		return googleAppsLoginEnabled;
	}

	public void setGoogleAppsLoginEnabled(String googleAppsLoginEnabled) {
		this.googleAppsLoginEnabled = googleAppsLoginEnabled;
	}

	public String getMoneyInEmailsFormat() {
		return moneyInEmailsFormat;
	}

	public void setMoneyInEmailsFormat(String moneyInEmailsFormat) {
		this.moneyInEmailsFormat = moneyInEmailsFormat;
	}

	public String getMoneyWithCurrencyInEmailsFormat() {
		return moneyWithCurrencyInEmailsFormat;
	}

	public void setMoneyWithCurrencyInEmailsFormat(String moneyWithCurrencyInEmailsFormat) {
		this.moneyWithCurrencyInEmailsFormat = moneyWithCurrencyInEmailsFormat;
	}

	public boolean isEligibleForPayments() {
		return eligibleForPayments;
	}

	public void setEligibleForPayments(boolean eligibleForPayments) {
		this.eligibleForPayments = eligibleForPayments;
	}

	public boolean isRequiresExtraPaymentsAgreement() {
		return requiresExtraPaymentsAgreement;
	}

	public void setRequiresExtraPaymentsAgreement(boolean requiresExtraPaymentsAgreement) {
		this.requiresExtraPaymentsAgreement = requiresExtraPaymentsAgreement;
	}

	public boolean isPasswordEnabled() {
		return passwordEnabled;
	}

	public void setPasswordEnabled(boolean passwordEnabled) {
		this.passwordEnabled = passwordEnabled;
	}

	public boolean isHasStorefront() {
		return hasStorefront;
	}

	public void setHasStorefront(boolean hasStorefront) {
		this.hasStorefront = hasStorefront;
	}

	public boolean isEligibleForCardReaderGiveaway() {
		return eligibleForCardReaderGiveaway;
	}

	public void setEligibleForCardReaderGiveaway(boolean eligibleForCardReaderGiveaway) {
		this.eligibleForCardReaderGiveaway = eligibleForCardReaderGiveaway;
	}

	public boolean isFinances() {
		return finances;
	}

	public void setFinances(boolean finances) {
		this.finances = finances;
	}

	public long getPrimaryLocationId() {
		return primaryLocationId;
	}

	public void setPrimaryLocationId(long primaryLocationId) {
		this.primaryLocationId = primaryLocationId;
	}

	public String getCookieConsentLevel() {
		return cookieConsentLevel;
	}

	public void setCookieConsentLevel(String cookieConsentLevel) {
		this.cookieConsentLevel = cookieConsentLevel;
	}

	public String getVisitorTrackingConsentPreference() {
		return visitorTrackingConsentPreference;
	}

	public void setVisitorTrackingConsentPreference(String visitorTrackingConsentPreference) {
		this.visitorTrackingConsentPreference = visitorTrackingConsentPreference;
	}

	public boolean isCheckoutApiSupported() {
		return checkoutApiSupported;
	}

	public void setCheckoutApiSupported(boolean checkoutApiSupported) {
		this.checkoutApiSupported = checkoutApiSupported;
	}

	public boolean isMultiLocationEnabled() {
		return multiLocationEnabled;
	}

	public void setMultiLocationEnabled(boolean multiLocationEnabled) {
		this.multiLocationEnabled = multiLocationEnabled;
	}

	public boolean isSetupRequired() {
		return setupRequired;
	}

	public void setSetupRequired(boolean setupRequired) {
		this.setupRequired = setupRequired;
	}

	public boolean isPreLaunchEnabled() {
		return preLaunchEnabled;
	}

	public void setPreLaunchEnabled(boolean preLaunchEnabled) {
		this.preLaunchEnabled = preLaunchEnabled;
	}

	public List<String> getEnabledPresentmentCurrencies() {
		return enabledPresentmentCurrencies;
	}

	public void setEnabledPresentmentCurrencies(List<String> enabledPresentmentCurrencies) {
		this.enabledPresentmentCurrencies = enabledPresentmentCurrencies;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
