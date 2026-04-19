package staticvariabletest;

public class Student {
    //独有的属性
    String name;
    int age;

    //所有学生共享同一个老师
    static String teachername;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    //显示
    void show(){
        System.out.println(name + " " + age + " " + teachername);
    }
}
