import java.util.*;

public class BreadthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private int s;
    private List<Integer> ordemVisita;

    public BreadthFirstPaths(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        ordemVisita = new ArrayList<>();
        this.s = s;
        bfs(G, s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new LinkedList<>();
        marked[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            int v = queue.poll();
            ordemVisita.add(v);
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = v;
                    queue.add(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }

    public List<Integer> ordemVisita() {
        return ordemVisita;
    }
}