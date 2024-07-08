# # PaymentSubject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_id** | **string** |  | [optional]
**status** | [**\TebexCheckout\Model\PaymentStatus**](PaymentStatus.md) |  | [optional]
**payment_sequence** | **string** |  | [optional]
**created_at** | **\DateTime** |  | [optional]
**price** | [**\TebexCheckout\Model\PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional]
**price_paid** | [**\TebexCheckout\Model\PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional]
**payment_method** | [**\TebexCheckout\Model\PaymentSubjectPaymentMethod**](PaymentSubjectPaymentMethod.md) |  | [optional]
**fees** | [**\TebexCheckout\Model\PaymentSubjectFees**](PaymentSubjectFees.md) |  | [optional]
**customer** | [**\TebexCheckout\Model\PaymentSubjectCustomer**](PaymentSubjectCustomer.md) |  | [optional]
**products** | [**\TebexCheckout\Model\PaymentSubjectProductsInner[]**](PaymentSubjectProductsInner.md) |  | [optional]
**coupons** | **object[]** |  | [optional]
**gift_cards** | **object[]** |  | [optional]
**recurring_payment_reference** | **string** |  | [optional]
**custom** | **object** |  | [optional]
**revenue_share** | [**\TebexCheckout\Model\RevenueShare[]**](RevenueShare.md) |  | [optional]
**decline_reason** | **string** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
