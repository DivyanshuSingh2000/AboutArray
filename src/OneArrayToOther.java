

public class OneArrayToOther {


        public static void main(String[] args) {
            //Initialize array
            int[] arr1 = new int [] {10, 20, 30, 40, 50,66,77};
            //Displaying elements of array arr1
            System.out.println("Elements of Array 1: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            //Create another array arr2 with size of arr1
            int arr2[] = new int[arr1.length];
            //Copying all elements of one array into another
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
            //Displaying elements of array arr2
            System.out.println("\nElements array 2: ");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }

