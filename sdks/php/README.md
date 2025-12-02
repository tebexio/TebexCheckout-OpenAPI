# TebexCheckout

The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.

You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.


## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/TebexCheckout/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

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

## API Endpoints

All URIs are relative to *https://checkout.tebex.io/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasketsApi* | [**addPackage**](docs/Api/BasketsApi.md#addpackage) | **POST** /baskets/{ident}/packages | Add a package to the basket
*BasketsApi* | [**addSaleToBasket**](docs/Api/BasketsApi.md#addsaletobasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket
*BasketsApi* | [**createBasket**](docs/Api/BasketsApi.md#createbasket) | **POST** /baskets | Create a basket that can be used to pay for items
*BasketsApi* | [**getBasketById**](docs/Api/BasketsApi.md#getbasketbyid) | **GET** /baskets/{ident} | Fetch a basket by its identifier
*BasketsApi* | [**removeRowFromBasket**](docs/Api/BasketsApi.md#removerowfrombasket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket
*BasketsApi* | [**updateBasket**](docs/Api/BasketsApi.md#updatebasket) | **PUT** /baskets | Update a basket&#39;s details, including expiry date.
*CheckoutApi* | [**checkout**](docs/Api/CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request
*PaymentsApi* | [**getPaymentById**](docs/Api/PaymentsApi.md#getpaymentbyid) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID
*PaymentsApi* | [**refundPaymentById**](docs/Api/PaymentsApi.md#refundpaymentbyid) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID
*RecurringPaymentsApi* | [**cancelRecurringPayment**](docs/Api/RecurringPaymentsApi.md#cancelrecurringpayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment
*RecurringPaymentsApi* | [**getRecurringPayment**](docs/Api/RecurringPaymentsApi.md#getrecurringpayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference
*RecurringPaymentsApi* | [**updateRecurringPayment**](docs/Api/RecurringPaymentsApi.md#updaterecurringpayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment
*RecurringPaymentsApi* | [**updateSubscription**](docs/Api/RecurringPaymentsApi.md#updatesubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product

## Models

- [AddPackageRequest](docs/Model/AddPackageRequest.md)
- [Address](docs/Model/Address.md)
- [Basket](docs/Model/Basket.md)
- [BasketItem](docs/Model/BasketItem.md)
- [BasketLinks](docs/Model/BasketLinks.md)
- [BasketRow](docs/Model/BasketRow.md)
- [BasketRowMeta](docs/Model/BasketRowMeta.md)
- [BasketRowMetaLimits](docs/Model/BasketRowMetaLimits.md)
- [BasketRowMetaLimitsUser](docs/Model/BasketRowMetaLimitsUser.md)
- [CheckoutItem](docs/Model/CheckoutItem.md)
- [CheckoutRequest](docs/Model/CheckoutRequest.md)
- [CheckoutRequestBasket](docs/Model/CheckoutRequestBasket.md)
- [CreateBasketRequest](docs/Model/CreateBasketRequest.md)
- [ErrorResponse](docs/Model/ErrorResponse.md)
- [Package](docs/Model/Package.md)
- [Payment](docs/Model/Payment.md)
- [PaymentCustomer](docs/Model/PaymentCustomer.md)
- [PaymentFees](docs/Model/PaymentFees.md)
- [PaymentFeesGateway](docs/Model/PaymentFeesGateway.md)
- [PaymentFeesTax](docs/Model/PaymentFeesTax.md)
- [PaymentPaymentMethod](docs/Model/PaymentPaymentMethod.md)
- [PaymentPrice](docs/Model/PaymentPrice.md)
- [PaymentProductsInner](docs/Model/PaymentProductsInner.md)
- [PaymentProductsInnerBasePrice](docs/Model/PaymentProductsInnerBasePrice.md)
- [PaymentProductsInnerPaidPrice](docs/Model/PaymentProductsInnerPaidPrice.md)
- [PaymentStatus](docs/Model/PaymentStatus.md)
- [PaymentSubject](docs/Model/PaymentSubject.md)
- [PaymentSubjectCustomer](docs/Model/PaymentSubjectCustomer.md)
- [PaymentSubjectFees](docs/Model/PaymentSubjectFees.md)
- [PaymentSubjectPaymentMethod](docs/Model/PaymentSubjectPaymentMethod.md)
- [PaymentSubjectPrice](docs/Model/PaymentSubjectPrice.md)
- [PaymentSubjectProductsInner](docs/Model/PaymentSubjectProductsInner.md)
- [PriceDetails](docs/Model/PriceDetails.md)
- [RecurringPayment](docs/Model/RecurringPayment.md)
- [RecurringPaymentAmount](docs/Model/RecurringPaymentAmount.md)
- [RecurringPaymentLinks](docs/Model/RecurringPaymentLinks.md)
- [RecurringPaymentStatus](docs/Model/RecurringPaymentStatus.md)
- [RecurringPaymentSubject](docs/Model/RecurringPaymentSubject.md)
- [RecurringPaymentSubjectPrice](docs/Model/RecurringPaymentSubjectPrice.md)
- [RecurringPaymentSubjectStatus](docs/Model/RecurringPaymentSubjectStatus.md)
- [RevenueShare](docs/Model/RevenueShare.md)
- [Sale](docs/Model/Sale.md)
- [TebexWebhook](docs/Model/TebexWebhook.md)
- [UpdateBasketRequest](docs/Model/UpdateBasketRequest.md)
- [UpdateRecurringPaymentRequest](docs/Model/UpdateRecurringPaymentRequest.md)
- [UpdateSubscriptionRequest](docs/Model/UpdateSubscriptionRequest.md)
- [UpdateSubscriptionRequestItemsInner](docs/Model/UpdateSubscriptionRequestItemsInner.md)

## Authorization

Authentication schemes defined for the API:
### tebex_checkout_auth_basic

- **Type**: HTTP basic authentication

## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

tebex-integrations@overwolf.com

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.1.2`
    - Generator version: `7.5.0`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
