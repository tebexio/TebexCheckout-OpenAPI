# TebexCheckout.Model.RecurringPayment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** |  | [optional] 
**CreatedAt** | **DateTime** |  | [optional] 
**UpdatedAt** | **DateTime** |  | [optional] 
**PausedAt** | **DateTime?** |  | [optional] 
**PausedUntil** | **DateTime?** |  | [optional] 
**NextPaymentDate** | **string** |  | [optional] 
**Reference** | **string** |  | [optional] 
**AccountId** | **int** |  | [optional] 
**Interval** | **string** |  | [optional] 
**CancelledAt** | **DateTime?** |  | [optional] 
**Status** | [**RecurringPaymentStatus**](RecurringPaymentStatus.md) |  | [optional] 
**Amount** | [**RecurringPaymentAmount**](RecurringPaymentAmount.md) |  | [optional] 
**CancelReason** | **string** |  | [optional] 
**Links** | [**RecurringPaymentLinks**](RecurringPaymentLinks.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

