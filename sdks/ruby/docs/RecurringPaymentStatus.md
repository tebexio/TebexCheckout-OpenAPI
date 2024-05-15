# OpenapiClient::RecurringPaymentStatus

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [optional] |
| **_class** | **String** |  | [optional] |
| **description** | **String** |  | [optional] |
| **active** | **Integer** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RecurringPaymentStatus.new(
  id: 2,
  _class: success,
  description: Active,
  active: 1
)
```

