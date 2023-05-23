/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfSaveOptions.java">
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
 * Allows to specify custom options for generating and saving PDF (Portable Document Format) documents
 */
@ApiModel(description = "Allows to specify custom options for generating and saving PDF (Portable Document Format) documents")
public class PdfSaveOptions extends SaveOptions {
  @SerializedName("password")
  private String password = null;

  /**
   * Specifies the PDF standards compliance level for output documents. Default is PdfCompliance.Pdf15.             
   */
  @JsonAdapter(ComplianceEnum.Adapter.class)
  public enum ComplianceEnum {
    PDF15("Pdf15"),
    
    PDFA1A("PdfA1a"),
    
    PDFA1B("PdfA1b");

    private String value;

    ComplianceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComplianceEnum fromValue(String text) {
      for (ComplianceEnum b : ComplianceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComplianceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComplianceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComplianceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComplianceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("compliance")
  private ComplianceEnum compliance = null;

  public PdfSaveOptions password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password, which will be applied to the generated PDF document as user password, required for opening. If NULL or empty, no password will be applied to the document. Otherwise, document will be encrypted with RC4 (key length of 128 bit).             
   * @return password
  **/
  @ApiModelProperty(value = "Password, which will be applied to the generated PDF document as user password, required for opening. If NULL or empty, no password will be applied to the document. Otherwise, document will be encrypted with RC4 (key length of 128 bit).             ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PdfSaveOptions compliance(ComplianceEnum compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Specifies the PDF standards compliance level for output documents. Default is PdfCompliance.Pdf15.             
   * @return compliance
  **/
  @ApiModelProperty(required = true, value = "Specifies the PDF standards compliance level for output documents. Default is PdfCompliance.Pdf15.             ")
  public ComplianceEnum getCompliance() {
    return compliance;
  }

  public void setCompliance(ComplianceEnum compliance) {
    this.compliance = compliance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSaveOptions pdfSaveOptions = (PdfSaveOptions) o;
    return Objects.equals(this.password, pdfSaveOptions.password) &&
        Objects.equals(this.compliance, pdfSaveOptions.compliance) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, compliance, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
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

