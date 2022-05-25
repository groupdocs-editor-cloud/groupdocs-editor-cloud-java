/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SpreadsheetLoadOptions.java">
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
 * Allows to specify custom options for editing documents of all supportable Spreadsheet (Excel-compatible) formats
 */
@ApiModel(description = "Allows to specify custom options for editing documents of all supportable Spreadsheet (Excel-compatible) formats")
public class SpreadsheetLoadOptions extends LoadOptions {
  @SerializedName("worksheetIndex")
  private Integer worksheetIndex = null;

  @SerializedName("excludeHiddenWorksheets")
  private Boolean excludeHiddenWorksheets = null;

  public SpreadsheetLoadOptions worksheetIndex(Integer worksheetIndex) {
    this.worksheetIndex = worksheetIndex;
    return this;
  }

   /**
   * Allows to specify the 0-based index of the worksheet (tab) of the input Spreadsheet document, which should be converted to the HTML.
   * @return worksheetIndex
  **/
  @ApiModelProperty(required = true, value = "Allows to specify the 0-based index of the worksheet (tab) of the input Spreadsheet document, which should be converted to the HTML.")
  public Integer getWorksheetIndex() {
    return worksheetIndex;
  }

  public void setWorksheetIndex(Integer worksheetIndex) {
    this.worksheetIndex = worksheetIndex;
  }

  public SpreadsheetLoadOptions excludeHiddenWorksheets(Boolean excludeHiddenWorksheets) {
    this.excludeHiddenWorksheets = excludeHiddenWorksheets;
    return this;
  }

   /**
   * Allows to exclude hidden worksheets in the input Spreadsheet document, so they will be totally ignored. Default is false - hidden worksheets are available and processed as normal.
   * @return excludeHiddenWorksheets
  **/
  @ApiModelProperty(required = true, value = "Allows to exclude hidden worksheets in the input Spreadsheet document, so they will be totally ignored. Default is false - hidden worksheets are available and processed as normal.")
  public Boolean getExcludeHiddenWorksheets() {
    return excludeHiddenWorksheets;
  }

  public void setExcludeHiddenWorksheets(Boolean excludeHiddenWorksheets) {
    this.excludeHiddenWorksheets = excludeHiddenWorksheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadsheetLoadOptions spreadsheetLoadOptions = (SpreadsheetLoadOptions) o;
    return Objects.equals(this.worksheetIndex, spreadsheetLoadOptions.worksheetIndex) &&
        Objects.equals(this.excludeHiddenWorksheets, spreadsheetLoadOptions.excludeHiddenWorksheets) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheetIndex, excludeHiddenWorksheets, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    worksheetIndex: ").append(toIndentedString(worksheetIndex)).append("\n");
    sb.append("    excludeHiddenWorksheets: ").append(toIndentedString(excludeHiddenWorksheets)).append("\n");
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

