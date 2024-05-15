# TebexCheckout.Model.Basket

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ident** | **string** |  | [optional] 
**Expire** | **string** |  | [optional] 
**Price** | **decimal** |  | [optional] 
**PriceDetails** | [**PriceDetails**](PriceDetails.md) |  | [optional] 
**Type** | **string** |  | [optional] 
**Recurring** | **bool** |  | [optional] 
**RecurringPeriod** | **Object** |  | [optional] 
**RecurringNextPaymentDate** | **string** |  | [optional] 
**IsPaymentMethodUpdate** | **bool** |  | [optional] 
**ReturnUrl** | **string** |  | [optional] 
**Complete** | **bool** |  | [optional] 
**Tax** | **Object** |  | [optional] 
**Username** | **string** |  | [optional] 
**Discounts** | **List&lt;Object&gt;** |  | [optional] 
**Coupons** | **List&lt;Object&gt;** |  | [optional] 
**Giftcards** | **List&lt;Object&gt;** |  | [optional] 
**Address** | [**Address**](Address.md) |  | [optional] 
**Rows** | [**List&lt;BasketItem&gt;**](BasketItem.md) |  | [optional] 
**Fingerprint** | **string** | Browser fingerprint to identify the user | [optional] 
**CreatorCode** | **string** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] 
**Roundup** | **bool?** |  | [optional] 
**CancelUrl** | **string** |  | [optional] 
**CompleteUrl** | **string** |  | [optional] 
**CompleteAutoRedirect** | **bool** |  | [optional] 
**Custom** | **Object** |  | [optional] 
**Links** | [**BasketLinks**](BasketLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

