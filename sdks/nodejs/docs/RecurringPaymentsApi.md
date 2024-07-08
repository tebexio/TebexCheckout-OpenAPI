# TebexCheckoutApi.RecurringPaymentsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelRecurringPayment**](RecurringPaymentsApi.md#cancelRecurringPayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment
[**getRecurringPayment**](RecurringPaymentsApi.md#getRecurringPayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference
[**updateRecurringPayment**](RecurringPaymentsApi.md#updateRecurringPayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment
[**updateSubscription**](RecurringPaymentsApi.md#updateSubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product



## cancelRecurringPayment

> RecurringPayment cancelRecurringPayment(reference)

Cancel a recurring payment

This cancels the recurring payment for the reference provided. Recurring payment references start with &#x60;tbx-r-&#x60;

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.RecurringPaymentsApi();
let reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to cancel.
apiInstance.cancelRecurringPayment(reference, (error, data, response) => {
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
 **reference** | **String**| The recurring payment reference to cancel. | 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRecurringPayment

> RecurringPayment getRecurringPayment(reference)

Fetch a recurring payment (subscription) by its reference

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.RecurringPaymentsApi();
let reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to fetch.
apiInstance.getRecurringPayment(reference, (error, data, response) => {
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
 **reference** | **String**| The recurring payment reference to fetch. | 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateRecurringPayment

> RecurringPayment updateRecurringPayment(reference, opts)

Pause or reactivate a recurring payment

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.RecurringPaymentsApi();
let reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to update.
let opts = {
  'updateRecurringPaymentRequest': new TebexCheckoutApi.UpdateRecurringPaymentRequest() // UpdateRecurringPaymentRequest | 
};
apiInstance.updateRecurringPayment(reference, opts, (error, data, response) => {
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
 **reference** | **String**| The recurring payment reference to update. | 
 **updateRecurringPaymentRequest** | [**UpdateRecurringPaymentRequest**](UpdateRecurringPaymentRequest.md)|  | [optional] 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateSubscription

> RecurringPayment updateSubscription(reference, opts)

Update a subscription with a new product / amount to pay - replacing the existing product

If the new subscription amount is higher than the existing amount, a pro-rata charge will be made to cover the cost of the new price up until the next billing date.   **This endpoint requires prior approval - please contact your account manager.**

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.RecurringPaymentsApi();
let reference = "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The recurring payment reference to fetch.
let opts = {
  'updateSubscriptionRequest': new TebexCheckoutApi.UpdateSubscriptionRequest() // UpdateSubscriptionRequest | 
};
apiInstance.updateSubscription(reference, opts, (error, data, response) => {
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
 **reference** | **String**| The recurring payment reference to fetch. | 
 **updateSubscriptionRequest** | [**UpdateSubscriptionRequest**](UpdateSubscriptionRequest.md)|  | [optional] 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

