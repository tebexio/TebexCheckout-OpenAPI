# TebexCheckout.Model.RecurringPaymentSubject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Reference** | **string** |  | [optional] 
**CreatedAt** | **DateTime** |  | [optional] 
**PausedAt** | **DateTime?** |  | [optional] 
**PausedUntil** | **DateTime?** |  | [optional] 
**NextPaymentAt** | **DateTime** |  | [optional] 
**Status** | [**RecurringPaymentSubjectStatus**](RecurringPaymentSubjectStatus.md) |  | [optional] 
**InitialPayment** | [**PaymentSubject**](PaymentSubject.md) |  | [optional] 
**LastPayment** | [**PaymentSubject**](PaymentSubject.md) |  | [optional] 
**FailCount** | **int** |  | [optional] 
**Price** | [**RecurringPaymentSubjectPrice**](RecurringPaymentSubjectPrice.md) |  | [optional] 
**CancelledAt** | **DateTime?** |  | [optional] 
**CancelReason** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

