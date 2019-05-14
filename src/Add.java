import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        int arr[];
        int size;
        int val;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        size = scanner.nextInt();
        arr = new int[size];
        System.out.println("Enter value :");
        val = scanner.nextInt();
        System.out.println("Enter position:");
        index = scanner.nextInt();

        for (int i = index ; i < arr.length -1 ; i++){
            int temp = arr[i];
            arr[index] = val;
            arr[index + 1] = temp;
        }
        for (int j = 0 ; j < arr.length ; j++){
            System.out.print(arr[j]);
        }
        
    }
}
