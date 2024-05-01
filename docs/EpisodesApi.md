# EpisodesApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkUsersSavedEpisodes**](EpisodesApi.md#checkUsersSavedEpisodes) | **GET** /me/episodes/contains | Check User&#x27;s Saved Episodes 
[**getAShowsEpisodes**](EpisodesApi.md#getAShowsEpisodes) | **GET** /shows/{id}/episodes | Get Show Episodes 
[**getAnEpisode**](EpisodesApi.md#getAnEpisode) | **GET** /episodes/{id} | Get Episode 
[**getMultipleEpisodes**](EpisodesApi.md#getMultipleEpisodes) | **GET** /episodes | Get Several Episodes 
[**getUsersSavedEpisodes**](EpisodesApi.md#getUsersSavedEpisodes) | **GET** /me/episodes | Get User&#x27;s Saved Episodes 
[**removeEpisodesUser**](EpisodesApi.md#removeEpisodesUser) | **DELETE** /me/episodes | Remove User&#x27;s Saved Episodes 
[**saveEpisodesUser**](EpisodesApi.md#saveEpisodesUser) | **PUT** /me/episodes | Save Episodes for Current User 

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
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

EpisodesApi apiInstance = new EpisodesApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedEpisodes(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#checkUsersSavedEpisodes");
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

<a name="getAShowsEpisodes"></a>
# **getAShowsEpisodes**
> PagingSimplifiedEpisodeObject getAShowsEpisodes(id, market, limit, offset)

Get Show Episodes 

Get Spotify catalog information about an show’s episodes. Optional parameters can be used to limit the number of episodes returned. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

EpisodesApi apiInstance = new EpisodesApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSimplifiedEpisodeObject result = apiInstance.getAShowsEpisodes(id, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#getAShowsEpisodes");
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

[**PagingSimplifiedEpisodeObject**](PagingSimplifiedEpisodeObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnEpisode"></a>
# **getAnEpisode**
> EpisodeObject getAnEpisode(id, market)

Get Episode 

Get Spotify catalog information for a single episode identified by its unique Spotify ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

EpisodesApi apiInstance = new EpisodesApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    EpisodeObject result = apiInstance.getAnEpisode(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#getAnEpisode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**EpisodeObject**](EpisodeObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMultipleEpisodes"></a>
# **getMultipleEpisodes**
> InlineResponse2004 getMultipleEpisodes(ids, market)

Get Several Episodes 

Get Spotify catalog information for several episodes based on their Spotify IDs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

EpisodesApi apiInstance = new EpisodesApi();
String ids = "ids_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.getMultipleEpisodes(ids, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#getMultipleEpisodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

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
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

EpisodesApi apiInstance = new EpisodesApi();
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedEpisodeObject result = apiInstance.getUsersSavedEpisodes(market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#getUsersSavedEpisodes");
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
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

EpisodesApi apiInstance = new EpisodesApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.removeEpisodesUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#removeEpisodesUser");
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
//import io.swagger.client.api.EpisodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

EpisodesApi apiInstance = new EpisodesApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.saveEpisodesUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling EpisodesApi#saveEpisodesUser");
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

