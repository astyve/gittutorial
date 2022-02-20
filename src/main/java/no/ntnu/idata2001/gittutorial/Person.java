package no.ntnu.idata2001.gittutorial;

public class Person {
  private String fullFamilyName;
  private int age;
  private String eMail;
  private String position;

  public Person(String name, int age) {
    this.fullFamilyName = name;
    this.age = age;
  }

  public String getFullFamilyName() {
    return this.fullFamilyName;
  }

  public int getAge() {
    return this.age;
  }

  public String getPosition() {
    return position;
  }
}
