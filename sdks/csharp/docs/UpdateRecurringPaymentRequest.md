# TebexCheckout.Model.UpdateRecurringPaymentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **string** | Your desired state of the recurring payment. Provide &#x60;Paused&#x60; with &#x60;paused_until&#x60; to pause a recurring payment. Otherwise, provide &#x60;Active&#x60; to resume a recurring payment. | 
**PausedUntil** | **string** | To pause a payment, provide a ISO8601 formatted date on which the payment should be reactivated. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

