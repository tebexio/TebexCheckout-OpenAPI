# PaymentProductsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**quantity** | **int** |  | [optional] 
**base_price** | [**PaymentProductsInnerBasePrice**](PaymentProductsInnerBasePrice.md) |  | [optional] 
**paid_price** | [**PaymentProductsInnerBasePrice**](PaymentProductsInnerBasePrice.md) |  | [optional] 
**variables** | **List[str]** |  | [optional] 
**expires_at** | **datetime** |  | [optional] 
**custom** | **str** |  | [optional] 
**username** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_products_inner import PaymentProductsInner

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentProductsInner from a JSON string
payment_products_inner_instance = PaymentProductsInner.from_json(json)
# print the JSON string representation of the object
print(PaymentProductsInner.to_json())

# convert the object into a dict
payment_products_inner_dict = payment_products_inner_instance.to_dict()
# create an instance of PaymentProductsInner from a dict
payment_products_inner_from_dict = PaymentProductsInner.from_dict(payment_products_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


