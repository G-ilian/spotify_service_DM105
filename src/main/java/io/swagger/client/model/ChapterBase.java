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
 * ChapterBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class ChapterBase {
  @SerializedName("audio_preview_url")
  private String audioPreviewUrl = null;

  @SerializedName("available_markets")
  private List<String> availableMarkets = null;

  @SerializedName("chapter_number")
  private Integer chapterNumber = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("html_description")
  private String htmlDescription = null;

  @SerializedName("duration_ms")
  private Integer durationMs = null;

  @SerializedName("explicit")
  private Boolean explicit = null;

  @SerializedName("external_urls")
  private AllOfChapterBaseExternalUrls externalUrls = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("images")
  private List<ImageObject> images = new ArrayList<ImageObject>();

  @SerializedName("is_playable")
  private Boolean isPlayable = null;

  @SerializedName("languages")
  private List<String> languages = new ArrayList<String>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("release_date")
  private String releaseDate = null;

  /**
   * The precision with which &#x60;release_date&#x60; value is known. 
   */
  @JsonAdapter(ReleaseDatePrecisionEnum.Adapter.class)
  public enum ReleaseDatePrecisionEnum {
    @SerializedName("year")
    YEAR("year"),
    @SerializedName("month")
    MONTH("month"),
    @SerializedName("day")
    DAY("day");

    private String value;

    ReleaseDatePrecisionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ReleaseDatePrecisionEnum fromValue(String input) {
      for (ReleaseDatePrecisionEnum b : ReleaseDatePrecisionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ReleaseDatePrecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReleaseDatePrecisionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ReleaseDatePrecisionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ReleaseDatePrecisionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("release_date_precision")
  private ReleaseDatePrecisionEnum releaseDatePrecision = null;

  @SerializedName("resume_point")
  private AllOfChapterBaseResumePoint resumePoint = null;

  /**
   * The object type. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    @SerializedName("episode")
    EPISODE("episode");

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

  @SerializedName("restrictions")
  private AllOfChapterBaseRestrictions restrictions = null;

  public ChapterBase audioPreviewUrl(String audioPreviewUrl) {
    this.audioPreviewUrl = audioPreviewUrl;
    return this;
  }

   /**
   * A URL to a 30 second preview (MP3 format) of the chapter. &#x60;null&#x60; if not available. 
   * @return audioPreviewUrl
  **/
  @Schema(example = "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17", required = true, description = "A URL to a 30 second preview (MP3 format) of the chapter. `null` if not available. ")
  public String getAudioPreviewUrl() {
    return audioPreviewUrl;
  }

  public void setAudioPreviewUrl(String audioPreviewUrl) {
    this.audioPreviewUrl = audioPreviewUrl;
  }

  public ChapterBase availableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
    return this;
  }

  public ChapterBase addAvailableMarketsItem(String availableMarketsItem) {
    if (this.availableMarkets == null) {
      this.availableMarkets = new ArrayList<String>();
    }
    this.availableMarkets.add(availableMarketsItem);
    return this;
  }

   /**
   * A list of the countries in which the chapter can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. 
   * @return availableMarkets
  **/
  @Schema(description = "A list of the countries in which the chapter can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. ")
  public List<String> getAvailableMarkets() {
    return availableMarkets;
  }

  public void setAvailableMarkets(List<String> availableMarkets) {
    this.availableMarkets = availableMarkets;
  }

  public ChapterBase chapterNumber(Integer chapterNumber) {
    this.chapterNumber = chapterNumber;
    return this;
  }

   /**
   * The number of the chapter 
   * @return chapterNumber
  **/
  @Schema(example = "1", required = true, description = "The number of the chapter ")
  public Integer getChapterNumber() {
    return chapterNumber;
  }

  public void setChapterNumber(Integer chapterNumber) {
    this.chapterNumber = chapterNumber;
  }

  public ChapterBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the chapter. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed. 
   * @return description
  **/
  @Schema(example = "We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky. ", required = true, description = "A description of the chapter. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ChapterBase htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * A description of the chapter. This field may contain HTML tags. 
   * @return htmlDescription
  **/
  @Schema(example = "<p>We kept on ascending, with occasional periods of quick descent, but in the main always ascending. Suddenly, I became conscious of the fact that the driver was in the act of pulling up the horses in the courtyard of a vast ruined castle, from whose tall black windows came no ray of light, and whose broken battlements showed a jagged line against the moonlit sky.</p> ", required = true, description = "A description of the chapter. This field may contain HTML tags. ")
  public String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public ChapterBase durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }

   /**
   * The chapter length in milliseconds. 
   * @return durationMs
  **/
  @Schema(example = "1686230", required = true, description = "The chapter length in milliseconds. ")
  public Integer getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }

  public ChapterBase explicit(Boolean explicit) {
    this.explicit = explicit;
    return this;
  }

   /**
   * Whether or not the chapter has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown). 
   * @return explicit
  **/
  @Schema(required = true, description = "Whether or not the chapter has explicit content (true = yes it does; false = no it does not OR unknown). ")
  public Boolean isExplicit() {
    return explicit;
  }

  public void setExplicit(Boolean explicit) {
    this.explicit = explicit;
  }

  public ChapterBase externalUrls(AllOfChapterBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * External URLs for this chapter. 
   * @return externalUrls
  **/
  @Schema(required = true, description = "External URLs for this chapter. ")
  public AllOfChapterBaseExternalUrls getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(AllOfChapterBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
  }

  public ChapterBase href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the chapter. 
   * @return href
  **/
  @Schema(example = "https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ", required = true, description = "A link to the Web API endpoint providing full details of the chapter. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ChapterBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. 
   * @return id
  **/
  @Schema(example = "5Xt5DXGzch68nYYamXrNxZ", required = true, description = "The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChapterBase images(List<ImageObject> images) {
    this.images = images;
    return this;
  }

  public ChapterBase addImagesItem(ImageObject imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The cover art for the chapter in various sizes, widest first. 
   * @return images
  **/
  @Schema(required = true, description = "The cover art for the chapter in various sizes, widest first. ")
  public List<ImageObject> getImages() {
    return images;
  }

  public void setImages(List<ImageObject> images) {
    this.images = images;
  }

  public ChapterBase isPlayable(Boolean isPlayable) {
    this.isPlayable = isPlayable;
    return this;
  }

   /**
   * True if the chapter is playable in the given market. Otherwise false. 
   * @return isPlayable
  **/
  @Schema(required = true, description = "True if the chapter is playable in the given market. Otherwise false. ")
  public Boolean isIsPlayable() {
    return isPlayable;
  }

  public void setIsPlayable(Boolean isPlayable) {
    this.isPlayable = isPlayable;
  }

  public ChapterBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ChapterBase addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * A list of the languages used in the chapter, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code. 
   * @return languages
  **/
  @Schema(example = "[\"fr\",\"en\"]", required = true, description = "A list of the languages used in the chapter, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code. ")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ChapterBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the chapter. 
   * @return name
  **/
  @Schema(example = "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators ", required = true, description = "The name of the chapter. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChapterBase releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * The date the chapter was first released, for example &#x60;\&quot;1981-12-15\&quot;&#x60;. Depending on the precision, it might be shown as &#x60;\&quot;1981\&quot;&#x60; or &#x60;\&quot;1981-12\&quot;&#x60;. 
   * @return releaseDate
  **/
  @Schema(example = "1981-12-15T00:00:00.000Z", required = true, description = "The date the chapter was first released, for example `\"1981-12-15\"`. Depending on the precision, it might be shown as `\"1981\"` or `\"1981-12\"`. ")
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public ChapterBase releaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
    this.releaseDatePrecision = releaseDatePrecision;
    return this;
  }

   /**
   * The precision with which &#x60;release_date&#x60; value is known. 
   * @return releaseDatePrecision
  **/
  @Schema(example = "day", required = true, description = "The precision with which `release_date` value is known. ")
  public ReleaseDatePrecisionEnum getReleaseDatePrecision() {
    return releaseDatePrecision;
  }

  public void setReleaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
    this.releaseDatePrecision = releaseDatePrecision;
  }

  public ChapterBase resumePoint(AllOfChapterBaseResumePoint resumePoint) {
    this.resumePoint = resumePoint;
    return this;
  }

   /**
   * The user&#x27;s most recent position in the chapter. Set if the supplied access token is a user token and has the scope &#x27;user-read-playback-position&#x27;. 
   * @return resumePoint
  **/
  @Schema(description = "The user's most recent position in the chapter. Set if the supplied access token is a user token and has the scope 'user-read-playback-position'. ")
  public AllOfChapterBaseResumePoint getResumePoint() {
    return resumePoint;
  }

  public void setResumePoint(AllOfChapterBaseResumePoint resumePoint) {
    this.resumePoint = resumePoint;
  }

  public ChapterBase type(TypeEnum type) {
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

  public ChapterBase uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. 
   * @return uri
  **/
  @Schema(example = "spotify:episode:0zLhl3WsOCQHbe1BPTiHgr", required = true, description = "The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the chapter. ")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ChapterBase restrictions(AllOfChapterBaseRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Included in the response when a content restriction is applied. 
   * @return restrictions
  **/
  @Schema(description = "Included in the response when a content restriction is applied. ")
  public AllOfChapterBaseRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(AllOfChapterBaseRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChapterBase chapterBase = (ChapterBase) o;
    return Objects.equals(this.audioPreviewUrl, chapterBase.audioPreviewUrl) &&
        Objects.equals(this.availableMarkets, chapterBase.availableMarkets) &&
        Objects.equals(this.chapterNumber, chapterBase.chapterNumber) &&
        Objects.equals(this.description, chapterBase.description) &&
        Objects.equals(this.htmlDescription, chapterBase.htmlDescription) &&
        Objects.equals(this.durationMs, chapterBase.durationMs) &&
        Objects.equals(this.explicit, chapterBase.explicit) &&
        Objects.equals(this.externalUrls, chapterBase.externalUrls) &&
        Objects.equals(this.href, chapterBase.href) &&
        Objects.equals(this.id, chapterBase.id) &&
        Objects.equals(this.images, chapterBase.images) &&
        Objects.equals(this.isPlayable, chapterBase.isPlayable) &&
        Objects.equals(this.languages, chapterBase.languages) &&
        Objects.equals(this.name, chapterBase.name) &&
        Objects.equals(this.releaseDate, chapterBase.releaseDate) &&
        Objects.equals(this.releaseDatePrecision, chapterBase.releaseDatePrecision) &&
        Objects.equals(this.resumePoint, chapterBase.resumePoint) &&
        Objects.equals(this.type, chapterBase.type) &&
        Objects.equals(this.uri, chapterBase.uri) &&
        Objects.equals(this.restrictions, chapterBase.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioPreviewUrl, availableMarkets, chapterNumber, description, htmlDescription, durationMs, explicit, externalUrls, href, id, images, isPlayable, languages, name, releaseDate, releaseDatePrecision, resumePoint, type, uri, restrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChapterBase {\n");
    
    sb.append("    audioPreviewUrl: ").append(toIndentedString(audioPreviewUrl)).append("\n");
    sb.append("    availableMarkets: ").append(toIndentedString(availableMarkets)).append("\n");
    sb.append("    chapterNumber: ").append(toIndentedString(chapterNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    isPlayable: ").append(toIndentedString(isPlayable)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    releaseDatePrecision: ").append(toIndentedString(releaseDatePrecision)).append("\n");
    sb.append("    resumePoint: ").append(toIndentedString(resumePoint)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
