# OpenapiClient::RecurringPayment

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [optional] |
| **created_at** | **Time** |  | [optional] |
| **updated_at** | **Time** |  | [optional] |
| **paused_at** | **Time** |  | [optional] |
| **paused_until** | **Time** |  | [optional] |
| **next_payment_date** | **String** |  | [optional] |
| **reference** | **String** |  | [optional] |
| **account_id** | **Integer** |  | [optional] |
| **interval** | **String** |  | [optional] |
| **cancelled_at** | **Time** |  | [optional] |
| **status** | [**RecurringPaymentStatus**](RecurringPaymentStatus.md) |  | [optional] |
| **amount** | [**RecurringPaymentAmount**](RecurringPaymentAmount.md) |  | [optional] |
| **cancel_reason** | **String** |  | [optional] |
| **links** | [**RecurringPaymentLinks**](RecurringPaymentLinks.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RecurringPayment.new(
  id: 5000,
  created_at: 2022-12-16T16:43:06Z,
  updated_at: 2022-12-16T16:43:06Z,
  paused_at: null,
  paused_until: null,
  next_payment_date: 2022-12-30T16:43:06,
  reference: 88,
  account_id: 1,
  interval: P2W,
  cancelled_at: null,
  status: null,
  amount: null,
  cancel_reason: null,
  links: null
)
```

