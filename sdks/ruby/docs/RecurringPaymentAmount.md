# OpenapiClient::RecurringPaymentAmount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **amount** | **Float** |  | [optional] |
| **tax** | **Float** |  | [optional] |
| **period** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RecurringPaymentAmount.new(
  amount: 7,
  tax: 1.4,
  period: P2W
)
```

