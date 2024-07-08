# TebexCheckout.TebexCheckout.RecurringPaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CancelRecurringPayment**](RecurringPaymentsApi.md#cancelrecurringpayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment |
| [**GetRecurringPayment**](RecurringPaymentsApi.md#getrecurringpayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference |
| [**UpdateRecurringPayment**](RecurringPaymentsApi.md#updaterecurringpayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment |
| [**UpdateSubscription**](RecurringPaymentsApi.md#updatesubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product |

<a id="cancelrecurringpayment"></a>
# **CancelRecurringPayment**
> RecurringPayment CancelRecurringPayment (string reference)

Cancel a recurring payment

This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class CancelRecurringPaymentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new RecurringPaymentsApi(config);
            var reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The recurring payment reference to cancel.

            try
            {
                // Cancel a recurring payment
                RecurringPayment result = apiInstance.CancelRecurringPayment(reference);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RecurringPaymentsApi.CancelRecurringPayment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CancelRecurringPaymentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Cancel a recurring payment
    ApiResponse<RecurringPayment> response = apiInstance.CancelRecurringPaymentWithHttpInfo(reference);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RecurringPaymentsApi.CancelRecurringPaymentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reference** | **string** | The recurring payment reference to cancel. |  |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Recurring payment cancelled successfully. |  -  |
| **404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getrecurringpayment"></a>
# **GetRecurringPayment**
> RecurringPayment GetRecurringPayment (string reference)

Fetch a recurring payment (subscription) by its reference

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class GetRecurringPaymentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new RecurringPaymentsApi(config);
            var reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The recurring payment reference to fetch.

            try
            {
                // Fetch a recurring payment (subscription) by its reference
                RecurringPayment result = apiInstance.GetRecurringPayment(reference);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RecurringPaymentsApi.GetRecurringPayment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetRecurringPaymentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch a recurring payment (subscription) by its reference
    ApiResponse<RecurringPayment> response = apiInstance.GetRecurringPaymentWithHttpInfo(reference);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RecurringPaymentsApi.GetRecurringPaymentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reference** | **string** | The recurring payment reference to fetch. |  |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully fetched recurring payment. |  -  |
| **404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updaterecurringpayment"></a>
# **UpdateRecurringPayment**
> RecurringPayment UpdateRecurringPayment (string reference, UpdateRecurringPaymentRequest? updateRecurringPaymentRequest = null)

Pause or reactivate a recurring payment

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class UpdateRecurringPaymentExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new RecurringPaymentsApi(config);
            var reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The recurring payment reference to update.
            var updateRecurringPaymentRequest = new UpdateRecurringPaymentRequest?(); // UpdateRecurringPaymentRequest? |  (optional) 

            try
            {
                // Pause or reactivate a recurring payment
                RecurringPayment result = apiInstance.UpdateRecurringPayment(reference, updateRecurringPaymentRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RecurringPaymentsApi.UpdateRecurringPayment: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateRecurringPaymentWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Pause or reactivate a recurring payment
    ApiResponse<RecurringPayment> response = apiInstance.UpdateRecurringPaymentWithHttpInfo(reference, updateRecurringPaymentRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RecurringPaymentsApi.UpdateRecurringPaymentWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reference** | **string** | The recurring payment reference to update. |  |
| **updateRecurringPaymentRequest** | [**UpdateRecurringPaymentRequest?**](UpdateRecurringPaymentRequest?.md) |  | [optional]  |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully paused or reactivated a payment. The &#x60;RecurringPayment&#x60; is returned. |  -  |
| **422** | Unprocessible Entity. An invalid status was provided or the recurring payment cannot be processed. See ErrorResponse. |  -  |
| **404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatesubscription"></a>
# **UpdateSubscription**
> RecurringPayment UpdateSubscription (string reference, UpdateSubscriptionRequest? updateSubscriptionRequest = null)

Update a subscription with a new product / amount to pay - replacing the existing product

If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class UpdateSubscriptionExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new RecurringPaymentsApi(config);
            var reference = tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The recurring payment reference to fetch.
            var updateSubscriptionRequest = new UpdateSubscriptionRequest?(); // UpdateSubscriptionRequest? |  (optional) 

            try
            {
                // Update a subscription with a new product / amount to pay - replacing the existing product
                RecurringPayment result = apiInstance.UpdateSubscription(reference, updateSubscriptionRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling RecurringPaymentsApi.UpdateSubscription: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateSubscriptionWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update a subscription with a new product / amount to pay - replacing the existing product
    ApiResponse<RecurringPayment> response = apiInstance.UpdateSubscriptionWithHttpInfo(reference, updateSubscriptionRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling RecurringPaymentsApi.UpdateSubscriptionWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **reference** | **string** | The recurring payment reference to fetch. |  |
| **updateSubscriptionRequest** | [**UpdateSubscriptionRequest?**](UpdateSubscriptionRequest?.md) |  | [optional]  |

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated subscription. The updated &#x60;RecurringPayment&#x60; is returned. |  -  |
| **400** | Bad Request. |  -  |
| **404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

