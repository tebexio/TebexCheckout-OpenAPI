# TebexCheckout - the C# library for the Tebex Checkout API

The Checkout APIs are designed to allow our creators to use the Tebex Checkout flow and payment acceptance capabilities without the need to set up a Tebex-powered webstore. Using these APIs allows you to create baskets with custom products (as opposed to pre-created products on our webstore platform), and send customers directly to the checkout flow to proceed with payment options.

You must receive prior authorisation before the Checkout API is enabled on your account. Please contact customer support or your account manager to discover if you qualify to use the Checkout API before beginning integration.

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.0
- Generator version: 7.5.0
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen

<a id="frameworks-supported"></a>
## Frameworks supported

<a id="dependencies"></a>
## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.13.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 13.0.2 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
Install-Package System.ComponentModel.Annotations
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742).
NOTE: RestSharp for .Net Core creates a new socket for each api call, which can lead to a socket exhaustion problem. See [RestSharp#1406](https://github.com/restsharp/RestSharp/issues/1406).

<a id="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;
```
<a id="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out TebexCheckout.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a id="usage"></a>
## Usage

To use the API client with a HTTP proxy, setup a `System.Net.WebProxy`
```csharp
Configuration c = new Configuration();
System.Net.WebProxy webProxy = new System.Net.WebProxy("http://myProxyUrl:80/");
webProxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
c.Proxy = webProxy;
```

<a id="getting-started"></a>
## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using TebexCheckout.TebexCheckout;
using TebexCheckout.Client;
using TebexCheckout.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration config = new Configuration();
            config.BasePath = "https://checkout.tebex.io/api";
            var apiInstance = new BasketsApi(config);
            var ident = 1a-55fff4107740a1f40d844ff89607557f45bfafb3;  // string | The basket identifier.
            var addPackageRequest = new AddPackageRequest?(); // AddPackageRequest? |  (optional) 

            try
            {
                // Add a package to the basket
                Basket result = apiInstance.AddPackage(ident, addPackageRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BasketsApi.AddPackage: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://checkout.tebex.io/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BasketsApi* | [**AddPackage**](docs/BasketsApi.md#addpackage) | **POST** /baskets/{ident}/packages | Add a package to the basket
*BasketsApi* | [**AddSaleToBasket**](docs/BasketsApi.md#addsaletobasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket
*BasketsApi* | [**CreateBasket**](docs/BasketsApi.md#createbasket) | **POST** /baskets | Create a basket that can be used to pay for items
*BasketsApi* | [**GetBasketById**](docs/BasketsApi.md#getbasketbyid) | **GET** /baskets/{ident} | Fetch a basket by its identifier
*BasketsApi* | [**RemoveRowFromBasket**](docs/BasketsApi.md#removerowfrombasket) | **DELETE** /baskets/{ident}/packages/{row.id} | Remove a row from the basket
*CheckoutApi* | [**Checkout**](docs/CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request
*PaymentsApi* | [**GetPaymentById**](docs/PaymentsApi.md#getpaymentbyid) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID
*PaymentsApi* | [**RefundPaymentById**](docs/PaymentsApi.md#refundpaymentbyid) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID
*RecurringPaymentsApi* | [**CancelRecurringPayment**](docs/RecurringPaymentsApi.md#cancelrecurringpayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment
*RecurringPaymentsApi* | [**GetRecurringPayment**](docs/RecurringPaymentsApi.md#getrecurringpayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference
*RecurringPaymentsApi* | [**UpdateRecurringPayment**](docs/RecurringPaymentsApi.md#updaterecurringpayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment
*RecurringPaymentsApi* | [**UpdateSubscription**](docs/RecurringPaymentsApi.md#updatesubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product


<a id="documentation-for-models"></a>
## Documentation for Models

 - [Model.AddPackageRequest](docs/AddPackageRequest.md)
 - [Model.Address](docs/Address.md)
 - [Model.Basket](docs/Basket.md)
 - [Model.BasketItem](docs/BasketItem.md)
 - [Model.BasketLinks](docs/BasketLinks.md)
 - [Model.CheckoutItem](docs/CheckoutItem.md)
 - [Model.CheckoutRequest](docs/CheckoutRequest.md)
 - [Model.CheckoutRequestBasket](docs/CheckoutRequestBasket.md)
 - [Model.CreateBasketRequest](docs/CreateBasketRequest.md)
 - [Model.ErrorResponse](docs/ErrorResponse.md)
 - [Model.Package](docs/Package.md)
 - [Model.PackageMetaData](docs/PackageMetaData.md)
 - [Model.Payment](docs/Payment.md)
 - [Model.PaymentCustom](docs/PaymentCustom.md)
 - [Model.PaymentCustomer](docs/PaymentCustomer.md)
 - [Model.PaymentFees](docs/PaymentFees.md)
 - [Model.PaymentFeesGateway](docs/PaymentFeesGateway.md)
 - [Model.PaymentFeesTax](docs/PaymentFeesTax.md)
 - [Model.PaymentPrice](docs/PaymentPrice.md)
 - [Model.PaymentProductsInner](docs/PaymentProductsInner.md)
 - [Model.PaymentProductsInnerBasePrice](docs/PaymentProductsInnerBasePrice.md)
 - [Model.PaymentStatus](docs/PaymentStatus.md)
 - [Model.PriceDetails](docs/PriceDetails.md)
 - [Model.RecurringPayment](docs/RecurringPayment.md)
 - [Model.RecurringPaymentAmount](docs/RecurringPaymentAmount.md)
 - [Model.RecurringPaymentLinks](docs/RecurringPaymentLinks.md)
 - [Model.RecurringPaymentStatus](docs/RecurringPaymentStatus.md)
 - [Model.RevenueShare](docs/RevenueShare.md)
 - [Model.Sale](docs/Sale.md)
 - [Model.UpdateRecurringPaymentRequest](docs/UpdateRecurringPaymentRequest.md)
 - [Model.UpdateSubscriptionRequest](docs/UpdateSubscriptionRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="tebex_checkout_auth_basic"></a>
### tebex_checkout_auth_basic

- **Type**: HTTP basic authentication
