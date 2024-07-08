# TebexCheckout\BasketsApi

All URIs are relative to https://checkout.tebex.io/api, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addPackage()**](BasketsApi.md#addPackage) | **POST** /baskets/{ident}/packages | Add a package to the basket |
| [**addSaleToBasket()**](BasketsApi.md#addSaleToBasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket |
| [**createBasket()**](BasketsApi.md#createBasket) | **POST** /baskets | Create a basket that can be used to pay for items |
| [**getBasketById()**](BasketsApi.md#getBasketById) | **GET** /baskets/{ident} | Fetch a basket by its identifier |
| [**removeRowFromBasket()**](BasketsApi.md#removeRowFromBasket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket |


## `addPackage()`

```php
addPackage($ident, $add_package_request): \TebexCheckout\Model\Basket
```

Add a package to the basket

This adds a package (an object describing the product) to the basket `{ident}`. For subscriptions, **only one subscription item may be in a basket at a time**, and it cannot be included with one-time payment items. **This endpoint requires prior approval. Please contact your account manager.**

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: tebex_checkout_auth_basic
$config = TebexCheckout\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new TebexCheckout\Api\BasketsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The basket identifier.
$add_package_request = new \TebexCheckout\Model\AddPackageRequest(); // \TebexCheckout\Model\AddPackageRequest

try {
    $result = $apiInstance->addPackage($ident, $add_package_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BasketsApi->addPackage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ident** | **string**| The basket identifier. | |
| **add_package_request** | [**\TebexCheckout\Model\AddPackageRequest**](../Model/AddPackageRequest.md)|  | [optional] |

### Return type

[**\TebexCheckout\Model\Basket**](../Model/Basket.md)

### Authorization

[tebex_checkout_auth_basic](../../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `addSaleToBasket()`

```php
addSaleToBasket($ident, $sale): \TebexCheckout\Model\Basket
```

Add a sale to the basket

Adds a `Sale` to the basket with `{ident}`. **Sales cannot be applied to baskets with `revenue_share` set.**

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: tebex_checkout_auth_basic
$config = TebexCheckout\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new TebexCheckout\Api\BasketsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The basket identifier.
$sale = new \TebexCheckout\Model\Sale(); // \TebexCheckout\Model\Sale | Provide a `Sale` as an object to apply it to the basket.

try {
    $result = $apiInstance->addSaleToBasket($ident, $sale);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BasketsApi->addSaleToBasket: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ident** | **string**| The basket identifier. | |
| **sale** | [**\TebexCheckout\Model\Sale**](../Model/Sale.md)| Provide a &#x60;Sale&#x60; as an object to apply it to the basket. | [optional] |

### Return type

[**\TebexCheckout\Model\Basket**](../Model/Basket.md)

### Authorization

[tebex_checkout_auth_basic](../../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createBasket()`

```php
createBasket($create_basket_request): \TebexCheckout\Model\Basket
```

Create a basket that can be used to pay for items

This will create and return a `Basket` that can be paid for by redirecting the user to `links.checkout`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: tebex_checkout_auth_basic
$config = TebexCheckout\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new TebexCheckout\Api\BasketsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$create_basket_request = new \TebexCheckout\Model\CreateBasketRequest(); // \TebexCheckout\Model\CreateBasketRequest | Create a basket, returning the full basket object and payment link.

try {
    $result = $apiInstance->createBasket($create_basket_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BasketsApi->createBasket: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_basket_request** | [**\TebexCheckout\Model\CreateBasketRequest**](../Model/CreateBasketRequest.md)| Create a basket, returning the full basket object and payment link. | [optional] |

### Return type

[**\TebexCheckout\Model\Basket**](../Model/Basket.md)

### Authorization

[tebex_checkout_auth_basic](../../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getBasketById()`

```php
getBasketById($ident): \TebexCheckout\Model\Basket
```

Fetch a basket by its identifier

Gets the basket associated with the provided identifier.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: tebex_checkout_auth_basic
$config = TebexCheckout\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new TebexCheckout\Api\BasketsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The basket identifier.

try {
    $result = $apiInstance->getBasketById($ident);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BasketsApi->getBasketById: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ident** | **string**| The basket identifier. | |

### Return type

[**\TebexCheckout\Model\Basket**](../Model/Basket.md)

### Authorization

[tebex_checkout_auth_basic](../../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeRowFromBasket()`

```php
removeRowFromBasket($ident, $rows_id)
```

Remove a row from the basket

This will remove the given `{rows.id}` from the basket `{ident}`. The basket must be re-fetched after running to receive updated totals.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: tebex_checkout_auth_basic
$config = TebexCheckout\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new TebexCheckout\Api\BasketsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3; // string | The basket identifier.
$rows_id = 1; // int | The `id` of the `basket.rows` row to remove.

try {
    $apiInstance->removeRowFromBasket($ident, $rows_id);
} catch (Exception $e) {
    echo 'Exception when calling BasketsApi->removeRowFromBasket: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ident** | **string**| The basket identifier. | |
| **rows_id** | **int**| The &#x60;id&#x60; of the &#x60;basket.rows&#x60; row to remove. | |

### Return type

void (empty response body)

### Authorization

[tebex_checkout_auth_basic](../../README.md#tebex_checkout_auth_basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
