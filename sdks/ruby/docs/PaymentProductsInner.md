# OpenapiClient::PaymentProductsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **quantity** | **Integer** |  | [optional] |
| **base_price** | [**PaymentProductsInnerBasePrice**](PaymentProductsInnerBasePrice.md) |  | [optional] |
| **paid_price** | [**PaymentProductsInnerBasePrice**](PaymentProductsInnerBasePrice.md) |  | [optional] |
| **variables** | **Array&lt;String&gt;** |  | [optional] |
| **expires_at** | **Time** |  | [optional] |
| **custom** | **String** |  | [optional] |
| **username** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PaymentProductsInner.new(
  id: null,
  name: null,
  quantity: null,
  base_price: null,
  paid_price: null,
  variables: null,
  expires_at: null,
  custom: null,
  username: null
)
```

