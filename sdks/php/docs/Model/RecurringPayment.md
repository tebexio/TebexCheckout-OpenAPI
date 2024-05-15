# # RecurringPayment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional]
**created_at** | **\DateTime** |  | [optional]
**updated_at** | **\DateTime** |  | [optional]
**paused_at** | **\DateTime** |  | [optional]
**paused_until** | **\DateTime** |  | [optional]
**next_payment_date** | **string** |  | [optional]
**reference** | **string** |  | [optional]
**account_id** | **int** |  | [optional]
**interval** | **string** |  | [optional]
**cancelled_at** | **\DateTime** |  | [optional]
**status** | [**\TebexCheckout\Model\RecurringPaymentStatus**](RecurringPaymentStatus.md) |  | [optional]
**amount** | [**\TebexCheckout\Model\RecurringPaymentAmount**](RecurringPaymentAmount.md) |  | [optional]
**cancel_reason** | **string** |  | [optional]
**links** | [**\TebexCheckout\Model\RecurringPaymentLinks**](RecurringPaymentLinks.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
