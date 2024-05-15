# Sale


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the sale (displayed to the customer) | [optional] 
**discount_type** | **str** | The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item. | [optional] 
**amount** | **float** | The amount or percentage to deduct | [optional] 

## Example

```python
from TebexCheckout.models.sale import Sale

# TODO update the JSON string below
json = "{}"
# create an instance of Sale from a JSON string
sale_instance = Sale.from_json(json)
# print the JSON string representation of the object
print(Sale.to_json())

# convert the object into a dict
sale_dict = sale_instance.to_dict()
# create an instance of Sale from a dict
sale_from_dict = Sale.from_dict(sale_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


