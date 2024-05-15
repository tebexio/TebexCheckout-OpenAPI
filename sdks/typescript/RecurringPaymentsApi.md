# .RecurringPaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRecurringPayment**](RecurringPaymentsApi.md#cancelRecurringPayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment
[**getRecurringPayment**](RecurringPaymentsApi.md#getRecurringPayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference
[**updateRecurringPayment**](RecurringPaymentsApi.md#updateRecurringPayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment
[**updateSubscription**](RecurringPaymentsApi.md#updateSubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product


# **cancelRecurringPayment**
> RecurringPayment cancelRecurringPayment()

This cancels the recurring payment for the reference provided. Recurring payment references start with `tbx-r-`

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RecurringPaymentsApi(configuration);

let body:.RecurringPaymentsApiCancelRecurringPaymentRequest = {
  // string | The recurring payment reference to cancel.
  reference: "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3",
};

apiInstance.cancelRecurringPayment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | [**string**] | The recurring payment reference to cancel. | defaults to undefined


### Return type

**RecurringPayment**

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getRecurringPayment**
> RecurringPayment getRecurringPayment()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RecurringPaymentsApi(configuration);

let body:.RecurringPaymentsApiGetRecurringPaymentRequest = {
  // string | The recurring payment reference to fetch.
  reference: "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3",
};

apiInstance.getRecurringPayment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | [**string**] | The recurring payment reference to fetch. | defaults to undefined


### Return type

**RecurringPayment**

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateRecurringPayment**
> RecurringPayment updateRecurringPayment()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RecurringPaymentsApi(configuration);

let body:.RecurringPaymentsApiUpdateRecurringPaymentRequest = {
  // string | The recurring payment reference to update.
  reference: "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3",
  // UpdateRecurringPaymentRequest (optional)
  updateRecurringPaymentRequest: null,
};

apiInstance.updateRecurringPayment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateRecurringPaymentRequest** | **UpdateRecurringPaymentRequest**|  |
 **reference** | [**string**] | The recurring payment reference to update. | defaults to undefined


### Return type

**RecurringPayment**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully paused or reactivated a payment. The &#x60;RecurringPayment&#x60; is returned. |  -  |
**400** | Bad Request. See ErrorResponse. |  -  |
**404** | Recurring payment not found. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateSubscription**
> RecurringPayment updateSubscription()

If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RecurringPaymentsApi(configuration);

let body:.RecurringPaymentsApiUpdateSubscriptionRequest = {
  // string | The recurring payment reference to fetch.
  reference: "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3",
  // UpdateSubscriptionRequest (optional)
  updateSubscriptionRequest: null,
};

apiInstance.updateSubscription(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateSubscriptionRequest** | **UpdateSubscriptionRequest**|  |
 **reference** | [**string**] | The recurring payment reference to fetch. | defaults to undefined


### Return type

**RecurringPayment**

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

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


