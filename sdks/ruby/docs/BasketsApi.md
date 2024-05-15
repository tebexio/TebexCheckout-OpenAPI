# OpenapiClient::BasketsApi

All URIs are relative to *https://checkout.tebex.io/api*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**add_package**](BasketsApi.md#add_package) | **POST** /baskets/{ident}/packages | Add a package to the basket |
| [**add_sale_to_basket**](BasketsApi.md#add_sale_to_basket) | **POST** /baskets/{ident}/sales | Add a sale to the basket |
| [**create_basket**](BasketsApi.md#create_basket) | **POST** /baskets | Create a basket that can be used to pay for items |
| [**get_basket_by_id**](BasketsApi.md#get_basket_by_id) | **GET** /baskets/{ident} | Fetch a basket by its identifier |
| [**remove_row_from_basket**](BasketsApi.md#remove_row_from_basket) | **DELETE** /baskets/{ident}/packages/{row.id} | Remove a row from the basket |


## add_package

> <Basket> add_package(ident, opts)

Add a package to the basket

This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::BasketsApi.new
ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The basket identifier.
opts = {
  add_package_request: OpenapiClient::AddPackageRequest.new # AddPackageRequest | 
}

begin
  # Add a package to the basket
  result = api_instance.add_package(ident, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->add_package: #{e}"
end
```

#### Using the add_package_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Basket>, Integer, Hash)> add_package_with_http_info(ident, opts)

```ruby
begin
  # Add a package to the basket
  data, status_code, headers = api_instance.add_package_with_http_info(ident, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Basket>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->add_package_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ident** | **String** | The basket identifier. |  |
| **add_package_request** | [**AddPackageRequest**](AddPackageRequest.md) |  | [optional] |

### Return type

[**Basket**](Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## add_sale_to_basket

> <Basket> add_sale_to_basket(ident, opts)

Add a sale to the basket

Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::BasketsApi.new
ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The basket identifier.
opts = {
  sale: OpenapiClient::Sale.new # Sale | Provide a `Sale` as an object to apply it to the basket.
}

begin
  # Add a sale to the basket
  result = api_instance.add_sale_to_basket(ident, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->add_sale_to_basket: #{e}"
end
```

#### Using the add_sale_to_basket_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Basket>, Integer, Hash)> add_sale_to_basket_with_http_info(ident, opts)

```ruby
begin
  # Add a sale to the basket
  data, status_code, headers = api_instance.add_sale_to_basket_with_http_info(ident, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Basket>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->add_sale_to_basket_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ident** | **String** | The basket identifier. |  |
| **sale** | [**Sale**](Sale.md) | Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | [optional] |

### Return type

[**Basket**](Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_basket

> <Basket> create_basket(opts)

Create a basket that can be used to pay for items

This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::BasketsApi.new
opts = {
  create_basket_request: OpenapiClient::CreateBasketRequest.new # CreateBasketRequest | Create a basket, returning the full basket object and payment link.
}

begin
  # Create a basket that can be used to pay for items
  result = api_instance.create_basket(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->create_basket: #{e}"
end
```

#### Using the create_basket_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Basket>, Integer, Hash)> create_basket_with_http_info(opts)

```ruby
begin
  # Create a basket that can be used to pay for items
  data, status_code, headers = api_instance.create_basket_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Basket>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->create_basket_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_basket_request** | [**CreateBasketRequest**](CreateBasketRequest.md) | Create a basket, returning the full basket object and payment link. | [optional] |

### Return type

[**Basket**](Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_basket_by_id

> <Basket> get_basket_by_id(ident)

Fetch a basket by its identifier

Gets the basket associated with the provided identifier.

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::BasketsApi.new
ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The basket identifier.

begin
  # Fetch a basket by its identifier
  result = api_instance.get_basket_by_id(ident)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->get_basket_by_id: #{e}"
end
```

#### Using the get_basket_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Basket>, Integer, Hash)> get_basket_by_id_with_http_info(ident)

```ruby
begin
  # Fetch a basket by its identifier
  data, status_code, headers = api_instance.get_basket_by_id_with_http_info(ident)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Basket>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->get_basket_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ident** | **String** | The basket identifier. |  |

### Return type

[**Basket**](Basket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## remove_row_from_basket

> remove_row_from_basket(ident, row_id)

Remove a row from the basket

This will remove the given `{row.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::BasketsApi.new
ident = '1a-55fff4107740a1f40d844ff89607557f45bfafb3' # String | The basket identifier.
row_id = 1 # Integer | The `id` of the `basket.rows` row to remove.

begin
  # Remove a row from the basket
  api_instance.remove_row_from_basket(ident, row_id)
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->remove_row_from_basket: #{e}"
end
```

#### Using the remove_row_from_basket_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> remove_row_from_basket_with_http_info(ident, row_id)

```ruby
begin
  # Remove a row from the basket
  data, status_code, headers = api_instance.remove_row_from_basket_with_http_info(ident, row_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling BasketsApi->remove_row_from_basket_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ident** | **String** | The basket identifier. |  |
| **row_id** | **Integer** | The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. |  |

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

