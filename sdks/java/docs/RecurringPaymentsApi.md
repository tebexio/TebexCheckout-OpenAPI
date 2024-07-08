# RecurringPaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecurringPayment**](RecurringPaymentsApi.md#cancelRecurringPayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment |
| [**getRecurringPayment**](RecurringPaymentsApi.md#getRecurringPayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference |
| [**updateRecurringPayment**](RecurringPaymentsApi.md#updateRecurringPayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment |
| [**updateSubscription**](RecurringPaymentsApi.md#updateSubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product |


<a id="cancelRecurringPayment"></a>
# **cancelRecurringPayment**
> RecurringPayment cancelRecurringPayment(reference)

Cancel a recurring payment

This cancels the recurring payment for the reference provided. Recurring payment references start with &#x60;tbx-r-&#x60;

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.RecurringPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    RecurringPaymentsApi apiInstance = new RecurringPaymentsApi(defaultClient);
    String reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to cancel.
    try {
      RecurringPayment result = apiInstance.cancelRecurringPayment(reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringPaymentsApi#cancelRecurringPayment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to cancel. | |

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

<a id="getRecurringPayment"></a>
# **getRecurringPayment**
> RecurringPayment getRecurringPayment(reference)

Fetch a recurring payment (subscription) by its reference

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.RecurringPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    RecurringPaymentsApi apiInstance = new RecurringPaymentsApi(defaultClient);
    String reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to fetch.
    try {
      RecurringPayment result = apiInstance.getRecurringPayment(reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringPaymentsApi#getRecurringPayment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to fetch. | |

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

<a id="updateRecurringPayment"></a>
# **updateRecurringPayment**
> RecurringPayment updateRecurringPayment(reference, updateRecurringPaymentRequest)

Pause or reactivate a recurring payment

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.RecurringPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    RecurringPaymentsApi apiInstance = new RecurringPaymentsApi(defaultClient);
    String reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to update.
    UpdateRecurringPaymentRequest updateRecurringPaymentRequest = new UpdateRecurringPaymentRequest(); // UpdateRecurringPaymentRequest | 
    try {
      RecurringPayment result = apiInstance.updateRecurringPayment(reference, updateRecurringPaymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringPaymentsApi#updateRecurringPayment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to update. | |
| **updateRecurringPaymentRequest** | [**UpdateRecurringPaymentRequest**](UpdateRecurringPaymentRequest.md)|  | [optional] |

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

<a id="updateSubscription"></a>
# **updateSubscription**
> RecurringPayment updateSubscription(reference, updateSubscriptionRequest)

Update a subscription with a new product / amount to pay - replacing the existing product

If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.RecurringPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    RecurringPaymentsApi apiInstance = new RecurringPaymentsApi(defaultClient);
    String reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to fetch.
    UpdateSubscriptionRequest updateSubscriptionRequest = new UpdateSubscriptionRequest(); // UpdateSubscriptionRequest | 
    try {
      RecurringPayment result = apiInstance.updateSubscription(reference, updateSubscriptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecurringPaymentsApi#updateSubscription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reference** | **String**| The recurring payment reference to fetch. | |
| **updateSubscriptionRequest** | [**UpdateSubscriptionRequest**](UpdateSubscriptionRequest.md)|  | [optional] |

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

