/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PresentationLoadOptions.java">
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
import com.groupdocs.cloud.editor.model.LoadOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Allows to specify custom options for editing documents of all supportable Presentation (PowerPoint-compatible) formats
 */
@ApiModel(description = "Allows to specify custom options for editing documents of all supportable Presentation (PowerPoint-compatible) formats")
public class PresentationLoadOptions extends LoadOptions {
  @SerializedName("slideNumber")
  private Integer slideNumber = null;

  @SerializedName("showHiddenSlides")
  private Boolean showHiddenSlides = null;

  public PresentationLoadOptions slideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
    return this;
  }

   /**
   * Allows to specify the slide number, which should be opened for editing
   * @return slideNumber
  **/
  @ApiModelProperty(required = true, value = "Allows to specify the slide number, which should be opened for editing")
  public Integer getSlideNumber() {
    return slideNumber;
  }

  public void setSlideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
  }

  public PresentationLoadOptions showHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
    return this;
  }

   /**
   * Specifies whether the hidden slides should be included or not. Default is false     - hidden slides are not shown and exception will be thrown while trying to edit
   * @return showHiddenSlides
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the hidden slides should be included or not. Default is false     - hidden slides are not shown and exception will be thrown while trying to edit")
  public Boolean getShowHiddenSlides() {
    return showHiddenSlides;
  }

  public void setShowHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationLoadOptions presentationLoadOptions = (PresentationLoadOptions) o;
    return Objects.equals(this.slideNumber, presentationLoadOptions.slideNumber) &&
        Objects.equals(this.showHiddenSlides, presentationLoadOptions.showHiddenSlides) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slideNumber, showHiddenSlides, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationLoadOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    slideNumber: ").append(toIndentedString(slideNumber)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
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

