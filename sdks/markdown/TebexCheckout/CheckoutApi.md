# CheckoutApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkout**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request |


<a name="checkout"></a>
# **checkout**
> Basket checkout(checkout\_request)

Create a checkout request

    This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **checkout\_request** | [**checkout_request**](../Models/checkout_request.md)| Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | [optional] |

### Return type

[**Basket**](../Models/Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

