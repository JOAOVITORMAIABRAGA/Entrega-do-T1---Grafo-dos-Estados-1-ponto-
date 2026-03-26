📌 Projeto: Busca em Grafos (DFS e BFS) — Estados do Nordeste
📖 Descrição

Este projeto implementa um grafo não direcionado representando conexões entre estados do Nordeste brasileiro. A partir desse grafo, são aplicados os algoritmos:

DFS (Depth-First Search) — Busca em Profundidade
BFS (Breadth-First Search) — Busca em Largura

O sistema permite:

Encontrar caminhos entre dois estados
Exibir a ordem de visita dos algoritmos
Identificar todos os estados alcançáveis a partir de uma origem
🗺️ Representação do Grafo

Os estados são representados por índices:

Índice	Estado
0	AL
1	BA
2	CE
3	MA
4	PB
5	PE
6	PI
7	RN
8	SE

As conexões entre os estados estão no arquivo:

dados/nordeste.txt
⚙️ Estrutura do Projeto
Main.java → Classe principal (entrada do usuário e execução)
Graph.java → Implementação do grafo (lista de adjacência)
DepthFirstPaths.java → Algoritmo DFS
BreadthFirstPaths.java → Algoritmo BFS
🚀 Como Executar

Certifique-se de que o arquivo nordeste.txt está no caminho:

dados/nordeste.txt

Compile o projeto:

javac Main.java

Execute:

java Main
Informe:
Estado de origem (índice)
Estado de destino (índice)
🔍 Exemplo de Saída
DFS:
Caminho encontrado: [7, 2, 6, 3, 1, 5, 0]
Ordem de visita: [0, 5, 1, 3, 6, 2, 7, 4, 8]

BFS:
Caminho encontrado: [7, 2, 5, 0]
Ordem de visita: [0, 5, 8, 1, 2, 4, 3, 6, 7]

Estados alcançáveis:
AL BA CE MA PB PE PI RN SE
🧠 Conceitos Aplicados
🔹 DFS (Busca em Profundidade)
Explora o grafo indo o mais fundo possível
Não garante o menor caminho
🔹 BFS (Busca em Largura)
Explora o grafo por níveis
Garante o menor caminho em grafos não ponderados
🔹 Grafo Conexo
Todos os estados são alcançáveis entre si
🎥 Vídeo Explicativo

👉
