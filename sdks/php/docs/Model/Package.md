# # Package

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. | [optional]
**price** | **float** | A float (decimal describing the price of the package in your account currency) | [optional]
**type** | **string** |  | [optional]
**qty** | **int** |  | [optional]
**expiry_period** | **string** | The renewal period of this item | [optional]
**expiry_length** | **int** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. | [optional]
**custom** | **object** | A map of data that is passed back to you via the webhook (for example, a tracking ID) | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
