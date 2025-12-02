# TebexCheckout.BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_package**](BasketsApi.md#add_package) | **POST** /baskets/{ident}/packages | Add a package to the basket
[**add_sale_to_basket**](BasketsApi.md#add_sale_to_basket) | **POST** /baskets/{ident}/sales | Add a sale to the basket
[**create_basket**](BasketsApi.md#create_basket) | **POST** /baskets | Create a basket that can be used to pay for items
[**get_basket_by_id**](BasketsApi.md#get_basket_by_id) | **GET** /baskets/{ident} | Fetch a basket by its identifier
[**remove_row_from_basket**](BasketsApi.md#remove_row_from_basket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket
[**update_basket**](BasketsApi.md#update_basket) | **PUT** /baskets/{ident} | Update a basket&#39;s details, including expiry date.


# **add_package**
> Basket add_package(ident, add_package_request=add_package_request)

Add a package to the basket

This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Example

* Basic Authentication (tebex_checkout_auth_basic):

```python
import TebexCheckout
from TebexCheckout.models.add_package_request import AddPackageRequest
from TebexCheckout.models.basket import Basket
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: tebex_checkout_auth_basic
configuration = TebexCheckout.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.BasketsApi(api_client)
    ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The basket identifier.
    add_package_request = TebexCheckout.AddPackageRequest() # AddPackageRequest |  (optional)

    try:
        # Add a package to the basket
        api_response = api_instance.add_package(ident, add_package_request=add_package_request)
        print("The response of BasketsApi->add_package:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BasketsApi->add_package: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | **str**| The basket identifier. | 
 **add_package_request** | [**AddPackageRequest**](AddPackageRequest.md)|  | [optional] 

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
**200** | Package is successfully added to the basket, and basket is returned. |  -  |
**400** | Improperly formatted package. See ErrorResponse. |  -  |
**404** | Basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **add_sale_to_basket**
> Basket add_sale_to_basket(ident, sale=sale)

Add a sale to the basket

Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**

### Example

* Basic Authentication (tebex_checkout_auth_basic):

```python
import TebexCheckout
from TebexCheckout.models.basket import Basket
from TebexCheckout.models.sale import Sale
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: tebex_checkout_auth_basic
configuration = TebexCheckout.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.BasketsApi(api_client)
    ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The basket identifier.
    sale = TebexCheckout.Sale() # Sale | Provide a `Sale` as an object to apply it to the basket. (optional)

    try:
        # Add a sale to the basket
        api_response = api_instance.add_sale_to_basket(ident, sale=sale)
        print("The response of BasketsApi->add_sale_to_basket:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BasketsApi->add_sale_to_basket: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | **str**| The basket identifier. | 
 **sale** | [**Sale**](Sale.md)| Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | [optional] 

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
**200** | Successfully adds sale to basket. |  -  |
**400** | Bad request. Improperly formatted Sale or this basket cannot accept sales. See ErrorResponse. |  -  |
**404** | Basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_basket**
> Basket create_basket(create_basket_request=create_basket_request)

Create a basket that can be used to pay for items

This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`

### Example

* Basic Authentication (tebex_checkout_auth_basic):

```python
import TebexCheckout
from TebexCheckout.models.basket import Basket
from TebexCheckout.models.create_basket_request import CreateBasketRequest
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: tebex_checkout_auth_basic
configuration = TebexCheckout.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.BasketsApi(api_client)
    create_basket_request = TebexCheckout.CreateBasketRequest() # CreateBasketRequest | Create a basket, returning the full basket object and payment link. (optional)

    try:
        # Create a basket that can be used to pay for items
        api_response = api_instance.create_basket(create_basket_request=create_basket_request)
        print("The response of BasketsApi->create_basket:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BasketsApi->create_basket: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_basket_request** | [**CreateBasketRequest**](CreateBasketRequest.md)| Create a basket, returning the full basket object and payment link. | [optional] 

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
**200** | Basket created successfully |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_basket_by_id**
> Basket get_basket_by_id(ident)

Fetch a basket by its identifier

Gets the basket associated with the provided identifier.

### Example

* Basic Authentication (tebex_checkout_auth_basic):

```python
import TebexCheckout
from TebexCheckout.models.basket import Basket
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: tebex_checkout_auth_basic
configuration = TebexCheckout.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.BasketsApi(api_client)
    ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The basket identifier.

    try:
        # Fetch a basket by its identifier
        api_response = api_instance.get_basket_by_id(ident)
        print("The response of BasketsApi->get_basket_by_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BasketsApi->get_basket_by_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | **str**| The basket identifier. | 

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
**200** | Successful response returns the basket.  The &#x60;links.payment&#x60; property is only returned if the basket has been paid for, and a payment exist with the **complete**/**refund**/**chargeback** status.  The &#x60;links.checkout&#x60; property is only returned if the basket has not been paid, and is the URL to send the customer to in order to complete payment. |  -  |
**404** | Basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_row_from_basket**
> remove_row_from_basket(ident, rows_id)

Remove a row from the basket

This will remove the given `{rows.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.

### Example

* Basic Authentication (tebex_checkout_auth_basic):

```python
import TebexCheckout
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: tebex_checkout_auth_basic
configuration = TebexCheckout.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.BasketsApi(api_client)
    ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The basket identifier.
    rows_id = 1 # int | The `id` of the `basket.rows` row to remove.

    try:
        # Remove a row from the basket
        api_instance.remove_row_from_basket(ident, rows_id)
    except Exception as e:
        print("Exception when calling BasketsApi->remove_row_from_basket: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | **str**| The basket identifier. | 
 **rows_id** | **int**| The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | 

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
**204** | Successfully deleted a row from the basket. |  -  |
**404** | Row or basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_basket**
> update_basket(ident, update_basket_request=update_basket_request)

Update a basket's details, including expiry date.

This will update the customer's details on the basket. If the customer is already logged in and a new email is provided, they will be logged out.

### Example

* Basic Authentication (tebex_checkout_auth_basic):

```python
import TebexCheckout
from TebexCheckout.models.update_basket_request import UpdateBasketRequest
from TebexCheckout.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://checkout.tebex.io/api
# See configuration.py for a list of all supported configuration parameters.
configuration = TebexCheckout.Configuration(
    host = "https://checkout.tebex.io/api"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure HTTP basic authorization: tebex_checkout_auth_basic
configuration = TebexCheckout.Configuration(
    username = os.environ["USERNAME"],
    password = os.environ["PASSWORD"]
)

# Enter a context with an instance of the API client
with TebexCheckout.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = TebexCheckout.BasketsApi(api_client)
    ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # str | The basket identifier.
    update_basket_request = TebexCheckout.UpdateBasketRequest() # UpdateBasketRequest | The parameters of the basket you wish to update. (optional)

    try:
        # Update a basket's details, including expiry date.
        api_instance.update_basket(ident, update_basket_request=update_basket_request)
    except Exception as e:
        print("Exception when calling BasketsApi->update_basket: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ident** | **str**| The basket identifier. | 
 **update_basket_request** | [**UpdateBasketRequest**](UpdateBasketRequest.md)| The parameters of the basket you wish to update. | [optional] 

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
**200** | Basket updated successfully |  -  |
**404** | Basket not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

