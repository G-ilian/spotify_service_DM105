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
import io.swagger.client.model.AuthorObject;
import io.swagger.client.model.CopyrightObject;
import io.swagger.client.model.ImageObject;
import io.swagger.client.model.NarratorObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AudiobookBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class AudiobookBase {
  @SerializedName("authors")
  private List<AuthorObject> authors = new ArrayList<AuthorObject>();

  @SerializedName("available_markets")
  private List<String> availableMarkets = new ArrayList<String>();

  @SerializedName("copyrights")
  private List<CopyrightObject> copyrights = new ArrayList<CopyrightObject>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("html_description")
  private String htmlDescription = null;

  @SerializedName("edition")
  private String edition = null;

  @SerializedName("explicit")
  private Boolean explicit = null;

  @SerializedName("external_urls")
  private AllOfAudiobookBaseExternalUrls externalUrls = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("images")
  private List<ImageObject> images = new ArrayList<ImageObject>();

  @SerializedName("languages")
  private List<String> languages = new ArrayList<String>();

  @SerializedName("media_type")
  private String mediaType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("narrators")
  private List<NarratorObject> narrators = new ArrayList<NarratorObject>();

  @SerializedName("publisher")
  private String publisher = null;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("audiobook")
    AUDIOBOOK("audiobook");

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

  @SerializedName("total_chapters")
  private Integer totalChapters = null;

  public AudiobookBase authors(List<AuthorObject> authors) {
    this.authors = authors;
    return this;
  }

  public AudiobookBase addAuthorsItem(AuthorObject authorsItem) {
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * The author(s) for the audiobook. 
   * @return authors
  **/
  @Schema(required = true, description = "The author(s) for the audiobook. ")
  public List<AuthorObject> getAuthors() {
    return authors;
  }

  public void setAuthors(List<AuthorObject> authors) {
    this.authors = authors;
  }

  public AudiobookBase availableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
    return this;
  }

  public AudiobookBase addAvailableMarketsItem(String availableMarketsItem) {
    this.availableMarkets.add(availableMarketsItem);
    return this;
  }

   /**
   * A list of the countries in which the audiobook can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. 
   * @return availableMarkets
  **/
  @Schema(required = true, description = "A list of the countries in which the audiobook can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. ")
  public List<String> getAvailableMarkets() {
    return availableMarkets;
  }

  public void setAvailableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
  }

  public AudiobookBase copyrights(List<CopyrightObject> copyrights) {
    this.copyrights = copyrights;
    return this;
  }

  public AudiobookBase addCopyrightsItem(CopyrightObject copyrightsItem) {
    this.copyrights.add(copyrightsItem);
    return this;
  }

   /**
   * The copyright statements of the audiobook. 
   * @return copyrights
  **/
  @Schema(required = true, description = "The copyright statements of the audiobook. ")
  public List<CopyrightObject> getCopyrights() {
    return copyrights;
  }

  public void setCopyrights(List<CopyrightObject> copyrights) {
    this.copyrights = copyrights;
  }

  public AudiobookBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the audiobook. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed. 
   * @return description
  **/
  @Schema(required = true, description = "A description of the audiobook. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AudiobookBase htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * A description of the audiobook. This field may contain HTML tags. 
   * @return htmlDescription
  **/
  @Schema(required = true, description = "A description of the audiobook. This field may contain HTML tags. ")
  public String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public AudiobookBase edition(String edition) {
    this.edition = edition;
    return this;
  }

   /**
   * The edition of the audiobook. 
   * @return edition
  **/
  @Schema(example = "Unabridged", description = "The edition of the audiobook. ")
  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public AudiobookBase explicit(Boolean explicit) {
    this.explicit = explicit;
    return this;
  }

   /**
   * Whether or not the audiobook has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown). 
   * @return explicit
  **/
  @Schema(required = true, description = "Whether or not the audiobook has explicit content (true = yes it does; false = no it does not OR unknown). ")
  public Boolean isExplicit() {
    return explicit;
  }

  public void setExplicit(Boolean explicit) {
    this.explicit = explicit;
  }

  public AudiobookBase externalUrls(AllOfAudiobookBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * External URLs for this audiobook. 
   * @return externalUrls
  **/
  @Schema(required = true, description = "External URLs for this audiobook. ")
  public AllOfAudiobookBaseExternalUrls getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(AllOfAudiobookBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
  }

  public AudiobookBase href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the audiobook. 
   * @return href
  **/
  @Schema(required = true, description = "A link to the Web API endpoint providing full details of the audiobook. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AudiobookBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. 
   * @return id
  **/
  @Schema(required = true, description = "The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AudiobookBase images(List<ImageObject> images) {
    this.images = images;
    return this;
  }

  public AudiobookBase addImagesItem(ImageObject imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The cover art for the audiobook in various sizes, widest first. 
   * @return images
  **/
  @Schema(required = true, description = "The cover art for the audiobook in various sizes, widest first. ")
  public List<ImageObject> getImages() {
    return images;
  }

  public void setImages(List<ImageObject> images) {
    this.images = images;
  }

  public AudiobookBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public AudiobookBase addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * A list of the languages used in the audiobook, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. 
   * @return languages
  **/
  @Schema(required = true, description = "A list of the languages used in the audiobook, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. ")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public AudiobookBase mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The media type of the audiobook. 
   * @return mediaType
  **/
  @Schema(required = true, description = "The media type of the audiobook. ")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AudiobookBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the audiobook. 
   * @return name
  **/
  @Schema(required = true, description = "The name of the audiobook. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AudiobookBase narrators(List<NarratorObject> narrators) {
    this.narrators = narrators;
    return this;
  }

  public AudiobookBase addNarratorsItem(NarratorObject narratorsItem) {
    this.narrators.add(narratorsItem);
    return this;
  }

   /**
   * The narrator(s) for the audiobook. 
   * @return narrators
  **/
  @Schema(required = true, description = "The narrator(s) for the audiobook. ")
  public List<NarratorObject> getNarrators() {
    return narrators;
  }

  public void setNarrators(List<NarratorObject> narrators) {
    this.narrators = narrators;
  }

  public AudiobookBase publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * The publisher of the audiobook. 
   * @return publisher
  **/
  @Schema(required = true, description = "The publisher of the audiobook. ")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public AudiobookBase type(TypeEnum type) {
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

  public AudiobookBase uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. 
   * @return uri
  **/
  @Schema(required = true, description = "The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. ")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public AudiobookBase totalChapters(Integer totalChapters) {
    this.totalChapters = totalChapters;
    return this;
  }

   /**
   * The number of chapters in this audiobook. 
   * @return totalChapters
  **/
  @Schema(required = true, description = "The number of chapters in this audiobook. ")
  public Integer getTotalChapters() {
    return totalChapters;
  }

  public void setTotalChapters(Integer totalChapters) {
    this.totalChapters = totalChapters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudiobookBase audiobookBase = (AudiobookBase) o;
    return Objects.equals(this.authors, audiobookBase.authors) &&
        Objects.equals(this.availableMarkets, audiobookBase.availableMarkets) &&
        Objects.equals(this.copyrights, audiobookBase.copyrights) &&
        Objects.equals(this.description, audiobookBase.description) &&
        Objects.equals(this.htmlDescription, audiobookBase.htmlDescription) &&
        Objects.equals(this.edition, audiobookBase.edition) &&
        Objects.equals(this.explicit, audiobookBase.explicit) &&
        Objects.equals(this.externalUrls, audiobookBase.externalUrls) &&
        Objects.equals(this.href, audiobookBase.href) &&
        Objects.equals(this.id, audiobookBase.id) &&
        Objects.equals(this.images, audiobookBase.images) &&
        Objects.equals(this.languages, audiobookBase.languages) &&
        Objects.equals(this.mediaType, audiobookBase.mediaType) &&
        Objects.equals(this.name, audiobookBase.name) &&
        Objects.equals(this.narrators, audiobookBase.narrators) &&
        Objects.equals(this.publisher, audiobookBase.publisher) &&
        Objects.equals(this.type, audiobookBase.type) &&
        Objects.equals(this.uri, audiobookBase.uri) &&
        Objects.equals(this.totalChapters, audiobookBase.totalChapters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authors, availableMarkets, copyrights, description, htmlDescription, edition, explicit, externalUrls, href, id, images, languages, mediaType, name, narrators, publisher, type, uri, totalChapters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudiobookBase {\n");
    
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
    sb.append("    copyrights: ").append(toIndentedString(copyrights)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    narrators: ").append(toIndentedString(narrators)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    totalChapters: ").append(toIndentedString(totalChapters)).append("\n");
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
