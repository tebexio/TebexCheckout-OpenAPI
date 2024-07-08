# TebexCheckout.CheckoutApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkout**](CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request


# **checkout**
> Basket checkout(checkout_request=checkout_request)

Create a checkout request

This API call allows the complete checkout flow (create basket, add items, add sale) to be made in a single API call, for when the Seller is managing the basket locally. **This endpoint requires prior approval - please contact your account manager.**

### Example

* Basic Authentication (tebex_checkout_auth_basic):

```python
import TebexCheckout
from TebexCheckout.models.basket import Basket
from TebexCheckout.models.checkout_request import CheckoutRequest
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: tebex_checkout_auth_basic
configuration = TebexCheckout.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.CheckoutApi(api_client)
    checkout_request = TebexCheckout.CheckoutRequest() # CheckoutRequest | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional)

    try:
        # Create a checkout request
        api_response = api_instance.checkout(checkout_request=checkout_request)
        print("The response of CheckoutApi->checkout:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CheckoutApi->checkout: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkout_request** | [**CheckoutRequest**](CheckoutRequest.md)| Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | [optional] 

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
**200** | Successfully created basket. The basket will be returned with &#x60;links&#x60; containing the URLs you should direct the customer to in order to complete payment. |  -  |
**400** | Bad Request. See ErrorResponse. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

