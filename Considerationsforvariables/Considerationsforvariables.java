public class Considerationsforvariables {
    // 变量名不能重复
    // 在一条语句中，可以定义多个变量。但是这种方式影响代码的阅读
    // 变量在使用之前必须要赋值

    public static void main(String[] args) {
        System.out.println("欢迎使用御风工作室教程");
        // 1.变量名不允许重复
        // int a = 10;
        // int a = 20;
        // System.out.println(a);

        // 2.一条语句可以定义多个变量
        // int a = 10, b = 20, c = 20, d = 20;
        // System.out.println(a);
        // System.out.println(a);

        // 3.变量在使用之前必须要赋值
        int a = 30;
        System.out.println(a);
    }
}
