# RecurringPaymentSubject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reference** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**paused_at** | **datetime** |  | [optional] 
**paused_until** | **datetime** |  | [optional] 
**next_payment_at** | **datetime** |  | [optional] 
**status** | [**RecurringPaymentSubjectStatus**](RecurringPaymentSubjectStatus.md) |  | [optional] 
**initial_payment** | [**PaymentSubject**](PaymentSubject.md) |  | [optional] 
**last_payment** | [**PaymentSubject**](PaymentSubject.md) |  | [optional] 
**fail_count** | **int** |  | [optional] 
**price** | [**RecurringPaymentSubjectPrice**](RecurringPaymentSubjectPrice.md) |  | [optional] 
**cancelled_at** | **datetime** |  | [optional] 
**cancel_reason** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.recurring_payment_subject import RecurringPaymentSubject

# TODO update the JSON string below
json = "{}"
# create an instance of RecurringPaymentSubject from a JSON string
recurring_payment_subject_instance = RecurringPaymentSubject.from_json(json)
# print the JSON string representation of the object
print(RecurringPaymentSubject.to_json())

# convert the object into a dict
recurring_payment_subject_dict = recurring_payment_subject_instance.to_dict()
# create an instance of RecurringPaymentSubject from a dict
recurring_payment_subject_from_dict = RecurringPaymentSubject.from_dict(recurring_payment_subject_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


