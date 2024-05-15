# Payment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_id** | **str** |  | [optional] 
**status** | [**PaymentStatus**](PaymentStatus.md) |  | [optional] 
**payment_sequence** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**price** | [**PaymentPrice**](PaymentPrice.md) |  | [optional] 
**fees** | [**PaymentFees**](PaymentFees.md) |  | [optional] 
**customer** | [**PaymentCustomer**](PaymentCustomer.md) |  | [optional] 
**products** | [**List[PaymentProductsInner]**](PaymentProductsInner.md) |  | [optional] 
**coupons** | **List[str]** |  | [optional] 
**gift_cards** | **List[str]** |  | [optional] 
**recurring_payment_reference** | **str** |  | [optional] 
**custom** | [**PaymentCustom**](PaymentCustom.md) |  | [optional] 

## Example

```python
from TebexCheckout.models.payment import Payment

# TODO update the JSON string below
json = "{}"
# create an instance of Payment from a JSON string
payment_instance = Payment.from_json(json)
# print the JSON string representation of the object
print(Payment.to_json())

# convert the object into a dict
payment_dict = payment_instance.to_dict()
# create an instance of Payment from a dict
payment_from_dict = Payment.from_dict(payment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


