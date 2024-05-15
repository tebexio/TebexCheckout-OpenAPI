# OpenapiClient::Basket

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ident** | **String** |  | [optional] |
| **expire** | **String** |  | [optional] |
| **price** | **Float** |  | [optional] |
| **price_details** | [**PriceDetails**](PriceDetails.md) |  | [optional] |
| **type** | **String** |  | [optional] |
| **recurring** | **Boolean** |  | [optional] |
| **recurring_period** | **Object** |  | [optional] |
| **recurring_next_payment_date** | **String** |  | [optional] |
| **is_payment_method_update** | **Boolean** |  | [optional] |
| **return_url** | **String** |  | [optional] |
| **complete** | **Boolean** |  | [optional] |
| **tax** | **Object** |  | [optional] |
| **username** | **String** |  | [optional] |
| **discounts** | **Array&lt;Object&gt;** |  | [optional] |
| **coupons** | **Array&lt;Object&gt;** |  | [optional] |
| **giftcards** | **Array&lt;Object&gt;** |  | [optional] |
| **address** | [**Address**](Address.md) |  | [optional] |
| **rows** | [**Array&lt;BasketItem&gt;**](BasketItem.md) |  | [optional] |
| **fingerprint** | **String** | Browser fingerprint to identify the user | [optional] |
| **creator_code** | **String** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] |
| **roundup** | **Boolean** |  | [optional] |
| **cancel_url** | **String** |  | [optional] |
| **complete_url** | **String** |  | [optional] |
| **complete_auto_redirect** | **Boolean** |  | [optional] |
| **custom** | **Object** |  | [optional] |
| **links** | [**BasketLinks**](BasketLinks.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Basket.new(
  ident: 1a-55fff4107740a1f40d844ff89607557f45bfafb3,
  expire: 2022-10-25 15:15:40,
  price: 1.27,
  price_details: null,
  type: single,
  recurring: false,
  recurring_period: null,
  recurring_next_payment_date: null,
  is_payment_method_update: false,
  return_url: null,
  complete: false,
  tax: null,
  username: null,
  discounts: null,
  coupons: null,
  giftcards: null,
  address: null,
  rows: null,
  fingerprint: ,
  creator_code: null,
  roundup: false,
  cancel_url: https://tebex.io,
  complete_url: null,
  complete_auto_redirect: false,
  custom: {&quot;foo&quot;:&quot;bar&quot;,&quot;ref&quot;:1234},
  links: null
)
```

