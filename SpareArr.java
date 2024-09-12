public class SpareArr {
    public static void main(String[] args) {
        /**
         * 稀疏数组压缩二维数组介绍：
         * 把含有很多个相同元素，只有几个不同数据的元素转换成稀疏数组（行数，列数，数据），来压缩
         */

        //1.创建二维数组
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //2.输出二维数组
        for(int[] row : chessArr1) {
            for(int x : row){
                System.out.printf("%d\t",x);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("转换的稀疏数组如下：");

        int sum = 0; // 给一个计数器
        for(int i = 0; i<chessArr1.length; i++){
            for(int j = 0; j<chessArr1[i].length; j++){
                if(chessArr1[i][j] != 0){
                    sum++; //如果这个元素不是0，那么就让计数器加1,
                }
            }

        }

        //3.获取稀疏数组,3列确定的，但是不知道行数，行数就是数字不为相同值的个数，那么我们来判断一下这个个数有多少个
        int[][] sparseArr = new int[sum+1][3];
        //4.确定了行列，但是还没有确定对应的数据
        sparseArr[0][0] = 11 ;
        sparseArr[0][1] = 11 ;
        sparseArr[0][2] = sum ;
        //5.获取有值的数据，将非0的数据存入稀疏数组（遍历出来非0，放入i跟j就好，第三列就是本身）
        int count = 0 ;
        for(int i = 0; i<chessArr1.length; i++){
            for(int j = 0; j<chessArr1[i].length; j++){
                if(chessArr1[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;  //第几个非0数据，如何获得
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }

        for(int[] row : sparseArr){
            for(int x : row){
                System.out.printf("%d\t",x);
            }
            System.out.println();
        }
//第二种解法：
//        System.out.println("得到的稀疏数组为： ");
//        for(int i = 0;i < sparseArr.length;i++){
//            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
//        }
//        System.out.println();


//        /**
//         * 将稀疏数组返回成二维数组
//         */
//
//        int[][] chessArr2 = new int[chessArr1[0][0]][chessArr1[0][1]];
//
//        //拿到sparseArr数组的大小，从第二行开始是需要的非0数值，其中非0的行号列号都在数组的【i】【0】.[i][2]
//        for(int i = 1;i < sparseArr.length;i++){
//            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
//        }
//
//        System.out.println("转回去后的输出数组");
//        for (int[] row : chessArr2) {
//            for(int col : row) {
//                System.out.printf("%d\t",col);
//            }
//            System.out.println();
//        }

        /**
         * 将稀疏数组恢复成二维数组
         */
        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];
        //如果此时输出，由于啥子机制，会全部为0，
        for(int i = 1;i < sparseArr.length;i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        System.out.println("转回去后的输出数组");
        for (int[] row : chessArr2) {
            for(int col : row) {
                System.out.printf("%d\t",col);
            }
            System.out.println();
        }

    }

}
