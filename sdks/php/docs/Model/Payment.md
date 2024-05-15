# # Payment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_id** | **string** |  | [optional]
**status** | [**\TebexCheckout\Model\PaymentStatus**](PaymentStatus.md) |  | [optional]
**payment_sequence** | **string** |  | [optional]
**created_at** | **\DateTime** |  | [optional]
**price** | [**\TebexCheckout\Model\PaymentPrice**](PaymentPrice.md) |  | [optional]
**fees** | [**\TebexCheckout\Model\PaymentFees**](PaymentFees.md) |  | [optional]
**customer** | [**\TebexCheckout\Model\PaymentCustomer**](PaymentCustomer.md) |  | [optional]
**products** | [**\TebexCheckout\Model\PaymentProductsInner[]**](PaymentProductsInner.md) |  | [optional]
**coupons** | **string[]** |  | [optional]
**gift_cards** | **string[]** |  | [optional]
**recurring_payment_reference** | **string** |  | [optional]
**custom** | [**\TebexCheckout\Model\PaymentCustom**](PaymentCustom.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
