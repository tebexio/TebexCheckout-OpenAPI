# OpenapiClient::PriceDetails

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **full_price** | **Float** |  | [optional] |
| **sub_total** | **Float** |  | [optional] |
| **discounts** | **Array&lt;Object&gt;** |  | [optional] |
| **total** | **Float** |  | [optional] |
| **tax** | **Float** |  | [optional] |
| **balance** | **Float** |  | [optional] |
| **sales** | [**Array&lt;Sale&gt;**](Sale.md) |  | [optional] |
| **giftcards** | **Array&lt;Object&gt;** |  | [optional] |
| **round_up** | **Float** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PriceDetails.new(
  full_price: null,
  sub_total: null,
  discounts: null,
  total: null,
  tax: null,
  balance: null,
  sales: null,
  giftcards: null,
  round_up: null
)
```

