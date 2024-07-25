

# RecurringPayment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**pausedAt** | **OffsetDateTime** |  |  [optional] |
|**pausedUntil** | **OffsetDateTime** |  |  [optional] |
|**nextPaymentDate** | **String** |  |  [optional] |
|**reference** | **String** |  |  [optional] |
|**accountId** | **Integer** |  |  [optional] |
|**interval** | **String** |  |  [optional] |
|**cancelledAt** | **OffsetDateTime** |  |  [optional] |
|**cancellationRequestedAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**RecurringPaymentStatus**](RecurringPaymentStatus.md) |  |  [optional] |
|**amount** | [**RecurringPaymentAmount**](RecurringPaymentAmount.md) |  |  [optional] |
|**cancelReason** | **String** |  |  [optional] |
|**links** | [**RecurringPaymentLinks**](RecurringPaymentLinks.md) |  |  [optional] |



