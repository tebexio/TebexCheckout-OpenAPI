# # CreateBasketRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**return_url** | **string** | The URL a customer can return to without completing checkout | [optional]
**complete_url** | **string** | URL the customer can return to after completing payment | [optional]
**custom** | **object** | Any custom data to be passed through the request. This will be returned in a post-completion webhook. | [optional]
**first_name** | **string** | The first name of the customer | [optional]
**last_name** | **string** | The last name of the customer | [optional]
**email** | **string** | The email address of the customer | [optional]
**expires_at** | **string** | An ISO8601 formatted date. After this date the basket cannot be used to checkout. | [optional]
**complete_auto_redirect** | **bool** | Automatically redirect to the complete_url provided | [optional]
**country** | **string** | An ISO 3166-1 alpha-2 character code representing the customer&#39;s country. | [optional]
**creator_code** | **string** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional]
**ip** | **string** | The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
