# TebexCheckout.TebexCheckout.BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AddPackage**](BasketsApi.md#addpackage) | **POST** /baskets/{ident}/packages | Add a package to the basket |
| [**AddSaleToBasket**](BasketsApi.md#addsaletobasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket |
| [**CreateBasket**](BasketsApi.md#createbasket) | **POST** /baskets | Create a basket that can be used to pay for items |
| [**GetBasketById**](BasketsApi.md#getbasketbyid) | **GET** /baskets/{ident} | Fetch a basket by its identifier |
| [**RemoveRowFromBasket**](BasketsApi.md#removerowfrombasket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket |
| [**UpdateBasket**](BasketsApi.md#updatebasket) | **PUT** /baskets | Update a basket&#39;s details, including expiry date. |

<a id="addpackage"></a>
# **AddPackage**
> Basket AddPackage (string ident, AddPackageRequest? addPackageRequest = null)

Add a package to the basket

This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class AddPackageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new BasketsApi(config);
            var ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The basket identifier.
            var addPackageRequest = new AddPackageRequest?(); // AddPackageRequest? |  (optional) 

            try
            {
                // Add a package to the basket
                Basket result = apiInstance.AddPackage(ident, addPackageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BasketsApi.AddPackage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AddPackageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a package to the basket
    ApiResponse<Basket> response = apiInstance.AddPackageWithHttpInfo(ident, addPackageRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BasketsApi.AddPackageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ident** | **string** | The basket identifier. |  |
| **addPackageRequest** | [**AddPackageRequest?**](AddPackageRequest?.md) |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="addsaletobasket"></a>
# **AddSaleToBasket**
> Basket AddSaleToBasket (string ident, Sale? sale = null)

Add a sale to the basket

Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class AddSaleToBasketExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new BasketsApi(config);
            var ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The basket identifier.
            var sale = new Sale?(); // Sale? | Provide a `Sale` as an object to apply it to the basket. (optional) 

            try
            {
                // Add a sale to the basket
                Basket result = apiInstance.AddSaleToBasket(ident, sale);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BasketsApi.AddSaleToBasket: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the AddSaleToBasketWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Add a sale to the basket
    ApiResponse<Basket> response = apiInstance.AddSaleToBasketWithHttpInfo(ident, sale);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BasketsApi.AddSaleToBasketWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ident** | **string** | The basket identifier. |  |
| **sale** | [**Sale?**](Sale?.md) | Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="createbasket"></a>
# **CreateBasket**
> Basket CreateBasket (CreateBasketRequest? createBasketRequest = null)

Create a basket that can be used to pay for items

This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class CreateBasketExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new BasketsApi(config);
            var createBasketRequest = new CreateBasketRequest?(); // CreateBasketRequest? | Create a basket, returning the full basket object and payment link. (optional) 

            try
            {
                // Create a basket that can be used to pay for items
                Basket result = apiInstance.CreateBasket(createBasketRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BasketsApi.CreateBasket: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateBasketWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a basket that can be used to pay for items
    ApiResponse<Basket> response = apiInstance.CreateBasketWithHttpInfo(createBasketRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BasketsApi.CreateBasketWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createBasketRequest** | [**CreateBasketRequest?**](CreateBasketRequest?.md) | Create a basket, returning the full basket object and payment link. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getbasketbyid"></a>
# **GetBasketById**
> Basket GetBasketById (string ident)

Fetch a basket by its identifier

Gets the basket associated with the provided identifier.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class GetBasketByIdExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new BasketsApi(config);
            var ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The basket identifier.

            try
            {
                // Fetch a basket by its identifier
                Basket result = apiInstance.GetBasketById(ident);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BasketsApi.GetBasketById: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetBasketByIdWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Fetch a basket by its identifier
    ApiResponse<Basket> response = apiInstance.GetBasketByIdWithHttpInfo(ident);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BasketsApi.GetBasketByIdWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ident** | **string** | The basket identifier. |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="removerowfrombasket"></a>
# **RemoveRowFromBasket**
> void RemoveRowFromBasket (string ident, int rowsId)

Remove a row from the basket

This will remove the given `{rows.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class RemoveRowFromBasketExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new BasketsApi(config);
            var ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The basket identifier.
            var rowsId = 1;  // int | The `id` of the `basket.rows` row to remove.

            try
            {
                // Remove a row from the basket
                apiInstance.RemoveRowFromBasket(ident, rowsId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BasketsApi.RemoveRowFromBasket: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RemoveRowFromBasketWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Remove a row from the basket
    apiInstance.RemoveRowFromBasketWithHttpInfo(ident, rowsId);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BasketsApi.RemoveRowFromBasketWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **ident** | **string** | The basket identifier. |  |
| **rowsId** | **int** | The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. |  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="updatebasket"></a>
# **UpdateBasket**
> void UpdateBasket (UpdateBasketRequest? updateBasketRequest = null)

Update a basket's details, including expiry date.

This will update the customer's details on the basket. If the customer is already logged in and a new email is provided, they will be logged out.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class UpdateBasketExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            // Configure HTTP basic authorization: tebex_checkout_auth_basic
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";

            var apiInstance = new BasketsApi(config);
            var updateBasketRequest = new UpdateBasketRequest?(); // UpdateBasketRequest? | The parameters of the basket you wish to update. (optional) 

            try
            {
                // Update a basket's details, including expiry date.
                apiInstance.UpdateBasket(updateBasketRequest);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BasketsApi.UpdateBasket: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the UpdateBasketWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update a basket's details, including expiry date.
    apiInstance.UpdateBasketWithHttpInfo(updateBasketRequest);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling BasketsApi.UpdateBasketWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **updateBasketRequest** | [**UpdateBasketRequest?**](UpdateBasketRequest?.md) | The parameters of the basket you wish to update. | [optional]  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

