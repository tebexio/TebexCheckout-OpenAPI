# OpenapiClient::UpdateRecurringPaymentRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | **String** | Your desired state of the recurring payment. Provide &#x60;Paused&#x60; with &#x60;paused_until&#x60; to pause a recurring payment. Otherwise, provide &#x60;Active&#x60; to resume a recurring payment. |  |
| **paused_until** | **String** | To pause a payment, provide a ISO8601 formatted date on which the payment should be reactivated. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateRecurringPaymentRequest.new(
  status: Active,
  paused_until: 2023-01-18T16:43:53.000000Z
)
```

