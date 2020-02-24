package DesignPatterns.Builder;

public class Test {
  public static void main(String...s)
  {
    CellPhone cellPhone = new CellPhone.CellPhoneBuilder("Android","Jio").support4g(true)
                              .touchEnabled(true).build();
    System.out.println(cellPhone);

  }

}
