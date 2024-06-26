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
import io.swagger.client.model.ImageObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PlaylistObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class PlaylistObject {
  @SerializedName("collaborative")
  private Boolean collaborative = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("external_urls")
  private AllOfPlaylistObjectExternalUrls externalUrls = null;

  @SerializedName("followers")
  private AllOfPlaylistObjectFollowers followers = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("images")
  private List<ImageObject> images = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private AllOfPlaylistObjectOwner owner = null;

  @SerializedName("public")
  private Boolean _public = null;

  @SerializedName("snapshot_id")
  private String snapshotId = null;

  @SerializedName("tracks")
  private AllOfPlaylistObjectTracks tracks = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uri")
  private String uri = null;

  public PlaylistObject collaborative(Boolean collaborative) {
    this.collaborative = collaborative;
    return this;
  }

   /**
   * &#x60;true&#x60; if the owner allows other users to modify the playlist. 
   * @return collaborative
  **/
  @Schema(description = "`true` if the owner allows other users to modify the playlist. ")
  public Boolean isCollaborative() {
    return collaborative;
  }

  public void setCollaborative(Boolean collaborative) {
    this.collaborative = collaborative;
  }

  public PlaylistObject description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The playlist description. _Only returned for modified, verified playlists, otherwise_ &#x60;null&#x60;. 
   * @return description
  **/
  @Schema(description = "The playlist description. _Only returned for modified, verified playlists, otherwise_ `null`. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PlaylistObject externalUrls(AllOfPlaylistObjectExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * Known external URLs for this playlist. 
   * @return externalUrls
  **/
  @Schema(description = "Known external URLs for this playlist. ")
  public AllOfPlaylistObjectExternalUrls getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(AllOfPlaylistObjectExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
  }

  public PlaylistObject followers(AllOfPlaylistObjectFollowers followers) {
    this.followers = followers;
    return this;
  }

   /**
   * Information about the followers of the playlist.
   * @return followers
  **/
  @Schema(description = "Information about the followers of the playlist.")
  public AllOfPlaylistObjectFollowers getFollowers() {
    return followers;
  }

  public void setFollowers(AllOfPlaylistObjectFollowers followers) {
    this.followers = followers;
  }

  public PlaylistObject href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the playlist. 
   * @return href
  **/
  @Schema(description = "A link to the Web API endpoint providing full details of the playlist. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PlaylistObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. 
   * @return id
  **/
  @Schema(description = "The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PlaylistObject images(List<ImageObject> images) {
    this.images = images;
    return this;
  }

  public PlaylistObject addImagesItem(ImageObject imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ImageObject>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Images for the playlist. The array may be empty or contain up to three images. The images are returned by size in descending order. See [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL for the image (&#x60;url&#x60;) is temporary and will expire in less than a day._ 
   * @return images
  **/
  @Schema(description = "Images for the playlist. The array may be empty or contain up to three images. The images are returned by size in descending order. See [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL for the image (`url`) is temporary and will expire in less than a day._ ")
  public List<ImageObject> getImages() {
    return images;
  }

  public void setImages(List<ImageObject> images) {
    this.images = images;
  }

  public PlaylistObject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the playlist. 
   * @return name
  **/
  @Schema(description = "The name of the playlist. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlaylistObject owner(AllOfPlaylistObjectOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The user who owns the playlist 
   * @return owner
  **/
  @Schema(description = "The user who owns the playlist ")
  public AllOfPlaylistObjectOwner getOwner() {
    return owner;
  }

  public void setOwner(AllOfPlaylistObjectOwner owner) {
    this.owner = owner;
  }

  public PlaylistObject _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * The playlist&#x27;s public/private status: &#x60;true&#x60; the playlist is public, &#x60;false&#x60; the playlist is private, &#x60;null&#x60; the playlist status is not relevant. For more about public/private status, see [Working with Playlists](/documentation/web-api/concepts/playlists) 
   * @return _public
  **/
  @Schema(description = "The playlist's public/private status: `true` the playlist is public, `false` the playlist is private, `null` the playlist status is not relevant. For more about public/private status, see [Working with Playlists](/documentation/web-api/concepts/playlists) ")
  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public PlaylistObject snapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version 
   * @return snapshotId
  **/
  @Schema(description = "The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version ")
  public String getSnapshotId() {
    return snapshotId;
  }

  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  public PlaylistObject tracks(AllOfPlaylistObjectTracks tracks) {
    this.tracks = tracks;
    return this;
  }

   /**
   * The tracks of the playlist. 
   * @return tracks
  **/
  @Schema(description = "The tracks of the playlist. ")
  public AllOfPlaylistObjectTracks getTracks() {
    return tracks;
  }

  public void setTracks(AllOfPlaylistObjectTracks tracks) {
    this.tracks = tracks;
  }

  public PlaylistObject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The object type: \&quot;playlist\&quot; 
   * @return type
  **/
  @Schema(description = "The object type: \"playlist\" ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PlaylistObject uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. 
   * @return uri
  **/
  @Schema(description = "The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist. ")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaylistObject playlistObject = (PlaylistObject) o;
    return Objects.equals(this.collaborative, playlistObject.collaborative) &&
        Objects.equals(this.description, playlistObject.description) &&
        Objects.equals(this.externalUrls, playlistObject.externalUrls) &&
        Objects.equals(this.followers, playlistObject.followers) &&
        Objects.equals(this.href, playlistObject.href) &&
        Objects.equals(this.id, playlistObject.id) &&
        Objects.equals(this.images, playlistObject.images) &&
        Objects.equals(this.name, playlistObject.name) &&
        Objects.equals(this.owner, playlistObject.owner) &&
        Objects.equals(this._public, playlistObject._public) &&
        Objects.equals(this.snapshotId, playlistObject.snapshotId) &&
        Objects.equals(this.tracks, playlistObject.tracks) &&
        Objects.equals(this.type, playlistObject.type) &&
        Objects.equals(this.uri, playlistObject.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collaborative, description, externalUrls, followers, href, id, images, name, owner, _public, snapshotId, tracks, type, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaylistObject {\n");
    
    sb.append("    collaborative: ").append(toIndentedString(collaborative)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
