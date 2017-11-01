package conceptTest;

import java.util.HashSet;
import java.util.Set;

public class IntersectionArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,2,1};
		int []b = {2,2,4,3};
		int[] res = intersection(a, b);
		for (int t : res)
		System.out.print(" "+ t);
	
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
