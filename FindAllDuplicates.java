public class FindAllDuplicates {

      public List<Integer> findDuplicates(int[] nums) {
          HashMap<Integer, Boolean> map = new HashMap();
          List<Integer> list = new ArrayList();
          for (Integer k : nums) {
              if (map.get(k) == null) {
                  map.put(k,true);
              } else {
                  list.add(k);
              }
          }
          return list;
      }


}
