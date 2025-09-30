public class SortTest {

    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 8, 1, 4, 7, 6, 9, 8, 7, 9};
        SortTest sortTest = new SortTest();


        //冒泡排序
//        for (int i : sortTest.冒泡(arr)) {
//            System.out.println(i);
//        }


        //选择排序
//        for (int i : sortTest.选择(arr)) {
//            System.out.println(i);
//        }


        //插入排序
//        for (int i : sortTest.插入(arr)) {
//            System.out.println(i);
//        }

        //快速排序
        for (int i : sortTest.快速(arr)) {
            System.out.println(i);
        }
    }
    private  int[] 快速(int[] arr) {
        //初始分区即数组本身
        quickSort(arr, 0,arr.length-1);
        return arr;
    }
    //这才是真正发生排序的地方：返回分区点就已经排序了
    private int 分区点(int[] arr,int left,int right ){
        //选最后一个数为基准
       int end=arr[right];
       //快慢指针指向最左边
       int fast=left,slow=left;
       while (fast<right){
            if (arr[fast] < end) {
                int temp = arr[fast];
                arr[fast]=arr[slow];
                arr[slow]=temp;
                slow++;
            }
           fast++;
       }
       arr[right]=arr[slow];
       arr[slow]=end;
       return slow;
    }
    //对具体的区域进行递归
    private void quickSort(int arr[],int left,int right){
        if(left>=right){
            return;
        }
        int result = 分区点(arr, left, right);
        quickSort(arr,left,result-1);
        quickSort(arr,result+1,right);
    }


    private  int[] 插入(int[] arr) {
        //将无序区的插入有序区的，每次与有序区最后一个比较，初始第一个为有序
        for (int i = 1; i < arr.length; i++) {
            //暂存
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
    private  int[] 选择(int[] arr) {
        //外层决定比较基准,同时也是次数
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex=i;
            //内层选一个最小值的索引
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex=j;
                }
            }
            //交换位置
            if(minIndex!=i){
                int temp= arr[i];
                arr[i]= arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        return arr;
    }

    private int[] 冒泡(int[] arr) {
        //外层决定比较次数
        for (int i = 1; i <= arr.length-1; i++) {
            boolean flag = true;
            //内层比较相邻值,每次比较的范围缩小
            for (int j = 0; j <= arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=false;
                }
            }
            if(flag){
                //提前退出
                break;
            }
        }
        return arr;
    }
}
