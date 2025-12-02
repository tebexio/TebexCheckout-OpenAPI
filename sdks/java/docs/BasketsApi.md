# BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPackage**](BasketsApi.md#addPackage) | **POST** /baskets/{ident}/packages | Add a package to the basket |
| [**addSaleToBasket**](BasketsApi.md#addSaleToBasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket |
| [**createBasket**](BasketsApi.md#createBasket) | **POST** /baskets | Create a basket that can be used to pay for items |
| [**getBasketById**](BasketsApi.md#getBasketById) | **GET** /baskets/{ident} | Fetch a basket by its identifier |
| [**removeRowFromBasket**](BasketsApi.md#removeRowFromBasket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket |
| [**updateBasket**](BasketsApi.md#updateBasket) | **PUT** /baskets | Update a basket&#39;s details, including expiry date. |


<a id="addPackage"></a>
# **addPackage**
> Basket addPackage(ident, addPackageRequest)

Add a package to the basket

This adds a package (an object describing the product) to the basket &#x60;{ident}&#x60;. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.BasketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    BasketsApi apiInstance = new BasketsApi(defaultClient);
    String ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
    AddPackageRequest addPackageRequest = new AddPackageRequest(); // AddPackageRequest | 
    try {
      Basket result = apiInstance.addPackage(ident, addPackageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasketsApi#addPackage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | |
| **addPackageRequest** | [**AddPackageRequest**](AddPackageRequest.md)|  | [optional] |

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Package is successfully added to the basket, and basket is returned. |  -  |
| **400** | Improperly formatted package. See ErrorResponse. |  -  |
| **404** | Basket not found. |  -  |

<a id="addSaleToBasket"></a>
# **addSaleToBasket**
> Basket addSaleToBasket(ident, sale)

Add a sale to the basket

Adds a &#x60;Sale&#x60; to the basket with &#x60;{ident}&#x60;. **Sales cannot be applied to baskets with &#x60;revenue_share&#x60; set.**

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.BasketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    BasketsApi apiInstance = new BasketsApi(defaultClient);
    String ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
    Sale sale = new Sale(); // Sale | Provide a `Sale` as an object to apply it to the basket.
    try {
      Basket result = apiInstance.addSaleToBasket(ident, sale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasketsApi#addSaleToBasket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | |
| **sale** | [**Sale**](Sale.md)| Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | [optional] |

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully adds sale to basket. |  -  |
| **400** | Bad request. Improperly formatted Sale or this basket cannot accept sales. See ErrorResponse. |  -  |
| **404** | Basket not found. |  -  |

<a id="createBasket"></a>
# **createBasket**
> Basket createBasket(createBasketRequest)

Create a basket that can be used to pay for items

This will create and return a &#x60;Basket&#x60; that can be paid for by redirecting the user to &#x60;links.checkout&#x60;

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.BasketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    BasketsApi apiInstance = new BasketsApi(defaultClient);
    CreateBasketRequest createBasketRequest = new CreateBasketRequest(); // CreateBasketRequest | Create a basket, returning the full basket object and payment link.
    try {
      Basket result = apiInstance.createBasket(createBasketRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasketsApi#createBasket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createBasketRequest** | [**CreateBasketRequest**](CreateBasketRequest.md)| Create a basket, returning the full basket object and payment link. | [optional] |

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Basket created successfully |  -  |

<a id="getBasketById"></a>
# **getBasketById**
> Basket getBasketById(ident)

Fetch a basket by its identifier

Gets the basket associated with the provided identifier.

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.BasketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    BasketsApi apiInstance = new BasketsApi(defaultClient);
    String ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
    try {
      Basket result = apiInstance.getBasketById(ident);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasketsApi#getBasketById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | |

### Return type

[**Basket**](Basket.md)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response returns the basket.  The &#x60;links.payment&#x60; property is only returned if the basket has been paid for, and a payment exist with the **complete**_/_**refund**_/_**chargeback** status.  The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to in order to complete payment. |  -  |
| **404** | Basket not found. |  -  |

<a id="removeRowFromBasket"></a>
# **removeRowFromBasket**
> removeRowFromBasket(ident, rowsId)

Remove a row from the basket

This will remove the given &#x60;{rows.id}&#x60; from the basket &#x60;{ident}&#x60;. The basket must be re-fetched after running to receive updated totals.

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.BasketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    BasketsApi apiInstance = new BasketsApi(defaultClient);
    String ident = "1a-55fff4107740a1f40d844ff89607557f45bfafb3"; // String | The basket identifier.
    Integer rowsId = 1; // Integer | The `id` of the `basket.rows` row to remove.
    try {
      apiInstance.removeRowFromBasket(ident, rowsId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasketsApi#removeRowFromBasket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ident** | **String**| The basket identifier. | |
| **rowsId** | **Integer**| The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | |

### Return type

null (empty response body)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully deleted a row from the basket. |  -  |
| **404** | Row or basket not found. |  -  |

<a id="updateBasket"></a>
# **updateBasket**
> updateBasket(updateBasketRequest)

Update a basket&#39;s details, including expiry date.

This will update the customer&#39;s details on the basket. If the customer is already logged in and a new email is provided, they will be logged out.

### Example
```java
// Import classes:
import TebexCheckout.ApiClient;
import TebexCheckout.ApiException;
import TebexCheckout.Configuration;
import TebexCheckout.auth.*;
import TebexCheckout.models.*;
import TebexCheckout.BasketsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://checkout.tebex.io/api");
    
    // Configure HTTP basic authorization: tebex_checkout_auth_basic
    HttpBasicAuth tebex_checkout_auth_basic = (HttpBasicAuth) defaultClient.getAuthentication("tebex_checkout_auth_basic");
    tebex_checkout_auth_basic.setUsername("YOUR USERNAME");
    tebex_checkout_auth_basic.setPassword("YOUR PASSWORD");

    BasketsApi apiInstance = new BasketsApi(defaultClient);
    UpdateBasketRequest updateBasketRequest = new UpdateBasketRequest(); // UpdateBasketRequest | The parameters of the basket you wish to update.
    try {
      apiInstance.updateBasket(updateBasketRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasketsApi#updateBasket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateBasketRequest** | [**UpdateBasketRequest**](UpdateBasketRequest.md)| The parameters of the basket you wish to update. | [optional] |

### Return type

null (empty response body)

### Authorization

[tebex_checkout_auth_basic](../README.md#tebex_checkout_auth_basic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Basket updated successfully |  -  |
| **404** | Basket not found. |  -  |

