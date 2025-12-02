# BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPackage**](BasketsApi.md#addPackage) | **POST** /baskets/{ident}/packages | Add a package to the basket |
| [**addSaleToBasket**](BasketsApi.md#addSaleToBasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket |
| [**createBasket**](BasketsApi.md#createBasket) | **POST** /baskets | Create a basket that can be used to pay for items |
| [**getBasketById**](BasketsApi.md#getBasketById) | **GET** /baskets/{ident} | Fetch a basket by its identifier |
| [**removeRowFromBasket**](BasketsApi.md#removeRowFromBasket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket |
| [**updateBasket**](BasketsApi.md#updateBasket) | **PUT** /baskets/{ident} | Update a basket&#39;s details, including expiry date. |


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

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

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

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

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

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

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

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="removeRowFromBasket"></a>
# **removeRowFromBasket**
> removeRowFromBasket(ident, rows.id)

Remove a row from the basket

    This will remove the given &#x60;{rows.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | [default to null] |
| **rows.id** | **Integer**| The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | [default to null] |

### Return type

null (empty response body)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="updateBasket"></a>
# **updateBasket**
> updateBasket(ident, updateBasket\_request)

Update a basket&#39;s details, including expiry date.

    This will update the customer&#39;s details on the basket. If the customer is already logged in and a new email is provided, they will be logged out.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | [default to null] |
| **updateBasket\_request** | [**updateBasket_request**](../Models/updateBasket_request.md)| The parameters of the basket you wish to update. | [optional] |

### Return type

null (empty response body)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

