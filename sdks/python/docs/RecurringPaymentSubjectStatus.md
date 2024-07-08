# RecurringPaymentSubjectStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**description** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.recurring_payment_subject_status import RecurringPaymentSubjectStatus

# TODO update the JSON string below
json = "{}"
# create an instance of RecurringPaymentSubjectStatus from a JSON string
recurring_payment_subject_status_instance = RecurringPaymentSubjectStatus.from_json(json)
# print the JSON string representation of the object
print(RecurringPaymentSubjectStatus.to_json())

# convert the object into a dict
recurring_payment_subject_status_dict = recurring_payment_subject_status_instance.to_dict()
# create an instance of RecurringPaymentSubjectStatus from a dict
recurring_payment_subject_status_from_dict = RecurringPaymentSubjectStatus.from_dict(recurring_payment_subject_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


