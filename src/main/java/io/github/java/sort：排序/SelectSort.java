import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 *  排序选择
 *
 * @author duyunjian
 * @date 2021/10/04
 */


public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        SelectSort(arr);
    }
    public static void SelectSort(int[] arr){
        for (int i =0;i< arr.length - 1; i++){
            for (int j =i+1; j< arr.length;j++){
                if (arr[i]>arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                }
            }
        for (int j :arr){
            log.info(j + "");
        }


    }
}
