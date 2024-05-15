# BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPackage**](BasketsApi.md#addPackage) | **POST** /baskets/{ident}/packages | Add a package to the basket |
| [**addSaleToBasket**](BasketsApi.md#addSaleToBasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket |
| [**createBasket**](BasketsApi.md#createBasket) | **POST** /baskets | Create a basket that can be used to pay for items |
| [**getBasketById**](BasketsApi.md#getBasketById) | **GET** /baskets/{ident} | Fetch a basket by its identifier |
| [**removeRowFromBasket**](BasketsApi.md#removeRowFromBasket) | **DELETE** /baskets/{ident}/packages/{row.id} | Remove a row from the basket |


<a name="addPackage"></a>
# **addPackage**
> Basket addPackage(ident, addPackage\_request)

Add a package to the basket

    This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | [default to null] |
| **addPackage\_request** | [**addPackage_request**](../Models/addPackage_request.md)|  | [optional] |

### Return type

[**Basket**](../Models/Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="addSaleToBasket"></a>
# **addSaleToBasket**
> Basket addSaleToBasket(ident, Sale)

Add a sale to the basket

    Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | [default to null] |
| **Sale** | [**Sale**](../Models/Sale.md)| Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | [optional] |

### Return type

[**Basket**](../Models/Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createBasket"></a>
# **createBasket**
> Basket createBasket(createBasket\_request)

Create a basket that can be used to pay for items

    This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBasket\_request** | [**createBasket_request**](../Models/createBasket_request.md)| Create a basket, returning the full basket object and payment link. | [optional] |

### Return type

[**Basket**](../Models/Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getBasketById"></a>
# **getBasketById**
> Basket getBasketById(ident)

Fetch a basket by its identifier

    Gets the basket associated with the provided identifier.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | [default to null] |

### Return type

[**Basket**](../Models/Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeRowFromBasket"></a>
# **removeRowFromBasket**
> removeRowFromBasket(ident, row.id)

Remove a row from the basket

    This will remove the given &#x60;{row.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | [default to null] |
| **row.id** | **Integer**| The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

