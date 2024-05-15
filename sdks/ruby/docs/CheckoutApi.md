# OpenapiClient::CheckoutApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**checkout**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request |


## checkout

> <Basket> checkout(opts)

Create a checkout request

This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::CheckoutApi.new
opts = {
  checkout_request: OpenapiClient::CheckoutRequest.new({basket: OpenapiClient::CheckoutRequestBasket.new, items: [OpenapiClient::CheckoutItem.new]}) # CheckoutRequest | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
}

begin
  # Create a checkout request
  result = api_instance.checkout(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CheckoutApi->checkout: #{e}"
end
```

#### Using the checkout_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Basket>, Integer, Hash)> checkout_with_http_info(opts)

```ruby
begin
  # Create a checkout request
  data, status_code, headers = api_instance.checkout_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Basket>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CheckoutApi->checkout_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **checkout_request** | [**CheckoutRequest**](CheckoutRequest.md) | Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | [optional] |

### Return type

[**Basket**](Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

