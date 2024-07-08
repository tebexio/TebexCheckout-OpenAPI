# TebexCheckoutApi.CheckoutApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkout**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request



## checkout

> Basket checkout(opts)

Create a checkout request

This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.CheckoutApi();
let opts = {
  'checkoutRequest': new TebexCheckoutApi.CheckoutRequest() // CheckoutRequest | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.**
};
apiInstance.checkout(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutRequest** | [**CheckoutRequest**](CheckoutRequest.md)| Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | [optional] 

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

