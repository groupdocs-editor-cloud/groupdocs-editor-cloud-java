/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordProcessingSaveOptions.java">
 *   Copyright (c) Aspose Pty Ltd
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
import com.groupdocs.cloud.editor.model.SaveOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Allows to specify custom options for generating and saving WordProcessing-compliant documents
 */
@ApiModel(description = "Allows to specify custom options for generating and saving WordProcessing-compliant documents")
public class WordProcessingSaveOptions extends SaveOptions {
  @SerializedName("password")
  private String password = null;

  @SerializedName("enablePagination")
  private Boolean enablePagination = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("localeBi")
  private String localeBi = null;

  @SerializedName("localeFarEast")
  private String localeFarEast = null;

  /**
   * Write-protection type. Default value is NoProtection
   */
  @JsonAdapter(ProtectionTypeEnum.Adapter.class)
  public enum ProtectionTypeEnum {
    NOPROTECTION("NoProtection"),
    
    ALLOWONLYREVISIONS("AllowOnlyRevisions"),
    
    ALLOWONLYCOMMENTS("AllowOnlyComments"),
    
    ALLOWONLYFORMFIELDS("AllowOnlyFormFields"),
    
    READONLY("ReadOnly");

    private String value;

    ProtectionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtectionTypeEnum fromValue(String text) {
      for (ProtectionTypeEnum b : ProtectionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtectionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtectionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtectionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtectionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("protectionType")
  private ProtectionTypeEnum protectionType = null;

  @SerializedName("protectionPassword")
  private String protectionPassword = null;

  public WordProcessingSaveOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Allows to specify document password
   * @return password
  **/
  @ApiModelProperty(value = "Allows to specify document password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public WordProcessingSaveOptions enablePagination(Boolean enablePagination) {
    this.enablePagination = enablePagination;
    return this;
  }

   /**
   * Allows to enable or disable pagination which will be used for saving the document. If the original document was opened and edited in pagination mode, this option also should be enabled. By default is disabled.
   * @return enablePagination
  **/
  @ApiModelProperty(required = true, value = "Allows to enable or disable pagination which will be used for saving the document. If the original document was opened and edited in pagination mode, this option also should be enabled. By default is disabled.")
  public Boolean getEnablePagination() {
    return enablePagination;
  }

  public void setEnablePagination(Boolean enablePagination) {
    this.enablePagination = enablePagination;
  }

  public WordProcessingSaveOptions locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Allows to set override default locale (language) for the WordProcessing document, which will be applied during its creation. When is not specified (default value), MS Word (or other program) will detect (or choose) the document locale according to its own settings or other factors.
   * @return locale
  **/
  @ApiModelProperty(value = "Allows to set override default locale (language) for the WordProcessing document, which will be applied during its creation. When is not specified (default value), MS Word (or other program) will detect (or choose) the document locale according to its own settings or other factors.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public WordProcessingSaveOptions localeBi(String localeBi) {
    this.localeBi = localeBi;
    return this;
  }

   /**
   * Allows to set override locale (language) for the WordProcessing document for the RTL (right-to-left) text, which will be applied during its creation. When is not specified (default value), MS Word (or other program) will detect (or choose) the document RTL locale according to its own settings or other factors.
   * @return localeBi
  **/
  @ApiModelProperty(value = "Allows to set override locale (language) for the WordProcessing document for the RTL (right-to-left) text, which will be applied during its creation. When is not specified (default value), MS Word (or other program) will detect (or choose) the document RTL locale according to its own settings or other factors.")
  public String getLocaleBi() {
    return localeBi;
  }

  public void setLocaleBi(String localeBi) {
    this.localeBi = localeBi;
  }

  public WordProcessingSaveOptions localeFarEast(String localeFarEast) {
    this.localeFarEast = localeFarEast;
    return this;
  }

   /**
   * Allows to override the locale (language) for the WordProcessing document for the East-Asian text, which will be applied during its creation. When is not specified (default value), MS Word (or other program) will detect (or choose) the document East-Asian locale according to its own settings or other factors.
   * @return localeFarEast
  **/
  @ApiModelProperty(value = "Allows to override the locale (language) for the WordProcessing document for the East-Asian text, which will be applied during its creation. When is not specified (default value), MS Word (or other program) will detect (or choose) the document East-Asian locale according to its own settings or other factors.")
  public String getLocaleFarEast() {
    return localeFarEast;
  }

  public void setLocaleFarEast(String localeFarEast) {
    this.localeFarEast = localeFarEast;
  }

  public WordProcessingSaveOptions protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }

   /**
   * Write-protection type. Default value is NoProtection
   * @return protectionType
  **/
  @ApiModelProperty(required = true, value = "Write-protection type. Default value is NoProtection")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  public WordProcessingSaveOptions protectionPassword(String protectionPassword) {
    this.protectionPassword = protectionPassword;
    return this;
  }

   /**
   * Write-protection password. Used when protection type is specified.
   * @return protectionPassword
  **/
  @ApiModelProperty(value = "Write-protection password. Used when protection type is specified.")
  public String getProtectionPassword() {
    return protectionPassword;
  }

  public void setProtectionPassword(String protectionPassword) {
    this.protectionPassword = protectionPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordProcessingSaveOptions wordProcessingSaveOptions = (WordProcessingSaveOptions) o;
    return Objects.equals(this.password, wordProcessingSaveOptions.password) &&
        Objects.equals(this.enablePagination, wordProcessingSaveOptions.enablePagination) &&
        Objects.equals(this.locale, wordProcessingSaveOptions.locale) &&
        Objects.equals(this.localeBi, wordProcessingSaveOptions.localeBi) &&
        Objects.equals(this.localeFarEast, wordProcessingSaveOptions.localeFarEast) &&
        Objects.equals(this.protectionType, wordProcessingSaveOptions.protectionType) &&
        Objects.equals(this.protectionPassword, wordProcessingSaveOptions.protectionPassword) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, enablePagination, locale, localeBi, localeFarEast, protectionType, protectionPassword, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordProcessingSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    enablePagination: ").append(toIndentedString(enablePagination)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    localeBi: ").append(toIndentedString(localeBi)).append("\n");
    sb.append("    localeFarEast: ").append(toIndentedString(localeFarEast)).append("\n");
    sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
    sb.append("    protectionPassword: ").append(toIndentedString(protectionPassword)).append("\n");
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

