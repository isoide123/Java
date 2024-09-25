public class Equality {
    public  void verification(int a,int b) {
        /*
        * 验证等式：
        * 1.连续的数字（for循环，然后得到sum值）
        * 2.找相等的数字：另开一个循环，循环遍历，然后再得到一个sum2,如果sum1 == sum2;等式成立，else ,等式不成立
        * */
        int sum1 = 0;
        for(int i=a;i<=b;i++) {
            sum1 += i*i*i;
        }
        int sum2 = 0;
        for (int j=a;j<sum1;j++){
            sum2 = j*j*j;
            int tmp = j;
            if(sum1 == sum2) {
                System.out.println("sum1是:"+sum1+"   sum2是："+sum2+"  找到的自然数是："+tmp);
                break;
            }else{
                continue;
            }
        }

        //数组开辟空间
//        int[] arr = new int[0];完全合法，并且开辟出了一小块空间去存储数组对象本身的信息（比如长度），无论尝试访问任何元素都会溢出

        /**
         * 验证：
         * 1.把能够走到的，右边等式的自然数值先存到一个数组里面了。
         * 2.用sum存储放在右边的连续数的立方和
         * 3.
         */
    }
}


