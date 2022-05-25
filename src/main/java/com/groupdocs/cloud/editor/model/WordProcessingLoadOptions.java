/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordProcessingLoadOptions.java">
 *   Copyright (c) 2003-2022 Aspose Pty Ltd
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
 * Allows to specify custom options for loading WordProcessing-compliant documents
 */
@ApiModel(description = "Allows to specify custom options for loading WordProcessing-compliant documents")
public class WordProcessingLoadOptions extends LoadOptions {
  @SerializedName("enablePagination")
  private Boolean enablePagination = null;

  @SerializedName("enableLanguageInformation")
  private Boolean enableLanguageInformation = null;

  /**
   * Responsible for extracting font resources, which are used in the input WordProcessing document. By default doesn&#39;t extract any fonts (NotExtract).
   */
  @JsonAdapter(FontExtractionEnum.Adapter.class)
  public enum FontExtractionEnum {
    NOTEXTRACT("NotExtract"),
    
    EXTRACTALLEMBEDDED("ExtractAllEmbedded"),
    
    EXTRACTEMBEDDEDWITHOUTSYSTEM("ExtractEmbeddedWithoutSystem"),
    
    EXTRACTALL("ExtractAll");

    private String value;

    FontExtractionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FontExtractionEnum fromValue(String text) {
      for (FontExtractionEnum b : FontExtractionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FontExtractionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FontExtractionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FontExtractionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FontExtractionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("fontExtraction")
  private FontExtractionEnum fontExtraction = null;

  public WordProcessingLoadOptions enablePagination(Boolean enablePagination) {
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

  public WordProcessingLoadOptions enableLanguageInformation(Boolean enableLanguageInformation) {
    this.enableLanguageInformation = enableLanguageInformation;
    return this;
  }

   /**
   * Specifies whether language information is exported to the HTML markup in a form of &#39;lang&#39; HTML attributes. This option may be useful for roundtrip conversion of the multi-language documents. By default it is disabled (false).
   * @return enableLanguageInformation
  **/
  @ApiModelProperty(required = true, value = "Specifies whether language information is exported to the HTML markup in a form of 'lang' HTML attributes. This option may be useful for roundtrip conversion of the multi-language documents. By default it is disabled (false).")
  public Boolean getEnableLanguageInformation() {
    return enableLanguageInformation;
  }

  public void setEnableLanguageInformation(Boolean enableLanguageInformation) {
    this.enableLanguageInformation = enableLanguageInformation;
  }

  public WordProcessingLoadOptions fontExtraction(FontExtractionEnum fontExtraction) {
    this.fontExtraction = fontExtraction;
    return this;
  }

   /**
   * Responsible for extracting font resources, which are used in the input WordProcessing document. By default doesn&#39;t extract any fonts (NotExtract).
   * @return fontExtraction
  **/
  @ApiModelProperty(required = true, value = "Responsible for extracting font resources, which are used in the input WordProcessing document. By default doesn't extract any fonts (NotExtract).")
  public FontExtractionEnum getFontExtraction() {
    return fontExtraction;
  }

  public void setFontExtraction(FontExtractionEnum fontExtraction) {
    this.fontExtraction = fontExtraction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordProcessingLoadOptions wordProcessingLoadOptions = (WordProcessingLoadOptions) o;
    return Objects.equals(this.enablePagination, wordProcessingLoadOptions.enablePagination) &&
        Objects.equals(this.enableLanguageInformation, wordProcessingLoadOptions.enableLanguageInformation) &&
        Objects.equals(this.fontExtraction, wordProcessingLoadOptions.fontExtraction) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePagination, enableLanguageInformation, fontExtraction, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordProcessingLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    enablePagination: ").append(toIndentedString(enablePagination)).append("\n");
    sb.append("    enableLanguageInformation: ").append(toIndentedString(enableLanguageInformation)).append("\n");
    sb.append("    fontExtraction: ").append(toIndentedString(fontExtraction)).append("\n");
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

