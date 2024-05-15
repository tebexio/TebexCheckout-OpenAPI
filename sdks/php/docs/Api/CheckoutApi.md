# TebexCheckout\CheckoutApi

All URIs are relative to https://checkout.tebex.io/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**checkout()**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request |


## `checkout()`

```php
checkout($checkout_request): \TebexCheckout\Model\Basket
```

Create a checkout request

This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new TebexCheckout\Api\CheckoutApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$checkout_request = new \TebexCheckout\Model\CheckoutRequest(); // \TebexCheckout\Model\CheckoutRequest | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**

try {
    $result = $apiInstance->checkout($checkout_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CheckoutApi->checkout: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **checkout_request** | [**\TebexCheckout\Model\CheckoutRequest**](../Model/CheckoutRequest.md)| Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | [optional] |

### Return type

[**\TebexCheckout\Model\Basket**](../Model/Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
