package Arrays;

public class Array {

public static void main(String[] args) {

//single-dimensional array
int a[]= {10,20,30,40,50};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {0, 1, 5, 3}, 
            {55, 7, 4} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}

