# PlaylistUserObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalUrls** | **AllOfPlaylistUserObjectExternalUrls** | Known public external URLs for this user.  |  [optional]
**followers** | **AllOfPlaylistUserObjectFollowers** | Information about the followers of this user.  |  [optional]
**href** | **String** | A link to the Web API endpoint for this user.  |  [optional]
**id** | **String** | The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The object type.  |  [optional]
**uri** | **String** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
