# RecurringPaymentAmount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**tax** | **float** |  | [optional] 
**period** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.recurring_payment_amount import RecurringPaymentAmount

# TODO update the JSON string below
json = "{}"
# create an instance of RecurringPaymentAmount from a JSON string
recurring_payment_amount_instance = RecurringPaymentAmount.from_json(json)
# print the JSON string representation of the object
print(RecurringPaymentAmount.to_json())

# convert the object into a dict
recurring_payment_amount_dict = recurring_payment_amount_instance.to_dict()
# create an instance of RecurringPaymentAmount from a dict
recurring_payment_amount_from_dict = RecurringPaymentAmount.from_dict(recurring_payment_amount_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


