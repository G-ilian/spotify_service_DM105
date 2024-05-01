# MarketsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailableMarkets**](MarketsApi.md#getAvailableMarkets) | **GET** /markets | Get Available Markets 

<a name="getAvailableMarkets"></a>
# **getAvailableMarkets**
> InlineResponse20015 getAvailableMarkets()

Get Available Markets 

Get the list of markets where Spotify is available. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MarketsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

MarketsApi apiInstance = new MarketsApi();
try {
    InlineResponse20015 result = apiInstance.getAvailableMarkets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketsApi#getAvailableMarkets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

