class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies)
            if (i > max)
                max = i;
        ArrayList<Boolean> ret = new ArrayList<Boolean>();
        for (int i : candies) {
            if (i + extraCandies >= max)
                ret.add(Boolean.TRUE);
            else
                ret.add(Boolean.FALSE);
        }
        return ret;
    }
}
