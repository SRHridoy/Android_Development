import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        int arr[] = {1, 3 , 4, 3, 5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        ArrayList arrayList = new ArrayList();
        arrayList.add(44);
        arrayList.add("EliteCoder007");
        arrayList.add(3.232);

        for (Object object : arrayList) {
            System.out.println(object);
        }
    }
}
