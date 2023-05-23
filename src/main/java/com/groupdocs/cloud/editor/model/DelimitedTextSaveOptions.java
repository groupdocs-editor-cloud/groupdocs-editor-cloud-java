/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DelimitedTextSaveOptions.java">
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
 * Contains options for generating and saving text-based Spreadsheet documents (CSV, Tab-based etc.), that use a separator (delimiter)
 */
@ApiModel(description = "Contains options for generating and saving text-based Spreadsheet documents (CSV, Tab-based etc.), that use a separator (delimiter)")
public class DelimitedTextSaveOptions extends SaveOptions {
  @SerializedName("separator")
  private String separator = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("trimLeadingBlankRowAndColumn")
  private Boolean trimLeadingBlankRowAndColumn = null;

  @SerializedName("keepSeparatorsForBlankRow")
  private Boolean keepSeparatorsForBlankRow = null;

  public DelimitedTextSaveOptions separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * Allows to specify a string separator (delimiter) for text-based Spreadsheet documents
   * @return separator
  **/
  @ApiModelProperty(value = "Allows to specify a string separator (delimiter) for text-based Spreadsheet documents")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public DelimitedTextSaveOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Allows to set an encoding for the text-based Spreadsheet document. By default (and if not specified) is UTF-8.
   * @return encoding
  **/
  @ApiModelProperty(value = "Allows to set an encoding for the text-based Spreadsheet document. By default (and if not specified) is UTF-8.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public DelimitedTextSaveOptions trimLeadingBlankRowAndColumn(Boolean trimLeadingBlankRowAndColumn) {
    this.trimLeadingBlankRowAndColumn = trimLeadingBlankRowAndColumn;
    return this;
  }

   /**
   * Indicates whether leading blank rows and columns should be trimmed like what MS Excel does
   * @return trimLeadingBlankRowAndColumn
  **/
  @ApiModelProperty(required = true, value = "Indicates whether leading blank rows and columns should be trimmed like what MS Excel does")
  public Boolean getTrimLeadingBlankRowAndColumn() {
    return trimLeadingBlankRowAndColumn;
  }

  public void setTrimLeadingBlankRowAndColumn(Boolean trimLeadingBlankRowAndColumn) {
    this.trimLeadingBlankRowAndColumn = trimLeadingBlankRowAndColumn;
  }

  public DelimitedTextSaveOptions keepSeparatorsForBlankRow(Boolean keepSeparatorsForBlankRow) {
    this.keepSeparatorsForBlankRow = keepSeparatorsForBlankRow;
    return this;
  }

   /**
   * Indicates whether separators should be output for blank row. Default value is false which means the content for blank row will be empty.
   * @return keepSeparatorsForBlankRow
  **/
  @ApiModelProperty(required = true, value = "Indicates whether separators should be output for blank row. Default value is false which means the content for blank row will be empty.")
  public Boolean getKeepSeparatorsForBlankRow() {
    return keepSeparatorsForBlankRow;
  }

  public void setKeepSeparatorsForBlankRow(Boolean keepSeparatorsForBlankRow) {
    this.keepSeparatorsForBlankRow = keepSeparatorsForBlankRow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelimitedTextSaveOptions delimitedTextSaveOptions = (DelimitedTextSaveOptions) o;
    return Objects.equals(this.separator, delimitedTextSaveOptions.separator) &&
        Objects.equals(this.encoding, delimitedTextSaveOptions.encoding) &&
        Objects.equals(this.trimLeadingBlankRowAndColumn, delimitedTextSaveOptions.trimLeadingBlankRowAndColumn) &&
        Objects.equals(this.keepSeparatorsForBlankRow, delimitedTextSaveOptions.keepSeparatorsForBlankRow) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(separator, encoding, trimLeadingBlankRowAndColumn, keepSeparatorsForBlankRow, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelimitedTextSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    trimLeadingBlankRowAndColumn: ").append(toIndentedString(trimLeadingBlankRowAndColumn)).append("\n");
    sb.append("    keepSeparatorsForBlankRow: ").append(toIndentedString(keepSeparatorsForBlankRow)).append("\n");
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

