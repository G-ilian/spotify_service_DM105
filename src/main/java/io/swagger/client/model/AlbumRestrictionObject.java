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
 * AlbumRestrictionObject
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-05-01T19:29:10.951410897Z[GMT]")

public class AlbumRestrictionObject {
  /**
   * The reason for the restriction. Albums may be restricted if the content is not available in a given market, to the user&#x27;s subscription type, or when the user&#x27;s account is set to not play explicit content. Additional reasons may be added in the future. 
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    @SerializedName("market")
    MARKET("market"),
    @SerializedName("product")
    PRODUCT("product"),
    @SerializedName("explicit")
    EXPLICIT("explicit");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ReasonEnum fromValue(String input) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ReasonEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("reason")
  private ReasonEnum reason = null;

  public AlbumRestrictionObject reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the restriction. Albums may be restricted if the content is not available in a given market, to the user&#x27;s subscription type, or when the user&#x27;s account is set to not play explicit content. Additional reasons may be added in the future. 
   * @return reason
  **/
  @Schema(description = "The reason for the restriction. Albums may be restricted if the content is not available in a given market, to the user's subscription type, or when the user's account is set to not play explicit content. Additional reasons may be added in the future. ")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlbumRestrictionObject albumRestrictionObject = (AlbumRestrictionObject) o;
    return Objects.equals(this.reason, albumRestrictionObject.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlbumRestrictionObject {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
