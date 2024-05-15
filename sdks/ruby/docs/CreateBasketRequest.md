# OpenapiClient::CreateBasketRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **return_url** | **String** | The URL a customer can return to without completing checkout | [optional] |
| **complete_url** | **String** | URL the customer can return to after completing payment | [optional] |
| **custom** | **Object** | Any custom data to be passed through the request. This will be returned in a post-completion webhook. | [optional] |
| **first_name** | **String** | The first name of the customer | [optional] |
| **last_name** | **String** | The last name of the customer | [optional] |
| **email** | **String** | The email address of the customer | [optional] |
| **expires_at** | **String** | An ISO8601 formatted date. After this date the basket cannot be used to checkout. | [optional] |
| **complete_auto_redirect** | **Boolean** | Automatically redirect to the complete_url provided | [optional] |
| **country** | **String** | An ISO 3166-1 alpha-2 character code representing the customer&#39;s country. | [optional] |
| **creator_code** | **String** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::CreateBasketRequest.new(
  return_url: https://example.tebex.io/,
  complete_url: https://example.tebex.io/complete,
  custom: {&quot;foo&quot;:&quot;bar&quot;},
  first_name: Neil,
  last_name: McNeil,
  email: example@tebex.io,
  expires_at: 2025-01-27T18:09:51Z,
  complete_auto_redirect: true,
  country: US,
  creator_code: null
)
```

