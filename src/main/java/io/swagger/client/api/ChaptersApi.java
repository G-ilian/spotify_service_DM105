/*
 * Spotify Web API with fixes and improvements from sonallux
 * You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 
 *
 * OpenAPI spec version: 2024.3.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ChapterObject;
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.InlineResponse401;
import io.swagger.client.model.PagingSimplifiedChapterObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChaptersApi {
    private ApiClient apiClient;

    public ChaptersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChaptersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAChapter
     * @param id  (required)
     * @param market  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAChapterCall(String id, String market, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/chapters/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (market != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("market", market));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAChapterValidateBeforeCall(String id, String market, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAChapter(Async)");
        }
        
        com.squareup.okhttp.Call call = getAChapterCall(id, market, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a Chapter 
     * Get Spotify catalog information for a single audiobook chapter. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param id  (required)
     * @param market  (optional)
     * @return ChapterObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ChapterObject getAChapter(String id, String market) throws ApiException {
        ApiResponse<ChapterObject> resp = getAChapterWithHttpInfo(id, market);
        return resp.getData();
    }

    /**
     * Get a Chapter 
     * Get Spotify catalog information for a single audiobook chapter. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param id  (required)
     * @param market  (optional)
     * @return ApiResponse&lt;ChapterObject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ChapterObject> getAChapterWithHttpInfo(String id, String market) throws ApiException {
        com.squareup.okhttp.Call call = getAChapterValidateBeforeCall(id, market, null, null);
        Type localVarReturnType = new TypeToken<ChapterObject>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a Chapter  (asynchronously)
     * Get Spotify catalog information for a single audiobook chapter. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param id  (required)
     * @param market  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAChapterAsync(String id, String market, final ApiCallback<ChapterObject> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAChapterValidateBeforeCall(id, market, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ChapterObject>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAudiobookChapters
     * @param id  (required)
     * @param market  (optional)
     * @param limit  (optional, default to 20)
     * @param offset  (optional, default to 0)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAudiobookChaptersCall(String id, String market, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/audiobooks/{id}/chapters"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (market != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("market", market));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAudiobookChaptersValidateBeforeCall(String id, String market, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAudiobookChapters(Async)");
        }
        
        com.squareup.okhttp.Call call = getAudiobookChaptersCall(id, market, limit, offset, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Audiobook Chapters 
     * Get Spotify catalog information about an audiobook&#x27;s chapters. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param id  (required)
     * @param market  (optional)
     * @param limit  (optional, default to 20)
     * @param offset  (optional, default to 0)
     * @return PagingSimplifiedChapterObject
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PagingSimplifiedChapterObject getAudiobookChapters(String id, String market, Integer limit, Integer offset) throws ApiException {
        ApiResponse<PagingSimplifiedChapterObject> resp = getAudiobookChaptersWithHttpInfo(id, market, limit, offset);
        return resp.getData();
    }

    /**
     * Get Audiobook Chapters 
     * Get Spotify catalog information about an audiobook&#x27;s chapters. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param id  (required)
     * @param market  (optional)
     * @param limit  (optional, default to 20)
     * @param offset  (optional, default to 0)
     * @return ApiResponse&lt;PagingSimplifiedChapterObject&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PagingSimplifiedChapterObject> getAudiobookChaptersWithHttpInfo(String id, String market, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = getAudiobookChaptersValidateBeforeCall(id, market, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<PagingSimplifiedChapterObject>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Audiobook Chapters  (asynchronously)
     * Get Spotify catalog information about an audiobook&#x27;s chapters. Audiobooks are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param id  (required)
     * @param market  (optional)
     * @param limit  (optional, default to 20)
     * @param offset  (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAudiobookChaptersAsync(String id, String market, Integer limit, Integer offset, final ApiCallback<PagingSimplifiedChapterObject> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAudiobookChaptersValidateBeforeCall(id, market, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PagingSimplifiedChapterObject>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSeveralChapters
     * @param ids  (required)
     * @param market  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSeveralChaptersCall(String ids, String market, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/chapters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ids != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ids", ids));
        if (market != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("market", market));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSeveralChaptersValidateBeforeCall(String ids, String market, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling getSeveralChapters(Async)");
        }
        
        com.squareup.okhttp.Call call = getSeveralChaptersCall(ids, market, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Several Chapters 
     * Get Spotify catalog information for several audiobook chapters identified by their Spotify IDs. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param ids  (required)
     * @param market  (optional)
     * @return InlineResponse2006
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2006 getSeveralChapters(String ids, String market) throws ApiException {
        ApiResponse<InlineResponse2006> resp = getSeveralChaptersWithHttpInfo(ids, market);
        return resp.getData();
    }

    /**
     * Get Several Chapters 
     * Get Spotify catalog information for several audiobook chapters identified by their Spotify IDs. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param ids  (required)
     * @param market  (optional)
     * @return ApiResponse&lt;InlineResponse2006&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2006> getSeveralChaptersWithHttpInfo(String ids, String market) throws ApiException {
        com.squareup.okhttp.Call call = getSeveralChaptersValidateBeforeCall(ids, market, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2006>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Several Chapters  (asynchronously)
     * Get Spotify catalog information for several audiobook chapters identified by their Spotify IDs. Chapters are only available within the US, UK, Canada, Ireland, New Zealand and Australia markets. 
     * @param ids  (required)
     * @param market  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSeveralChaptersAsync(String ids, String market, final ApiCallback<InlineResponse2006> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSeveralChaptersValidateBeforeCall(ids, market, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2006>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
