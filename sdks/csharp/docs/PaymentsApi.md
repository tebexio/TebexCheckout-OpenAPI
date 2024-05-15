# TebexCheckout.TebexCheckout.PaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetPaymentById**](PaymentsApi.md#getpaymentbyid) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID |
| [**RefundPaymentById**](PaymentsApi.md#refundpaymentbyid) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID |

<a id="getpaymentbyid"></a>
# **GetPaymentById**
> Payment GetPaymentById (string txnId)

Fetch a payment by its transaction ID

This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class GetPaymentByIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            var apiInstance = new PaymentsApi(config);
            var txnId = tbx-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The payment reference to fetch.

            try
            {
                // Fetch a payment by its transaction ID
                Payment result = apiInstance.GetPaymentById(txnId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PaymentsApi.GetPaymentById: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetPaymentByIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch a payment by its transaction ID
    ApiResponse<Payment> response = apiInstance.GetPaymentByIdWithHttpInfo(txnId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PaymentsApi.GetPaymentByIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **txnId** | **string** | The payment reference to fetch. |  |

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment fetched successfully. |  -  |
| **404** | Transaction not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="refundpaymentbyid"></a>
# **RefundPaymentById**
> Payment RefundPaymentById (string txnId)

Refund a payment by its transaction ID

This will refund the given payment associated with this transaction id.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class RefundPaymentByIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            var apiInstance = new PaymentsApi(config);
            var txnId = tbx-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The payment reference to refund.

            try
            {
                // Refund a payment by its transaction ID
                Payment result = apiInstance.RefundPaymentById(txnId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PaymentsApi.RefundPaymentById: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RefundPaymentByIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Refund a payment by its transaction ID
    ApiResponse<Payment> response = apiInstance.RefundPaymentByIdWithHttpInfo(txnId);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PaymentsApi.RefundPaymentByIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **txnId** | **string** | The payment reference to refund. |  |

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment refunded successfully. The payment details are returned. |  -  |
| **404** | Payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

