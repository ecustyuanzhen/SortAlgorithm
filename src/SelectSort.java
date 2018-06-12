/**
 * 选择排序
 * @Author:zhenyuan
 * @Date:Created in 21:25 2018/6/10
 */

public class SelectSort {
    public static void main(String[] args){

        int[] a = {2,3,1,6,4,36,7,5,56,43,12,14,50,88};
        new SelectSort().selectSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public void selectSort(int[] array){
        int length = array.length;
        int temp,index=0;
        for (int i=0;i<length;i++){
            index=i;
            for (int j=i+1;j<length;j++){
                if (array[j]<array[index]){
                    index=j;
                }
            }
            temp=array[index];
            array[index]=array[i];
            array[i]=temp;
        }
    }




}
