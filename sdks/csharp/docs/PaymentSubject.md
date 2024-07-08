# TebexCheckout.Model.PaymentSubject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TransactionId** | **string** |  | [optional] 
**Status** | [**PaymentStatus**](PaymentStatus.md) |  | [optional] 
**PaymentSequence** | **string** |  | [optional] 
**CreatedAt** | **DateTime** |  | [optional] 
**Price** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional] 
**PricePaid** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional] 
**PaymentMethod** | [**PaymentSubjectPaymentMethod**](PaymentSubjectPaymentMethod.md) |  | [optional] 
**Fees** | [**PaymentSubjectFees**](PaymentSubjectFees.md) |  | [optional] 
**Customer** | [**PaymentSubjectCustomer**](PaymentSubjectCustomer.md) |  | [optional] 
**Products** | [**List&lt;PaymentSubjectProductsInner&gt;**](PaymentSubjectProductsInner.md) |  | [optional] 
**Coupons** | **List&lt;Object&gt;** |  | [optional] 
**GiftCards** | **List&lt;Object&gt;** |  | [optional] 
**RecurringPaymentReference** | **string** |  | [optional] 
**Custom** | **Object** |  | [optional] 
**RevenueShare** | [**List&lt;RevenueShare&gt;**](RevenueShare.md) |  | [optional] 
**DeclineReason** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

