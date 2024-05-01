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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PagingObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class PagingObject {
  @SerializedName("href")
  private String href = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("previous")
  private String previous = null;

  @SerializedName("total")
  private Integer total = null;

  public PagingObject href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint returning the full result of the request 
   * @return href
  **/
  @Schema(example = "https://api.spotify.com/v1/me/shows?offset=0&limit=20 ", required = true, description = "A link to the Web API endpoint returning the full result of the request ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PagingObject limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum number of items in the response (as set in the query or by default). 
   * @return limit
  **/
  @Schema(example = "20", required = true, description = "The maximum number of items in the response (as set in the query or by default). ")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public PagingObject next(String next) {
    this.next = next;
    return this;
  }

   /**
   * URL to the next page of items. ( &#x60;null&#x60; if none) 
   * @return next
  **/
  @Schema(example = "https://api.spotify.com/v1/me/shows?offset=1&limit=1", required = true, description = "URL to the next page of items. ( `null` if none) ")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public PagingObject offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The offset of the items returned (as set in the query or by default) 
   * @return offset
  **/
  @Schema(example = "0", required = true, description = "The offset of the items returned (as set in the query or by default) ")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public PagingObject previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * URL to the previous page of items. ( &#x60;null&#x60; if none) 
   * @return previous
  **/
  @Schema(example = "https://api.spotify.com/v1/me/shows?offset=1&limit=1", required = true, description = "URL to the previous page of items. ( `null` if none) ")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public PagingObject total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * The total number of items available to return. 
   * @return total
  **/
  @Schema(example = "4", required = true, description = "The total number of items available to return. ")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingObject pagingObject = (PagingObject) o;
    return Objects.equals(this.href, pagingObject.href) &&
        Objects.equals(this.limit, pagingObject.limit) &&
        Objects.equals(this.next, pagingObject.next) &&
        Objects.equals(this.offset, pagingObject.offset) &&
        Objects.equals(this.previous, pagingObject.previous) &&
        Objects.equals(this.total, pagingObject.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, limit, next, offset, previous, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingObject {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
