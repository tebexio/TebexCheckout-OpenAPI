# PaymentProductsInnerBasePrice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_products_inner_base_price import PaymentProductsInnerBasePrice

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentProductsInnerBasePrice from a JSON string
payment_products_inner_base_price_instance = PaymentProductsInnerBasePrice.from_json(json)
# print the JSON string representation of the object
print(PaymentProductsInnerBasePrice.to_json())

# convert the object into a dict
payment_products_inner_base_price_dict = payment_products_inner_base_price_instance.to_dict()
# create an instance of PaymentProductsInnerBasePrice from a dict
payment_products_inner_base_price_from_dict = PaymentProductsInnerBasePrice.from_dict(payment_products_inner_base_price_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


