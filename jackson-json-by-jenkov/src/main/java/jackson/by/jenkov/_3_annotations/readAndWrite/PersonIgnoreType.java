package jackson.by.jenkov._3_annotations.readAndWrite;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class PersonIgnoreType {
  @JsonIgnoreType
  public static class Address {
    public String streetName = null;
    public String houseNumber = null;
    public String zipCode = null;
    public String city = null;
    public String country = null;
  }

  public long personId = 0;

  public String name = null;

  public Address address = null;
}
