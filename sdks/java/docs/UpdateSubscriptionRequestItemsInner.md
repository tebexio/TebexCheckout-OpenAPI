

# UpdateSubscriptionRequestItemsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of payment, either &#x60;single&#x60; for one-time payments or &#x60;subscription&#x60;. |  [optional] |
|**qty** | **BigDecimal** |  |  [optional] |
|**revenueShare** | **List&lt;Object&gt;** |  |  [optional] |
|**_package** | [**ModelPackage**](ModelPackage.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;single&quot; |
| SUBSCRIPTION | &quot;subscription&quot; |



