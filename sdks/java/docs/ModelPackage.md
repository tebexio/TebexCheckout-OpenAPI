

# ModelPackage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the item being purchased. This should be user-friendly as it is shown to the customer on checkout and receipts. |  [optional] |
|**price** | **Float** | A float (decimal describing the price of the package in your account currency) |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**qty** | **Integer** |  |  [optional] |
|**expiryPeriod** | [**ExpiryPeriodEnum**](#ExpiryPeriodEnum) | The renewal period of this item |  [optional] |
|**expiryLength** | **Integer** | An integer representing the number of &#x60;expiry_periods&#x60; that make up the renewal period. |  [optional] |
|**custom** | **Object** | A map of data that is passed back to you via the webhook (for example, a tracking ID) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| SUBSCRIPTION | &quot;subscription&quot; |



## Enum: ExpiryPeriodEnum

| Name | Value |
|---- | -----|
| DAY | &quot;day&quot; |
| MONTH | &quot;month&quot; |
| YEAR | &quot;year&quot; |



