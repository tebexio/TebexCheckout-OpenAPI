# TebexCheckout.Model.Payment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TransactionId** | **string** |  | [optional] 
**Status** | [**PaymentStatus**](PaymentStatus.md) |  | [optional] 
**PaymentSequence** | **string** |  | [optional] 
**CreatedAt** | **DateTime** |  | [optional] 
**Price** | [**PaymentPrice**](PaymentPrice.md) |  | [optional] 
**PricePaid** | [**PaymentPrice**](PaymentPrice.md) |  | [optional] 
**PaymentMethod** | [**PaymentPaymentMethod**](PaymentPaymentMethod.md) |  | [optional] 
**RevenueShare** | [**List&lt;RevenueShare&gt;**](RevenueShare.md) |  | [optional] 
**DeclineReason** | **string** |  | [optional] 
**Fees** | [**PaymentFees**](PaymentFees.md) |  | [optional] 
**Customer** | [**PaymentCustomer**](PaymentCustomer.md) |  | [optional] 
**Products** | [**List&lt;PaymentProductsInner&gt;**](PaymentProductsInner.md) |  | [optional] 
**Coupons** | **List&lt;Object&gt;** |  | [optional] 
**GiftCards** | **List&lt;Object&gt;** |  | [optional] 
**RecurringPaymentReference** | **string** |  | [optional] 
**Custom** | **Object** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

