# AudiobooksApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkUsersSavedAudiobooks**](AudiobooksApi.md#checkUsersSavedAudiobooks) | **GET** /me/audiobooks/contains | Check User&#x27;s Saved Audiobooks 
[**getAnAudiobook**](AudiobooksApi.md#getAnAudiobook) | **GET** /audiobooks/{id} | Get an Audiobook 
[**getAudiobookChapters**](AudiobooksApi.md#getAudiobookChapters) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters 
[**getMultipleAudiobooks**](AudiobooksApi.md#getMultipleAudiobooks) | **GET** /audiobooks | Get Several Audiobooks 
[**getUsersSavedAudiobooks**](AudiobooksApi.md#getUsersSavedAudiobooks) | **GET** /me/audiobooks | Get User&#x27;s Saved Audiobooks 
[**removeAudiobooksUser**](AudiobooksApi.md#removeAudiobooksUser) | **DELETE** /me/audiobooks | Remove User&#x27;s Saved Audiobooks 
[**saveAudiobooksUser**](AudiobooksApi.md#saveAudiobooksUser) | **PUT** /me/audiobooks | Save Audiobooks for Current User 

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
//import io.swagger.client.api.AudiobooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AudiobooksApi apiInstance = new AudiobooksApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedAudiobooks(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiobooksApi#checkUsersSavedAudiobooks");
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

<a name="getAnAudiobook"></a>
# **getAnAudiobook**
> AudiobookObject getAnAudiobook(id, market)

Get an Audiobook 

Get Spotify catalog information for a single audiobook. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AudiobooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AudiobooksApi apiInstance = new AudiobooksApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    AudiobookObject result = apiInstance.getAnAudiobook(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiobooksApi#getAnAudiobook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**AudiobookObject**](AudiobookObject.md)

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
//import io.swagger.client.api.AudiobooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AudiobooksApi apiInstance = new AudiobooksApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSimplifiedChapterObject result = apiInstance.getAudiobookChapters(id, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiobooksApi#getAudiobookChapters");
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

<a name="getMultipleAudiobooks"></a>
# **getMultipleAudiobooks**
> InlineResponse2005 getMultipleAudiobooks(ids, market)

Get Several Audiobooks 

Get Spotify catalog information for several audiobooks identified by their Spotify IDs. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AudiobooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AudiobooksApi apiInstance = new AudiobooksApi();
String ids = "ids_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse2005 result = apiInstance.getMultipleAudiobooks(ids, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiobooksApi#getMultipleAudiobooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

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
//import io.swagger.client.api.AudiobooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AudiobooksApi apiInstance = new AudiobooksApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedAudiobookObject result = apiInstance.getUsersSavedAudiobooks(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiobooksApi#getUsersSavedAudiobooks");
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
//import io.swagger.client.api.AudiobooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AudiobooksApi apiInstance = new AudiobooksApi();
String ids = "ids_example"; // String | 
try {
    apiInstance.removeAudiobooksUser(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiobooksApi#removeAudiobooksUser");
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
//import io.swagger.client.api.AudiobooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

AudiobooksApi apiInstance = new AudiobooksApi();
String ids = "ids_example"; // String | 
try {
    apiInstance.saveAudiobooksUser(ids);
} catch (ApiException e) {
    System.err.println("Exception when calling AudiobooksApi#saveAudiobooksUser");
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

