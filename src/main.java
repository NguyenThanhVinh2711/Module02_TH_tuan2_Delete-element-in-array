import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int numberIsDelete = scanner.nextInt();
        int positionIsDelete = findIndexDelete(arr,numberIsDelete);
        if (positionIsDelete == -1){
            System.out.println("Phần tử không có trong mảng");
        }
        else {
            arr = deleteOneElement( arr , positionIsDelete );
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
    public static int findIndexDelete( int[] arr,int element){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element ){
                index = i;
            }
        }
        return index;
    }

    public static int[] deleteOneElement(int[] arr , int index){
        int[] newarr = new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            newarr[i] = arr[i];
        }
        for (int i = index +1 ; i < arr.length ; i++) {
            newarr[i-1] = arr[i];
        }
        return newarr;
    }

}
