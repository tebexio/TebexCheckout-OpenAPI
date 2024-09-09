# # Payment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_id** | **string** |  | [optional]
**status** | [**\TebexCheckout\Model\PaymentStatus**](PaymentStatus.md) |  | [optional]
**payment_sequence** | **string** |  | [optional]
**created_at** | **\DateTime** |  | [optional]
**price** | [**\TebexCheckout\Model\PaymentPrice**](PaymentPrice.md) |  | [optional]
**price_paid** | [**\TebexCheckout\Model\PaymentPrice**](PaymentPrice.md) |  | [optional]
**payment_method** | [**\TebexCheckout\Model\PaymentPaymentMethod**](PaymentPaymentMethod.md) |  | [optional]
**revenue_share** | [**\TebexCheckout\Model\RevenueShare[]**](RevenueShare.md) |  | [optional]
**decline_reason** | **string** |  | [optional]
**fees** | [**\TebexCheckout\Model\PaymentFees**](PaymentFees.md) |  | [optional]
**customer** | [**\TebexCheckout\Model\PaymentCustomer**](PaymentCustomer.md) |  | [optional]
**products** | [**\TebexCheckout\Model\PaymentProductsInner[]**](PaymentProductsInner.md) |  | [optional]
**coupons** | **object[]** |  | [optional]
**gift_cards** | **object[]** |  | [optional]
**recurring_payment_reference** | **string** |  | [optional]
**custom** | **object** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
