class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> cities=new HashSet<>();
        HashMap<String,String> mp=new HashMap<>();

        for(List<String> path:paths)
        {
            cities.add(path.get(0));
            cities.add(path.get(1));
            mp.put(path.get(0),path.get(1));
        }
        String dest="";
        for(String city:cities)
        {
            if(mp.containsKey(city)==false)
            {
                dest=city;
                break;
            }
        }
        return dest;
    }
}