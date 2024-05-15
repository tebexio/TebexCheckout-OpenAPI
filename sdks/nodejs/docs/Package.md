# TebexCheckoutApi.Package

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. | [optional] 
**price** | **Number** | A float (decimal describing the price of the package in your account currency) | [optional] 
**expiryPeriod** | **String** | The renewal period of this item | [optional] 
**expiryLength** | **Number** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. | [optional] 
**metaData** | [**PackageMetaData**](PackageMetaData.md) |  | [optional] 



## Enum: ExpiryPeriodEnum


* `day` (value: `"day"`)

* `month` (value: `"month"`)

* `year` (value: `"year"`)




