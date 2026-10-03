import java.util.ArrayList;

public class Adjecency_List {
    static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static void createGrapg(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1,4));

        graph[1].add(new Edge(1, 2,2));
        graph[1].add(new Edge(1, 3,1));

        graph[2].add(new Edge(2, 0,11));
        graph[2].add(new Edge(2, 1,6));
        graph[2].add(new Edge(2, 3,6));

        graph[3].add(new Edge(3, 1,2));
        graph[3].add(new Edge(3, 2,3));
    }
public static void main(String[] args) {
    int v=4;
    ArrayList<Edge>graph[]=new ArrayList[v];
    createGrapg(graph);
    // for (int i = 0; i < graph[2].size(); i++) {
    //     Edge e=graph[2].get(i);
    //     System.out.println(e.dest +"");
    // }


    // Weighted Graph

 for (int i = 0; i < graph[2].size(); i++) {
        Edge e=graph[2].get(i);
        System.out.println(e.dest +","+e.weight);
    }
}
    
}