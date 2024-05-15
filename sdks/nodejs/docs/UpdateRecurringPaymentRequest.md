# TebexCheckoutApi.UpdateRecurringPaymentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Your desired state of the recurring payment. Provide &#x60;Paused&#x60; with &#x60;paused_until&#x60; to pause a recurring payment. Otherwise, provide &#x60;Active&#x60; to resume a recurring payment. | 
**pausedUntil** | **String** | To pause a payment, provide a ISO8601 formatted date on which the payment should be reactivated. | [optional] 



## Enum: StatusEnum


* `Paused` (value: `"Paused"`)

* `Active` (value: `"Active"`)




