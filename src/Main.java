import java.io.*;
import java.util.*;

public class Main {
    private static final String[] estados = {
        "AL","BA","CE","MA","PB","PE","PI","RN","SE"
    };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph G = new Graph(estados.length);

        // carregar arestas do arquivo
        Scanner file = new Scanner(new File("dados/nordeste.txt"));
        while (file.hasNextInt()) {
            int v = file.nextInt();
            int w = file.nextInt();
            G.addEdge(v, w);
        }

        System.out.print("Informe estado origem (índice): ");
        int origem = sc.nextInt();
        System.out.print("Informe estado destino (índice): ");
        int destino = sc.nextInt();

        // DFS
        DepthFirstPaths dfs = new DepthFirstPaths(G, origem);
        System.out.println("\nDFS:");
        if (dfs.hasPathTo(destino)) {
            System.out.println("Caminho encontrado: " + dfs.pathTo(destino));
        } else {
            System.out.println("Não há caminho.");
        }
        System.out.println("Ordem de visita: " + dfs.ordemVisita());

        // BFS
        BreadthFirstPaths bfs = new BreadthFirstPaths(G, origem);
        System.out.println("\nBFS:");
        if (bfs.hasPathTo(destino)) {
            System.out.println("Caminho encontrado: " + bfs.pathTo(destino));
        } else {
            System.out.println("Não há caminho.");
        }
        System.out.println("Ordem de visita: " + bfs.ordemVisita());

        // Estados alcançáveis
        System.out.println("\nEstados alcançáveis a partir de " + estados[origem] + ":");
        for (int i = 0; i < estados.length; i++) {
            if (dfs.hasPathTo(i)) {
                System.out.print(estados[i] + " ");
            }
        }
    }
}