package no.ntnu.idata2001.gittutorial;

public class Person {
  private String fullName;
  private int age;
  private String eMail;

  public Person(String name, int age) {
    this.fullName = name;
    this.age = age;
  }

  public String getFullName() {
    return this.fullName;
  }

  public int getAge() {
    return this.age;
  }
}
