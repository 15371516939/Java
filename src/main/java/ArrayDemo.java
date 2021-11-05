

public class ArrayDemo {
    /**
     * 求数组元素志和
     *
     * @parom array 整型形参数组
     * @retunrn int :元素之和
     */
    public int getSum(int[] array) {
        // sum为累加器，初始值为0
        int sum =0;
        /*
        以下通过循环遍历数组，累加求和
         */
        for (int i = 0; i <array.length;i++){
            sum += i;
        }
        //返回sum
        return sum;
    }



}
