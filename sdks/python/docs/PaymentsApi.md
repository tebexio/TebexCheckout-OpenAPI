# TebexCheckout.PaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_payment_by_id**](PaymentsApi.md#get_payment_by_id) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID
[**refund_payment_by_id**](PaymentsApi.md#refund_payment_by_id) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID


# **get_payment_by_id**
> Payment get_payment_by_id(txn_id)

Fetch a payment by its transaction ID

This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`

### Example


```python
import TebexCheckout
from TebexCheckout.models.payment import Payment
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
    api_instance = TebexCheckout.PaymentsApi(api_client)
    txn_id = 'tbx-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The payment reference to fetch.

    try:
        # Fetch a payment by its transaction ID
        api_response = api_instance.get_payment_by_id(txn_id)
        print("The response of PaymentsApi->get_payment_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentsApi->get_payment_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txn_id** | **str**| The payment reference to fetch. | 

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
**200** | Payment fetched successfully. |  -  |
**404** | Transaction not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refund_payment_by_id**
> Payment refund_payment_by_id(txn_id)

Refund a payment by its transaction ID

This will refund the given payment associated with this transaction id.

### Example


```python
import TebexCheckout
from TebexCheckout.models.payment import Payment
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
    api_instance = TebexCheckout.PaymentsApi(api_client)
    txn_id = 'tbx-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The payment reference to refund.

    try:
        # Refund a payment by its transaction ID
        api_response = api_instance.refund_payment_by_id(txn_id)
        print("The response of PaymentsApi->refund_payment_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PaymentsApi->refund_payment_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txn_id** | **str**| The payment reference to refund. | 

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
**200** | Payment refunded successfully. The payment details are returned. |  -  |
**404** | Payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

