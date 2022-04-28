class Employee {

  public int age = 50;
  public int lage = 50;

  void printHello() {
    System.out.println("Hello");
  }
}

public class CEmployee extends Employee {

  public int age = 55;
  public String name = "Tarun";
  int sage = super.age;

  void printname() {
    System.out.println(name);
    System.out.println(sage);
  }

  void printHello(){
    System.out.println("Hello MR. " + name);
  }

  public static void main(String[] args) {
    CEmployee emp = new CEmployee();
    emp.printHello();
    emp.printname();
    System.out.println(emp.age);
    System.out.println(emp.lage);
  }
}
