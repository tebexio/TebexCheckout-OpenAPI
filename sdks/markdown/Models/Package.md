# Package
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **name** | **String** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. | [optional] [default to null] |
| **price** | **Float** | A float (decimal describing the price of the package in your account currency) | [optional] [default to null] |
| **type** | **String** |  | [optional] [default to null] |
| **qty** | **Integer** |  | [optional] [default to null] |
| **expiry\_period** | **String** | The renewal period of this item | [optional] [default to null] |
| **expiry\_length** | **Integer** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. | [optional] [default to null] |
| **custom** | [**Object**](.md) | A map of data that is passed back to you via the webhook (for example, a tracking ID) | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

