public class Main {
    /* 需求：说出公交车到终点站之后，车上一共有多少乘客？

		    一开始没有乘客。

	   第一站：上去一位乘客，没有下来乘客。
       第二站：上去两位乘客，下来一位乘客。
	   第三站：上去两位乘客，下来一位乘客。
	   第四站：没有上去乘客，下来一位乘客。
	   第五站：上去一位乘客，没有下来乘客。
	   问：到了终点站之后，车上一共多少乘客？ */

    // 主入口
    public static void main(String[] args) {
        System.out.println("欢迎使用御风工作室教程");
        // 一开始没有乘客
        int count = 0;
        // 第一站：上去一位乘客
        // 在原有的基础上 + 1
        count = count + 1;
        System.out.println(count);
        // 第二站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        // 第三站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        // 第四战：下来一位乘客
        count = count - 1;
        // 第五战：上去一位乘客
        count = count + 1;
        // 请问：到了终点站，车上一共几位乘客？
        System.out.println(count);
    }
}