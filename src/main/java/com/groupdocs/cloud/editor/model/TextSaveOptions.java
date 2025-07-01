/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextSaveOptions.java">
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
 * Allows to specify custom options for generating and saving plain text (TXT) documents
 */
@ApiModel(description = "Allows to specify custom options for generating and saving plain text (TXT) documents")
public class TextSaveOptions extends SaveOptions {
  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("addBidiMarks")
  private Boolean addBidiMarks = null;

  @SerializedName("preserveTableLayout")
  private Boolean preserveTableLayout = null;

  public TextSaveOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Character encoding of the text document, which will be applied for its saving
   * @return encoding
  **/
  @ApiModelProperty(value = "Character encoding of the text document, which will be applied for its saving")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public TextSaveOptions addBidiMarks(Boolean addBidiMarks) {
    this.addBidiMarks = addBidiMarks;
    return this;
  }

   /**
   * Specifies whether to add bi-directional marks before each BiDi run when exporting in plain text format
   * @return addBidiMarks
  **/
  @ApiModelProperty(required = true, value = "Specifies whether to add bi-directional marks before each BiDi run when exporting in plain text format")
  public Boolean getAddBidiMarks() {
    return addBidiMarks;
  }

  public void setAddBidiMarks(Boolean addBidiMarks) {
    this.addBidiMarks = addBidiMarks;
  }

  public TextSaveOptions preserveTableLayout(Boolean preserveTableLayout) {
    this.preserveTableLayout = preserveTableLayout;
    return this;
  }

   /**
   * Specifies whether the program should attempt to preserve layout of tables when saving in the plain text format. The default value is false.
   * @return preserveTableLayout
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the program should attempt to preserve layout of tables when saving in the plain text format. The default value is false.")
  public Boolean getPreserveTableLayout() {
    return preserveTableLayout;
  }

  public void setPreserveTableLayout(Boolean preserveTableLayout) {
    this.preserveTableLayout = preserveTableLayout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextSaveOptions textSaveOptions = (TextSaveOptions) o;
    return Objects.equals(this.encoding, textSaveOptions.encoding) &&
        Objects.equals(this.addBidiMarks, textSaveOptions.addBidiMarks) &&
        Objects.equals(this.preserveTableLayout, textSaveOptions.preserveTableLayout) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, addBidiMarks, preserveTableLayout, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    addBidiMarks: ").append(toIndentedString(addBidiMarks)).append("\n");
    sb.append("    preserveTableLayout: ").append(toIndentedString(preserveTableLayout)).append("\n");
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

