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
 * EpisodeBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class EpisodeBase {
  @SerializedName("audio_preview_url")
  private String audioPreviewUrl = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("html_description")
  private String htmlDescription = null;

  @SerializedName("duration_ms")
  private Integer durationMs = null;

  @SerializedName("explicit")
  private Boolean explicit = null;

  @SerializedName("external_urls")
  private AllOfEpisodeBaseExternalUrls externalUrls = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("images")
  private List<ImageObject> images = new ArrayList<ImageObject>();

  @SerializedName("is_externally_hosted")
  private Boolean isExternallyHosted = null;

  @SerializedName("is_playable")
  private Boolean isPlayable = null;

  @SerializedName("language")
  private String language = null;

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
  private AllOfEpisodeBaseResumePoint resumePoint = null;

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
  private AllOfEpisodeBaseRestrictions restrictions = null;

  public EpisodeBase audioPreviewUrl(String audioPreviewUrl) {
    this.audioPreviewUrl = audioPreviewUrl;
    return this;
  }

   /**
   * A URL to a 30 second preview (MP3 format) of the episode. &#x60;null&#x60; if not available. 
   * @return audioPreviewUrl
  **/
  @Schema(example = "https://p.scdn.co/mp3-preview/2f37da1d4221f40b9d1a98cd191f4d6f1646ad17", required = true, description = "A URL to a 30 second preview (MP3 format) of the episode. `null` if not available. ")
  public String getAudioPreviewUrl() {
    return audioPreviewUrl;
  }

  public void setAudioPreviewUrl(String audioPreviewUrl) {
    this.audioPreviewUrl = audioPreviewUrl;
  }

  public EpisodeBase description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the episode. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed. 
   * @return description
  **/
  @Schema(example = "A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us. ", required = true, description = "A description of the episode. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EpisodeBase htmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

   /**
   * A description of the episode. This field may contain HTML tags. 
   * @return htmlDescription
  **/
  @Schema(example = "<p>A Spotify podcast sharing fresh insights on important topics of the moment—in a way only Spotify can. You’ll hear from experts in the music, podcast and tech industries as we discover and uncover stories about our work and the world around us.</p> ", required = true, description = "A description of the episode. This field may contain HTML tags. ")
  public String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public EpisodeBase durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }

   /**
   * The episode length in milliseconds. 
   * @return durationMs
  **/
  @Schema(example = "1686230", required = true, description = "The episode length in milliseconds. ")
  public Integer getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }

  public EpisodeBase explicit(Boolean explicit) {
    this.explicit = explicit;
    return this;
  }

   /**
   * Whether or not the episode has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown). 
   * @return explicit
  **/
  @Schema(required = true, description = "Whether or not the episode has explicit content (true = yes it does; false = no it does not OR unknown). ")
  public Boolean isExplicit() {
    return explicit;
  }

  public void setExplicit(Boolean explicit) {
    this.explicit = explicit;
  }

  public EpisodeBase externalUrls(AllOfEpisodeBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
    return this;
  }

   /**
   * External URLs for this episode. 
   * @return externalUrls
  **/
  @Schema(required = true, description = "External URLs for this episode. ")
  public AllOfEpisodeBaseExternalUrls getExternalUrls() {
    return externalUrls;
  }

  public void setExternalUrls(AllOfEpisodeBaseExternalUrls externalUrls) {
    this.externalUrls = externalUrls;
  }

  public EpisodeBase href(String href) {
    this.href = href;
    return this;
  }

   /**
   * A link to the Web API endpoint providing full details of the episode. 
   * @return href
  **/
  @Schema(example = "https://api.spotify.com/v1/episodes/5Xt5DXGzch68nYYamXrNxZ", required = true, description = "A link to the Web API endpoint providing full details of the episode. ")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public EpisodeBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the episode. 
   * @return id
  **/
  @Schema(example = "5Xt5DXGzch68nYYamXrNxZ", required = true, description = "The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the episode. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EpisodeBase images(List<ImageObject> images) {
    this.images = images;
    return this;
  }

  public EpisodeBase addImagesItem(ImageObject imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * The cover art for the episode in various sizes, widest first. 
   * @return images
  **/
  @Schema(required = true, description = "The cover art for the episode in various sizes, widest first. ")
  public List<ImageObject> getImages() {
    return images;
  }

  public void setImages(List<ImageObject> images) {
    this.images = images;
  }

  public EpisodeBase isExternallyHosted(Boolean isExternallyHosted) {
    this.isExternallyHosted = isExternallyHosted;
    return this;
  }

   /**
   * True if the episode is hosted outside of Spotify&#x27;s CDN. 
   * @return isExternallyHosted
  **/
  @Schema(required = true, description = "True if the episode is hosted outside of Spotify's CDN. ")
  public Boolean isIsExternallyHosted() {
    return isExternallyHosted;
  }

  public void setIsExternallyHosted(Boolean isExternallyHosted) {
    this.isExternallyHosted = isExternallyHosted;
  }

  public EpisodeBase isPlayable(Boolean isPlayable) {
    this.isPlayable = isPlayable;
    return this;
  }

   /**
   * True if the episode is playable in the given market. Otherwise false. 
   * @return isPlayable
  **/
  @Schema(required = true, description = "True if the episode is playable in the given market. Otherwise false. ")
  public Boolean isIsPlayable() {
    return isPlayable;
  }

  public void setIsPlayable(Boolean isPlayable) {
    this.isPlayable = isPlayable;
  }

  public EpisodeBase language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language used in the episode, identified by a [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. This field is deprecated and might be removed in the future. Please use the &#x60;languages&#x60; field instead. 
   * @return language
  **/
  @Schema(example = "en", description = "The language used in the episode, identified by a [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. This field is deprecated and might be removed in the future. Please use the `languages` field instead. ")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public EpisodeBase languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public EpisodeBase addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * A list of the languages used in the episode, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code. 
   * @return languages
  **/
  @Schema(example = "[\"fr\",\"en\"]", required = true, description = "A list of the languages used in the episode, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code. ")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public EpisodeBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the episode. 
   * @return name
  **/
  @Schema(example = "Starting Your Own Podcast: Tips, Tricks, and Advice From Anchor Creators ", required = true, description = "The name of the episode. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EpisodeBase releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * The date the episode was first released, for example &#x60;\&quot;1981-12-15\&quot;&#x60;. Depending on the precision, it might be shown as &#x60;\&quot;1981\&quot;&#x60; or &#x60;\&quot;1981-12\&quot;&#x60;. 
   * @return releaseDate
  **/
  @Schema(example = "1981-12-15T00:00:00.000Z", required = true, description = "The date the episode was first released, for example `\"1981-12-15\"`. Depending on the precision, it might be shown as `\"1981\"` or `\"1981-12\"`. ")
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public EpisodeBase releaseDatePrecision(ReleaseDatePrecisionEnum releaseDatePrecision) {
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

  public EpisodeBase resumePoint(AllOfEpisodeBaseResumePoint resumePoint) {
    this.resumePoint = resumePoint;
    return this;
  }

   /**
   * The user&#x27;s most recent position in the episode. Set if the supplied access token is a user token and has the scope &#x27;user-read-playback-position&#x27;. 
   * @return resumePoint
  **/
  @Schema(description = "The user's most recent position in the episode. Set if the supplied access token is a user token and has the scope 'user-read-playback-position'. ")
  public AllOfEpisodeBaseResumePoint getResumePoint() {
    return resumePoint;
  }

  public void setResumePoint(AllOfEpisodeBaseResumePoint resumePoint) {
    this.resumePoint = resumePoint;
  }

  public EpisodeBase type(TypeEnum type) {
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

  public EpisodeBase uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the episode. 
   * @return uri
  **/
  @Schema(example = "spotify:episode:0zLhl3WsOCQHbe1BPTiHgr", required = true, description = "The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the episode. ")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public EpisodeBase restrictions(AllOfEpisodeBaseRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Included in the response when a content restriction is applied. 
   * @return restrictions
  **/
  @Schema(description = "Included in the response when a content restriction is applied. ")
  public AllOfEpisodeBaseRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(AllOfEpisodeBaseRestrictions restrictions) {
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
    EpisodeBase episodeBase = (EpisodeBase) o;
    return Objects.equals(this.audioPreviewUrl, episodeBase.audioPreviewUrl) &&
        Objects.equals(this.description, episodeBase.description) &&
        Objects.equals(this.htmlDescription, episodeBase.htmlDescription) &&
        Objects.equals(this.durationMs, episodeBase.durationMs) &&
        Objects.equals(this.explicit, episodeBase.explicit) &&
        Objects.equals(this.externalUrls, episodeBase.externalUrls) &&
        Objects.equals(this.href, episodeBase.href) &&
        Objects.equals(this.id, episodeBase.id) &&
        Objects.equals(this.images, episodeBase.images) &&
        Objects.equals(this.isExternallyHosted, episodeBase.isExternallyHosted) &&
        Objects.equals(this.isPlayable, episodeBase.isPlayable) &&
        Objects.equals(this.language, episodeBase.language) &&
        Objects.equals(this.languages, episodeBase.languages) &&
        Objects.equals(this.name, episodeBase.name) &&
        Objects.equals(this.releaseDate, episodeBase.releaseDate) &&
        Objects.equals(this.releaseDatePrecision, episodeBase.releaseDatePrecision) &&
        Objects.equals(this.resumePoint, episodeBase.resumePoint) &&
        Objects.equals(this.type, episodeBase.type) &&
        Objects.equals(this.uri, episodeBase.uri) &&
        Objects.equals(this.restrictions, episodeBase.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioPreviewUrl, description, htmlDescription, durationMs, explicit, externalUrls, href, id, images, isExternallyHosted, isPlayable, language, languages, name, releaseDate, releaseDatePrecision, resumePoint, type, uri, restrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EpisodeBase {\n");
    
    sb.append("    audioPreviewUrl: ").append(toIndentedString(audioPreviewUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    explicit: ").append(toIndentedString(explicit)).append("\n");
    sb.append("    externalUrls: ").append(toIndentedString(externalUrls)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    isExternallyHosted: ").append(toIndentedString(isExternallyHosted)).append("\n");
    sb.append("    isPlayable: ").append(toIndentedString(isPlayable)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
