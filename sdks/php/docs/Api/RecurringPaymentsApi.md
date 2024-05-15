# TebexCheckout\RecurringPaymentsApi

All URIs are relative to https://checkout.tebex.io/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelRecurringPayment()**](RecurringPaymentsApi.md#cancelRecurringPayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment |
| [**getRecurringPayment()**](RecurringPaymentsApi.md#getRecurringPayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference |
| [**updateRecurringPayment()**](RecurringPaymentsApi.md#updateRecurringPayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment |
| [**updateSubscription()**](RecurringPaymentsApi.md#updateSubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product |


## `cancelRecurringPayment()`

```php
cancelRecurringPayment($reference): \TebexCheckout\Model\RecurringPayment
```

Cancel a recurring payment

This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new TebexCheckout\Api\RecurringPaymentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The recurring payment reference to cancel.

try {
    $result = $apiInstance->cancelRecurringPayment($reference);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RecurringPaymentsApi->cancelRecurringPayment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reference** | **string**| The recurring payment reference to cancel. | |

### Return type

[**\TebexCheckout\Model\RecurringPayment**](../Model/RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getRecurringPayment()`

```php
getRecurringPayment($reference): \TebexCheckout\Model\RecurringPayment
```

Fetch a recurring payment (subscription) by its reference

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new TebexCheckout\Api\RecurringPaymentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The recurring payment reference to fetch.

try {
    $result = $apiInstance->getRecurringPayment($reference);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RecurringPaymentsApi->getRecurringPayment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reference** | **string**| The recurring payment reference to fetch. | |

### Return type

[**\TebexCheckout\Model\RecurringPayment**](../Model/RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateRecurringPayment()`

```php
updateRecurringPayment($reference, $update_recurring_payment_request): \TebexCheckout\Model\RecurringPayment
```

Pause or reactivate a recurring payment

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new TebexCheckout\Api\RecurringPaymentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The recurring payment reference to update.
$update_recurring_payment_request = new \TebexCheckout\Model\UpdateRecurringPaymentRequest(); // \TebexCheckout\Model\UpdateRecurringPaymentRequest

try {
    $result = $apiInstance->updateRecurringPayment($reference, $update_recurring_payment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RecurringPaymentsApi->updateRecurringPayment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reference** | **string**| The recurring payment reference to update. | |
| **update_recurring_payment_request** | [**\TebexCheckout\Model\UpdateRecurringPaymentRequest**](../Model/UpdateRecurringPaymentRequest.md)|  | [optional] |

### Return type

[**\TebexCheckout\Model\RecurringPayment**](../Model/RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateSubscription()`

```php
updateSubscription($reference, $update_subscription_request): \TebexCheckout\Model\RecurringPayment
```

Update a subscription with a new product / amount to pay - replacing the existing product

If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new TebexCheckout\Api\RecurringPaymentsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The recurring payment reference to fetch.
$update_subscription_request = new \TebexCheckout\Model\UpdateSubscriptionRequest(); // \TebexCheckout\Model\UpdateSubscriptionRequest

try {
    $result = $apiInstance->updateSubscription($reference, $update_subscription_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling RecurringPaymentsApi->updateSubscription: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reference** | **string**| The recurring payment reference to fetch. | |
| **update_subscription_request** | [**\TebexCheckout\Model\UpdateSubscriptionRequest**](../Model/UpdateSubscriptionRequest.md)|  | [optional] |

### Return type

[**\TebexCheckout\Model\RecurringPayment**](../Model/RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
