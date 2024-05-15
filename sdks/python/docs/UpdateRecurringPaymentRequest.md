# UpdateRecurringPaymentRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** | Your desired state of the recurring payment. Provide &#x60;Paused&#x60; with &#x60;paused_until&#x60; to pause a recurring payment. Otherwise, provide &#x60;Active&#x60; to resume a recurring payment. | 
**paused_until** | **str** | To pause a payment, provide a ISO8601 formatted date on which the payment should be reactivated. | [optional] 

## Example

```python
from TebexCheckout.models.update_recurring_payment_request import UpdateRecurringPaymentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateRecurringPaymentRequest from a JSON string
update_recurring_payment_request_instance = UpdateRecurringPaymentRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateRecurringPaymentRequest.to_json())

# convert the object into a dict
update_recurring_payment_request_dict = update_recurring_payment_request_instance.to_dict()
# create an instance of UpdateRecurringPaymentRequest from a dict
update_recurring_payment_request_from_dict = UpdateRecurringPaymentRequest.from_dict(update_recurring_payment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


