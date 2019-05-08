/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.ory.hydra.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.
 */
@ApiModel(description = "Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-08T10:14:06.817+02:00")
public class GenericError {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("error_code")
  private Long errorCode = null;

  @JsonProperty("error_debug")
  private String errorDebug = null;

  @JsonProperty("error_hint")
  private String errorHint = null;

  public GenericError error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Name is the error name.
   * @return error
  **/
  @ApiModelProperty(example = "The requested resource could not be found", required = true, value = "Name is the error name.")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public GenericError errorCode(Long errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Code represents the error status code (404, 403, 401, ...).
   * @return errorCode
  **/
  @ApiModelProperty(example = "404", value = "Code represents the error status code (404, 403, 401, ...).")
  public Long getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
  }

  public GenericError errorDebug(String errorDebug) {
    this.errorDebug = errorDebug;
    return this;
  }

   /**
   * Debug contains debug information. This is usually not available and has to be enabled.
   * @return errorDebug
  **/
  @ApiModelProperty(example = "The database adapter was unable to find the element", value = "Debug contains debug information. This is usually not available and has to be enabled.")
  public String getErrorDebug() {
    return errorDebug;
  }

  public void setErrorDebug(String errorDebug) {
    this.errorDebug = errorDebug;
  }

  public GenericError errorHint(String errorHint) {
    this.errorHint = errorHint;
    return this;
  }

   /**
   * Hint contains further information on the nature of the error.
   * @return errorHint
  **/
  @ApiModelProperty(example = "Object with ID 12345 does not exist", value = "Hint contains further information on the nature of the error.")
  public String getErrorHint() {
    return errorHint;
  }

  public void setErrorHint(String errorHint) {
    this.errorHint = errorHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericError genericError = (GenericError) o;
    return Objects.equals(this.error, genericError.error) &&
        Objects.equals(this.errorCode, genericError.errorCode) &&
        Objects.equals(this.errorDebug, genericError.errorDebug) &&
        Objects.equals(this.errorHint, genericError.errorHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorCode, errorDebug, errorHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericError {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDebug: ").append(toIndentedString(errorDebug)).append("\n");
    sb.append("    errorHint: ").append(toIndentedString(errorHint)).append("\n");
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

