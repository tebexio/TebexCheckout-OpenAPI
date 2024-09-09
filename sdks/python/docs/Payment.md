# Payment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_id** | **str** |  | [optional] 
**status** | [**PaymentStatus**](PaymentStatus.md) |  | [optional] 
**payment_sequence** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**price** | [**PaymentPrice**](PaymentPrice.md) |  | [optional] 
**price_paid** | [**PaymentPrice**](PaymentPrice.md) |  | [optional] 
**payment_method** | [**PaymentPaymentMethod**](PaymentPaymentMethod.md) |  | [optional] 
**revenue_share** | [**List[RevenueShare]**](RevenueShare.md) |  | [optional] 
**decline_reason** | **str** |  | [optional] 
**fees** | [**PaymentFees**](PaymentFees.md) |  | [optional] 
**customer** | [**PaymentCustomer**](PaymentCustomer.md) |  | [optional] 
**products** | [**List[PaymentProductsInner]**](PaymentProductsInner.md) |  | [optional] 
**coupons** | **List[object]** |  | [optional] 
**gift_cards** | **List[object]** |  | [optional] 
**recurring_payment_reference** | **str** |  | [optional] 
**custom** | **object** |  | [optional] 

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


