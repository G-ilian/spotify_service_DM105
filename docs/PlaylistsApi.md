# PlaylistsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTracksToPlaylist**](PlaylistsApi.md#addTracksToPlaylist) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
[**changePlaylistDetails**](PlaylistsApi.md#changePlaylistDetails) | **PUT** /playlists/{playlist_id} | Change Playlist Details 
[**checkIfUserFollowsPlaylist**](PlaylistsApi.md#checkIfUserFollowsPlaylist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist 
[**createPlaylist**](PlaylistsApi.md#createPlaylist) | **POST** /users/{user_id}/playlists | Create Playlist 
[**followPlaylist**](PlaylistsApi.md#followPlaylist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist 
[**getACategoriesPlaylists**](PlaylistsApi.md#getACategoriesPlaylists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#x27;s Playlists 
[**getAListOfCurrentUsersPlaylists**](PlaylistsApi.md#getAListOfCurrentUsersPlaylists) | **GET** /me/playlists | Get Current User&#x27;s Playlists 
[**getFeaturedPlaylists**](PlaylistsApi.md#getFeaturedPlaylists) | **GET** /browse/featured-playlists | Get Featured Playlists 
[**getListUsersPlaylists**](PlaylistsApi.md#getListUsersPlaylists) | **GET** /users/{user_id}/playlists | Get User&#x27;s Playlists 
[**getPlaylist**](PlaylistsApi.md#getPlaylist) | **GET** /playlists/{playlist_id} | Get Playlist 
[**getPlaylistCover**](PlaylistsApi.md#getPlaylistCover) | **GET** /playlists/{playlist_id}/images | Get Playlist Cover Image 
[**getPlaylistsTracks**](PlaylistsApi.md#getPlaylistsTracks) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
[**removeTracksPlaylist**](PlaylistsApi.md#removeTracksPlaylist) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
[**reorderOrReplacePlaylistsTracks**](PlaylistsApi.md#reorderOrReplacePlaylistsTracks) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
[**unfollowPlaylist**](PlaylistsApi.md#unfollowPlaylist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist 
[**uploadCustomPlaylistCover**](PlaylistsApi.md#uploadCustomPlaylistCover) | **PUT** /playlists/{playlist_id}/images | Add Custom Playlist Cover Image 

<a name="addTracksToPlaylist"></a>
# **addTracksToPlaylist**
> InlineResponse2008 addTracksToPlaylist(playlistId, body, position, uris)

Add Items to Playlist 

Add one or more items to a user&#x27;s playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
Integer position = 56; // Integer | 
String uris = "uris_example"; // String | 
try {
    InlineResponse2008 result = apiInstance.addTracksToPlaylist(playlistId, body, position, uris);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#addTracksToPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]
 **position** | **Integer**|  | [optional]
 **uris** | **String**|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changePlaylistDetails"></a>
# **changePlaylistDetails**
> changePlaylistDetails(playlistId, body)

Change Playlist Details 

Change a playlist&#x27;s name and public/private state. (The user must, of course, own the playlist.) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.changePlaylistDetails(playlistId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#changePlaylistDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkIfUserFollowsPlaylist"></a>
# **checkIfUserFollowsPlaylist**
> List&lt;Boolean&gt; checkIfUserFollowsPlaylist(playlistId, ids)

Check if Users Follow Playlist 

Check to see if one or more Spotify users are following a specified playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkIfUserFollowsPlaylist(playlistId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#checkIfUserFollowsPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **ids** | **String**|  |

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createPlaylist"></a>
# **createPlaylist**
> PlaylistObject createPlaylist(userId, body)

Create Playlist 

Create a playlist for a Spotify user. (The playlist will be empty until you [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) Each user is generally limited to a maximum of 11000 playlists. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String userId = "userId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    PlaylistObject result = apiInstance.createPlaylist(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#createPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="followPlaylist"></a>
# **followPlaylist**
> followPlaylist(playlistId, body)

Follow Playlist 

Add the current user as a follower of a playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.followPlaylist(playlistId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#followPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getACategoriesPlaylists"></a>
# **getACategoriesPlaylists**
> PagingFeaturedPlaylistObject getACategoriesPlaylists(categoryId, limit, offset)

Get Category&#x27;s Playlists 

Get a list of Spotify playlists tagged with a particular category. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String categoryId = "categoryId_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingFeaturedPlaylistObject result = apiInstance.getACategoriesPlaylists(categoryId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#getACategoriesPlaylists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**|  |
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAListOfCurrentUsersPlaylists"></a>
# **getAListOfCurrentUsersPlaylists**
> PagingPlaylistObject getAListOfCurrentUsersPlaylists(limit, offset)

Get Current User&#x27;s Playlists 

Get a list of the playlists owned or followed by the current Spotify user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingPlaylistObject result = apiInstance.getAListOfCurrentUsersPlaylists(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#getAListOfCurrentUsersPlaylists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFeaturedPlaylists"></a>
# **getFeaturedPlaylists**
> PagingFeaturedPlaylistObject getFeaturedPlaylists(locale, limit, offset)

Get Featured Playlists 

Get a list of Spotify featured playlists (shown, for example, on a Spotify player&#x27;s &#x27;Browse&#x27; tab). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String locale = "locale_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingFeaturedPlaylistObject result = apiInstance.getFeaturedPlaylists(locale, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#getFeaturedPlaylists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locale** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListUsersPlaylists"></a>
# **getListUsersPlaylists**
> PagingPlaylistObject getListUsersPlaylists(userId, limit, offset)

Get User&#x27;s Playlists 

Get a list of the playlists owned or followed by a Spotify user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String userId = "userId_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingPlaylistObject result = apiInstance.getListUsersPlaylists(userId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#getListUsersPlaylists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlaylist"></a>
# **getPlaylist**
> PlaylistObject getPlaylist(playlistId, market, fields, additionalTypes)

Get Playlist 

Get a playlist owned by a Spotify user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
String market = "market_example"; // String | 
String fields = "fields_example"; // String | 
String additionalTypes = "additionalTypes_example"; // String | 
try {
    PlaylistObject result = apiInstance.getPlaylist(playlistId, market, fields, additionalTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#getPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **market** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **additionalTypes** | **String**|  | [optional]

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlaylistCover"></a>
# **getPlaylistCover**
> List&lt;ImageObject&gt; getPlaylistCover(playlistId)

Get Playlist Cover Image 

Get the current image associated with a specific playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
try {
    List<ImageObject> result = apiInstance.getPlaylistCover(playlistId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#getPlaylistCover");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |

### Return type

[**List&lt;ImageObject&gt;**](ImageObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlaylistsTracks"></a>
# **getPlaylistsTracks**
> PagingPlaylistTrackObject getPlaylistsTracks(playlistId, market, fields, limit, offset, additionalTypes)

Get Playlist Items 

Get full details of the items of a playlist owned by a Spotify user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
String market = "market_example"; // String | 
String fields = "fields_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
String additionalTypes = "additionalTypes_example"; // String | 
try {
    PagingPlaylistTrackObject result = apiInstance.getPlaylistsTracks(playlistId, market, fields, limit, offset, additionalTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#getPlaylistsTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **market** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 100]
 **offset** | **Integer**|  | [optional] [default to 0]
 **additionalTypes** | **String**|  | [optional]

### Return type

[**PagingPlaylistTrackObject**](PagingPlaylistTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeTracksPlaylist"></a>
# **removeTracksPlaylist**
> InlineResponse2008 removeTracksPlaylist(playlistId, body)

Remove Playlist Items 

Remove one or more items from a user&#x27;s playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
PlaylistIdTracksBody2 body = new PlaylistIdTracksBody2(); // PlaylistIdTracksBody2 | 
try {
    InlineResponse2008 result = apiInstance.removeTracksPlaylist(playlistId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#removeTracksPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**PlaylistIdTracksBody2**](PlaylistIdTracksBody2.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reorderOrReplacePlaylistsTracks"></a>
# **reorderOrReplacePlaylistsTracks**
> InlineResponse2008 reorderOrReplacePlaylistsTracks(playlistId, body, uris)

Update Playlist Items 

Either reorder or replace items in a playlist depending on the request&#x27;s parameters. To reorder items, include &#x60;range_start&#x60;, &#x60;insert_before&#x60;, &#x60;range_length&#x60; and &#x60;snapshot_id&#x60; in the request&#x27;s body. To replace items, include &#x60;uris&#x60; as either a query parameter or in the request&#x27;s body. Replacing items in a playlist will overwrite its existing items. This operation can be used for replacing or clearing items in a playlist. &lt;br/&gt; **Note**: Replace and reorder are mutually exclusive operations which share the same endpoint, but have different parameters. These operations can&#x27;t be applied together in a single request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
String uris = "uris_example"; // String | 
try {
    InlineResponse2008 result = apiInstance.reorderOrReplacePlaylistsTracks(playlistId, body, uris);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#reorderOrReplacePlaylistsTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]
 **uris** | **String**|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unfollowPlaylist"></a>
# **unfollowPlaylist**
> unfollowPlaylist(playlistId)

Unfollow Playlist 

Remove the current user as a follower of a playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String playlistId = "playlistId_example"; // String | 
try {
    apiInstance.unfollowPlaylist(playlistId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#unfollowPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadCustomPlaylistCover"></a>
# **uploadCustomPlaylistCover**
> uploadCustomPlaylistCover(body, playlistId)

Add Custom Playlist Cover Image 

Replace the image used to represent a specific playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlaylistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlaylistsApi apiInstance = new PlaylistsApi();
String body = "body_example"; // String | 
String playlistId = "playlistId_example"; // String | 
try {
    apiInstance.uploadCustomPlaylistCover(body, playlistId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlaylistsApi#uploadCustomPlaylistCover");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |
 **playlistId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: image/jpeg
 - **Accept**: application/json

