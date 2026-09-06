class LargestThree {
    public static void main(String[] args) {

        int num[] = {66, 55, 44, 77, 88};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i++) {

            if(num[i] > largest) {
                third = second;
                second = largest;
                largest = num[i];
            }
            else if(num[i] > second) {
                third = second;
                second = num[i];
            }
            else if(num[i] > third) {
                third = num[i];
            }
        }

        System.out.println(largest + " " + second + " " + third);
    }
}
