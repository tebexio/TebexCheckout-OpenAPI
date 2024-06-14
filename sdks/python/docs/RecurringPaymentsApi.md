# TebexCheckout.RecurringPaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_recurring_payment**](RecurringPaymentsApi.md#cancel_recurring_payment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment
[**get_recurring_payment**](RecurringPaymentsApi.md#get_recurring_payment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference
[**update_recurring_payment**](RecurringPaymentsApi.md#update_recurring_payment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment
[**update_subscription**](RecurringPaymentsApi.md#update_subscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product


# **cancel_recurring_payment**
> RecurringPayment cancel_recurring_payment(reference)

Cancel a recurring payment

This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`

### Example


```python
import TebexCheckout
from TebexCheckout.models.recurring_payment import RecurringPayment
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)


# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.RecurringPaymentsApi(api_client)
    reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The recurring payment reference to cancel.

    try:
        # Cancel a recurring payment
        api_response = api_instance.cancel_recurring_payment(reference)
        print("The response of RecurringPaymentsApi->cancel_recurring_payment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RecurringPaymentsApi->cancel_recurring_payment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **str**| The recurring payment reference to cancel. | 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Recurring payment cancelled successfully. |  -  |
**404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recurring_payment**
> RecurringPayment get_recurring_payment(reference)

Fetch a recurring payment (subscription) by its reference

### Example


```python
import TebexCheckout
from TebexCheckout.models.recurring_payment import RecurringPayment
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)


# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.RecurringPaymentsApi(api_client)
    reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The recurring payment reference to fetch.

    try:
        # Fetch a recurring payment (subscription) by its reference
        api_response = api_instance.get_recurring_payment(reference)
        print("The response of RecurringPaymentsApi->get_recurring_payment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RecurringPaymentsApi->get_recurring_payment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **str**| The recurring payment reference to fetch. | 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully fetched recurring payment. |  -  |
**404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_recurring_payment**
> RecurringPayment update_recurring_payment(reference, update_recurring_payment_request=update_recurring_payment_request)

Pause or reactivate a recurring payment

### Example


```python
import TebexCheckout
from TebexCheckout.models.recurring_payment import RecurringPayment
from TebexCheckout.models.update_recurring_payment_request import UpdateRecurringPaymentRequest
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)


# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.RecurringPaymentsApi(api_client)
    reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The recurring payment reference to update.
    update_recurring_payment_request = TebexCheckout.UpdateRecurringPaymentRequest() # UpdateRecurringPaymentRequest |  (optional)

    try:
        # Pause or reactivate a recurring payment
        api_response = api_instance.update_recurring_payment(reference, update_recurring_payment_request=update_recurring_payment_request)
        print("The response of RecurringPaymentsApi->update_recurring_payment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RecurringPaymentsApi->update_recurring_payment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **str**| The recurring payment reference to update. | 
 **update_recurring_payment_request** | [**UpdateRecurringPaymentRequest**](UpdateRecurringPaymentRequest.md)|  | [optional] 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully paused or reactivated a payment. The &#x60;RecurringPayment&#x60; is returned. |  -  |
**422** | Unprocessible Entity. An invalid status was provided or the recurring payment cannot be processed. See ErrorResponse. |  -  |
**404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_subscription**
> RecurringPayment update_subscription(reference, update_subscription_request=update_subscription_request)

Update a subscription with a new product / amount to pay - replacing the existing product

If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Example


```python
import TebexCheckout
from TebexCheckout.models.recurring_payment import RecurringPayment
from TebexCheckout.models.update_subscription_request import UpdateSubscriptionRequest
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)


# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.RecurringPaymentsApi(api_client)
    reference = 'tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The recurring payment reference to fetch.
    update_subscription_request = TebexCheckout.UpdateSubscriptionRequest() # UpdateSubscriptionRequest |  (optional)

    try:
        # Update a subscription with a new product / amount to pay - replacing the existing product
        api_response = api_instance.update_subscription(reference, update_subscription_request=update_subscription_request)
        print("The response of RecurringPaymentsApi->update_subscription:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RecurringPaymentsApi->update_subscription: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **str**| The recurring payment reference to fetch. | 
 **update_subscription_request** | [**UpdateSubscriptionRequest**](UpdateSubscriptionRequest.md)|  | [optional] 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated subscription. The updated &#x60;RecurringPayment&#x60; is returned. |  -  |
**400** | Bad Request. |  -  |
**404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

