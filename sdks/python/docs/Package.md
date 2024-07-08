# Package


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. | [optional] 
**price** | **float** | A float (decimal describing the price of the package in your account currency) | [optional] 
**type** | **str** |  | [optional] 
**qty** | **int** |  | [optional] 
**expiry_period** | **str** | The renewal period of this item | [optional] 
**expiry_length** | **int** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. | [optional] 
**custom** | **object** | A map of data that is passed back to you via the webhook (for example, a tracking ID) | [optional] 

## Example

```python
from TebexCheckout.models.package import Package

# TODO update the JSON string below
json = "{}"
# create an instance of Package from a JSON string
package_instance = Package.from_json(json)
# print the JSON string representation of the object
print(Package.to_json())

# convert the object into a dict
package_dict = package_instance.to_dict()
# create an instance of Package from a dict
package_from_dict = Package.from_dict(package_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


