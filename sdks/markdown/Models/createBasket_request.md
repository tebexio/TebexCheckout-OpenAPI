# createBasket_request
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **return\_url** | **String** | The URL a customer can return to without completing checkout | [optional] [default to null] |
| **complete\_url** | **String** | URL the customer can return to after completing payment | [optional] [default to null] |
| **custom** | [**Object**](.md) | Any custom data to be passed through the request. This will be returned in a post-completion webhook. | [optional] [default to null] |
| **first\_name** | **String** | The first name of the customer | [optional] [default to null] |
| **last\_name** | **String** | The last name of the customer | [optional] [default to null] |
| **email** | **String** | The email address of the customer | [optional] [default to null] |
| **complete\_auto\_redirect** | **Boolean** | Automatically redirect to the complete_url provided | [optional] [default to null] |
| **country** | **String** | An ISO 3166-1 alpha-2 character code representing the customer&#39;s country. | [optional] [default to null] |
| **creator\_code** | **String** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] [default to null] |
| **ip** | **String** | The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

