/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SaveOptions.java">
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
import com.groupdocs.cloud.editor.model.Options;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Save options
 */
@ApiModel(description = "Save options")
public class SaveOptions extends Options {
  @SerializedName("htmlPath")
  private String htmlPath = null;

  @SerializedName("resourcesPath")
  private String resourcesPath = null;

  @SerializedName("format")
  private String format = null;

  public SaveOptions htmlPath(String htmlPath) {
    this.htmlPath = htmlPath;
    return this;
  }

   /**
   * The Html document path
   * @return htmlPath
  **/
  @ApiModelProperty(value = "The Html document path")
  public String getHtmlPath() {
    return htmlPath;
  }

  public void setHtmlPath(String htmlPath) {
    this.htmlPath = htmlPath;
  }

  public SaveOptions resourcesPath(String resourcesPath) {
    this.resourcesPath = resourcesPath;
    return this;
  }

   /**
   * Resources path
   * @return resourcesPath
  **/
  @ApiModelProperty(value = "Resources path")
  public String getResourcesPath() {
    return resourcesPath;
  }

  public void setResourcesPath(String resourcesPath) {
    this.resourcesPath = resourcesPath;
  }

  public SaveOptions format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Document format
   * @return format
  **/
  @ApiModelProperty(value = "Document format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveOptions saveOptions = (SaveOptions) o;
    return Objects.equals(this.htmlPath, saveOptions.htmlPath) &&
        Objects.equals(this.resourcesPath, saveOptions.resourcesPath) &&
        Objects.equals(this.format, saveOptions.format) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlPath, resourcesPath, format, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    htmlPath: ").append(toIndentedString(htmlPath)).append("\n");
    sb.append("    resourcesPath: ").append(toIndentedString(resourcesPath)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

