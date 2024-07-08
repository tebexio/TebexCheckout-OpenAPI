# PaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPaymentById**](PaymentsApi.md#getPaymentById) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID |
| [**refundPaymentById**](PaymentsApi.md#refundPaymentById) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID |


<a name="getPaymentById"></a>
# **getPaymentById**
> Payment getPaymentById(txnId)

Fetch a payment by its transaction ID

    This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with &#x60;tbx-&#x60;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **txnId** | **String**| The payment reference to fetch. | [default to null] |

### Return type

[**Payment**](../Models/Payment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="refundPaymentById"></a>
# **refundPaymentById**
> Payment refundPaymentById(txnId)

Refund a payment by its transaction ID

    This will refund the given payment associated with this transaction id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **txnId** | **String**| The payment reference to refund. | [default to null] |

### Return type

[**Payment**](../Models/Payment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

