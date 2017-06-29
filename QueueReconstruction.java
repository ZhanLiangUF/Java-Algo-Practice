public class QeueReconstruction {

  public static void main(String[] args) {

  }

  /*
  h = height
  k = number of people in front whose height is greater than or equal to h
  (h,k)
  */
  public int[][] reconstructQueue(int[][] people) {

      // move people with greater height in front, and if height are equal move
      // lower k to the front
       Arrays.sort(people, new Comparator<int[]>() {
           public int compare(int[] a, int[] b) {
               if (b[0] == a[0]) return a[1] - b[1];
               return b[0] - a[0];
           }
       });
       // Need ArrayList because when add in index with element it shifts the previous added element to the right which
       // helps with the insert ordering.
       int n = people.length;
       ArrayList<int[]> tmp = new ArrayList<>();
       for (int i = 0; i < n; i++)
           tmp.add(people[i][1], new int[]{people[i][0], people[i][1]});

       int[][] res = new int[people.length][2];
       int i = 0;
       for (int[] k : tmp) {
          res[i][0] = k[0];
          res[i++][1] = k[1];
       }
       return res;

   }
}
