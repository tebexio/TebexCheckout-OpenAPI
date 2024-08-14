# TebexCheckout.Model.CreateBasketRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReturnUrl** | **string** | The URL a customer can return to without completing checkout | [optional] 
**CompleteUrl** | **string** | URL the customer can return to after completing payment | [optional] 
**Custom** | **Object** | Any custom data to be passed through the request. This will be returned in a post-completion webhook. | [optional] 
**FirstName** | **string** | The first name of the customer | [optional] 
**LastName** | **string** | The last name of the customer | [optional] 
**Email** | **string** | The email address of the customer | [optional] 
**ExpiresAt** | **string** | An ISO8601 formatted date. After this date the basket cannot be used to checkout. | [optional] 
**CompleteAutoRedirect** | **bool** | Automatically redirect to the complete_url provided | [optional] 
**Country** | **string** | An ISO 3166-1 alpha-2 character code representing the customer&#39;s country. | [optional] 
**CreatorCode** | **string** | The creator code is used to share a percentage of the payment with another party. See more about creator codes at https://docs.tebex.io/creators/tebex-control-panel/engagement/creator-codes | [optional] 
**Ip** | **string** | The IP address of the customer using this basket. Provide the IP if creating a basket on your server backend. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

