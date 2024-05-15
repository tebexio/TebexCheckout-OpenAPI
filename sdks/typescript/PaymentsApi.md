# .PaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPaymentById**](PaymentsApi.md#getPaymentById) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID
[**refundPaymentById**](PaymentsApi.md#refundPaymentById) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID


# **getPaymentById**
> Payment getPaymentById()

This will fetch the given payment associated with this transaction id. Single payment transaction IDs begin with `tbx-`

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PaymentsApi(configuration);

let body:.PaymentsApiGetPaymentByIdRequest = {
  // string | The payment reference to fetch.
  txnId: "tbx-55fff4107740a1f40d844ff89607557f45bfafb3",
};

apiInstance.getPaymentById(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txnId** | [**string**] | The payment reference to fetch. | defaults to undefined


### Return type

**Payment**

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **refundPaymentById**
> Payment refundPaymentById()

This will refund the given payment associated with this transaction id.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PaymentsApi(configuration);

let body:.PaymentsApiRefundPaymentByIdRequest = {
  // string | The payment reference to refund.
  txnId: "tbx-55fff4107740a1f40d844ff89607557f45bfafb3",
};

apiInstance.refundPaymentById(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txnId** | [**string**] | The payment reference to refund. | defaults to undefined


### Return type

**Payment**

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


