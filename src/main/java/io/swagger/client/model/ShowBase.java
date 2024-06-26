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
import io.swagger.client.model.CopyrightObject;
import io.swagger.client.model.ImageObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ShowBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class ShowBase {
  @SerializedName("available_markets")
  private List<String> availableMarkets = new ArrayList<String>();

  @SerializedName("copyrights")
  private List<CopyrightObject> copyrights = new ArrayList<CopyrightObject>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("html_description")
  private String htmlDescription = null;

  @SerializedName("explicit")
  private Boolean explicit = null;

  @SerializedName("external_urls")
  private AllOfShowBaseExternalUrls externalUrls = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("images")
  private List<ImageObject> images = new ArrayList<ImageObject>();

  @SerializedName("is_externally_hosted")
  private Boolean isExternallyHosted = null;

  @SerializedName("languages")
  private List<String> languages = new ArrayList<String>();

  @SerializedName("media_type")
  private String mediaType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("publisher")
  private String publisher = null;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("show")
    SHOW("show");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("total_episodes")
  private Integer totalEpisodes = null;

  public ShowBase availableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
    return this;
  }

  public ShowBase addAvailableMarketsItem(String availableMarketsItem) {
    this.availableMarkets.add(availableMarketsItem);
    return this;
  }

   /**
   * A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. 
   * @return availableMarkets
  **/
  @Schema(required = true, description = "A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. ")
  public List<String> getAvailableMarkets() {
    return availableMarkets;
  }

  public void setAvailableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
  }

  public ShowBase copyrights(List<CopyrightObject> copyrights) {
    this.copyrights = copyrights;
    return this;
  }

  public ShowBase addCopyrightsItem(CopyrightObject copyrightsItem) {
    this.copyrights.add(copyrightsItem);
    return this;
  }

   /**
   * The copyright statements of the show. 
   * @return copyrights
  **/
  @Schema(required = true, description = "The copyright statements of the show. ")
  public List<CopyrightObject> getCopyrights() {
    return copyrights;
  }

  public void setCopyrights(List<CopyrightObject> copyrights) {
    this.copyrights = copyrights;
  }

  public ShowBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the show. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed. 
   * @return description
  **/
  @Schema(required = true, description = "A description of the show. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ShowBase htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * A description of the show. This field may contain HTML tags. 
   * @return htmlDescription
  **/
  @Schema(required = true, description = "A description of the show. This field may contain HTML tags. ")
  public String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public ShowBase explicit(Boolean explicit) {
    this.explicit = explicit;
    return this;
  }

   /**
   * Whether or not the show has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown). 
   * @return explicit
  **/
  @Schema(required = true, description = "Whether or not the show has explicit content (true = yes it does; false = no it does not OR unknown). ")
  public Boolean isExplicit() {
    return explicit;
  }

  public void setExplicit(Boolean explicit) {
    this.explicit = explicit;
  }

  public ShowBase externalUrls(AllOfShowBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * External URLs for this show. 
   * @return externalUrls
  **/
  @Schema(required = true, description = "External URLs for this show. ")
  public AllOfShowBaseExternalUrls getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(AllOfShowBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
  }

  public ShowBase href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the show. 
   * @return href
  **/
  @Schema(required = true, description = "A link to the Web API endpoint providing full details of the show. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ShowBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show. 
   * @return id
  **/
  @Schema(required = true, description = "The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShowBase images(List<ImageObject> images) {
    this.images = images;
    return this;
  }

  public ShowBase addImagesItem(ImageObject imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The cover art for the show in various sizes, widest first. 
   * @return images
  **/
  @Schema(required = true, description = "The cover art for the show in various sizes, widest first. ")
  public List<ImageObject> getImages() {
    return images;
  }

  public void setImages(List<ImageObject> images) {
    this.images = images;
  }

  public ShowBase isExternallyHosted(Boolean isExternallyHosted) {
    this.isExternallyHosted = isExternallyHosted;
    return this;
  }

   /**
   * True if all of the shows episodes are hosted outside of Spotify&#x27;s CDN. This field might be &#x60;null&#x60; in some cases. 
   * @return isExternallyHosted
  **/
  @Schema(required = true, description = "True if all of the shows episodes are hosted outside of Spotify's CDN. This field might be `null` in some cases. ")
  public Boolean isIsExternallyHosted() {
    return isExternallyHosted;
  }

  public void setIsExternallyHosted(Boolean isExternallyHosted) {
    this.isExternallyHosted = isExternallyHosted;
  }

  public ShowBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ShowBase addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. 
   * @return languages
  **/
  @Schema(required = true, description = "A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. ")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ShowBase mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The media type of the show. 
   * @return mediaType
  **/
  @Schema(required = true, description = "The media type of the show. ")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public ShowBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the episode. 
   * @return name
  **/
  @Schema(required = true, description = "The name of the episode. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShowBase publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * The publisher of the show. 
   * @return publisher
  **/
  @Schema(required = true, description = "The publisher of the show. ")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public ShowBase type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The object type. 
   * @return type
  **/
  @Schema(required = true, description = "The object type. ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ShowBase uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the show. 
   * @return uri
  **/
  @Schema(required = true, description = "The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the show. ")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ShowBase totalEpisodes(Integer totalEpisodes) {
    this.totalEpisodes = totalEpisodes;
    return this;
  }

   /**
   * The total number of episodes in the show. 
   * @return totalEpisodes
  **/
  @Schema(required = true, description = "The total number of episodes in the show. ")
  public Integer getTotalEpisodes() {
    return totalEpisodes;
  }

  public void setTotalEpisodes(Integer totalEpisodes) {
    this.totalEpisodes = totalEpisodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowBase showBase = (ShowBase) o;
    return Objects.equals(this.availableMarkets, showBase.availableMarkets) &&
        Objects.equals(this.copyrights, showBase.copyrights) &&
        Objects.equals(this.description, showBase.description) &&
        Objects.equals(this.htmlDescription, showBase.htmlDescription) &&
        Objects.equals(this.explicit, showBase.explicit) &&
        Objects.equals(this.externalUrls, showBase.externalUrls) &&
        Objects.equals(this.href, showBase.href) &&
        Objects.equals(this.id, showBase.id) &&
        Objects.equals(this.images, showBase.images) &&
        Objects.equals(this.isExternallyHosted, showBase.isExternallyHosted) &&
        Objects.equals(this.languages, showBase.languages) &&
        Objects.equals(this.mediaType, showBase.mediaType) &&
        Objects.equals(this.name, showBase.name) &&
        Objects.equals(this.publisher, showBase.publisher) &&
        Objects.equals(this.type, showBase.type) &&
        Objects.equals(this.uri, showBase.uri) &&
        Objects.equals(this.totalEpisodes, showBase.totalEpisodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableMarkets, copyrights, description, htmlDescription, explicit, externalUrls, href, id, images, isExternallyHosted, languages, mediaType, name, publisher, type, uri, totalEpisodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowBase {\n");
    
    sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
    sb.append("    copyrights: ").append(toIndentedString(copyrights)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    isExternallyHosted: ").append(toIndentedString(isExternallyHosted)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    totalEpisodes: ").append(toIndentedString(totalEpisodes)).append("\n");
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
