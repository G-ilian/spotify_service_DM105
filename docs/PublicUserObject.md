# PublicUserObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The name displayed on the user&#x27;s profile. &#x60;null&#x60; if not available.  |  [optional]
**externalUrls** | **AllOfPublicUserObjectExternalUrls** | Known public external URLs for this user.  |  [optional]
**followers** | **AllOfPublicUserObjectFollowers** | Information about the followers of this user.  |  [optional]
**href** | **String** | A link to the Web API endpoint for this user.  |  [optional]
**id** | **String** | The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.  |  [optional]
**images** | [**List&lt;ImageObject&gt;**](ImageObject.md) | The user&#x27;s profile image.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The object type.  |  [optional]
**uri** | **String** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
