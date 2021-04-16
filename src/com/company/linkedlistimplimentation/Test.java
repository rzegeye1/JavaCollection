package com.company.linkedlistimplimentation;

public class Test {

    public static void main(String[] arg) {


int []sumNumber = {1, 2, 3};
int target = 4;

      int []selectedIndex  =(twoSum(sumNumber, target));
for (int i =0; i<selectedIndex.length; i++){
    System.out.print(selectedIndex[i]+" ");
}

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target) {

                    return new int[]{i, j};
                }

            }

        }
        throw new IllegalArgumentException("no two sum found");
    }


}