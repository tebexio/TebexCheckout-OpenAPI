# OpenapiClient::RevenueShare

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **wallet_ref** | **String** |  | [optional] |
| **amount** | **Float** | A float (decimal) value representing the amount of this payment in your account currency that is credited to the &#x60;wallet_ref&#x60; | [optional] |
| **gateway_fee_percent** | **Float** | A float (decimal) value representing the percentage of the gateway fee that should be dedicated from this wallet’s revenue share. This optional value can be anywhere between 0 - 100. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RevenueShare.new(
  wallet_ref: some_wallet_reference,
  amount: 0.5,
  gateway_fee_percent: 50.0
)
```

