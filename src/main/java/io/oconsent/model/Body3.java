package io.oconsent.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Body3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-30T08:49:14.744Z[GMT]")


public class Body3   {
  @JsonProperty("foo")
  private String foo = null;

  public Body3 foo(String foo) {
    this.foo = foo;
    return this;
  }

  /**
   * Get foo
   * @return foo
   **/
  @Schema(description = "")
  
    public String getFoo() {
    return foo;
  }

  public void setFoo(String foo) {
    this.foo = foo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return Objects.equals(this.foo, body3.foo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
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
