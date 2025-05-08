// need of an array?
// >>a variable to store multiple value

public class Array {
    public static void main(String[] args) {
        System.out.println("\n____________1D-One dimensional array_____________");

        int arr[] = new int[4]; // create an array with new keyword and the type of the array is int and size is 4.
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println("\n____________2D-Multi dimensional array_____________");

// Multi dimensional array
        int arr1 [][] = new int[3][5]; // one big array which have internal 3 array of size 4

        int value = 1;
        for(int i = 0; i<3; i++){
            for(int j=0; j<4; j++){
                arr1 [i][j] = value;
                value++;
            }
        }

        for(int i = 0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr1 [i][j]+" ");
                
            }
            System.out.println();
        }

        System.out.println("\n____________Jagged Array_____________");
// Jagged Array = Individually specifying the size of the column of internal array
        int arr3[][] = new int[3][];

        arr3 [0] = new int[6];
        arr3 [1] = new int[5];
        arr3 [2] = new int[7];

        int value2 = 1;
        for(int i = 0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){            //size of the every row
                arr3 [i][j] = value2;
                value2++;
            }
        }

        for(int i = 0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length; j++){
                System.out.print(arr3 [i][j]+" ");
                
            }
            System.out.println();
        }

        // using for each loop

        for(int n[] : arr3){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        System.out.println("\n____________3D Array_____________");
// 3D Array
        int arr3d [][][] = new int[3][4][5];

        int value6 = 1;
        for(int i = 0; i<arr3d.length; i++){
            for(int j=0; j<arr3d[i].length; j++){            //size of the every row
                for(int k=0; k<arr3d[i][j].length; k++){
                    arr3d [i][j][k] = value6;
                    value6++;
                }
            }
        }

        for(int i = 0; i<arr3d.length; i++){
            for(int j=0; j<arr3d[i].length; j++){
                for(int k=0; k<arr3d[i][j].length; k++){
                    System.out.print(arr3d [i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // using for each loop

        for(int n[][] : arr3d){
            for(int[] m : n){
                for(int o : m){
                System.out.print(o+" ");
                }
            }
            System.out.println();
        }


    }
    
}
