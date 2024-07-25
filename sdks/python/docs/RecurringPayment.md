# RecurringPayment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**updated_at** | **datetime** |  | [optional] 
**paused_at** | **datetime** |  | [optional] 
**paused_until** | **datetime** |  | [optional] 
**next_payment_date** | **str** |  | [optional] 
**reference** | **str** |  | [optional] 
**account_id** | **int** |  | [optional] 
**interval** | **str** |  | [optional] 
**cancelled_at** | **datetime** |  | [optional] 
**cancellation_requested_at** | **datetime** |  | [optional] 
**status** | [**RecurringPaymentStatus**](RecurringPaymentStatus.md) |  | [optional] 
**amount** | [**RecurringPaymentAmount**](RecurringPaymentAmount.md) |  | [optional] 
**cancel_reason** | **str** |  | [optional] 
**links** | [**RecurringPaymentLinks**](RecurringPaymentLinks.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.recurring_payment import RecurringPayment

# TODO update the JSON string below
json = "{}"
# create an instance of RecurringPayment from a JSON string
recurring_payment_instance = RecurringPayment.from_json(json)
# print the JSON string representation of the object
print(RecurringPayment.to_json())

# convert the object into a dict
recurring_payment_dict = recurring_payment_instance.to_dict()
# create an instance of RecurringPayment from a dict
recurring_payment_from_dict = RecurringPayment.from_dict(recurring_payment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


