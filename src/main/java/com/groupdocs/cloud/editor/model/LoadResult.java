/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="LoadResult.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes load result
 */
@ApiModel(description = "Describes load result")
public class LoadResult {
  @SerializedName("htmlPath")
  private String htmlPath = null;

  @SerializedName("resourcesPath")
  private String resourcesPath = null;

  public LoadResult htmlPath(String htmlPath) {
    this.htmlPath = htmlPath;
    return this;
  }

   /**
   * Path of the editable document
   * @return htmlPath
  **/
  @ApiModelProperty(value = "Path of the editable document")
  public String getHtmlPath() {
    return htmlPath;
  }

  public void setHtmlPath(String htmlPath) {
    this.htmlPath = htmlPath;
  }

  public LoadResult resourcesPath(String resourcesPath) {
    this.resourcesPath = resourcesPath;
    return this;
  }

   /**
   * Path of the document resources
   * @return resourcesPath
  **/
  @ApiModelProperty(value = "Path of the document resources")
  public String getResourcesPath() {
    return resourcesPath;
  }

  public void setResourcesPath(String resourcesPath) {
    this.resourcesPath = resourcesPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadResult loadResult = (LoadResult) o;
    return Objects.equals(this.htmlPath, loadResult.htmlPath) &&
        Objects.equals(this.resourcesPath, loadResult.resourcesPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlPath, resourcesPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadResult {\n");
    
    sb.append("    htmlPath: ").append(toIndentedString(htmlPath)).append("\n");
    sb.append("    resourcesPath: ").append(toIndentedString(resourcesPath)).append("\n");
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

