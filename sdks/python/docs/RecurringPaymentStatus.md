# RecurringPaymentStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**var_class** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**active** | **int** |  | [optional] 

## Example

```python
from TebexCheckout.models.recurring_payment_status import RecurringPaymentStatus

# TODO update the JSON string below
json = "{}"
# create an instance of RecurringPaymentStatus from a JSON string
recurring_payment_status_instance = RecurringPaymentStatus.from_json(json)
# print the JSON string representation of the object
print(RecurringPaymentStatus.to_json())

# convert the object into a dict
recurring_payment_status_dict = recurring_payment_status_instance.to_dict()
# create an instance of RecurringPaymentStatus from a dict
recurring_payment_status_from_dict = RecurringPaymentStatus.from_dict(recurring_payment_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


