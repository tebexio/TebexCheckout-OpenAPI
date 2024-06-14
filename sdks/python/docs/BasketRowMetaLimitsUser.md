# BasketRowMetaLimitsUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **bool** |  | [optional] 
**timestamp** | **int** |  | [optional] 
**limit** | **bool** |  | [optional] 

## Example

```python
from TebexCheckout.models.basket_row_meta_limits_user import BasketRowMetaLimitsUser

# TODO update the JSON string below
json = "{}"
# create an instance of BasketRowMetaLimitsUser from a JSON string
basket_row_meta_limits_user_instance = BasketRowMetaLimitsUser.from_json(json)
# print the JSON string representation of the object
print(BasketRowMetaLimitsUser.to_json())

# convert the object into a dict
basket_row_meta_limits_user_dict = basket_row_meta_limits_user_instance.to_dict()
# create an instance of BasketRowMetaLimitsUser from a dict
basket_row_meta_limits_user_from_dict = BasketRowMetaLimitsUser.from_dict(basket_row_meta_limits_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


