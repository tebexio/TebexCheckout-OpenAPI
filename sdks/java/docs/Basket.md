

# Basket


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ident** | **String** |  |  [optional] |
|**expire** | **String** |  |  [optional] |
|**price** | **BigDecimal** |  |  [optional] |
|**priceDetails** | [**PriceDetails**](PriceDetails.md) |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**recurring** | **Boolean** |  |  [optional] |
|**recurringPeriod** | **Object** |  |  [optional] |
|**recurringNextPaymentDate** | **String** |  |  [optional] |
|**isPaymentMethodUpdate** | **Boolean** |  |  [optional] |
|**returnUrl** | **String** |  |  [optional] |
|**complete** | **Boolean** |  |  [optional] |
|**tax** | **Object** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**discounts** | **List&lt;Object&gt;** |  |  [optional] |
|**coupons** | **List&lt;Object&gt;** |  |  [optional] |
|**giftcards** | **List&lt;Object&gt;** |  |  [optional] |
|**address** | [**Address**](Address.md) |  |  [optional] |
|**rows** | [**List&lt;BasketItem&gt;**](BasketItem.md) |  |  [optional] |
|**fingerprint** | **String** | Browser fingerprint to identify the user |  [optional] |
|**creatorCode** | **String** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes |  [optional] |
|**roundup** | **Boolean** |  |  [optional] |
|**cancelUrl** | **String** |  |  [optional] |
|**completeUrl** | **String** |  |  [optional] |
|**completeAutoRedirect** | **Boolean** |  |  [optional] |
|**custom** | **Object** |  |  [optional] |
|**links** | [**BasketLinks**](BasketLinks.md) |  |  [optional] |



