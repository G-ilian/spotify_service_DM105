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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * PlaylistIdTracksBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class PlaylistIdTracksBody extends HashMap<String, Object> {
  @SerializedName("uris")
  private List<String> uris = null;

  @SerializedName("range_start")
  private Integer rangeStart = null;

  @SerializedName("insert_before")
  private Integer insertBefore = null;

  @SerializedName("range_length")
  private Integer rangeLength = null;

  @SerializedName("snapshot_id")
  private String snapshotId = null;

  public PlaylistIdTracksBody uris(List<String> uris) {
    this.uris = uris;
    return this;
  }

  public PlaylistIdTracksBody addUrisItem(String urisItem) {
    if (this.uris == null) {
      this.uris = new ArrayList<String>();
    }
    this.uris.add(urisItem);
    return this;
  }

   /**
   * Get uris
   * @return uris
  **/
  @Schema(description = "")
  public List<String> getUris() {
    return uris;
  }

  public void setUris(List<String> uris) {
    this.uris = uris;
  }

  public PlaylistIdTracksBody rangeStart(Integer rangeStart) {
    this.rangeStart = rangeStart;
    return this;
  }

   /**
   * The position of the first item to be reordered. 
   * @return rangeStart
  **/
  @Schema(description = "The position of the first item to be reordered. ")
  public Integer getRangeStart() {
    return rangeStart;
  }

  public void setRangeStart(Integer rangeStart) {
    this.rangeStart = rangeStart;
  }

  public PlaylistIdTracksBody insertBefore(Integer insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

   /**
   * The position where the items should be inserted.&lt;br/&gt;To reorder the items to the end of the playlist, simply set _insert_before_ to the position after the last item.&lt;br/&gt;Examples:&lt;br/&gt;To reorder the first item to the last position in a playlist with 10 items, set _range_start_ to 0, and _insert_before_ to 10.&lt;br/&gt;To reorder the last item in a playlist with 10 items to the start of the playlist, set _range_start_ to 9, and _insert_before_ to 0. 
   * @return insertBefore
  **/
  @Schema(description = "The position where the items should be inserted.<br/>To reorder the items to the end of the playlist, simply set _insert_before_ to the position after the last item.<br/>Examples:<br/>To reorder the first item to the last position in a playlist with 10 items, set _range_start_ to 0, and _insert_before_ to 10.<br/>To reorder the last item in a playlist with 10 items to the start of the playlist, set _range_start_ to 9, and _insert_before_ to 0. ")
  public Integer getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(Integer insertBefore) {
    this.insertBefore = insertBefore;
  }

  public PlaylistIdTracksBody rangeLength(Integer rangeLength) {
    this.rangeLength = rangeLength;
    return this;
  }

   /**
   * The amount of items to be reordered. Defaults to 1 if not set.&lt;br/&gt;The range of items to be reordered begins from the _range_start_ position, and includes the _range_length_ subsequent items.&lt;br/&gt;Example:&lt;br/&gt;To move the items at index 9-10 to the start of the playlist, _range_start_ is set to 9, and _range_length_ is set to 2. 
   * @return rangeLength
  **/
  @Schema(description = "The amount of items to be reordered. Defaults to 1 if not set.<br/>The range of items to be reordered begins from the _range_start_ position, and includes the _range_length_ subsequent items.<br/>Example:<br/>To move the items at index 9-10 to the start of the playlist, _range_start_ is set to 9, and _range_length_ is set to 2. ")
  public Integer getRangeLength() {
    return rangeLength;
  }

  public void setRangeLength(Integer rangeLength) {
    this.rangeLength = rangeLength;
  }

  public PlaylistIdTracksBody snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * The playlist&#x27;s snapshot ID against which you want to make the changes. 
   * @return snapshotId
  **/
  @Schema(description = "The playlist's snapshot ID against which you want to make the changes. ")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistIdTracksBody playlistIdTracksBody = (PlaylistIdTracksBody) o;
    return Objects.equals(this.uris, playlistIdTracksBody.uris) &&
        Objects.equals(this.rangeStart, playlistIdTracksBody.rangeStart) &&
        Objects.equals(this.insertBefore, playlistIdTracksBody.insertBefore) &&
        Objects.equals(this.rangeLength, playlistIdTracksBody.rangeLength) &&
        Objects.equals(this.snapshotId, playlistIdTracksBody.snapshotId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uris, rangeStart, insertBefore, rangeLength, snapshotId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistIdTracksBody {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    uris: ").append(toIndentedString(uris)).append("\n");
    sb.append("    rangeStart: ").append(toIndentedString(rangeStart)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    rangeLength: ").append(toIndentedString(rangeLength)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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