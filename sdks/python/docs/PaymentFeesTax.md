# PaymentFeesTax


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**currency** | **str** |  | [optional] 

## Example

```python
from TebexCheckout.models.payment_fees_tax import PaymentFeesTax

# TODO update the JSON string below
json = "{}"
# create an instance of PaymentFeesTax from a JSON string
payment_fees_tax_instance = PaymentFeesTax.from_json(json)
# print the JSON string representation of the object
print(PaymentFeesTax.to_json())

# convert the object into a dict
payment_fees_tax_dict = payment_fees_tax_instance.to_dict()
# create an instance of PaymentFeesTax from a dict
payment_fees_tax_from_dict = PaymentFeesTax.from_dict(payment_fees_tax_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


