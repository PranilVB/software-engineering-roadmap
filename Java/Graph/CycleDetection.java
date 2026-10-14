import java.util.ArrayList;

public class CycleDetection {

    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
       
    }
    public static boolean isCycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(rec[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                isCycle(graph, vis, e.dest, rec);
                return true;
            }
        }
        rec[curr]=false;
        return false;
    }
    public static void main(String[] args) {
        int v = 4;

        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph, new boolean[v], 0, new boolean[v]));
    }
}