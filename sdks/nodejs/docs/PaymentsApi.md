# TebexCheckoutApi.PaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentById**](PaymentsApi.md#getPaymentById) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID
[**refundPaymentById**](PaymentsApi.md#refundPaymentById) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID



## getPaymentById

> Payment getPaymentById(txnId)

Fetch a payment by its transaction ID

This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with &#x60;tbx-&#x60;

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';

let apiInstance = new TebexCheckoutApi.PaymentsApi();
let txnId = "tbx-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The payment reference to fetch.
apiInstance.getPaymentById(txnId, (error, data, response) => {
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
 **txnId** | **String**| The payment reference to fetch. | 

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## refundPaymentById

> Payment refundPaymentById(txnId)

Refund a payment by its transaction ID

This will refund the given payment associated with this transaction id.

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';

let apiInstance = new TebexCheckoutApi.PaymentsApi();
let txnId = "tbx-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The payment reference to refund.
apiInstance.refundPaymentById(txnId, (error, data, response) => {
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
 **txnId** | **String**| The payment reference to refund. | 

### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

