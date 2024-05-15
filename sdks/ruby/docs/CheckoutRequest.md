# OpenapiClient::CheckoutRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **basket** | [**CheckoutRequestBasket**](CheckoutRequestBasket.md) |  |  |
| **items** | [**Array&lt;CheckoutItem&gt;**](CheckoutItem.md) | An array of &#x60;Packages&#x60; in the basket. |  |
| **sale** | [**Sale**](Sale.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CheckoutRequest.new(
  basket: null,
  items: null,
  sale: null
)
```

