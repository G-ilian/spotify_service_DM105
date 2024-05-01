# SearchApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /search | Search for Item 

<a name="search"></a>
# **search**
> InlineResponse2007 search(q, type, market, limit, offset, includeExternal)

Search for Item 

Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or audiobooks that match a keyword string. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
String q = "q_example"; // String | 
List<String> type = Arrays.asList("type_example"); // List<String> | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
String includeExternal = "includeExternal_example"; // String | 
try {
    InlineResponse2007 result = apiInstance.search(q, type, market, limit, offset, includeExternal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  |
 **type** | [**List&lt;String&gt;**](String.md)|  | [enum: album, artist, playlist, track, show, episode, audiobook]
 **market** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0] [enum: 0, 1000]
 **includeExternal** | **String**|  | [optional] [enum: audio]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

