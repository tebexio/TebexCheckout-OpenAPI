# OpenapiClient::Package

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. | [optional] |
| **price** | **Float** | A float (decimal describing the price of the package in your account currency) | [optional] |
| **expiry_period** | **String** | The renewal period of this item | [optional] |
| **expiry_length** | **Integer** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. | [optional] |
| **meta_data** | [**PackageMetaData**](PackageMetaData.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::Package.new(
  name: 1000 Gold,
  price: 1.27,
  expiry_period: month,
  expiry_length: 3,
  meta_data: null
)
```

