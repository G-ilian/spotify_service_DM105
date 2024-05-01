# TracksApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTracksToPlaylist**](TracksApi.md#addTracksToPlaylist) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
[**checkUsersSavedTracks**](TracksApi.md#checkUsersSavedTracks) | **GET** /me/tracks/contains | Check User&#x27;s Saved Tracks 
[**getAnAlbumsTracks**](TracksApi.md#getAnAlbumsTracks) | **GET** /albums/{id}/tracks | Get Album Tracks 
[**getAnArtistsTopTracks**](TracksApi.md#getAnArtistsTopTracks) | **GET** /artists/{id}/top-tracks | Get Artist&#x27;s Top Tracks 
[**getAudioAnalysis**](TracksApi.md#getAudioAnalysis) | **GET** /audio-analysis/{id} | Get Track&#x27;s Audio Analysis 
[**getAudioFeatures**](TracksApi.md#getAudioFeatures) | **GET** /audio-features/{id} | Get Track&#x27;s Audio Features 
[**getPlaylistsTracks**](TracksApi.md#getPlaylistsTracks) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
[**getRecommendations**](TracksApi.md#getRecommendations) | **GET** /recommendations | Get Recommendations 
[**getSeveralAudioFeatures**](TracksApi.md#getSeveralAudioFeatures) | **GET** /audio-features | Get Several Tracks&#x27; Audio Features 
[**getSeveralTracks**](TracksApi.md#getSeveralTracks) | **GET** /tracks | Get Several Tracks 
[**getTrack**](TracksApi.md#getTrack) | **GET** /tracks/{id} | Get Track 
[**getUsersSavedTracks**](TracksApi.md#getUsersSavedTracks) | **GET** /me/tracks | Get User&#x27;s Saved Tracks 
[**getUsersTopTracks**](TracksApi.md#getUsersTopTracks) | **GET** /me/top/tracks | Get User&#x27;s Top Tracks 
[**removeTracksPlaylist**](TracksApi.md#removeTracksPlaylist) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
[**removeTracksUser**](TracksApi.md#removeTracksUser) | **DELETE** /me/tracks | Remove User&#x27;s Saved Tracks 
[**reorderOrReplacePlaylistsTracks**](TracksApi.md#reorderOrReplacePlaylistsTracks) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
[**saveTracksUser**](TracksApi.md#saveTracksUser) | **PUT** /me/tracks | Save Tracks for Current User 

<a name="addTracksToPlaylist"></a>
# **addTracksToPlaylist**
> InlineResponse2008 addTracksToPlaylist(playlistId, body, position, uris)

Add Items to Playlist 

Add one or more items to a user&#x27;s playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
Integer position = 56; // Integer | 
String uris = "uris_example"; // String | 
try {
    InlineResponse2008 result = apiInstance.addTracksToPlaylist(playlistId, body, position, uris);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#addTracksToPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]
 **position** | **Integer**|  | [optional]
 **uris** | **String**|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
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
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String ids = "ids_example"; // String | 
try {
    List<Boolean> result = apiInstance.checkUsersSavedTracks(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#checkUsersSavedTracks");
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
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSimplifiedTrackObject result = apiInstance.getAnAlbumsTracks(id, market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getAnAlbumsTracks");
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
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.getAnArtistsTopTracks(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getAnArtistsTopTracks");
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

<a name="getAudioAnalysis"></a>
# **getAudioAnalysis**
> AudioAnalysisObject getAudioAnalysis(id)

Get Track&#x27;s Audio Analysis 

Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis describes the track’s structure and musical content, including rhythm, pitch, and timbre. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String id = "id_example"; // String | 
try {
    AudioAnalysisObject result = apiInstance.getAudioAnalysis(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getAudioAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AudioAnalysisObject**](AudioAnalysisObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAudioFeatures"></a>
# **getAudioFeatures**
> AudioFeaturesObject getAudioFeatures(id)

Get Track&#x27;s Audio Features 

Get audio feature information for a single track identified by its unique Spotify ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String id = "id_example"; // String | 
try {
    AudioFeaturesObject result = apiInstance.getAudioFeatures(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getAudioFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**AudioFeaturesObject**](AudioFeaturesObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPlaylistsTracks"></a>
# **getPlaylistsTracks**
> PagingPlaylistTrackObject getPlaylistsTracks(playlistId, market, fields, limit, offset, additionalTypes)

Get Playlist Items 

Get full details of the items of a playlist owned by a Spotify user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String playlistId = "playlistId_example"; // String | 
String market = "market_example"; // String | 
String fields = "fields_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
String additionalTypes = "additionalTypes_example"; // String | 
try {
    PagingPlaylistTrackObject result = apiInstance.getPlaylistsTracks(playlistId, market, fields, limit, offset, additionalTypes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getPlaylistsTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **market** | **String**|  | [optional]
 **fields** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 100]
 **offset** | **Integer**|  | [optional] [default to 0]
 **additionalTypes** | **String**|  | [optional]

### Return type

[**PagingPlaylistTrackObject**](PagingPlaylistTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecommendations"></a>
# **getRecommendations**
> RecommendationsObject getRecommendations(limit, market, seedArtists, seedGenres, seedTracks, minAcousticness, maxAcousticness, targetAcousticness, minDanceability, maxDanceability, targetDanceability, minDurationMs, maxDurationMs, targetDurationMs, minEnergy, maxEnergy, targetEnergy, minInstrumentalness, maxInstrumentalness, targetInstrumentalness, minKey, maxKey, targetKey, minLiveness, maxLiveness, targetLiveness, minLoudness, maxLoudness, targetLoudness, minMode, maxMode, targetMode, minPopularity, maxPopularity, targetPopularity, minSpeechiness, maxSpeechiness, targetSpeechiness, minTempo, maxTempo, targetTempo, minTimeSignature, maxTimeSignature, targetTimeSignature, minValence, maxValence, targetValence)

Get Recommendations 

Recommendations are generated based on the available information for a given seed entity and matched against similar artists and tracks. If there is sufficient information about the provided seeds, a list of tracks will be returned together with pool size details.  For artists and tracks that are very new or obscure there might not be enough data to generate a list of tracks. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
Integer limit = 20; // Integer | 
String market = "market_example"; // String | 
String seedArtists = "seedArtists_example"; // String | 
String seedGenres = "seedGenres_example"; // String | 
String seedTracks = "seedTracks_example"; // String | 
BigDecimal minAcousticness = new BigDecimal(); // BigDecimal | 
BigDecimal maxAcousticness = new BigDecimal(); // BigDecimal | 
BigDecimal targetAcousticness = new BigDecimal(); // BigDecimal | 
BigDecimal minDanceability = new BigDecimal(); // BigDecimal | 
BigDecimal maxDanceability = new BigDecimal(); // BigDecimal | 
BigDecimal targetDanceability = new BigDecimal(); // BigDecimal | 
Integer minDurationMs = 56; // Integer | 
Integer maxDurationMs = 56; // Integer | 
Integer targetDurationMs = 56; // Integer | 
BigDecimal minEnergy = new BigDecimal(); // BigDecimal | 
BigDecimal maxEnergy = new BigDecimal(); // BigDecimal | 
BigDecimal targetEnergy = new BigDecimal(); // BigDecimal | 
BigDecimal minInstrumentalness = new BigDecimal(); // BigDecimal | 
BigDecimal maxInstrumentalness = new BigDecimal(); // BigDecimal | 
BigDecimal targetInstrumentalness = new BigDecimal(); // BigDecimal | 
Integer minKey = 56; // Integer | 
Integer maxKey = 56; // Integer | 
Integer targetKey = 56; // Integer | 
BigDecimal minLiveness = new BigDecimal(); // BigDecimal | 
BigDecimal maxLiveness = new BigDecimal(); // BigDecimal | 
BigDecimal targetLiveness = new BigDecimal(); // BigDecimal | 
BigDecimal minLoudness = new BigDecimal(); // BigDecimal | 
BigDecimal maxLoudness = new BigDecimal(); // BigDecimal | 
BigDecimal targetLoudness = new BigDecimal(); // BigDecimal | 
Integer minMode = 56; // Integer | 
Integer maxMode = 56; // Integer | 
Integer targetMode = 56; // Integer | 
Integer minPopularity = 56; // Integer | 
Integer maxPopularity = 56; // Integer | 
Integer targetPopularity = 56; // Integer | 
BigDecimal minSpeechiness = new BigDecimal(); // BigDecimal | 
BigDecimal maxSpeechiness = new BigDecimal(); // BigDecimal | 
BigDecimal targetSpeechiness = new BigDecimal(); // BigDecimal | 
BigDecimal minTempo = new BigDecimal(); // BigDecimal | 
BigDecimal maxTempo = new BigDecimal(); // BigDecimal | 
BigDecimal targetTempo = new BigDecimal(); // BigDecimal | 
Integer minTimeSignature = 56; // Integer | 
Integer maxTimeSignature = 56; // Integer | 
Integer targetTimeSignature = 56; // Integer | 
BigDecimal minValence = new BigDecimal(); // BigDecimal | 
BigDecimal maxValence = new BigDecimal(); // BigDecimal | 
BigDecimal targetValence = new BigDecimal(); // BigDecimal | 
try {
    RecommendationsObject result = apiInstance.getRecommendations(limit, market, seedArtists, seedGenres, seedTracks, minAcousticness, maxAcousticness, targetAcousticness, minDanceability, maxDanceability, targetDanceability, minDurationMs, maxDurationMs, targetDurationMs, minEnergy, maxEnergy, targetEnergy, minInstrumentalness, maxInstrumentalness, targetInstrumentalness, minKey, maxKey, targetKey, minLiveness, maxLiveness, targetLiveness, minLoudness, maxLoudness, targetLoudness, minMode, maxMode, targetMode, minPopularity, maxPopularity, targetPopularity, minSpeechiness, maxSpeechiness, targetSpeechiness, minTempo, maxTempo, targetTempo, minTimeSignature, maxTimeSignature, targetTimeSignature, minValence, maxValence, targetValence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getRecommendations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 100]
 **market** | **String**|  | [optional]
 **seedArtists** | **String**|  | [optional]
 **seedGenres** | **String**|  | [optional]
 **seedTracks** | **String**|  | [optional]
 **minAcousticness** | **BigDecimal**|  | [optional]
 **maxAcousticness** | **BigDecimal**|  | [optional]
 **targetAcousticness** | **BigDecimal**|  | [optional]
 **minDanceability** | **BigDecimal**|  | [optional]
 **maxDanceability** | **BigDecimal**|  | [optional]
 **targetDanceability** | **BigDecimal**|  | [optional]
 **minDurationMs** | **Integer**|  | [optional]
 **maxDurationMs** | **Integer**|  | [optional]
 **targetDurationMs** | **Integer**|  | [optional]
 **minEnergy** | **BigDecimal**|  | [optional]
 **maxEnergy** | **BigDecimal**|  | [optional]
 **targetEnergy** | **BigDecimal**|  | [optional]
 **minInstrumentalness** | **BigDecimal**|  | [optional]
 **maxInstrumentalness** | **BigDecimal**|  | [optional]
 **targetInstrumentalness** | **BigDecimal**|  | [optional]
 **minKey** | **Integer**|  | [optional] [enum: 0, 11]
 **maxKey** | **Integer**|  | [optional] [enum: 0, 11]
 **targetKey** | **Integer**|  | [optional] [enum: 0, 11]
 **minLiveness** | **BigDecimal**|  | [optional]
 **maxLiveness** | **BigDecimal**|  | [optional]
 **targetLiveness** | **BigDecimal**|  | [optional]
 **minLoudness** | **BigDecimal**|  | [optional]
 **maxLoudness** | **BigDecimal**|  | [optional]
 **targetLoudness** | **BigDecimal**|  | [optional]
 **minMode** | **Integer**|  | [optional] [enum: 0, 1]
 **maxMode** | **Integer**|  | [optional] [enum: 0, 1]
 **targetMode** | **Integer**|  | [optional] [enum: 0, 1]
 **minPopularity** | **Integer**|  | [optional] [enum: 0, 100]
 **maxPopularity** | **Integer**|  | [optional] [enum: 0, 100]
 **targetPopularity** | **Integer**|  | [optional] [enum: 0, 100]
 **minSpeechiness** | **BigDecimal**|  | [optional]
 **maxSpeechiness** | **BigDecimal**|  | [optional]
 **targetSpeechiness** | **BigDecimal**|  | [optional]
 **minTempo** | **BigDecimal**|  | [optional]
 **maxTempo** | **BigDecimal**|  | [optional]
 **targetTempo** | **BigDecimal**|  | [optional]
 **minTimeSignature** | **Integer**|  | [optional] [enum: 11]
 **maxTimeSignature** | **Integer**|  | [optional]
 **targetTimeSignature** | **Integer**|  | [optional]
 **minValence** | **BigDecimal**|  | [optional]
 **maxValence** | **BigDecimal**|  | [optional]
 **targetValence** | **BigDecimal**|  | [optional]

### Return type

[**RecommendationsObject**](RecommendationsObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSeveralAudioFeatures"></a>
# **getSeveralAudioFeatures**
> InlineResponse20012 getSeveralAudioFeatures(ids)

Get Several Tracks&#x27; Audio Features 

Get audio features for multiple tracks based on their Spotify IDs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String ids = "ids_example"; // String | 
try {
    InlineResponse20012 result = apiInstance.getSeveralAudioFeatures(ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getSeveralAudioFeatures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSeveralTracks"></a>
# **getSeveralTracks**
> InlineResponse2002 getSeveralTracks(ids, market)

Get Several Tracks 

Get Spotify catalog information for multiple tracks based on their Spotify IDs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String ids = "ids_example"; // String | 
String market = "market_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.getSeveralTracks(ids, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getSeveralTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrack"></a>
# **getTrack**
> TrackObject getTrack(id, market)

Get Track 

Get Spotify catalog information for a single track identified by its unique Spotify ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String id = "id_example"; // String | 
String market = "market_example"; // String | 
try {
    TrackObject result = apiInstance.getTrack(id, market);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getTrack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **market** | **String**|  | [optional]

### Return type

[**TrackObject**](TrackObject.md)

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
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String market = "market_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingSavedTrackObject result = apiInstance.getUsersSavedTracks(market, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getUsersSavedTracks");
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
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String timeRange = "medium_term"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingTrackObject result = apiInstance.getUsersTopTracks(timeRange, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#getUsersTopTracks");
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

<a name="removeTracksPlaylist"></a>
# **removeTracksPlaylist**
> InlineResponse2008 removeTracksPlaylist(playlistId, body)

Remove Playlist Items 

Remove one or more items from a user&#x27;s playlist. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String playlistId = "playlistId_example"; // String | 
PlaylistIdTracksBody2 body = new PlaylistIdTracksBody2(); // PlaylistIdTracksBody2 | 
try {
    InlineResponse2008 result = apiInstance.removeTracksPlaylist(playlistId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#removeTracksPlaylist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**PlaylistIdTracksBody2**](PlaylistIdTracksBody2.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.removeTracksUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#removeTracksUser");
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

<a name="reorderOrReplacePlaylistsTracks"></a>
# **reorderOrReplacePlaylistsTracks**
> InlineResponse2008 reorderOrReplacePlaylistsTracks(playlistId, body, uris)

Update Playlist Items 

Either reorder or replace items in a playlist depending on the request&#x27;s parameters. To reorder items, include &#x60;range_start&#x60;, &#x60;insert_before&#x60;, &#x60;range_length&#x60; and &#x60;snapshot_id&#x60; in the request&#x27;s body. To replace items, include &#x60;uris&#x60; as either a query parameter or in the request&#x27;s body. Replacing items in a playlist will overwrite its existing items. This operation can be used for replacing or clearing items in a playlist. &lt;br/&gt; **Note**: Replace and reorder are mutually exclusive operations which share the same endpoint, but have different parameters. These operations can&#x27;t be applied together in a single request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String playlistId = "playlistId_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
String uris = "uris_example"; // String | 
try {
    InlineResponse2008 result = apiInstance.reorderOrReplacePlaylistsTracks(playlistId, body, uris);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#reorderOrReplacePlaylistsTracks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlistId** | **String**|  |
 **body** | [**Map&lt;String, Object&gt;**](Map.md)|  | [optional]
 **uris** | **String**|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

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
//import io.swagger.client.api.TracksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

TracksApi apiInstance = new TracksApi();
String ids = "ids_example"; // String | 
Map<String, Object> body = new Map(); // Map<String, Object> | 
try {
    apiInstance.saveTracksUser(ids, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TracksApi#saveTracksUser");
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

