/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DelimitedTextLoadOptions.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
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
 * Options for loading text-based Spreadsheet documents (CSV, Tab-based etc.), that use a separator (delimiter)
 */
@ApiModel(description = "Options for loading text-based Spreadsheet documents (CSV, Tab-based etc.), that use a separator (delimiter)")
public class DelimitedTextLoadOptions extends LoadOptions {
  @SerializedName("separator")
  private String separator = null;

  @SerializedName("convertDateTimeData")
  private Boolean convertDateTimeData = null;

  @SerializedName("convertNumericData")
  private Boolean convertNumericData = null;

  @SerializedName("treatConsecutiveDelimitersAsOne")
  private Boolean treatConsecutiveDelimitersAsOne = null;

  public DelimitedTextLoadOptions separator(String separator) {
    this.separator = separator;
    return this;
  }

   /**
   * Allows to specify a string separator (delimiter) for text-based Spreadsheet documents             
   * @return separator
  **/
  @ApiModelProperty(value = "Allows to specify a string separator (delimiter) for text-based Spreadsheet documents             ")
  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public DelimitedTextLoadOptions convertDateTimeData(Boolean convertDateTimeData) {
    this.convertDateTimeData = convertDateTimeData;
    return this;
  }

   /**
   * Gets or sets a value that indicates whether the string in text-based document is converted to the date data. Default is false.
   * @return convertDateTimeData
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value that indicates whether the string in text-based document is converted to the date data. Default is false.")
  public Boolean getConvertDateTimeData() {
    return convertDateTimeData;
  }

  public void setConvertDateTimeData(Boolean convertDateTimeData) {
    this.convertDateTimeData = convertDateTimeData;
  }

  public DelimitedTextLoadOptions convertNumericData(Boolean convertNumericData) {
    this.convertNumericData = convertNumericData;
    return this;
  }

   /**
   * Gets or sets a value that indicates whether the string in text-based document is converted to numeric data. Default is false.
   * @return convertNumericData
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value that indicates whether the string in text-based document is converted to numeric data. Default is false.")
  public Boolean getConvertNumericData() {
    return convertNumericData;
  }

  public void setConvertNumericData(Boolean convertNumericData) {
    this.convertNumericData = convertNumericData;
  }

  public DelimitedTextLoadOptions treatConsecutiveDelimitersAsOne(Boolean treatConsecutiveDelimitersAsOne) {
    this.treatConsecutiveDelimitersAsOne = treatConsecutiveDelimitersAsOne;
    return this;
  }

   /**
   * Defines whether consecutive delimiters should be treated as one. By default is false.
   * @return treatConsecutiveDelimitersAsOne
  **/
  @ApiModelProperty(required = true, value = "Defines whether consecutive delimiters should be treated as one. By default is false.")
  public Boolean getTreatConsecutiveDelimitersAsOne() {
    return treatConsecutiveDelimitersAsOne;
  }

  public void setTreatConsecutiveDelimitersAsOne(Boolean treatConsecutiveDelimitersAsOne) {
    this.treatConsecutiveDelimitersAsOne = treatConsecutiveDelimitersAsOne;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelimitedTextLoadOptions delimitedTextLoadOptions = (DelimitedTextLoadOptions) o;
    return Objects.equals(this.separator, delimitedTextLoadOptions.separator) &&
        Objects.equals(this.convertDateTimeData, delimitedTextLoadOptions.convertDateTimeData) &&
        Objects.equals(this.convertNumericData, delimitedTextLoadOptions.convertNumericData) &&
        Objects.equals(this.treatConsecutiveDelimitersAsOne, delimitedTextLoadOptions.treatConsecutiveDelimitersAsOne) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(separator, convertDateTimeData, convertNumericData, treatConsecutiveDelimitersAsOne, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelimitedTextLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    convertDateTimeData: ").append(toIndentedString(convertDateTimeData)).append("\n");
    sb.append("    convertNumericData: ").append(toIndentedString(convertNumericData)).append("\n");
    sb.append("    treatConsecutiveDelimitersAsOne: ").append(toIndentedString(treatConsecutiveDelimitersAsOne)).append("\n");
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

