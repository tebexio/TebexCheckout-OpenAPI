# RecurringPaymentSubjectPrice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.recurring_payment_subject_price import RecurringPaymentSubjectPrice

# TODO update the JSON string below
json = "{}"
# create an instance of RecurringPaymentSubjectPrice from a JSON string
recurring_payment_subject_price_instance = RecurringPaymentSubjectPrice.from_json(json)
# print the JSON string representation of the object
print(RecurringPaymentSubjectPrice.to_json())

# convert the object into a dict
recurring_payment_subject_price_dict = recurring_payment_subject_price_instance.to_dict()
# create an instance of RecurringPaymentSubjectPrice from a dict
recurring_payment_subject_price_from_dict = RecurringPaymentSubjectPrice.from_dict(recurring_payment_subject_price_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


