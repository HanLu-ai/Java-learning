// 导包，其实就是先找到Scanner这个类在哪
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("欢迎使用御风工作室教程");
        /* 第一步：导包：其实就是表示先找到Scanner这个类在哪。
        第二步：创建对象：其实就表示申明一下，我准备开始用Scanner这个类了。
        第三步：接收数据：也是真正干活的代码。 */
        // 2.创建对象，其实就是申明一下，我准备开始用Scanner这个类了
        Scanner sc = new Scanner(System.in);
        // 3.接收数据
        // 当程序运行之后，我们在键盘输入的数据就会被变量i给接受了
        System.out.println("请输入一个数字：");
        int i = sc.nextInt();
        System.out.println(i);
    }
}
