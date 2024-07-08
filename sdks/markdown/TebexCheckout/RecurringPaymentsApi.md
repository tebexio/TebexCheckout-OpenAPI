# RecurringPaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecurringPayment**](RecurringPaymentsApi.md#cancelRecurringPayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment |
| [**getRecurringPayment**](RecurringPaymentsApi.md#getRecurringPayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference |
| [**updateRecurringPayment**](RecurringPaymentsApi.md#updateRecurringPayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment |
| [**updateSubscription**](RecurringPaymentsApi.md#updateSubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product |


<a name="cancelRecurringPayment"></a>
# **cancelRecurringPayment**
> RecurringPayment cancelRecurringPayment(reference)

Cancel a recurring payment

    This cancels the recurring payment for the reference provided. Recurring payment references start with &#x60;tbx-r-&#x60;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to cancel. | [default to null] |

### Return type

[**RecurringPayment**](../Models/RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getRecurringPayment"></a>
# **getRecurringPayment**
> RecurringPayment getRecurringPayment(reference)

Fetch a recurring payment (subscription) by its reference

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to fetch. | [default to null] |

### Return type

[**RecurringPayment**](../Models/RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="updateRecurringPayment"></a>
# **updateRecurringPayment**
> RecurringPayment updateRecurringPayment(reference, updateRecurringPayment\_request)

Pause or reactivate a recurring payment

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to update. | [default to null] |
| **updateRecurringPayment\_request** | [**updateRecurringPayment_request**](../Models/updateRecurringPayment_request.md)|  | [optional] |

### Return type

[**RecurringPayment**](../Models/RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateSubscription"></a>
# **updateSubscription**
> RecurringPayment updateSubscription(reference, updateSubscription\_request)

Update a subscription with a new product / amount to pay - replacing the existing product

    If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to fetch. | [default to null] |
| **updateSubscription\_request** | [**updateSubscription_request**](../Models/updateSubscription_request.md)|  | [optional] |

### Return type

[**RecurringPayment**](../Models/RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

