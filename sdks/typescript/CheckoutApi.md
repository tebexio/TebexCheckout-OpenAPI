# .CheckoutApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkout**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request


# **checkout**
> Basket checkout()

This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CheckoutApi(configuration);

let body:.CheckoutApiCheckoutRequest = {
  // CheckoutRequest | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional)
  checkoutRequest: null,
};

apiInstance.checkout(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutRequest** | **CheckoutRequest**| Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** |


### Return type

**Basket**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully created basket. The basket will be returned with &#x60;links&#x60; containing the URLs you should direct the customer to in order to complete payment. |  -  |
**400** | Bad Request. See ErrorResponse. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


