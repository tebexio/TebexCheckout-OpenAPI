# OpenapiClient::PaymentCustomer

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **first_name** | **String** |  | [optional] |
| **last_name** | **String** |  | [optional] |
| **email** | **String** |  | [optional] |
| **ip** | **String** |  | [optional] |
| **username** | **String** |  | [optional] |
| **marketing_consent** | **Boolean** |  | [optional] |
| **country** | **String** |  | [optional] |
| **postal_code** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::PaymentCustomer.new(
  first_name: Test,
  last_name: Test,
  email: test@test.com,
  ip: 1.2.3.4,
  username: null,
  marketing_consent: false,
  country: TS,
  postal_code: null
)
```

