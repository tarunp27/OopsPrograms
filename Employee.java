public class Employee {

  final public int age;
  public String name = "Tarun";

  public Employee() {
    this.age = 20;
    System.out.println("Constructor Calls");
  }
   public Employee(int age) {
     this.age = age;
    System.out.println("Single parameter Constructor Calls");
  }
   public Employee(int age, String s) {
     this.age = age;
     name = s;
    System.out.println("Double paramater Constructor Calls");
  }

  public static void main(String[] args) {
    Employee emp1 = new Employee();
    System.out.println("Age: " + emp1.age + ", Name: " + emp1.name);
   // Employee emp2= new Employee(32);
    //System.out.println("Age: " + emp2.age + ", Name: " + emp2.name);
    //Employee emp3 = new Employee(45,"MALA PUGALENDI");
    //System.out.println("Age: " + emp3.age + ", Name: " + emp3.name);
  }
}
