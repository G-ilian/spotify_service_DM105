# ShowsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkUsersSavedShows**](ShowsApi.md#checkUsersSavedShows) | **GET** /me/shows/contains | Check User&#x27;s Saved Shows 
[**getAShow**](ShowsApi.md#getAShow) | **GET** /shows/{id} | Get Show 
[**getAShowsEpisodes**](ShowsApi.md#getAShowsEpisodes) | **GET** /shows/{id}/episodes | Get Show Episodes 
[**getMultipleShows**](ShowsApi.md#getMultipleShows) | **GET** /shows | Get Several Shows 
[**getUsersSavedShows**](ShowsApi.md#getUsersSavedShows) | **GET** /me/shows | Get User&#x27;s Saved Shows 
[**removeShowsUser**](ShowsApi.md#removeShowsUser) | **DELETE** /me/shows | Remove User&#x27;s Saved Shows 
[**saveShowsUser**](ShowsApi.md#saveShowsUser) | **PUT** /me/shows | Save Shows for Current User 

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
//import io.swagger.client.api.ShowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ShowsApi apiInstance = new ShowsApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedShows(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShowsApi#checkUsersSavedShows");
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

<a name="getAShow"></a>
# **getAShow**
> ShowObject getAShow(id, market)

Get Show 

Get Spotify catalog information for a single show identified by its unique Spotify ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ShowsApi apiInstance = new ShowsApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    ShowObject result = apiInstance.getAShow(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShowsApi#getAShow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**ShowObject**](ShowObject.md)

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
//import io.swagger.client.api.ShowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ShowsApi apiInstance = new ShowsApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSimplifiedEpisodeObject result = apiInstance.getAShowsEpisodes(id, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShowsApi#getAShowsEpisodes");
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

<a name="getMultipleShows"></a>
# **getMultipleShows**
> InlineResponse2003 getMultipleShows(ids, market)

Get Several Shows 

Get Spotify catalog information for several shows based on their Spotify IDs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ShowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ShowsApi apiInstance = new ShowsApi();
String ids = "ids_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse2003 result = apiInstance.getMultipleShows(ids, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShowsApi#getMultipleShows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

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
//import io.swagger.client.api.ShowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ShowsApi apiInstance = new ShowsApi();
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedShowObject result = apiInstance.getUsersSavedShows(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShowsApi#getUsersSavedShows");
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
//import io.swagger.client.api.ShowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ShowsApi apiInstance = new ShowsApi();
String ids = "ids_example"; // String | 
MeShowsBody1 body = new MeShowsBody1(); // MeShowsBody1 | 
String market = "market_example"; // String | 
try {
    apiInstance.removeShowsUser(ids, body, market);
} catch (ApiException e) {
    System.err.println("Exception when calling ShowsApi#removeShowsUser");
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
//import io.swagger.client.api.ShowsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

ShowsApi apiInstance = new ShowsApi();
String ids = "ids_example"; // String | 
MeShowsBody body = new MeShowsBody(); // MeShowsBody | 
try {
    apiInstance.saveShowsUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ShowsApi#saveShowsUser");
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

