# TebexCheckout\RecurringPaymentsAPI

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelRecurringPayment**](RecurringPaymentsAPI.md#CancelRecurringPayment) | **Delete** /recurring-payments/{reference} | Cancel a recurring payment
[**GetRecurringPayment**](RecurringPaymentsAPI.md#GetRecurringPayment) | **Get** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference
[**UpdateRecurringPayment**](RecurringPaymentsAPI.md#UpdateRecurringPayment) | **Put** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment
[**UpdateSubscription**](RecurringPaymentsAPI.md#UpdateSubscription) | **Put** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product



## CancelRecurringPayment

> RecurringPayment CancelRecurringPayment(ctx, reference).Execute()

Cancel a recurring payment



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	reference := "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The recurring payment reference to cancel.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RecurringPaymentsAPI.CancelRecurringPayment(context.Background(), reference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RecurringPaymentsAPI.CancelRecurringPayment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CancelRecurringPayment`: RecurringPayment
	fmt.Fprintf(os.Stdout, "Response from `RecurringPaymentsAPI.CancelRecurringPayment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reference** | **string** | The recurring payment reference to cancel. | 

### Other Parameters

Other parameters are passed through a pointer to a apiCancelRecurringPaymentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetRecurringPayment

> RecurringPayment GetRecurringPayment(ctx, reference).Execute()

Fetch a recurring payment (subscription) by its reference

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	reference := "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The recurring payment reference to fetch.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RecurringPaymentsAPI.GetRecurringPayment(context.Background(), reference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RecurringPaymentsAPI.GetRecurringPayment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetRecurringPayment`: RecurringPayment
	fmt.Fprintf(os.Stdout, "Response from `RecurringPaymentsAPI.GetRecurringPayment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reference** | **string** | The recurring payment reference to fetch. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetRecurringPaymentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateRecurringPayment

> RecurringPayment UpdateRecurringPayment(ctx, reference).UpdateRecurringPaymentRequest(updateRecurringPaymentRequest).Execute()

Pause or reactivate a recurring payment

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	reference := "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The recurring payment reference to update.
	updateRecurringPaymentRequest := *openapiclient.NewUpdateRecurringPaymentRequest("Active") // UpdateRecurringPaymentRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RecurringPaymentsAPI.UpdateRecurringPayment(context.Background(), reference).UpdateRecurringPaymentRequest(updateRecurringPaymentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RecurringPaymentsAPI.UpdateRecurringPayment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateRecurringPayment`: RecurringPayment
	fmt.Fprintf(os.Stdout, "Response from `RecurringPaymentsAPI.UpdateRecurringPayment`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reference** | **string** | The recurring payment reference to update. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateRecurringPaymentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateRecurringPaymentRequest** | [**UpdateRecurringPaymentRequest**](UpdateRecurringPaymentRequest.md) |  | 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateSubscription

> RecurringPayment UpdateSubscription(ctx, reference).UpdateSubscriptionRequest(updateSubscriptionRequest).Execute()

Update a subscription with a new product / amount to pay - replacing the existing product



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	reference := "tbx-r-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The recurring payment reference to fetch.
	updateSubscriptionRequest := *openapiclient.NewUpdateSubscriptionRequest() // UpdateSubscriptionRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RecurringPaymentsAPI.UpdateSubscription(context.Background(), reference).UpdateSubscriptionRequest(updateSubscriptionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RecurringPaymentsAPI.UpdateSubscription``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `UpdateSubscription`: RecurringPayment
	fmt.Fprintf(os.Stdout, "Response from `RecurringPaymentsAPI.UpdateSubscription`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**reference** | **string** | The recurring payment reference to fetch. | 

### Other Parameters

Other parameters are passed through a pointer to a apiUpdateSubscriptionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **updateSubscriptionRequest** | [**UpdateSubscriptionRequest**](UpdateSubscriptionRequest.md) |  | 

### Return type

[**RecurringPayment**](RecurringPayment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

