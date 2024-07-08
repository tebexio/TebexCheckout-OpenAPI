

# RecurringPaymentSubject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reference** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**pausedAt** | **OffsetDateTime** |  |  [optional] |
|**pausedUntil** | **OffsetDateTime** |  |  [optional] |
|**nextPaymentAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**RecurringPaymentSubjectStatus**](RecurringPaymentSubjectStatus.md) |  |  [optional] |
|**initialPayment** | [**PaymentSubject**](PaymentSubject.md) |  |  [optional] |
|**lastPayment** | [**PaymentSubject**](PaymentSubject.md) |  |  [optional] |
|**failCount** | **Integer** |  |  [optional] |
|**price** | [**RecurringPaymentSubjectPrice**](RecurringPaymentSubjectPrice.md) |  |  [optional] |
|**cancelledAt** | **OffsetDateTime** |  |  [optional] |
|**cancelReason** | **String** |  |  [optional] |



