# LibraryApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlaylistDetails**](LibraryApi.md#changePlaylistDetails) | **PUT** /playlists/{playlist_id} | Change Playlist Details 
[**checkCurrentUserFollows**](LibraryApi.md#checkCurrentUserFollows) | **GET** /me/following/contains | Check If User Follows Artists or Users 
[**checkUsersSavedAlbums**](LibraryApi.md#checkUsersSavedAlbums) | **GET** /me/albums/contains | Check User&#x27;s Saved Albums 
[**checkUsersSavedAudiobooks**](LibraryApi.md#checkUsersSavedAudiobooks) | **GET** /me/audiobooks/contains | Check User&#x27;s Saved Audiobooks 
[**checkUsersSavedEpisodes**](LibraryApi.md#checkUsersSavedEpisodes) | **GET** /me/episodes/contains | Check User&#x27;s Saved Episodes 
[**checkUsersSavedShows**](LibraryApi.md#checkUsersSavedShows) | **GET** /me/shows/contains | Check User&#x27;s Saved Shows 
[**checkUsersSavedTracks**](LibraryApi.md#checkUsersSavedTracks) | **GET** /me/tracks/contains | Check User&#x27;s Saved Tracks 
[**createPlaylist**](LibraryApi.md#createPlaylist) | **POST** /users/{user_id}/playlists | Create Playlist 
[**followArtistsUsers**](LibraryApi.md#followArtistsUsers) | **PUT** /me/following | Follow Artists or Users 
[**getAListOfCurrentUsersPlaylists**](LibraryApi.md#getAListOfCurrentUsersPlaylists) | **GET** /me/playlists | Get Current User&#x27;s Playlists 
[**getFollowed**](LibraryApi.md#getFollowed) | **GET** /me/following | Get Followed Artists 
[**getUsersSavedAlbums**](LibraryApi.md#getUsersSavedAlbums) | **GET** /me/albums | Get User&#x27;s Saved Albums 
[**getUsersSavedAudiobooks**](LibraryApi.md#getUsersSavedAudiobooks) | **GET** /me/audiobooks | Get User&#x27;s Saved Audiobooks 
[**getUsersSavedEpisodes**](LibraryApi.md#getUsersSavedEpisodes) | **GET** /me/episodes | Get User&#x27;s Saved Episodes 
[**getUsersSavedShows**](LibraryApi.md#getUsersSavedShows) | **GET** /me/shows | Get User&#x27;s Saved Shows 
[**getUsersSavedTracks**](LibraryApi.md#getUsersSavedTracks) | **GET** /me/tracks | Get User&#x27;s Saved Tracks 
[**getUsersTopArtists**](LibraryApi.md#getUsersTopArtists) | **GET** /me/top/artists | Get User&#x27;s Top Artists 
[**getUsersTopTracks**](LibraryApi.md#getUsersTopTracks) | **GET** /me/top/tracks | Get User&#x27;s Top Tracks 
[**removeAlbumsUser**](LibraryApi.md#removeAlbumsUser) | **DELETE** /me/albums | Remove Users&#x27; Saved Albums 
[**removeAudiobooksUser**](LibraryApi.md#removeAudiobooksUser) | **DELETE** /me/audiobooks | Remove User&#x27;s Saved Audiobooks 
[**removeEpisodesUser**](LibraryApi.md#removeEpisodesUser) | **DELETE** /me/episodes | Remove User&#x27;s Saved Episodes 
[**removeShowsUser**](LibraryApi.md#removeShowsUser) | **DELETE** /me/shows | Remove User&#x27;s Saved Shows 
[**removeTracksUser**](LibraryApi.md#removeTracksUser) | **DELETE** /me/tracks | Remove User&#x27;s Saved Tracks 
[**saveAlbumsUser**](LibraryApi.md#saveAlbumsUser) | **PUT** /me/albums | Save Albums for Current User 
[**saveAudiobooksUser**](LibraryApi.md#saveAudiobooksUser) | **PUT** /me/audiobooks | Save Audiobooks for Current User 
[**saveEpisodesUser**](LibraryApi.md#saveEpisodesUser) | **PUT** /me/episodes | Save Episodes for Current User 
[**saveShowsUser**](LibraryApi.md#saveShowsUser) | **PUT** /me/shows | Save Shows for Current User 
[**saveTracksUser**](LibraryApi.md#saveTracksUser) | **PUT** /me/tracks | Save Tracks for Current User 
[**unfollowArtistsUsers**](LibraryApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 

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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.changePlaylistDetails(playlistId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#changePlaylistDetails");
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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkCurrentUserFollows(type, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#checkCurrentUserFollows");
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

<a name="checkUsersSavedAlbums"></a>
# **checkUsersSavedAlbums**
> List&lt;Boolean&gt; checkUsersSavedAlbums(ids)

Check User&#x27;s Saved Albums 

Check if one or more albums is already saved in the current Spotify user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedAlbums(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#checkUsersSavedAlbums");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkUsersSavedAudiobooks"></a>
# **checkUsersSavedAudiobooks**
> List&lt;Boolean&gt; checkUsersSavedAudiobooks(ids)

Check User&#x27;s Saved Audiobooks 

Check if one or more audiobooks are already saved in the current Spotify user&#x27;s library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedAudiobooks(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#checkUsersSavedAudiobooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkUsersSavedEpisodes"></a>
# **checkUsersSavedEpisodes**
> List&lt;Boolean&gt; checkUsersSavedEpisodes(ids)

Check User&#x27;s Saved Episodes 

Check if one or more episodes is already saved in the current Spotify user&#x27;s &#x27;Your Episodes&#x27; library.&lt;br/&gt; This API endpoint is in __beta__ and could change without warning. Please share any feedback that you have, or issues that you discover, in our [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer).. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedEpisodes(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#checkUsersSavedEpisodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkUsersSavedShows"></a>
# **checkUsersSavedShows**
> List&lt;Boolean&gt; checkUsersSavedShows(ids)

Check User&#x27;s Saved Shows 

Check if one or more shows is already saved in the current Spotify user&#x27;s library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedShows(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#checkUsersSavedShows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

**List&lt;Boolean&gt;**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="checkUsersSavedTracks"></a>
# **checkUsersSavedTracks**
> List&lt;Boolean&gt; checkUsersSavedTracks(ids)

Check User&#x27;s Saved Tracks 

Check if one or more tracks is already saved in the current Spotify user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedTracks(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#checkUsersSavedTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String userId = "userId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    PlaylistObject result = apiInstance.createPlaylist(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#createPlaylist");
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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.followArtistsUsers(type, ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#followArtistsUsers");
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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingPlaylistObject result = apiInstance.getAListOfCurrentUsersPlaylists(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getAListOfCurrentUsersPlaylists");
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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String type = "type_example"; // String | 
String after = "after_example"; // String | 
Integer limit = 20; // Integer | 
try {
    InlineResponse20011 result = apiInstance.getFollowed(type, after, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getFollowed");
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

<a name="getUsersSavedAlbums"></a>
# **getUsersSavedAlbums**
> PagingSavedAlbumObject getUsersSavedAlbums(limit, offset, market)

Get User&#x27;s Saved Albums 

Get a list of the albums saved in the current Spotify user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
String market = "market_example"; // String | 
try {
    PagingSavedAlbumObject result = apiInstance.getUsersSavedAlbums(limit, offset, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getUsersSavedAlbums");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]
 **market** | **String**|  | [optional]

### Return type

[**PagingSavedAlbumObject**](PagingSavedAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersSavedAudiobooks"></a>
# **getUsersSavedAudiobooks**
> PagingSavedAudiobookObject getUsersSavedAudiobooks(limit, offset)

Get User&#x27;s Saved Audiobooks 

Get a list of the audiobooks saved in the current Spotify user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedAudiobookObject result = apiInstance.getUsersSavedAudiobooks(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getUsersSavedAudiobooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSavedAudiobookObject**](PagingSavedAudiobookObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersSavedEpisodes"></a>
# **getUsersSavedEpisodes**
> PagingSavedEpisodeObject getUsersSavedEpisodes(market, limit, offset)

Get User&#x27;s Saved Episodes 

Get a list of the episodes saved in the current Spotify user&#x27;s library.&lt;br/&gt; This API endpoint is in __beta__ and could change without warning. Please share any feedback that you have, or issues that you discover, in our [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedEpisodeObject result = apiInstance.getUsersSavedEpisodes(market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getUsersSavedEpisodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSavedEpisodeObject**](PagingSavedEpisodeObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersSavedShows"></a>
# **getUsersSavedShows**
> PagingSavedShowObject getUsersSavedShows(limit, offset)

Get User&#x27;s Saved Shows 

Get a list of shows saved in the current Spotify user&#x27;s library. Optional parameters can be used to limit the number of shows returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedShowObject result = apiInstance.getUsersSavedShows(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getUsersSavedShows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSavedShowObject**](PagingSavedShowObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUsersSavedTracks"></a>
# **getUsersSavedTracks**
> PagingSavedTrackObject getUsersSavedTracks(market, limit, offset)

Get User&#x27;s Saved Tracks 

Get a list of the songs saved in the current Spotify user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedTrackObject result = apiInstance.getUsersSavedTracks(market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getUsersSavedTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSavedTrackObject**](PagingSavedTrackObject.md)

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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String timeRange = "medium_term"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingArtistObject result = apiInstance.getUsersTopArtists(timeRange, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getUsersTopArtists");
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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String timeRange = "medium_term"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingTrackObject result = apiInstance.getUsersTopTracks(timeRange, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#getUsersTopTracks");
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

<a name="removeAlbumsUser"></a>
# **removeAlbumsUser**
> removeAlbumsUser(ids, body)

Remove Users&#x27; Saved Albums 

Remove one or more albums from the current user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.removeAlbumsUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#removeAlbumsUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeAudiobooksUser"></a>
# **removeAudiobooksUser**
> removeAudiobooksUser(ids)

Remove User&#x27;s Saved Audiobooks 

Remove one or more audiobooks from the Spotify user&#x27;s library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
try {
    apiInstance.removeAudiobooksUser(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#removeAudiobooksUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeEpisodesUser"></a>
# **removeEpisodesUser**
> removeEpisodesUser(ids, body)

Remove User&#x27;s Saved Episodes 

Remove one or more episodes from the current user&#x27;s library.&lt;br/&gt; This API endpoint is in __beta__ and could change without warning. Please share any feedback that you have, or issues that you discover, in our [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.removeEpisodesUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#removeEpisodesUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeShowsUser"></a>
# **removeShowsUser**
> removeShowsUser(ids, body, market)

Remove User&#x27;s Saved Shows 

Delete one or more shows from current Spotify user&#x27;s library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
MeShowsBody1 body = new MeShowsBody1(); // MeShowsBody1 | 
String market = "market_example"; // String | 
try {
    apiInstance.removeShowsUser(ids, body, market);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#removeShowsUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**MeShowsBody1**](MeShowsBody1.md)|  | [optional]
 **market** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTracksUser"></a>
# **removeTracksUser**
> removeTracksUser(ids, body)

Remove User&#x27;s Saved Tracks 

Remove one or more tracks from the current user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.removeTracksUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#removeTracksUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveAlbumsUser"></a>
# **saveAlbumsUser**
> saveAlbumsUser(ids, body)

Save Albums for Current User 

Save one or more albums to the current user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.saveAlbumsUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#saveAlbumsUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveAudiobooksUser"></a>
# **saveAudiobooksUser**
> saveAudiobooksUser(ids)

Save Audiobooks for Current User 

Save one or more audiobooks to the current Spotify user&#x27;s library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
try {
    apiInstance.saveAudiobooksUser(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#saveAudiobooksUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveEpisodesUser"></a>
# **saveEpisodesUser**
> saveEpisodesUser(ids, body)

Save Episodes for Current User 

Save one or more episodes to the current user&#x27;s library.&lt;br/&gt; This API endpoint is in __beta__ and could change without warning. Please share any feedback that you have, or issues that you discover, in our [developer community forum](https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.saveEpisodesUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#saveEpisodesUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveShowsUser"></a>
# **saveShowsUser**
> saveShowsUser(ids, body)

Save Shows for Current User 

Save one or more shows to current Spotify user&#x27;s library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
MeShowsBody body = new MeShowsBody(); // MeShowsBody | 
try {
    apiInstance.saveShowsUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#saveShowsUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**MeShowsBody**](MeShowsBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveTracksUser"></a>
# **saveTracksUser**
> saveTracksUser(ids, body)

Save Tracks for Current User 

Save one or more tracks to the current user&#x27;s &#x27;Your Music&#x27; library. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.saveTracksUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#saveTracksUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
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
//import io.swagger.client.api.LibraryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

LibraryApi apiInstance = new LibraryApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.unfollowArtistsUsers(type, ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LibraryApi#unfollowArtistsUsers");
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

