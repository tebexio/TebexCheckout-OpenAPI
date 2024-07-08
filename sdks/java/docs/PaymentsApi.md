# PaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentById**](PaymentsApi.md#getPaymentById) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID |
| [**refundPaymentById**](PaymentsApi.md#refundPaymentById) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID |


<a id="getPaymentById"></a>
# **getPaymentById**
> Payment getPaymentById(txnId)

Fetch a payment by its transaction ID

This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with &#x60;tbx-&#x60;

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String txnId = "tbx-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The payment reference to fetch.
    try {
      Payment result = apiInstance.getPaymentById(txnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#getPaymentById");
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
| **txnId** | **String**| The payment reference to fetch. | |

### Return type

[**Payment**](Payment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment fetched successfully. |  -  |
| **404** | Transaction not found. |  -  |

<a id="refundPaymentById"></a>
# **refundPaymentById**
> Payment refundPaymentById(txnId)

Refund a payment by its transaction ID

This will refund the given payment associated with this transaction id.

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String txnId = "tbx-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The payment reference to refund.
    try {
      Payment result = apiInstance.refundPaymentById(txnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#refundPaymentById");
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
| **txnId** | **String**| The payment reference to refund. | |

### Return type

[**Payment**](Payment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment refunded successfully. The payment details are returned. |  -  |
| **422** | The payment cannot be refunded. Payments can only be refunded when a payment&#39;s &#x60;status&#x60; is Completed. |  -  |
| **404** | Payment not found. |  -  |

