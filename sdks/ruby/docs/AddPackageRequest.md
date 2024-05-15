# OpenapiClient::AddPackageRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **package** | [**Package**](Package.md) |  | [optional] |
| **qty** | **Integer** | The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket. | [optional] |
| **type** | **String** | The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;. | [optional] |
| **revenue_share** | [**Array&lt;RevenueShare&gt;**](RevenueShare.md) | An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.** | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::AddPackageRequest.new(
  package: null,
  qty: 2,
  type: single,
  revenue_share: null
)
```

