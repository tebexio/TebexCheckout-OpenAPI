# TebexCheckoutApi.BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPackage**](BasketsApi.md#addPackage) | **POST** /baskets/{ident}/packages | Add a package to the basket
[**addSaleToBasket**](BasketsApi.md#addSaleToBasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket
[**createBasket**](BasketsApi.md#createBasket) | **POST** /baskets | Create a basket that can be used to pay for items
[**getBasketById**](BasketsApi.md#getBasketById) | **GET** /baskets/{ident} | Fetch a basket by its identifier
[**removeRowFromBasket**](BasketsApi.md#removeRowFromBasket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket
[**updateBasket**](BasketsApi.md#updateBasket) | **PUT** /baskets/{ident} | Update a basket&#39;s details, including expiry date.



## addPackage

> Basket addPackage(ident, opts)

Add a package to the basket

This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.BasketsApi();
let ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
let opts = {
  'addPackageRequest': new TebexCheckoutApi.AddPackageRequest() // AddPackageRequest | 
};
apiInstance.addPackage(ident, opts, (error, data, response) => {
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
 **ident** | **String**| The basket identifier. | 
 **addPackageRequest** | [**AddPackageRequest**](AddPackageRequest.md)|  | [optional] 

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## addSaleToBasket

> Basket addSaleToBasket(ident, opts)

Add a sale to the basket

Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.BasketsApi();
let ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
let opts = {
  'sale': new TebexCheckoutApi.Sale() // Sale | Provide a `Sale` as an object to apply it to the basket.
};
apiInstance.addSaleToBasket(ident, opts, (error, data, response) => {
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
 **ident** | **String**| The basket identifier. | 
 **sale** | [**Sale**](Sale.md)| Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | [optional] 

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## createBasket

> Basket createBasket(opts)

Create a basket that can be used to pay for items

This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.BasketsApi();
let opts = {
  'createBasketRequest': new TebexCheckoutApi.CreateBasketRequest() // CreateBasketRequest | Create a basket, returning the full basket object and payment link.
};
apiInstance.createBasket(opts, (error, data, response) => {
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
 **createBasketRequest** | [**CreateBasketRequest**](CreateBasketRequest.md)| Create a basket, returning the full basket object and payment link. | [optional] 

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getBasketById

> Basket getBasketById(ident)

Fetch a basket by its identifier

Gets the basket associated with the provided identifier.

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.BasketsApi();
let ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
apiInstance.getBasketById(ident, (error, data, response) => {
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
 **ident** | **String**| The basket identifier. | 

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## removeRowFromBasket

> removeRowFromBasket(ident, rowsId)

Remove a row from the basket

This will remove the given &#x60;{rows.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.BasketsApi();
let ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
let rowsId = 1; // Number | The `id` of the `basket.rows` row to remove.
apiInstance.removeRowFromBasket(ident, rowsId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | **String**| The basket identifier. | 
 **rowsId** | **Number**| The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | 

### Return type

null (empty response body)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## updateBasket

> updateBasket(ident, opts)

Update a basket&#39;s details, including expiry date.

This will update the customer&#39;s details on the basket. If the customer is already logged in and a new email is provided, they will be logged out.

### Example

```javascript
import TebexCheckoutApi from 'tebex_checkout_api';
let defaultClient = TebexCheckoutApi.ApiClient.instance;
// Configure HTTP basic authorization: tebex_checkout_auth_basic
let tebex_checkout_auth_basic = defaultClient.authentications['tebex_checkout_auth_basic'];
tebex_checkout_auth_basic.username = 'YOUR USERNAME';
tebex_checkout_auth_basic.password = 'YOUR PASSWORD';

let apiInstance = new TebexCheckoutApi.BasketsApi();
let ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
let opts = {
  'updateBasketRequest': new TebexCheckoutApi.UpdateBasketRequest() // UpdateBasketRequest | The parameters of the basket you wish to update.
};
apiInstance.updateBasket(ident, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | **String**| The basket identifier. | 
 **updateBasketRequest** | [**UpdateBasketRequest**](UpdateBasketRequest.md)| The parameters of the basket you wish to update. | [optional] 

### Return type

null (empty response body)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

