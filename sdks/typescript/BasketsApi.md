# .BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPackage**](BasketsApi.md#addPackage) | **POST** /baskets/{ident}/packages | Add a package to the basket
[**addSaleToBasket**](BasketsApi.md#addSaleToBasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket
[**createBasket**](BasketsApi.md#createBasket) | **POST** /baskets | Create a basket that can be used to pay for items
[**getBasketById**](BasketsApi.md#getBasketById) | **GET** /baskets/{ident} | Fetch a basket by its identifier
[**removeRowFromBasket**](BasketsApi.md#removeRowFromBasket) | **DELETE** /baskets/{ident}/packages/{row.id} | Remove a row from the basket


# **addPackage**
> Basket addPackage()

This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BasketsApi(configuration);

let body:.BasketsApiAddPackageRequest = {
  // string | The basket identifier.
  ident: "1a-55fff4107740a1f40d844ff89607557f45bfafb3",
  // AddPackageRequest (optional)
  addPackageRequest: null,
};

apiInstance.addPackage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addPackageRequest** | **AddPackageRequest**|  |
 **ident** | [**string**] | The basket identifier. | defaults to undefined


### Return type

**Basket**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Package is successfully added to the basket, and basket is returned. |  -  |
**400** | Improperly formatted package. See ErrorResponse. |  -  |
**404** | Basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **addSaleToBasket**
> Basket addSaleToBasket()

Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BasketsApi(configuration);

let body:.BasketsApiAddSaleToBasketRequest = {
  // string | The basket identifier.
  ident: "1a-55fff4107740a1f40d844ff89607557f45bfafb3",
  // Sale | Provide a `Sale` as an object to apply it to the basket. (optional)
  sale: {
    name: "Test Sale",
    discountType: "amount",
    amount: 4.99,
  },
};

apiInstance.addSaleToBasket(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sale** | **Sale**| Provide a &#x60;Sale&#x60; as an object to apply it to the basket. |
 **ident** | [**string**] | The basket identifier. | defaults to undefined


### Return type

**Basket**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully adds sale to basket. |  -  |
**400** | Bad request. Improperly formatted Sale or this basket cannot accept sales. See ErrorResponse. |  -  |
**404** | Basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **createBasket**
> Basket createBasket()

This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BasketsApi(configuration);

let body:.BasketsApiCreateBasketRequest = {
  // CreateBasketRequest | Create a basket, returning the full basket object and payment link. (optional)
  createBasketRequest: {
    returnUrl: "https://example.tebex.io/",
    completeUrl: "https://example.tebex.io/complete",
    custom: {},
    firstName: "Neil",
    lastName: "McNeil",
    email: "example@tebex.io",
    expiresAt: "2025-01-27T18:09:51Z",
    completeAutoRedirect: true,
    country: "US",
    creatorCode: "creatorCode_example",
  },
};

apiInstance.createBasket(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createBasketRequest** | **CreateBasketRequest**| Create a basket, returning the full basket object and payment link. |


### Return type

**Basket**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Basket created successfully |  -  |
**400** | Invalid basket information provided. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getBasketById**
> Basket getBasketById()

Gets the basket associated with the provided identifier.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BasketsApi(configuration);

let body:.BasketsApiGetBasketByIdRequest = {
  // string | The basket identifier.
  ident: "1a-55fff4107740a1f40d844ff89607557f45bfafb3",
};

apiInstance.getBasketById(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | [**string**] | The basket identifier. | defaults to undefined


### Return type

**Basket**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response returns the basket.  The &#x60;links.payment&#x60; property is only returned if the basket has been paid for, and a payment exist with the **complete**_/_**refund**_/_**chargeback** status.  The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to in order to complete payment. |  -  |
**404** | Basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **removeRowFromBasket**
> void removeRowFromBasket()

This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .BasketsApi(configuration);

let body:.BasketsApiRemoveRowFromBasketRequest = {
  // string | The basket identifier.
  ident: "1a-55fff4107740a1f40d844ff89607557f45bfafb3",
  // number | The `id` of the `basket.rows` row to remove.
  rowId: 1,
};

apiInstance.removeRowFromBasket(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | [**string**] | The basket identifier. | defaults to undefined
 **rowId** | [**number**] | The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | defaults to undefined


### Return type

**void**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully deleted a row from the basket. |  -  |
**400** | Bad Request. See ErrorResponse. |  -  |
**404** | Row or basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


