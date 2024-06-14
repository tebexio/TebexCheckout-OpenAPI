# BasketRowMetaLimits


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user** | [**BasketRowMetaLimitsUser**](BasketRowMetaLimitsUser.md) |  | [optional] 
**var_global** | [**BasketRowMetaLimitsUser**](BasketRowMetaLimitsUser.md) |  | [optional] 
**package_expiry_time** | **int** |  | [optional] 

## Example

```python
from TebexCheckout.models.basket_row_meta_limits import BasketRowMetaLimits

# TODO update the JSON string below
json = "{}"
# create an instance of BasketRowMetaLimits from a JSON string
basket_row_meta_limits_instance = BasketRowMetaLimits.from_json(json)
# print the JSON string representation of the object
print(BasketRowMetaLimits.to_json())

# convert the object into a dict
basket_row_meta_limits_dict = basket_row_meta_limits_instance.to_dict()
# create an instance of BasketRowMetaLimits from a dict
basket_row_meta_limits_from_dict = BasketRowMetaLimits.from_dict(basket_row_meta_limits_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


