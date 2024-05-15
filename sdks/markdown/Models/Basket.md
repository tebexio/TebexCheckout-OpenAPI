# Basket
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ident** | **String** |  | [optional] [default to null] |
| **expire** | **String** |  | [optional] [default to null] |
| **price** | **BigDecimal** |  | [optional] [default to null] |
| **priceDetails** | [**PriceDetails**](PriceDetails.md) |  | [optional] [default to null] |
| **type** | **String** |  | [optional] [default to null] |
| **recurring** | **Boolean** |  | [optional] [default to null] |
| **recurringPeriod** | [**Object**](.md) |  | [optional] [default to null] |
| **recurringNextPaymentDate** | **String** |  | [optional] [default to null] |
| **isPaymentMethodUpdate** | **Boolean** |  | [optional] [default to null] |
| **returnUrl** | **String** |  | [optional] [default to null] |
| **complete** | **Boolean** |  | [optional] [default to null] |
| **tax** | [**Object**](.md) |  | [optional] [default to null] |
| **username** | **String** |  | [optional] [default to null] |
| **discounts** | **List** |  | [optional] [default to null] |
| **coupons** | **List** |  | [optional] [default to null] |
| **giftcards** | **List** |  | [optional] [default to null] |
| **address** | [**Address**](Address.md) |  | [optional] [default to null] |
| **rows** | [**List**](BasketItem.md) |  | [optional] [default to null] |
| **fingerprint** | **String** | Browser fingerprint to identify the user | [optional] [default to null] |
| **creator\_code** | **String** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] [default to null] |
| **roundup** | **Boolean** |  | [optional] [default to null] |
| **cancel\_url** | **String** |  | [optional] [default to null] |
| **complete\_url** | **String** |  | [optional] [default to null] |
| **complete\_auto\_redirect** | **Boolean** |  | [optional] [default to null] |
| **custom** | [**Object**](.md) |  | [optional] [default to null] |
| **links** | [**BasketLinks**](BasketLinks.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

