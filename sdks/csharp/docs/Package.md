# TebexCheckout.Model.Package

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. | [optional] 
**Price** | **float** | A float (decimal describing the price of the package in your account currency) | [optional] 
**Type** | **string** |  | [optional] 
**Qty** | **int** |  | [optional] 
**ExpiryPeriod** | **string** | The renewal period of this item | [optional] 
**ExpiryLength** | **int** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. | [optional] 
**Custom** | **Object** | A map of data that is passed back to you via the webhook (for example, a tracking ID) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

