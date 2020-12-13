class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer> ();

        for (int i : nums) {
            Integer i_integer = Integer.valueOf(i);
            if (set.contains(i_integer)) {
                return true;
            } else {
                set.add(i_integer);
            }
        }

        return false;
    }
}