# PriceDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**full_price** | **float** |  | [optional] 
**sub_total** | **float** |  | [optional] 
**discounts** | **List[object]** |  | [optional] 
**total** | **float** |  | [optional] 
**tax** | **float** |  | [optional] 
**balance** | **float** |  | [optional] 
**sales** | [**List[Sale]**](Sale.md) |  | [optional] 
**giftcards** | **List[object]** |  | [optional] 
**round_up** | **float** |  | [optional] 

## Example

```python
from TebexCheckout.models.price_details import PriceDetails

# TODO update the JSON string below
json = "{}"
# create an instance of PriceDetails from a JSON string
price_details_instance = PriceDetails.from_json(json)
# print the JSON string representation of the object
print(PriceDetails.to_json())

# convert the object into a dict
price_details_dict = price_details_instance.to_dict()
# create an instance of PriceDetails from a dict
price_details_from_dict = PriceDetails.from_dict(price_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


