

# Sale


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the sale (displayed to the customer) |  [optional] |
|**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | The type of discount, either &#x60;percentage&#x60; for deducting a percentage of each item, or &#x60;amount&#x60; to deduct a fixed amount from each item. |  [optional] |
|**amount** | **BigDecimal** | The amount or percentage to deduct |  [optional] |



## Enum: DiscountTypeEnum

| Name | Value |
|---- | -----|
| PERCENTAGE | &quot;percentage&quot; |
| AMOUNT | &quot;amount&quot; |



