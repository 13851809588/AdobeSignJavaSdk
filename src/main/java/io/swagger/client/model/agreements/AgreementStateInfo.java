/**
*  Copyright 2019 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*
**/


/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.agreements;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.agreements.AgreementCancellationInfo;
import java.io.IOException;

/**
 * AgreementStateInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:48:52.659+05:30")
public class AgreementStateInfo {
  @SerializedName("agreementCancellationInfo")
  private AgreementCancellationInfo agreementCancellationInfo = null;

  /**
   * The state in which the agreement should land
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    AUTHORING("AUTHORING"),
    
    CANCELLED("CANCELLED"),
    
    IN_PROCESS("IN_PROCESS");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  public AgreementStateInfo agreementCancellationInfo(AgreementCancellationInfo agreementCancellationInfo) {
    this.agreementCancellationInfo = agreementCancellationInfo;
    return this;
  }

   /**
   * Cancellation information for the agreement
   * @return agreementCancellationInfo
  **/
  @ApiModelProperty(value = "Cancellation information for the agreement")
  public AgreementCancellationInfo getAgreementCancellationInfo() {
    return agreementCancellationInfo;
  }

  public void setAgreementCancellationInfo(AgreementCancellationInfo agreementCancellationInfo) {
    this.agreementCancellationInfo = agreementCancellationInfo;
  }

  public AgreementStateInfo state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state in which the agreement should land
   * @return state
  **/
  @ApiModelProperty(value = "The state in which the agreement should land")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementStateInfo agreementStateInfo = (AgreementStateInfo) o;
    return Objects.equals(this.agreementCancellationInfo, agreementStateInfo.agreementCancellationInfo) &&
        Objects.equals(this.state, agreementStateInfo.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementCancellationInfo, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementStateInfo {\n");
    
    sb.append("    agreementCancellationInfo: ").append(toIndentedString(agreementCancellationInfo)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
