class university {
    String universityname="Davangere university";
    void conductexam () {
         System.out.println("exams conducted");
     }
}
class College extends university  {
    String collegename = "st.joseph";
    void conductinternals (){
        System.out.println("inetrnals conducted");
    }
}
class Department extends College {
    String departmentname ="bca";
    void assigment()
    {
        System.out.println("assignment given");
    }
 }
 class Soulation {
     public static void main(String[] args) {
         Department d = new Department();
         System.out.println(d.universityname);
         System.out.println(d.collegename);
         System.out.println(d.departmentname);
         d.conductexam();
         d.conductinternals();
         d.assigment();
     }
 }

