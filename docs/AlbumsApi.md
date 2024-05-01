# AlbumsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkUsersSavedAlbums**](AlbumsApi.md#checkUsersSavedAlbums) | **GET** /me/albums/contains | Check User&#x27;s Saved Albums 
[**getAnAlbum**](AlbumsApi.md#getAnAlbum) | **GET** /albums/{id} | Get Album 
[**getAnAlbumsTracks**](AlbumsApi.md#getAnAlbumsTracks) | **GET** /albums/{id}/tracks | Get Album Tracks 
[**getAnArtistsAlbums**](AlbumsApi.md#getAnArtistsAlbums) | **GET** /artists/{id}/albums | Get Artist&#x27;s Albums 
[**getMultipleAlbums**](AlbumsApi.md#getMultipleAlbums) | **GET** /albums | Get Several Albums 
[**getNewReleases**](AlbumsApi.md#getNewReleases) | **GET** /browse/new-releases | Get New Releases 
[**getUsersSavedAlbums**](AlbumsApi.md#getUsersSavedAlbums) | **GET** /me/albums | Get User&#x27;s Saved Albums 
[**removeAlbumsUser**](AlbumsApi.md#removeAlbumsUser) | **DELETE** /me/albums | Remove Users&#x27; Saved Albums 
[**saveAlbumsUser**](AlbumsApi.md#saveAlbumsUser) | **PUT** /me/albums | Save Albums for Current User 

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
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedAlbums(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#checkUsersSavedAlbums");
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

<a name="getAnAlbum"></a>
# **getAnAlbum**
> AlbumObject getAnAlbum(id, market)

Get Album 

Get Spotify catalog information for a single album. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    AlbumObject result = apiInstance.getAnAlbum(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#getAnAlbum");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**AlbumObject**](AlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnAlbumsTracks"></a>
# **getAnAlbumsTracks**
> PagingSimplifiedTrackObject getAnAlbumsTracks(id, market, limit, offset)

Get Album Tracks 

Get Spotify catalog information about an album’s tracks. Optional parameters can be used to limit the number of tracks returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSimplifiedTrackObject result = apiInstance.getAnAlbumsTracks(id, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#getAnAlbumsTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingSimplifiedTrackObject**](PagingSimplifiedTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnArtistsAlbums"></a>
# **getAnArtistsAlbums**
> PagingArtistDiscographyAlbumObject getAnArtistsAlbums(id, includeGroups, market, limit, offset)

Get Artist&#x27;s Albums 

Get Spotify catalog information about an artist&#x27;s albums. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
String id = "id_example"; // String | 
String includeGroups = "includeGroups_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingArtistDiscographyAlbumObject result = apiInstance.getAnArtistsAlbums(id, includeGroups, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#getAnArtistsAlbums");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **includeGroups** | **String**|  | [optional]
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingArtistDiscographyAlbumObject**](PagingArtistDiscographyAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMultipleAlbums"></a>
# **getMultipleAlbums**
> InlineResponse200 getMultipleAlbums(ids, market)

Get Several Albums 

Get Spotify catalog information for multiple albums identified by their Spotify IDs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
String ids = "ids_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse200 result = apiInstance.getMultipleAlbums(ids, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#getMultipleAlbums");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNewReleases"></a>
# **getNewReleases**
> InlineResponse20010 getNewReleases(limit, offset)

Get New Releases 

Get a list of new album releases featured in Spotify (shown, for example, on a Spotify player’s “Browse” tab). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    InlineResponse20010 result = apiInstance.getNewReleases(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#getNewReleases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

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
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
String market = "market_example"; // String | 
try {
    PagingSavedAlbumObject result = apiInstance.getUsersSavedAlbums(limit, offset, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#getUsersSavedAlbums");
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
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.removeAlbumsUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#removeAlbumsUser");
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
//import io.swagger.client.api.AlbumsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AlbumsApi apiInstance = new AlbumsApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.saveAlbumsUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AlbumsApi#saveAlbumsUser");
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

