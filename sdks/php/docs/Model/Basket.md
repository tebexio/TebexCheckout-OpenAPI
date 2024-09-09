# # Basket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ident** | **string** |  | [optional]
**expire** | **string** |  | [optional]
**price** | **float** |  | [optional]
**price_details** | [**\TebexCheckout\Model\PriceDetails**](PriceDetails.md) |  | [optional]
**is_payment_method_update** | **bool** |  | [optional]
**return_url** | **string** |  | [optional]
**complete** | **bool** |  | [optional]
**tax** | **float** |  | [optional]
**username** | **string** |  | [optional]
**email_immutable** | **bool** |  | [optional]
**discounts** | **object[]** |  | [optional]
**coupons** | **object[]** |  | [optional]
**giftcards** | **object[]** |  | [optional]
**address** | [**\TebexCheckout\Model\Address**](Address.md) |  | [optional]
**rows** | [**\TebexCheckout\Model\BasketRow[]**](BasketRow.md) |  | [optional]
**fingerprint** | **string** | Browser fingerprint to identify the user | [optional]
**creator_code** | **string** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional]
**roundup** | **bool** |  | [optional]
**cancel_url** | **string** |  | [optional]
**complete_url** | **string** |  | [optional]
**complete_auto_redirect** | **bool** |  | [optional]
**recurring_items** | **object[]** |  | [optional]
**payment** | [**\TebexCheckout\Model\Payment**](.md) |  | [optional]
**custom** | **object** |  | [optional]
**links** | [**\TebexCheckout\Model\BasketLinks**](BasketLinks.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
