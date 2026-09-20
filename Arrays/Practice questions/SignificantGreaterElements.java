class SignificantGreaterElements {

    static void findGreaterElements(int[] nums, int n) {

        System.out.print(
            "Elements which have at-least two greater elements: "
        );

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (nums[j] > nums[i]) {
                    count++;
                }
            }

            if (count >= 2) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {10, 5, 8, 3, 12};

        findGreaterElements(nums, nums.length);
    }
} 
