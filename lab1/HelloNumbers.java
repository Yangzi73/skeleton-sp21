public class HelloNumbers {
    /**
     * 主方法，程序的入口点
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 初始化变量x为1，用于循环计数
        int x = 1;
        // 初始化变量total为0，用于累加和
        int total = 0;
        // 当x小于等于10时，执行循环体
        while (x <= 10) {
            // 打印当前的累加和total，并在后面添加一个空格
            System.out.print(total + " ");
            // 将x的值累加到total中
            total = total + x;
            // 将x的值增加1，以便在下一次循环中使用
            x = x + 1;
        }
    }
} 
