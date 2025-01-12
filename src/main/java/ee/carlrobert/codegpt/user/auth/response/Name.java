package ee.carlrobert.codegpt.user.auth.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {

  private final String firstName;
  private final String middleName;
  private final String lastName;

  public Name(
      @JsonProperty("first_name") String firstName,
      @JsonProperty("middle_name") String middleName,
      @JsonProperty("last_name") String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }
}
