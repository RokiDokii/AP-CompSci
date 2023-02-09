class Main {
  public static void main(String[] args) {
    int[] test = {20, 31, 55, 21, 19};


    System.out.println("Before calling maxPlacement:");
    for( int i = 0; i<test.length; i++)
        System.out.println(test[i]);
    System.out.println();

    System.out.println("Successful swap? " + maxPlacement(test, 3));

    System.out.println("After calling maxPlacement:");
    for( int i = 0; i<test.length; i++)
        System.out.println(test[i]);
  }

   public static boolean maxPlacement(int[] arr, int index){
    int bigNum = arr[0];
    for (int i = 0; i < arr.length; i++){
        if (arr[i] > arr[index]){
            bigNum = i;
        }
    }
    if (arr[bigNum] > arr[index]){
        int temp = arr[index];
        arr[index] = arr[bigNum];
        arr[bigNum] = temp;
        return true;
    }
    return false;
   }
}