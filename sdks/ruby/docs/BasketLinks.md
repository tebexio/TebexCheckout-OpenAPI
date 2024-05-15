# OpenapiClient::BasketLinks

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **payment** | **String** | The &#x60;links.payment&#x60; property is only returned if the basket has been paid for and a payment exists with the &#x60;complete&#x60;,&#x60;refund&#x60;, or &#x60;chargeback&#x60; status. | [optional] |
| **checkout** | **String** | The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to make payment | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::BasketLinks.new(
  payment: https://checkout.tebex.io/api/payments/tbx-12345,
  checkout: https://checkout.tebex.io/checkout/1a-55fff4107740a1f40d844ff89607557f45bfafb3
)
```

