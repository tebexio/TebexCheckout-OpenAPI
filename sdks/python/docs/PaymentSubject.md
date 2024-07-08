# PaymentSubject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction_id** | **str** |  | [optional] 
**status** | [**PaymentStatus**](PaymentStatus.md) |  | [optional] 
**payment_sequence** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**price** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional] 
**price_paid** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional] 
**payment_method** | [**PaymentSubjectPaymentMethod**](PaymentSubjectPaymentMethod.md) |  | [optional] 
**fees** | [**PaymentSubjectFees**](PaymentSubjectFees.md) |  | [optional] 
**customer** | [**PaymentSubjectCustomer**](PaymentSubjectCustomer.md) |  | [optional] 
**products** | [**List[PaymentSubjectProductsInner]**](PaymentSubjectProductsInner.md) |  | [optional] 
**coupons** | **List[object]** |  | [optional] 
**gift_cards** | **List[object]** |  | [optional] 
**recurring_payment_reference** | **str** |  | [optional] 
**custom** | **object** |  | [optional] 
**revenue_share** | [**List[RevenueShare]**](RevenueShare.md) |  | [optional] 
**decline_reason** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_subject import PaymentSubject

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentSubject from a JSON string
payment_subject_instance = PaymentSubject.from_json(json)
# print the JSON string representation of the object
print(PaymentSubject.to_json())

# convert the object into a dict
payment_subject_dict = payment_subject_instance.to_dict()
# create an instance of PaymentSubject from a dict
payment_subject_from_dict = PaymentSubject.from_dict(payment_subject_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


