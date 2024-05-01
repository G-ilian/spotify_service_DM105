# PlayerApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToQueue**](PlayerApi.md#addToQueue) | **POST** /me/player/queue | Add Item to Playback Queue 
[**getAUsersAvailableDevices**](PlayerApi.md#getAUsersAvailableDevices) | **GET** /me/player/devices | Get Available Devices 
[**getInformationAboutTheUsersCurrentPlayback**](PlayerApi.md#getInformationAboutTheUsersCurrentPlayback) | **GET** /me/player | Get Playback State 
[**getQueue**](PlayerApi.md#getQueue) | **GET** /me/player/queue | Get the User&#x27;s Queue 
[**getRecentlyPlayed**](PlayerApi.md#getRecentlyPlayed) | **GET** /me/player/recently-played | Get Recently Played Tracks 
[**getTheUsersCurrentlyPlayingTrack**](PlayerApi.md#getTheUsersCurrentlyPlayingTrack) | **GET** /me/player/currently-playing | Get Currently Playing Track 
[**pauseAUsersPlayback**](PlayerApi.md#pauseAUsersPlayback) | **PUT** /me/player/pause | Pause Playback 
[**seekToPositionInCurrentlyPlayingTrack**](PlayerApi.md#seekToPositionInCurrentlyPlayingTrack) | **PUT** /me/player/seek | Seek To Position 
[**setRepeatModeOnUsersPlayback**](PlayerApi.md#setRepeatModeOnUsersPlayback) | **PUT** /me/player/repeat | Set Repeat Mode 
[**setVolumeForUsersPlayback**](PlayerApi.md#setVolumeForUsersPlayback) | **PUT** /me/player/volume | Set Playback Volume 
[**skipUsersPlaybackToNextTrack**](PlayerApi.md#skipUsersPlaybackToNextTrack) | **POST** /me/player/next | Skip To Next 
[**skipUsersPlaybackToPreviousTrack**](PlayerApi.md#skipUsersPlaybackToPreviousTrack) | **POST** /me/player/previous | Skip To Previous 
[**startAUsersPlayback**](PlayerApi.md#startAUsersPlayback) | **PUT** /me/player/play | Start/Resume Playback 
[**toggleShuffleForUsersPlayback**](PlayerApi.md#toggleShuffleForUsersPlayback) | **PUT** /me/player/shuffle | Toggle Playback Shuffle 
[**transferAUsersPlayback**](PlayerApi.md#transferAUsersPlayback) | **PUT** /me/player | Transfer Playback 

<a name="addToQueue"></a>
# **addToQueue**
> addToQueue(uri, deviceId)

Add Item to Playback Queue 

Add an item to the end of the user&#x27;s current playback queue. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
String uri = "uri_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.addToQueue(uri, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#addToQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **String**|  |
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAUsersAvailableDevices"></a>
# **getAUsersAvailableDevices**
> InlineResponse20014 getAUsersAvailableDevices()

Get Available Devices 

Get information about a user’s available Spotify Connect devices. Some device models are not supported and will not be listed in the API response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
try {
    InlineResponse20014 result = apiInstance.getAUsersAvailableDevices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getAUsersAvailableDevices");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInformationAboutTheUsersCurrentPlayback"></a>
# **getInformationAboutTheUsersCurrentPlayback**
> CurrentlyPlayingContextObject getInformationAboutTheUsersCurrentPlayback(market, additionalTypes)

Get Playback State 

Get information about the user’s current playback state, including track or episode, progress, and active device. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
String market = "market_example"; // String | 
String additionalTypes = "additionalTypes_example"; // String | 
try {
    CurrentlyPlayingContextObject result = apiInstance.getInformationAboutTheUsersCurrentPlayback(market, additionalTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getInformationAboutTheUsersCurrentPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  | [optional]
 **additionalTypes** | **String**|  | [optional]

### Return type

[**CurrentlyPlayingContextObject**](CurrentlyPlayingContextObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQueue"></a>
# **getQueue**
> QueueObject getQueue()

Get the User&#x27;s Queue 

Get the list of objects that make up the user&#x27;s queue. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
try {
    QueueObject result = apiInstance.getQueue();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getQueue");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QueueObject**](QueueObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecentlyPlayed"></a>
# **getRecentlyPlayed**
> CursorPagingPlayHistoryObject getRecentlyPlayed(limit, after, before)

Get Recently Played Tracks 

Get tracks from the current user&#x27;s recently played tracks. _**Note**: Currently doesn&#x27;t support podcast episodes._ 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
Integer limit = 20; // Integer | 
Integer after = 56; // Integer | 
Integer before = 56; // Integer | 
try {
    CursorPagingPlayHistoryObject result = apiInstance.getRecentlyPlayed(limit, after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getRecentlyPlayed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **after** | **Integer**|  | [optional]
 **before** | **Integer**|  | [optional]

### Return type

[**CursorPagingPlayHistoryObject**](CursorPagingPlayHistoryObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTheUsersCurrentlyPlayingTrack"></a>
# **getTheUsersCurrentlyPlayingTrack**
> CurrentlyPlayingObject getTheUsersCurrentlyPlayingTrack(market, additionalTypes)

Get Currently Playing Track 

Get the object currently being played on the user&#x27;s Spotify account. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
String market = "market_example"; // String | 
String additionalTypes = "additionalTypes_example"; // String | 
try {
    CurrentlyPlayingObject result = apiInstance.getTheUsersCurrentlyPlayingTrack(market, additionalTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getTheUsersCurrentlyPlayingTrack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **String**|  | [optional]
 **additionalTypes** | **String**|  | [optional]

### Return type

[**CurrentlyPlayingObject**](CurrentlyPlayingObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pauseAUsersPlayback"></a>
# **pauseAUsersPlayback**
> pauseAUsersPlayback(deviceId)

Pause Playback 

Pause playback on the user&#x27;s account. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.pauseAUsersPlayback(deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#pauseAUsersPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="seekToPositionInCurrentlyPlayingTrack"></a>
# **seekToPositionInCurrentlyPlayingTrack**
> seekToPositionInCurrentlyPlayingTrack(positionMs, deviceId)

Seek To Position 

Seeks to the given position in the user’s currently playing track. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
Integer positionMs = 56; // Integer | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.seekToPositionInCurrentlyPlayingTrack(positionMs, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#seekToPositionInCurrentlyPlayingTrack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **positionMs** | **Integer**|  |
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setRepeatModeOnUsersPlayback"></a>
# **setRepeatModeOnUsersPlayback**
> setRepeatModeOnUsersPlayback(state, deviceId)

Set Repeat Mode 

Set the repeat mode for the user&#x27;s playback. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
String state = "state_example"; // String | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.setRepeatModeOnUsersPlayback(state, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#setRepeatModeOnUsersPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **String**|  |
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setVolumeForUsersPlayback"></a>
# **setVolumeForUsersPlayback**
> setVolumeForUsersPlayback(volumePercent, deviceId)

Set Playback Volume 

Set the volume for the user’s current playback device. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
Integer volumePercent = 56; // Integer | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.setVolumeForUsersPlayback(volumePercent, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#setVolumeForUsersPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **volumePercent** | **Integer**|  |
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="skipUsersPlaybackToNextTrack"></a>
# **skipUsersPlaybackToNextTrack**
> skipUsersPlaybackToNextTrack(deviceId)

Skip To Next 

Skips to next track in the user’s queue. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.skipUsersPlaybackToNextTrack(deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#skipUsersPlaybackToNextTrack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="skipUsersPlaybackToPreviousTrack"></a>
# **skipUsersPlaybackToPreviousTrack**
> skipUsersPlaybackToPreviousTrack(deviceId)

Skip To Previous 

Skips to previous track in the user’s queue. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.skipUsersPlaybackToPreviousTrack(deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#skipUsersPlaybackToPreviousTrack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="startAUsersPlayback"></a>
# **startAUsersPlayback**
> startAUsersPlayback(body, deviceId)

Start/Resume Playback 

Start a new context or resume current playback on the user&#x27;s active device. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
Map<String, Object> body = new Map(); // Map<String, Object> | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.startAUsersPlayback(body, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#startAUsersPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="toggleShuffleForUsersPlayback"></a>
# **toggleShuffleForUsersPlayback**
> toggleShuffleForUsersPlayback(state, deviceId)

Toggle Playback Shuffle 

Toggle shuffle on or off for user’s playback. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
Boolean state = true; // Boolean | 
String deviceId = "deviceId_example"; // String | 
try {
    apiInstance.toggleShuffleForUsersPlayback(state, deviceId);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#toggleShuffleForUsersPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **Boolean**|  |
 **deviceId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transferAUsersPlayback"></a>
# **transferAUsersPlayback**
> transferAUsersPlayback(body)

Transfer Playback 

Transfer playback to a new device and optionally begin playback. This API only works for users who have Spotify Premium. The order of execution is not guaranteed when you use this API with other Player API endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PlayerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

PlayerApi apiInstance = new PlayerApi();
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.transferAUsersPlayback(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#transferAUsersPlayback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

