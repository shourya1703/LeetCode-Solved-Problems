import java.util.HashSet;
import java.util.ArrayList;
class Solution {

public boolean containsDuplicate(int[] nums) {
Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
if(nums.length == set.size())
    return false;
else
    return true;
}
}