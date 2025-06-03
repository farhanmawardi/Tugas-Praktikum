import java.util.*;
public class DFS {
    static Map<String, List<String>>graph=new HashMap<>();
    static Map<String, Integer> nodeValue=new HashMap<>();
    static Set<String>visited=new HashSet<>();

    public static void main(String[] args) {
        //Struktur graf
        graph.put("a1", Arrays.asList("a2", "a3"));
        graph.put("a2", Arrays.asList("a1", "a4", "a5"));
        graph.put("a3", Arrays.asList("a1", "a6", "a7"));
        graph.put("a4", Arrays.asList("a2"));
        graph.put("a5", Arrays.asList("a2"));
        graph.put("a6", Arrays.asList("a3"));
        graph.put("a7", Arrays.asList("a3"));

        //Memasukan nilai pada node
        nodeValue.put("a1", 9);
        nodeValue.put("a2", 5);
        nodeValue.put("a3", 3);
        nodeValue.put("a4", 10);
        nodeValue.put("a5", 19);
        nodeValue.put("a6", 8);
        nodeValue.put("a7", 21);

        int targetValue = 1;

        System.out.println("Mencari Nilai " + targetValue + " Menggunakan DFS...\n");

        boolean found = dfs("a1", targetValue);

        if (found){
            System.out.println("\nNilai " + targetValue +" Ditemukan!");
        } else {
            System.out.println("\nNilai " +targetValue + " Tidak Ditemukan!");
        }
    }

    //Rekursif DFS
    public static boolean dfs(String current, int targetValue) {
        System.out.println("Mengunjungi Node " + current + " Dengan Nilai: " + nodeValue.get(current));
        visited.add(current);

        if(nodeValue.get(current)== targetValue){
            return true;
        }
        for (String neighbor : graph.get(current)){
            if (!visited.contains(neighbor)){
                if (dfs(neighbor, targetValue)){
                    return true;
                }
            }
        }
        return false;
        
    }
}
