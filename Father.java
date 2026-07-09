 class Father {
  String name  =" tom";

}
class Son extends Father {
    int age=18;
  String name = "jerry";
  void display() {
    System.out.println(name);
    System.out.println(super.name);
    System.out.println(age);
  }

public static void main(String[] args) {
    Son s = new Son();
    s.display();
  }
}

