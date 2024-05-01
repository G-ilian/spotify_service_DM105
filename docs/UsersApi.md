# UsersApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCurrentUserFollows**](UsersApi.md#checkCurrentUserFollows) | **GET** /me/following/contains | Check If User Follows Artists or Users 
[**checkIfUserFollowsPlaylist**](UsersApi.md#checkIfUserFollowsPlaylist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist 
[**followArtistsUsers**](UsersApi.md#followArtistsUsers) | **PUT** /me/following | Follow Artists or Users 
[**followPlaylist**](UsersApi.md#followPlaylist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist 
[**getCurrentUsersProfile**](UsersApi.md#getCurrentUsersProfile) | **GET** /me | Get Current User&#x27;s Profile 
[**getFollowed**](UsersApi.md#getFollowed) | **GET** /me/following | Get Followed Artists 
[**getListUsersPlaylists**](UsersApi.md#getListUsersPlaylists) | **GET** /users/{user_id}/playlists | Get User&#x27;s Playlists 
[**getUsersProfile**](UsersApi.md#getUsersProfile) | **GET** /users/{user_id} | Get User&#x27;s Profile 
[**getUsersTopArtists**](UsersApi.md#getUsersTopArtists) | **GET** /me/top/artists | Get User&#x27;s Top Artists 
[**getUsersTopTracks**](UsersApi.md#getUsersTopTracks) | **GET** /me/top/tracks | Get User&#x27;s Top Tracks 
[**unfollowArtistsUsers**](UsersApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 
[**unfollowPlaylist**](UsersApi.md#unfollowPlaylist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist 

<a name="checkCurrentUserFollows"></a>
# **checkCurrentUserFollows**
> List&lt;Boolean&gt; checkCurrentUserFollows(type, ids)

Check If User Follows Artists or Users 

Check to see if the current user is following one or more artists or other Spotify users. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkCurrentUserFollows(type, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#checkCurrentUserFollows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [enum: artist, user]
 **ids** | **String**|  |

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
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
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String playlistId = "playlistId_example"; // String | 
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkIfUserFollowsPlaylist(playlistId, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#checkIfUserFollowsPlaylist");
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

<a name="followArtistsUsers"></a>
# **followArtistsUsers**
> followArtistsUsers(type, ids, body)

Follow Artists or Users 

Add the current user as a follower of one or more artists or other Spotify users. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.followArtistsUsers(type, ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#followArtistsUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [enum: artist, user]
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

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
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.followPlaylist(playlistId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#followPlaylist");
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

<a name="getCurrentUsersProfile"></a>
# **getCurrentUsersProfile**
> PrivateUserObject getCurrentUsersProfile()

Get Current User&#x27;s Profile 

Get detailed profile information about the current user (including the current user&#x27;s username). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
try {
    PrivateUserObject result = apiInstance.getCurrentUsersProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getCurrentUsersProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrivateUserObject**](PrivateUserObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFollowed"></a>
# **getFollowed**
> InlineResponse20011 getFollowed(type, after, limit)

Get Followed Artists 

Get the current user&#x27;s followed artists. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String type = "type_example"; // String | 
String after = "after_example"; // String | 
Integer limit = 20; // Integer | 
try {
    InlineResponse20011 result = apiInstance.getFollowed(type, after, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getFollowed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [enum: artist]
 **after** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

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
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingPlaylistObject result = apiInstance.getListUsersPlaylists(userId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getListUsersPlaylists");
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

<a name="getUsersProfile"></a>
# **getUsersProfile**
> PublicUserObject getUsersProfile(userId)

Get User&#x27;s Profile 

Get public profile information about a Spotify user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | 
try {
    PublicUserObject result = apiInstance.getUsersProfile(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**PublicUserObject**](PublicUserObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersTopArtists"></a>
# **getUsersTopArtists**
> PagingArtistObject getUsersTopArtists(timeRange, limit, offset)

Get User&#x27;s Top Artists 

Get the current user&#x27;s top artists based on calculated affinity. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String timeRange = "medium_term"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingArtistObject result = apiInstance.getUsersTopArtists(timeRange, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersTopArtists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeRange** | **String**|  | [optional] [default to medium_term]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingArtistObject**](PagingArtistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersTopTracks"></a>
# **getUsersTopTracks**
> PagingTrackObject getUsersTopTracks(timeRange, limit, offset)

Get User&#x27;s Top Tracks 

Get the current user&#x27;s top tracks based on calculated affinity. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String timeRange = "medium_term"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingTrackObject result = apiInstance.getUsersTopTracks(timeRange, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsersTopTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeRange** | **String**|  | [optional] [default to medium_term]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingTrackObject**](PagingTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unfollowArtistsUsers"></a>
# **unfollowArtistsUsers**
> unfollowArtistsUsers(type, ids, body)

Unfollow Artists or Users 

Remove the current user as a follower of one or more artists or other Spotify users. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.unfollowArtistsUsers(type, ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#unfollowArtistsUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [enum: artist, user]
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

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
//import io.swagger.client.api.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

UsersApi apiInstance = new UsersApi();
String playlistId = "playlistId_example"; // String | 
try {
    apiInstance.unfollowPlaylist(playlistId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#unfollowPlaylist");
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

