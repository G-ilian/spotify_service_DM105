# GenresApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecommendationGenres**](GenresApi.md#getRecommendationGenres) | **GET** /recommendations/available-genre-seeds | Get Available Genre Seeds 

<a name="getRecommendationGenres"></a>
# **getRecommendationGenres**
> InlineResponse20013 getRecommendationGenres()

Get Available Genre Seeds 

Retrieve a list of available genres seed parameter values for [recommendations](/documentation/web-api/reference/get-recommendations). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GenresApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

GenresApi apiInstance = new GenresApi();
try {
    InlineResponse20013 result = apiInstance.getRecommendationGenres();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenresApi#getRecommendationGenres");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

