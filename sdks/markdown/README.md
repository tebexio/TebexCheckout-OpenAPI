# Documentation for Tebex Checkout API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://checkout.tebex.io/api*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *BasketsApi* | [**addPackage**](Apis/BasketsApi.md#addpackage) | **POST** /baskets/{ident}/packages | Add a package to the basket |
*BasketsApi* | [**addSaleToBasket**](Apis/BasketsApi.md#addsaletobasket) | **POST** /baskets/{ident}/sales | Add a sale to the basket |
*BasketsApi* | [**createBasket**](Apis/BasketsApi.md#createbasket) | **POST** /baskets | Create a basket that can be used to pay for items |
*BasketsApi* | [**getBasketById**](Apis/BasketsApi.md#getbasketbyid) | **GET** /baskets/{ident} | Fetch a basket by its identifier |
*BasketsApi* | [**removeRowFromBasket**](Apis/BasketsApi.md#removerowfrombasket) | **DELETE** /baskets/{ident}/packages/{rows.id} | Remove a row from the basket |
*BasketsApi* | [**updateBasket**](Apis/BasketsApi.md#updatebasket) | **PUT** /baskets | Update a basket's details, including expiry date. |
| *CheckoutApi* | [**checkout**](Apis/CheckoutApi.md#checkout) | **POST** /checkout | Create a checkout request |
| *PaymentsApi* | [**getPaymentById**](Apis/PaymentsApi.md#getpaymentbyid) | **GET** /payments/{txnId}?type&#x3D;txn_id | Fetch a payment by its transaction ID |
*PaymentsApi* | [**refundPaymentById**](Apis/PaymentsApi.md#refundpaymentbyid) | **POST** /payments/{txnId}/refund?type&#x3D;txn_id | Refund a payment by its transaction ID |
| *RecurringPaymentsApi* | [**cancelRecurringPayment**](Apis/RecurringPaymentsApi.md#cancelrecurringpayment) | **DELETE** /recurring-payments/{reference} | Cancel a recurring payment |
*RecurringPaymentsApi* | [**getRecurringPayment**](Apis/RecurringPaymentsApi.md#getrecurringpayment) | **GET** /recurring-payments/{reference} | Fetch a recurring payment (subscription) by its reference |
*RecurringPaymentsApi* | [**updateRecurringPayment**](Apis/RecurringPaymentsApi.md#updaterecurringpayment) | **PUT** /recurring-payments/{reference}/status | Pause or reactivate a recurring payment |
*RecurringPaymentsApi* | [**updateSubscription**](Apis/RecurringPaymentsApi.md#updatesubscription) | **PUT** /recurring-payments/{reference} | Update a subscription with a new product / amount to pay - replacing the existing product |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Address](./Models/Address.md)
 - [Basket](./Models/Basket.md)
 - [BasketItem](./Models/BasketItem.md)
 - [BasketLinks](./Models/BasketLinks.md)
 - [BasketRow](./Models/BasketRow.md)
 - [BasketRow_meta](./Models/BasketRow_meta.md)
 - [BasketRow_meta_limits](./Models/BasketRow_meta_limits.md)
 - [BasketRow_meta_limits_user](./Models/BasketRow_meta_limits_user.md)
 - [CheckoutItem](./Models/CheckoutItem.md)
 - [ErrorResponse](./Models/ErrorResponse.md)
 - [Package](./Models/Package.md)
 - [Payment](./Models/Payment.md)
 - [PaymentSubject](./Models/PaymentSubject.md)
 - [PaymentSubject_customer](./Models/PaymentSubject_customer.md)
 - [PaymentSubject_fees](./Models/PaymentSubject_fees.md)
 - [PaymentSubject_payment_method](./Models/PaymentSubject_payment_method.md)
 - [PaymentSubject_price](./Models/PaymentSubject_price.md)
 - [PaymentSubject_products_inner](./Models/PaymentSubject_products_inner.md)
 - [Payment_customer](./Models/Payment_customer.md)
 - [Payment_fees](./Models/Payment_fees.md)
 - [Payment_fees_gateway](./Models/Payment_fees_gateway.md)
 - [Payment_fees_tax](./Models/Payment_fees_tax.md)
 - [Payment_payment_method](./Models/Payment_payment_method.md)
 - [Payment_price](./Models/Payment_price.md)
 - [Payment_products_inner](./Models/Payment_products_inner.md)
 - [Payment_products_inner_base_price](./Models/Payment_products_inner_base_price.md)
 - [Payment_products_inner_paid_price](./Models/Payment_products_inner_paid_price.md)
 - [Payment_status](./Models/Payment_status.md)
 - [PriceDetails](./Models/PriceDetails.md)
 - [RecurringPayment](./Models/RecurringPayment.md)
 - [RecurringPaymentSubject](./Models/RecurringPaymentSubject.md)
 - [RecurringPaymentSubject_price](./Models/RecurringPaymentSubject_price.md)
 - [RecurringPaymentSubject_status](./Models/RecurringPaymentSubject_status.md)
 - [RecurringPayment_amount](./Models/RecurringPayment_amount.md)
 - [RecurringPayment_links](./Models/RecurringPayment_links.md)
 - [RecurringPayment_status](./Models/RecurringPayment_status.md)
 - [RevenueShare](./Models/RevenueShare.md)
 - [Sale](./Models/Sale.md)
 - [TebexWebhook](./Models/TebexWebhook.md)
 - [addPackage_request](./Models/addPackage_request.md)
 - [checkout_request](./Models/checkout_request.md)
 - [checkout_request_basket](./Models/checkout_request_basket.md)
 - [createBasket_request](./Models/createBasket_request.md)
 - [updateBasket_request](./Models/updateBasket_request.md)
 - [updateRecurringPayment_request](./Models/updateRecurringPayment_request.md)
 - [updateSubscription_request](./Models/updateSubscription_request.md)
 - [updateSubscription_request_items_inner](./Models/updateSubscription_request_items_inner.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="tebex_checkout_auth_basic"></a>
### tebex_checkout_auth_basic

- **Type**: HTTP basic authentication

