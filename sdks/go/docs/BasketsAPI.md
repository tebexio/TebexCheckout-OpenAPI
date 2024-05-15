# TebexCheckout\BasketsAPI

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddPackage**](BasketsAPI.md#AddPackage) | **Post** /baskets/{ident}/packages | Add a package to the basket
[**AddSaleToBasket**](BasketsAPI.md#AddSaleToBasket) | **Post** /baskets/{ident}/sales | Add a sale to the basket
[**CreateBasket**](BasketsAPI.md#CreateBasket) | **Post** /baskets | Create a basket that can be used to pay for items
[**GetBasketById**](BasketsAPI.md#GetBasketById) | **Get** /baskets/{ident} | Fetch a basket by its identifier
[**RemoveRowFromBasket**](BasketsAPI.md#RemoveRowFromBasket) | **Delete** /baskets/{ident}/packages/{row.id} | Remove a row from the basket



## AddPackage

> Basket AddPackage(ctx, ident).AddPackageRequest(addPackageRequest).Execute()

Add a package to the basket



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
	ident := "1a-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The basket identifier.
	addPackageRequest := *openapiclient.NewAddPackageRequest() // AddPackageRequest |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BasketsAPI.AddPackage(context.Background(), ident).AddPackageRequest(addPackageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BasketsAPI.AddPackage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddPackage`: Basket
	fmt.Fprintf(os.Stdout, "Response from `BasketsAPI.AddPackage`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**ident** | **string** | The basket identifier. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddPackageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **addPackageRequest** | [**AddPackageRequest**](AddPackageRequest.md) |  | 

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


## AddSaleToBasket

> Basket AddSaleToBasket(ctx, ident).Sale(sale).Execute()

Add a sale to the basket



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
	ident := "1a-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The basket identifier.
	sale := *openapiclient.NewSale() // Sale | Provide a `Sale` as an object to apply it to the basket. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BasketsAPI.AddSaleToBasket(context.Background(), ident).Sale(sale).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BasketsAPI.AddSaleToBasket``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddSaleToBasket`: Basket
	fmt.Fprintf(os.Stdout, "Response from `BasketsAPI.AddSaleToBasket`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**ident** | **string** | The basket identifier. | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddSaleToBasketRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **sale** | [**Sale**](Sale.md) | Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | 

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


## CreateBasket

> Basket CreateBasket(ctx).CreateBasketRequest(createBasketRequest).Execute()

Create a basket that can be used to pay for items



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
	createBasketRequest := *openapiclient.NewCreateBasketRequest() // CreateBasketRequest | Create a basket, returning the full basket object and payment link. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BasketsAPI.CreateBasket(context.Background()).CreateBasketRequest(createBasketRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BasketsAPI.CreateBasket``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateBasket`: Basket
	fmt.Fprintf(os.Stdout, "Response from `BasketsAPI.CreateBasket`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCreateBasketRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBasketRequest** | [**CreateBasketRequest**](CreateBasketRequest.md) | Create a basket, returning the full basket object and payment link. | 

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


## GetBasketById

> Basket GetBasketById(ctx, ident).Execute()

Fetch a basket by its identifier



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
	ident := "1a-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The basket identifier.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.BasketsAPI.GetBasketById(context.Background(), ident).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BasketsAPI.GetBasketById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetBasketById`: Basket
	fmt.Fprintf(os.Stdout, "Response from `BasketsAPI.GetBasketById`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**ident** | **string** | The basket identifier. | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetBasketByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Basket**](Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RemoveRowFromBasket

> RemoveRowFromBasket(ctx, ident, rowId).Execute()

Remove a row from the basket



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
	ident := "1a-55fff4107740a1f40d844ff89607557f45bfafb3" // string | The basket identifier.
	rowId := int32(1) // int32 | The `id` of the `basket.rows` row to remove.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.BasketsAPI.RemoveRowFromBasket(context.Background(), ident, rowId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `BasketsAPI.RemoveRowFromBasket``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**ident** | **string** | The basket identifier. | 
**rowId** | **int32** | The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | 

### Other Parameters

Other parameters are passed through a pointer to a apiRemoveRowFromBasketRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

