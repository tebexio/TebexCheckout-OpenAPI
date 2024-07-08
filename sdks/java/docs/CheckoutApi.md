# CheckoutApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkout**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request |


<a id="checkout"></a>
# **checkout**
> Basket checkout(checkoutRequest)

Create a checkout request

This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.CheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    CheckoutApi apiInstance = new CheckoutApi(defaultClient);
    CheckoutRequest checkoutRequest = new CheckoutRequest(); // CheckoutRequest | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
    try {
      Basket result = apiInstance.checkout(checkoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckoutApi#checkout");
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
| **checkoutRequest** | [**CheckoutRequest**](CheckoutRequest.md)| Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | [optional] |

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

