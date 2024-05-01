# ChaptersApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAChapter**](ChaptersApi.md#getAChapter) | **GET** /chapters/{id} | Get a Chapter 
[**getAudiobookChapters**](ChaptersApi.md#getAudiobookChapters) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters 
[**getSeveralChapters**](ChaptersApi.md#getSeveralChapters) | **GET** /chapters | Get Several Chapters 

<a name="getAChapter"></a>
# **getAChapter**
> ChapterObject getAChapter(id, market)

Get a Chapter 

Get Spotify catalog information for a single audiobook chapter. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChaptersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ChaptersApi apiInstance = new ChaptersApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    ChapterObject result = apiInstance.getAChapter(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChaptersApi#getAChapter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**ChapterObject**](ChapterObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAudiobookChapters"></a>
# **getAudiobookChapters**
> PagingSimplifiedChapterObject getAudiobookChapters(id, market, limit, offset)

Get Audiobook Chapters 

Get Spotify catalog information about an audiobook&#x27;s chapters. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChaptersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ChaptersApi apiInstance = new ChaptersApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSimplifiedChapterObject result = apiInstance.getAudiobookChapters(id, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChaptersApi#getAudiobookChapters");
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

[**PagingSimplifiedChapterObject**](PagingSimplifiedChapterObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSeveralChapters"></a>
# **getSeveralChapters**
> InlineResponse2006 getSeveralChapters(ids, market)

Get Several Chapters 

Get Spotify catalog information for several audiobook chapters identified by their Spotify IDs. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ChaptersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ChaptersApi apiInstance = new ChaptersApi();
String ids = "ids_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.getSeveralChapters(ids, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChaptersApi#getSeveralChapters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

