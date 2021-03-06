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


package io.swagger.client.model.users;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.users.UserGroupInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UserGroupsInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T15:49:31.257+05:30")
public class UserGroupsInfo {
  @SerializedName("groupInfoList")
  private List<UserGroupInfo> groupInfoList = null;

  public UserGroupsInfo groupInfoList(List<UserGroupInfo> groupInfoList) {
    this.groupInfoList = groupInfoList;
    return this;
  }

  public UserGroupsInfo addGroupInfoListItem(UserGroupInfo groupInfoListItem) {
    if (this.groupInfoList == null) {
      this.groupInfoList = new ArrayList<UserGroupInfo>();
    }
    this.groupInfoList.add(groupInfoListItem);
    return this;
  }

   /**
   * The list of groups for given user.
   * @return groupInfoList
  **/
  @ApiModelProperty(value = "The list of groups for given user.")
  public List<UserGroupInfo> getGroupInfoList() {
    return groupInfoList;
  }

  public void setGroupInfoList(List<UserGroupInfo> groupInfoList) {
    this.groupInfoList = groupInfoList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupsInfo userGroupsInfo = (UserGroupsInfo) o;
    return Objects.equals(this.groupInfoList, userGroupsInfo.groupInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupInfoList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupsInfo {\n");
    
    sb.append("    groupInfoList: ").append(toIndentedString(groupInfoList)).append("\n");
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

