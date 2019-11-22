/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SaveRequest.java">
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

package com.groupdocs.cloud.editor.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.editor.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for save method.
 */
public class SaveRequest {
    
    /**
    * Initializes a new instance of the SaveRequest class.
    */      
    public SaveRequest()
    {
    }

    /**
    * Initializes a new instance of the SaveRequest class.    
    * @param saveOptions Edited document save options
    */
    public SaveRequest(SaveOptions saveOptions)
    {
        this.saveOptions = saveOptions;
    }

  @SerializedName("saveOptions")
  private SaveOptions saveOptions = null;

  /**
   * Edited document save options
   * @return Edited document save options
  **/
  @ApiModelProperty(example = "new SaveOptions()", required = true, value = "Edited document save options")
  public SaveOptions getsaveOptions() {
    return saveOptions;
  }

  public void setsaveOptions(SaveOptions saveOptions) {
    this.saveOptions = saveOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    SaveRequest request = (SaveRequest) o;
    return Objects.equals(this.saveOptions, request.saveOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Save {\n");
    sb.append("    saveOptions: ").append(toIndentedString(saveOptions)).append("\n");
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

