package staticvariabletest;

public class Test {
    public static void main(String[] args) {
        /*学生有如下属性:姓名,年龄,老师
         * 一个班级中，所有学生都是共享同一个老师
         * 第一名学生:张三,18岁
         * 第二名学生:李四,19岁
         * 最初都是小刘老师上课,后面换成小傅老师了*/

        // 创建学生对象
        Student s1 = new Student("张三",18);
        s1.teachername = "小刘老师";

        Student s2 = new Student("李四",19);

        s1.show();
        s2.show();

        Student.teachername = "小傅老师";
        s1.show();
        s2.show();

    }
}
