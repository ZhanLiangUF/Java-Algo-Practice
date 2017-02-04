import java.util.*;

public class IntersectionOfTwoArrays {
  public static void main(String[] args) {

  }
  public int[] intersect(int[] nums1, int[] nums2) {
    int length1 = nums1.length;
    int length2 = nums2.length;
    Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
    Map<Integer,Integer> map2 = new HashMap<Integer,Integer>();
    ArrayList<Integer> returnList = new ArrayList<Integer>();
    for(int i = 0; i< length1; i++) {
      if (map1.get(nums1[i]) != null) {
        int temp = map1.get(nums1[i]);
        map1.put(nums1[i],temp+1);
      } else {
        map1.put(nums1[i],1);
      }
    }
    for(int i = 0; i< length2; i++) {
      if (map2.get(nums2[i]) != null) {
        int temp = map2.get(nums2[i]);
        map2.put(nums2[i],temp+1);
      } else {
        map2.put(nums2[i],1);
      }
    }
    Map<Integer,Integer> smallestMap = (length1 > length2) ? map2 : map1;
    Map<Integer,Integer> biggestMap = (length1 > length2) ? map1 : map2;
    for (Map.Entry<Integer, Integer> entry : smallestMap.entrySet()) {
      Integer key = entry.getKey();
      Integer value = entry.getValue();
      if (biggestMap.get(key) != null) {
        int appendValue = (biggestMap.get(key) > value) ? value : biggestMap.get(key);
        for(int i = 0;i<appendValue;i++) {
          returnList.add(key);
        }
      }

    }
    int[] ints = new int[returnList.size()];
    for(int i=0, len = returnList.size(); i < len; i++)
    ints[i] = returnList.get(i);

    return ints;
  }

}
