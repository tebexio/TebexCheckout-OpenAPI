# PackageMetaData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom** | **str** | A free-text string field that is passed back to you via the webhook (for example, a tracking ID) | [optional] 

## Example

```python
from TebexCheckout.models.package_meta_data import PackageMetaData

# TODO update the JSON string below
json = "{}"
# create an instance of PackageMetaData from a JSON string
package_meta_data_instance = PackageMetaData.from_json(json)
# print the JSON string representation of the object
print(PackageMetaData.to_json())

# convert the object into a dict
package_meta_data_dict = package_meta_data_instance.to_dict()
# create an instance of PackageMetaData from a dict
package_meta_data_from_dict = PackageMetaData.from_dict(package_meta_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


