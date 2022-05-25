/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="XmlLoadOptions.java">
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
 * Allows to specify custom options for loading XML (eXtensible Markup Language) documents
 */
@ApiModel(description = "Allows to specify custom options for loading XML (eXtensible Markup Language) documents")
public class XmlLoadOptions extends LoadOptions {
  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("fixIncorrectStructure")
  private Boolean fixIncorrectStructure = null;

  @SerializedName("recognizeUris")
  private Boolean recognizeUris = null;

  @SerializedName("recognizeEmails")
  private Boolean recognizeEmails = null;

  @SerializedName("trimTrailingWhitespaces")
  private Boolean trimTrailingWhitespaces = null;

  /**
   * Allows to specify quote type (single or double quotes) for attribute values. Double quotes are default.             
   */
  @JsonAdapter(AttributeValuesQuoteTypeEnum.Adapter.class)
  public enum AttributeValuesQuoteTypeEnum {
    DOUBLEQUOTE("DoubleQuote"),
    
    SINGLEQUOTE("SingleQuote");

    private String value;

    AttributeValuesQuoteTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttributeValuesQuoteTypeEnum fromValue(String text) {
      for (AttributeValuesQuoteTypeEnum b : AttributeValuesQuoteTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AttributeValuesQuoteTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttributeValuesQuoteTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttributeValuesQuoteTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AttributeValuesQuoteTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("attributeValuesQuoteType")
  private AttributeValuesQuoteTypeEnum attributeValuesQuoteType = null;

  public XmlLoadOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Character encoding of the text document, which will be applied for its opening. By default is null - internal document encoding will be applied.             
   * @return encoding
  **/
  @ApiModelProperty(value = "Character encoding of the text document, which will be applied for its opening. By default is null - internal document encoding will be applied.             ")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public XmlLoadOptions fixIncorrectStructure(Boolean fixIncorrectStructure) {
    this.fixIncorrectStructure = fixIncorrectStructure;
    return this;
  }

   /**
   * Allows to enable or disable mechanism for fixing corrupted XML structure. By default is disabled (false).             
   * @return fixIncorrectStructure
  **/
  @ApiModelProperty(required = true, value = "Allows to enable or disable mechanism for fixing corrupted XML structure. By default is disabled (false).             ")
  public Boolean getFixIncorrectStructure() {
    return fixIncorrectStructure;
  }

  public void setFixIncorrectStructure(Boolean fixIncorrectStructure) {
    this.fixIncorrectStructure = fixIncorrectStructure;
  }

  public XmlLoadOptions recognizeUris(Boolean recognizeUris) {
    this.recognizeUris = recognizeUris;
    return this;
  }

   /**
   * Allows to enable URI recognition algorithm
   * @return recognizeUris
  **/
  @ApiModelProperty(required = true, value = "Allows to enable URI recognition algorithm")
  public Boolean getRecognizeUris() {
    return recognizeUris;
  }

  public void setRecognizeUris(Boolean recognizeUris) {
    this.recognizeUris = recognizeUris;
  }

  public XmlLoadOptions recognizeEmails(Boolean recognizeEmails) {
    this.recognizeEmails = recognizeEmails;
    return this;
  }

   /**
   * Allows to enable recognition algorithm for email addresses in attribute values
   * @return recognizeEmails
  **/
  @ApiModelProperty(required = true, value = "Allows to enable recognition algorithm for email addresses in attribute values")
  public Boolean getRecognizeEmails() {
    return recognizeEmails;
  }

  public void setRecognizeEmails(Boolean recognizeEmails) {
    this.recognizeEmails = recognizeEmails;
  }

  public XmlLoadOptions trimTrailingWhitespaces(Boolean trimTrailingWhitespaces) {
    this.trimTrailingWhitespaces = trimTrailingWhitespaces;
    return this;
  }

   /**
   * Allows to enable the truncation of trailing whitespaces in the inner-tag text. By default is disabled (false) - trailing whitespaces will be preserved.             
   * @return trimTrailingWhitespaces
  **/
  @ApiModelProperty(required = true, value = "Allows to enable the truncation of trailing whitespaces in the inner-tag text. By default is disabled (false) - trailing whitespaces will be preserved.             ")
  public Boolean getTrimTrailingWhitespaces() {
    return trimTrailingWhitespaces;
  }

  public void setTrimTrailingWhitespaces(Boolean trimTrailingWhitespaces) {
    this.trimTrailingWhitespaces = trimTrailingWhitespaces;
  }

  public XmlLoadOptions attributeValuesQuoteType(AttributeValuesQuoteTypeEnum attributeValuesQuoteType) {
    this.attributeValuesQuoteType = attributeValuesQuoteType;
    return this;
  }

   /**
   * Allows to specify quote type (single or double quotes) for attribute values. Double quotes are default.             
   * @return attributeValuesQuoteType
  **/
  @ApiModelProperty(required = true, value = "Allows to specify quote type (single or double quotes) for attribute values. Double quotes are default.             ")
  public AttributeValuesQuoteTypeEnum getAttributeValuesQuoteType() {
    return attributeValuesQuoteType;
  }

  public void setAttributeValuesQuoteType(AttributeValuesQuoteTypeEnum attributeValuesQuoteType) {
    this.attributeValuesQuoteType = attributeValuesQuoteType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlLoadOptions xmlLoadOptions = (XmlLoadOptions) o;
    return Objects.equals(this.encoding, xmlLoadOptions.encoding) &&
        Objects.equals(this.fixIncorrectStructure, xmlLoadOptions.fixIncorrectStructure) &&
        Objects.equals(this.recognizeUris, xmlLoadOptions.recognizeUris) &&
        Objects.equals(this.recognizeEmails, xmlLoadOptions.recognizeEmails) &&
        Objects.equals(this.trimTrailingWhitespaces, xmlLoadOptions.trimTrailingWhitespaces) &&
        Objects.equals(this.attributeValuesQuoteType, xmlLoadOptions.attributeValuesQuoteType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, fixIncorrectStructure, recognizeUris, recognizeEmails, trimTrailingWhitespaces, attributeValuesQuoteType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    fixIncorrectStructure: ").append(toIndentedString(fixIncorrectStructure)).append("\n");
    sb.append("    recognizeUris: ").append(toIndentedString(recognizeUris)).append("\n");
    sb.append("    recognizeEmails: ").append(toIndentedString(recognizeEmails)).append("\n");
    sb.append("    trimTrailingWhitespaces: ").append(toIndentedString(trimTrailingWhitespaces)).append("\n");
    sb.append("    attributeValuesQuoteType: ").append(toIndentedString(attributeValuesQuoteType)).append("\n");
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

