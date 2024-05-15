# OpenapiClient::PaymentFees

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **tax** | [**PaymentFeesTax**](PaymentFeesTax.md) |  | [optional] |
| **gateway** | [**PaymentFeesGateway**](PaymentFeesGateway.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PaymentFees.new(
  tax: null,
  gateway: null
)
```

