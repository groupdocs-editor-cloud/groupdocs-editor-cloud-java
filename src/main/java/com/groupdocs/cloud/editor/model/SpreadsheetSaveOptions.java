/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SpreadsheetSaveOptions.java">
 *   Copyright (c) 2003-2023 Aspose Pty Ltd
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
 * Allows to specify custom options for generating and saving Spreadsheet (Excel-compliant) documents
 */
@ApiModel(description = "Allows to specify custom options for generating and saving Spreadsheet (Excel-compliant) documents")
public class SpreadsheetSaveOptions extends SaveOptions {
  @SerializedName("password")
  private String password = null;

  /**
   * Write-protection type. Default value is None.
   */
  @JsonAdapter(ProtectionTypeEnum.Adapter.class)
  public enum ProtectionTypeEnum {
    NONE("None"),
    
    ALL("All"),
    
    CONTENTS("Contents"),
    
    OBJECTS("Objects"),
    
    SCENARIOS("Scenarios"),
    
    STRUCTURE("Structure"),
    
    WINDOW("Window");

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

  public SpreadsheetSaveOptions password(String password) {
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

  public SpreadsheetSaveOptions protectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
    return this;
  }

   /**
   * Write-protection type. Default value is None.
   * @return protectionType
  **/
  @ApiModelProperty(required = true, value = "Write-protection type. Default value is None.")
  public ProtectionTypeEnum getProtectionType() {
    return protectionType;
  }

  public void setProtectionType(ProtectionTypeEnum protectionType) {
    this.protectionType = protectionType;
  }

  public SpreadsheetSaveOptions protectionPassword(String protectionPassword) {
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
    SpreadsheetSaveOptions spreadsheetSaveOptions = (SpreadsheetSaveOptions) o;
    return Objects.equals(this.password, spreadsheetSaveOptions.password) &&
        Objects.equals(this.protectionType, spreadsheetSaveOptions.protectionType) &&
        Objects.equals(this.protectionPassword, spreadsheetSaveOptions.protectionPassword) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, protectionType, protectionPassword, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

