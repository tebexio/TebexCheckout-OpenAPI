# AddPackageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package** | [**Package**](Package.md) |  | [optional] 
**qty** | **int** | The quantity of &#x60;package&#x60; in this basket. This is not the total quantity of overall items in the basket. | [optional] 
**type** | **str** | The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;. | [optional] 
**revenue_share** | [**List[RevenueShare]**](RevenueShare.md) | An array of payment destination objects describing how the purchase should be split between multiple wallets. **Only available with pre-agreement from Tebex.** | [optional] 

## Example

```python
from TebexCheckout.models.add_package_request import AddPackageRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddPackageRequest from a JSON string
add_package_request_instance = AddPackageRequest.from_json(json)
# print the JSON string representation of the object
print(AddPackageRequest.to_json())

# convert the object into a dict
add_package_request_dict = add_package_request_instance.to_dict()
# create an instance of AddPackageRequest from a dict
add_package_request_from_dict = AddPackageRequest.from_dict(add_package_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


