# # RecurringPaymentSubject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **string** |  | [optional]
**created_at** | **\DateTime** |  | [optional]
**paused_at** | **\DateTime** |  | [optional]
**paused_until** | **\DateTime** |  | [optional]
**next_payment_at** | **\DateTime** |  | [optional]
**status** | [**\TebexCheckout\Model\RecurringPaymentSubjectStatus**](RecurringPaymentSubjectStatus.md) |  | [optional]
**initial_payment** | [**\TebexCheckout\Model\PaymentSubject**](PaymentSubject.md) |  | [optional]
**last_payment** | [**\TebexCheckout\Model\PaymentSubject**](PaymentSubject.md) |  | [optional]
**fail_count** | **int** |  | [optional]
**price** | [**\TebexCheckout\Model\RecurringPaymentSubjectPrice**](RecurringPaymentSubjectPrice.md) |  | [optional]
**cancelled_at** | **\DateTime** |  | [optional]
**cancel_reason** | **string** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
