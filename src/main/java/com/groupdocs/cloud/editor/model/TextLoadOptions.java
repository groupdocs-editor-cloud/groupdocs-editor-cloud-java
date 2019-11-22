/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextLoadOptions.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.editor.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.editor.model.FileInfo;
import com.groupdocs.cloud.editor.model.LoadOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Allows to specify custom options for loading plain text (TXT) documents
 */
@ApiModel(description = "Allows to specify custom options for loading plain text (TXT) documents")
public class TextLoadOptions extends LoadOptions {
  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("recognizeLists")
  private Boolean recognizeLists = null;

  /**
   * Gets or sets preferred option of a leading space handling. By default converts leading spaces to the left indent.
   */
  @JsonAdapter(LeadingSpacesEnum.Adapter.class)
  public enum LeadingSpacesEnum {
    CONVERTTOINDENT("ConvertToIndent"),
    
    PRESERVE("Preserve"),
    
    TRIM("Trim");

    private String value;

    LeadingSpacesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LeadingSpacesEnum fromValue(String text) {
      for (LeadingSpacesEnum b : LeadingSpacesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LeadingSpacesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LeadingSpacesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LeadingSpacesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LeadingSpacesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("leadingSpaces")
  private LeadingSpacesEnum leadingSpaces = null;

  /**
   * Gets or sets preferred option of a trailing space handling. By default truncates all trailing spaces.
   */
  @JsonAdapter(TrailingSpacesEnum.Adapter.class)
  public enum TrailingSpacesEnum {
    TRIM("Trim"),
    
    PRESERVE("Preserve");

    private String value;

    TrailingSpacesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TrailingSpacesEnum fromValue(String text) {
      for (TrailingSpacesEnum b : TrailingSpacesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TrailingSpacesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TrailingSpacesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TrailingSpacesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TrailingSpacesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("trailingSpaces")
  private TrailingSpacesEnum trailingSpaces = null;

  @SerializedName("enablePagination")
  private Boolean enablePagination = null;

  public TextLoadOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Character encoding of the text document, which will be applied for its opening
   * @return encoding
  **/
  @ApiModelProperty(value = "Character encoding of the text document, which will be applied for its opening")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public TextLoadOptions recognizeLists(Boolean recognizeLists) {
    this.recognizeLists = recognizeLists;
    return this;
  }

   /**
   * Allows to specify how numbered list items are recognized when document is imported from plain text format. The default value is true.
   * @return recognizeLists
  **/
  @ApiModelProperty(required = true, value = "Allows to specify how numbered list items are recognized when document is imported from plain text format. The default value is true.")
  public Boolean getRecognizeLists() {
    return recognizeLists;
  }

  public void setRecognizeLists(Boolean recognizeLists) {
    this.recognizeLists = recognizeLists;
  }

  public TextLoadOptions leadingSpaces(LeadingSpacesEnum leadingSpaces) {
    this.leadingSpaces = leadingSpaces;
    return this;
  }

   /**
   * Gets or sets preferred option of a leading space handling. By default converts leading spaces to the left indent.
   * @return leadingSpaces
  **/
  @ApiModelProperty(required = true, value = "Gets or sets preferred option of a leading space handling. By default converts leading spaces to the left indent.")
  public LeadingSpacesEnum getLeadingSpaces() {
    return leadingSpaces;
  }

  public void setLeadingSpaces(LeadingSpacesEnum leadingSpaces) {
    this.leadingSpaces = leadingSpaces;
  }

  public TextLoadOptions trailingSpaces(TrailingSpacesEnum trailingSpaces) {
    this.trailingSpaces = trailingSpaces;
    return this;
  }

   /**
   * Gets or sets preferred option of a trailing space handling. By default truncates all trailing spaces.
   * @return trailingSpaces
  **/
  @ApiModelProperty(required = true, value = "Gets or sets preferred option of a trailing space handling. By default truncates all trailing spaces.")
  public TrailingSpacesEnum getTrailingSpaces() {
    return trailingSpaces;
  }

  public void setTrailingSpaces(TrailingSpacesEnum trailingSpaces) {
    this.trailingSpaces = trailingSpaces;
  }

  public TextLoadOptions enablePagination(Boolean enablePagination) {
    this.enablePagination = enablePagination;
    return this;
  }

   /**
   * Allows to enable or disable pagination in the resultant HTML document. By default is disabled (false).
   * @return enablePagination
  **/
  @ApiModelProperty(required = true, value = "Allows to enable or disable pagination in the resultant HTML document. By default is disabled (false).")
  public Boolean getEnablePagination() {
    return enablePagination;
  }

  public void setEnablePagination(Boolean enablePagination) {
    this.enablePagination = enablePagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextLoadOptions textLoadOptions = (TextLoadOptions) o;
    return Objects.equals(this.encoding, textLoadOptions.encoding) &&
        Objects.equals(this.recognizeLists, textLoadOptions.recognizeLists) &&
        Objects.equals(this.leadingSpaces, textLoadOptions.leadingSpaces) &&
        Objects.equals(this.trailingSpaces, textLoadOptions.trailingSpaces) &&
        Objects.equals(this.enablePagination, textLoadOptions.enablePagination) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, recognizeLists, leadingSpaces, trailingSpaces, enablePagination, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    recognizeLists: ").append(toIndentedString(recognizeLists)).append("\n");
    sb.append("    leadingSpaces: ").append(toIndentedString(leadingSpaces)).append("\n");
    sb.append("    trailingSpaces: ").append(toIndentedString(trailingSpaces)).append("\n");
    sb.append("    enablePagination: ").append(toIndentedString(enablePagination)).append("\n");
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

