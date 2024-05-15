# RecurringPaymentLinks


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**initial_payment** | **str** |  | [optional] 
**payment_history** | **List[str]** |  | [optional] 

## Example

```python
from TebexCheckout.models.recurring_payment_links import RecurringPaymentLinks

# TODO update the JSON string below
json = "{}"
# create an instance of RecurringPaymentLinks from a JSON string
recurring_payment_links_instance = RecurringPaymentLinks.from_json(json)
# print the JSON string representation of the object
print(RecurringPaymentLinks.to_json())

# convert the object into a dict
recurring_payment_links_dict = recurring_payment_links_instance.to_dict()
# create an instance of RecurringPaymentLinks from a dict
recurring_payment_links_from_dict = RecurringPaymentLinks.from_dict(recurring_payment_links_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


