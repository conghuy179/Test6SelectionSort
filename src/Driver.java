import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private Scanner sc;
    private int selection;

    public Driver(Scanner sc) {
        this.sc = sc.useDelimiter("\n");
    }

    public void run() {
        do {
            System.out.println("PHAN CONG HUY - FX16513");
            System.out.println("Enter the number of elements in array (1 to 10): ");
            selection = sc.nextInt();
            if (!isValid(selection)) {
                System.out.println("Only type number from 1 to 10. Try again.");
            }
        } while (!isValid(selection));
        int[] arr = new int[selection];
        System.out.println("Type " + selection + " number in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Selection Sort: ");
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }

    public boolean isValid(int selection) {
        for (int i = 1; i < 11; i++) {
            if (selection == i) {
                return true;
            }
        }
        return false;
    }

    public void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }

    public void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            // Tim vi tri co gia tri nho nhat tinh tu i den a.length - 1
            int tem = i;
            for (int j = i; j < a.length; j++) {
                if (a[tem] > a[j]) {
                    tem = j;
                }
            }
            // doi cho gia tri tai i va gia tri tai vi tri tem
            swap(a, i, tem);
        }
    }
}
