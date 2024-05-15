# OpenapiClient::RecurringPaymentLinks

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **initial_payment** | **String** |  | [optional] |
| **payment_history** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RecurringPaymentLinks.new(
  initial_payment: https://checkout.tebex.io/api/payments/tbx-123123aabccd123-bf71ad?type&#x3D;txn_id,
  payment_history: null
)
```

