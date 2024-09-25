import java.util.Scanner;

public class lianxu {
    //本方法是通过从等号右边的得数出发，逐个检测它以内的所有连续相加组合方式是否有等于这个数的式子
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数作为上限(右侧值)：");

        int high = scan.nextInt() + 1;// 因为下面数组开辟空间数从0开始，所以要+1
        int[] array = new int[high];

        for (int i = 0; i < high; i++) {
            array[i] = i * i * i;// 将每个数的三次方计算出来，一直到上限
        }
        long sum = 0;
        for (int i = 1; i < high; i++)
            // 这是等号右面的得数的三次方，也就说设置的上限
            for (int j = 1; j < i; j++)// 组合式子的第一个开始的数字
                for (int k = j; k < i; k++) {// 从j开始到<最右侧数可能出现的组合式子
                    sum = sum + array[k];
                    if (sum == array[i]) {
                        // 这里的判断必须紧跟着每次的累加，以判断比如2+3+4+5过程中的2+3+4是否符合
                        System.out.println(j + "^3+..." + k + "^3=" + i + "^3");
                        sum = 0;
                        /**
                         * 拿最右侧数（i）来说，有一个式子符合，则它以内的其他式子就不再符合，
                         *  即：2+3+4+5+6判断的过程中判断出2+3+4成立，
                         * 则不需要继续向后判断2+3+4+5和2+3+4+5+6了， 则将sum置0，并跳出循环
                         */
                        break;
                    }
                    if (sum > array[i]) {
                        /**
                         * 此处意思是计算过程中如果得到总和>该轮上限值的三次方了， 就不用计算下去了
                         */
                        sum = 0;
                        break;
                    }
                }

    }
}

