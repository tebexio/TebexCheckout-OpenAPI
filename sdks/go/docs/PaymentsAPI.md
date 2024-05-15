# TebexCheckout\PaymentsAPI

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPaymentById**](PaymentsAPI.md#GetPaymentById) | **Get** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID
[**RefundPaymentById**](PaymentsAPI.md#RefundPaymentById) | **Post** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID



## GetPaymentById

> Payment GetPaymentById(ctx, txnId).Execute()

Fetch a payment by its transaction ID



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
	txnId := "tbx-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The payment reference to fetch.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsAPI.GetPaymentById(context.Background(), txnId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsAPI.GetPaymentById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetPaymentById`: Payment
	fmt.Fprintf(os.Stdout, "Response from `PaymentsAPI.GetPaymentById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**txnId** | **string** | The payment reference to fetch. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetPaymentByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RefundPaymentById

> Payment RefundPaymentById(ctx, txnId).Execute()

Refund a payment by its transaction ID



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
	txnId := "tbx-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The payment reference to refund.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.PaymentsAPI.RefundPaymentById(context.Background(), txnId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `PaymentsAPI.RefundPaymentById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `RefundPaymentById`: Payment
	fmt.Fprintf(os.Stdout, "Response from `PaymentsAPI.RefundPaymentById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**txnId** | **string** | The payment reference to refund. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRefundPaymentByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Payment**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

