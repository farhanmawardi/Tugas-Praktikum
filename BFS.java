import java.util.*;
public class BFS {
    static Map<String, List<String>>graph=new HashMap<>();
    static Map<String, Integer> nodeValue=new HashMap<>();
    static Set<String> visited=new HashSet<>();

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
        nodeValue.put("a1", 10);
        nodeValue.put("a2", 5);
        nodeValue.put("a3", 29);
        nodeValue.put("a4", 9);
        nodeValue.put("a5", 11);
        nodeValue.put("a6", 3);
        nodeValue.put("a7", 19);

        int targetValue = 1;

        System.out.println("Mencari Nilai: " + targetValue + " Menggunakan BFS...\n");

        boolean found = bfs("a1", targetValue);

        if (found) {
            System.out.println("\nNilai " + targetValue + " Ditemukan!");
        } else {
            System.out.println("\nNilai " + targetValue + " Tidak Ditemukan!");
        }
    }

    //Rekursif BFS
    public static boolean bfs(String start, int targetValue) {
        Queue<String>queue=new LinkedList<>();
        visited.clear(); //Membersihkan yang sebelumnya
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentValue = nodeValue.get(current);
            System.out.println("Mengunjungi Node: " + current + " Dengan Nilai: " + currentValue);

            if (currentValue == targetValue) {
                return true;
            }

            for (String neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }
}
