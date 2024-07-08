# TebexCheckout.TebexCheckout.CheckoutApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**Checkout**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request |

<a id="checkout"></a>
# **Checkout**
> Basket Checkout (CheckoutRequest? checkoutRequest = null)

Create a checkout request

This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class CheckoutExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new CheckoutApi(config);
            var checkoutRequest = new CheckoutRequest?(); // CheckoutRequest? | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional) 

            try
            {
                // Create a checkout request
                Basket result = apiInstance.Checkout(checkoutRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CheckoutApi.Checkout: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CheckoutWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a checkout request
    ApiResponse<Basket> response = apiInstance.CheckoutWithHttpInfo(checkoutRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CheckoutApi.CheckoutWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **checkoutRequest** | [**CheckoutRequest?**](CheckoutRequest?.md) | Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | [optional]  |

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created basket. The basket will be returned with &#x60;links&#x60; containing the URLs you should direct the customer to in order to complete payment. |  -  |
| **400** | Bad Request. See ErrorResponse. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

