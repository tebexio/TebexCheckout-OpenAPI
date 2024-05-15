# TebexCheckout\CheckoutAPI

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Checkout**](CheckoutAPI.md#Checkout) | **Post** /checkout | Create a checkout request



## Checkout

> Basket Checkout(ctx).CheckoutRequest(checkoutRequest).Execute()

Create a checkout request



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
	checkoutRequest := *openapiclient.NewCheckoutRequest(*openapiclient.NewCheckoutRequestBasket(), []openapiclient.CheckoutItem{*openapiclient.NewCheckoutItem()}) // CheckoutRequest | Provide a `Basket`, an array of `Packages` to be added to the basket, and an optional `Sale` to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.CheckoutAPI.Checkout(context.Background()).CheckoutRequest(checkoutRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `CheckoutAPI.Checkout``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `Checkout`: Basket
	fmt.Fprintf(os.Stdout, "Response from `CheckoutAPI.Checkout`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCheckoutRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkoutRequest** | [**CheckoutRequest**](CheckoutRequest.md) | Provide a &#x60;Basket&#x60;, an array of &#x60;Packages&#x60; to be added to the basket, and an optional &#x60;Sale&#x60; to complete the full checkout flow in one call. **Only one subscription item may be in the basket at a time.** | 

### Return type

[**Basket**](Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

