//Input:
//["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
//Output:
//[["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]

// Input is an array of strings. Parse array first??

// Output anything that has the same string? Can be simple check?

public FindDuplicateFileInSystem {

public static void main(String[] args) {

}


    public List<List<String>> findDuplicate(String[] paths) {

        HashMap<String,ArrayList<String>> map = new HashMap();
        ArrayList<List<String>> returnList = new ArrayList<List<String>>();

        for(String path: paths) {
            // split on spaces
            String[] stringArr = path.split("\\s+");

            for(int i = 1; i < stringArr.length; i++) {

                int index = stringArr[i].indexOf('(');
                String key = stringArr[i].substring(index);

                ArrayList<String> value = map.getOrDefault(key, new ArrayList<String>());
                value.add(stringArr[0].concat("/").concat(stringArr[i].substring(0,index)));
                map.put(key, value);

            }
        }

        for (ArrayList<String> value : map.values()) {
            if (value.size() < 2) {
                continue;
            }
            returnList.add(value);
        }

        return returnList;
    }


}
