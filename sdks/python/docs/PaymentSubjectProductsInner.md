# PaymentSubjectProductsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** |  | [optional] 
**name** | **str** |  | [optional] 
**quantity** | **int** |  | [optional] 
**base_price** | [**PaymentSubjectPrice**](PaymentSubjectPrice.md) |  | [optional] 
**paid_price** | [**PaymentFeesTax**](PaymentFeesTax.md) |  | [optional] 
**variables** | **List[object]** |  | [optional] 
**expires_at** | **datetime** |  | [optional] 
**custom** | **object** |  | [optional] 
**username** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_subject_products_inner import PaymentSubjectProductsInner

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentSubjectProductsInner from a JSON string
payment_subject_products_inner_instance = PaymentSubjectProductsInner.from_json(json)
# print the JSON string representation of the object
print(PaymentSubjectProductsInner.to_json())

# convert the object into a dict
payment_subject_products_inner_dict = payment_subject_products_inner_instance.to_dict()
# create an instance of PaymentSubjectProductsInner from a dict
payment_subject_products_inner_from_dict = PaymentSubjectProductsInner.from_dict(payment_subject_products_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


