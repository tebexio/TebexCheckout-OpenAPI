# TebexCheckout\PaymentsApi

All URIs are relative to https://checkout.tebex.io/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getPaymentById()**](PaymentsApi.md#getPaymentById) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID |
| [**refundPaymentById()**](PaymentsApi.md#refundPaymentById) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID |


## `getPaymentById()`

```php
getPaymentById($txn_id): \TebexCheckout\Model\Payment
```

Fetch a payment by its transaction ID

This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: tebex_checkout_auth_basic
$config = TebexCheckout\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new TebexCheckout\Api\PaymentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$txn_id = tbx-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The payment reference to fetch.

try {
    $result = $apiInstance->getPaymentById($txn_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentsApi->getPaymentById: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **txn_id** | **string**| The payment reference to fetch. | |

### Return type

[**\TebexCheckout\Model\Payment**](../Model/Payment.md)

### Authorization

[tebex_checkout_auth_basic](../../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `refundPaymentById()`

```php
refundPaymentById($txn_id): \TebexCheckout\Model\Payment
```

Refund a payment by its transaction ID

This will refund the given payment associated with this transaction id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: tebex_checkout_auth_basic
$config = TebexCheckout\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new TebexCheckout\Api\PaymentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$txn_id = tbx-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The payment reference to refund.

try {
    $result = $apiInstance->refundPaymentById($txn_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentsApi->refundPaymentById: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **txn_id** | **string**| The payment reference to refund. | |

### Return type

[**\TebexCheckout\Model\Payment**](../Model/Payment.md)

### Authorization

[tebex_checkout_auth_basic](../../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
