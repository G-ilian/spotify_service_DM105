# ArtistsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkCurrentUserFollows**](ArtistsApi.md#checkCurrentUserFollows) | **GET** /me/following/contains | Check If User Follows Artists or Users 
[**followArtistsUsers**](ArtistsApi.md#followArtistsUsers) | **PUT** /me/following | Follow Artists or Users 
[**getAnArtist**](ArtistsApi.md#getAnArtist) | **GET** /artists/{id} | Get Artist 
[**getAnArtistsAlbums**](ArtistsApi.md#getAnArtistsAlbums) | **GET** /artists/{id}/albums | Get Artist&#x27;s Albums 
[**getAnArtistsRelatedArtists**](ArtistsApi.md#getAnArtistsRelatedArtists) | **GET** /artists/{id}/related-artists | Get Artist&#x27;s Related Artists 
[**getAnArtistsTopTracks**](ArtistsApi.md#getAnArtistsTopTracks) | **GET** /artists/{id}/top-tracks | Get Artist&#x27;s Top Tracks 
[**getFollowed**](ArtistsApi.md#getFollowed) | **GET** /me/following | Get Followed Artists 
[**getMultipleArtists**](ArtistsApi.md#getMultipleArtists) | **GET** /artists | Get Several Artists 
[**getUsersTopArtists**](ArtistsApi.md#getUsersTopArtists) | **GET** /me/top/artists | Get User&#x27;s Top Artists 
[**unfollowArtistsUsers**](ArtistsApi.md#unfollowArtistsUsers) | **DELETE** /me/following | Unfollow Artists or Users 

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
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkCurrentUserFollows(type, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#checkCurrentUserFollows");
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
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.followArtistsUsers(type, ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#followArtistsUsers");
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

<a name="getAnArtist"></a>
# **getAnArtist**
> ArtistObject getAnArtist(id)

Get Artist 

Get Spotify catalog information for a single artist identified by their unique Spotify ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String id = "id_example"; // String | 
try {
    ArtistObject result = apiInstance.getAnArtist(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#getAnArtist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ArtistObject**](ArtistObject.md)

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
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String id = "id_example"; // String | 
String includeGroups = "includeGroups_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingArtistDiscographyAlbumObject result = apiInstance.getAnArtistsAlbums(id, includeGroups, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#getAnArtistsAlbums");
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

<a name="getAnArtistsRelatedArtists"></a>
# **getAnArtistsRelatedArtists**
> InlineResponse2001 getAnArtistsRelatedArtists(id)

Get Artist&#x27;s Related Artists 

Get Spotify catalog information about artists similar to a given artist. Similarity is based on analysis of the Spotify community&#x27;s listening history. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String id = "id_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getAnArtistsRelatedArtists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#getAnArtistsRelatedArtists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnArtistsTopTracks"></a>
# **getAnArtistsTopTracks**
> InlineResponse2002 getAnArtistsTopTracks(id, market)

Get Artist&#x27;s Top Tracks 

Get Spotify catalog information about an artist&#x27;s top tracks by country. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.getAnArtistsTopTracks(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#getAnArtistsTopTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String type = "type_example"; // String | 
String after = "after_example"; // String | 
Integer limit = 20; // Integer | 
try {
    InlineResponse20011 result = apiInstance.getFollowed(type, after, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#getFollowed");
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

<a name="getMultipleArtists"></a>
# **getMultipleArtists**
> InlineResponse2001 getMultipleArtists(ids)

Get Several Artists 

Get Spotify catalog information for several artists based on their Spotify IDs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String ids = "ids_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getMultipleArtists(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#getMultipleArtists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String timeRange = "medium_term"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingArtistObject result = apiInstance.getUsersTopArtists(timeRange, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#getUsersTopArtists");
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
//import io.swagger.client.api.ArtistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ArtistsApi apiInstance = new ArtistsApi();
String type = "type_example"; // String | 
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.unfollowArtistsUsers(type, ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtistsApi#unfollowArtistsUsers");
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

