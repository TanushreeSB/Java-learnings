// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LargestElement {
    public static void main(String[] args) {
        int arr[] = {20,30,90,40,50};

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
