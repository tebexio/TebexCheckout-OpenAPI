# OpenapiClient::UpdateSubscriptionRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;Package&gt;**](Package.md) | An array containing the item to be added to the recurring payment. **Only 1 item is supported at this time.** | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateSubscriptionRequest.new(
  items: null
)
```

