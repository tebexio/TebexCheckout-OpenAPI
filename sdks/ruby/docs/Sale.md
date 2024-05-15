# OpenapiClient::Sale

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the sale (displayed to the customer) | [optional] |
| **discount_type** | **String** | The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item. | [optional] |
| **amount** | **Float** | The amount or percentage to deduct | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Sale.new(
  name: Test Sale,
  discount_type: amount,
  amount: 4.99
)
```

