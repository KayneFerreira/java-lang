void main() {

    // Listas
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    // Sets
    Set<Integer> hashSet = new HashSet<>();
    Set<Integer> linkedHashSet = new LinkedHashSet<>();
    Set<Integer> treeHashSet = new TreeSet<>();

    // Maps
    Map<Integer, Long> hashMap = new HashMap<>();
    Map<Integer, Long> linkedHashMap = new LinkedHashMap<>();
    Map<Integer, Long> treeMap = new TreeMap<>();

    // Queue / Deque
    Deque<Integer> arrayDeque = new ArrayDeque<>();
    Queue<Integer> priorityQueue = new PriorityQueue<>();

    //
    Map<Integer, Long> concurrentHashMap = new ConcurrentHashMap<>();
    List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    // Legados (legacy)
    Vector<Integer> vector = new Vector<>();    // Substituído por ArrayList
    Hashtable<Integer, Long> hashtable = new Hashtable<>();     // Substituído por HashMap

}

/* **************************************************************************************
 * O(1) - Tempo Constante (Instantâneo):
 * O tempo de execução é fixo e não depende do tamanho da coleção. O acesso é
 * direto e leva o mesmo tempo seja para 10 ou 1 milhão de itens (ex.: acessar um
 * elemento no ArrayList pelo índice).
 *

 *
 * O(log n) - Tempo Logarítmico (Muito Rápido):
 * O tempo cresce de forma muito lenta porque a cada passo da operação metade dos
 * dados restantes é descartada. Permite escalar para grandes volumes com alto
 * desempenho (ex.: busca em árvore no TreeMap).
 *

 *
 * O(n) - Tempo Linear (Proporcional):
 * O tempo de execução cresce na mesma proporção do número de elementos (n). Se
 * a coleção dobrar de tamanho, o tempo gasto para processar também dobrará
 * (ex.: percorrer um LinkedList para achar um item no meio).
 * ****************************************************************************************
 */


/*
 * ArrayList:
 * Guarda os dados de forma contígua em um array dinâmico na memória, acessando elementos
 * diretamente pelo índice. Oferece acesso por índice e inserção/remoção no fim em O(1),
 * mas torna a inserção e a remoção no início ou no meio lentas em O(n) por deslocar os
 * elementos vizinhos. Possui baixo consumo de memória.
 */

/*
 * LinkedList:
 * Armazena os dados espalhados na memória em nós duplamente encadeados, onde cada nó
 * guarda o valor e dois ponteiros. Permite inserções e remoções instantâneas em O(1) no
 * início e no fim, mas o acesso por índice e alterações no meio exigem percorrer a
 * lista em O(n). Consome mais memória devido ao armazenamento dos ponteiros.
 */

/*
 * HashSet / HashMap:
 * Organizam os dados baseando-se no hash code das chaves/elementos, distribuindo-os em
 * uma tabela Hash interna sem garantir nenhuma ordem. Ambos oferecem buscas, inserções
 * e remoções extremamente rápidas com desempenho médio de O(1), possuindo consumo de
 * memória moderado.
 */

/*
 * LinkedHashSet / LinkedHashMap:
 * Funcionam de maneira idêntica aos seus equivalentes Hash, mas mantêm uma lista
 * duplamente encadeada por debaixo dos panos para preservar a ordem de inserção dos
 * itens. O desempenho para busca, inserção e remoção permanece em O(1) na média, porém
 * com consumo de memória ligeiramente maior devido aos ponteiros de ordenação.
 */

/*
 * TreeSet / TreeMap:
 * Armazenam os dados em uma estrutura de árvore rubro-negra (balanceada), mantendo os
 * elementos automaticamente ordenados pelo valor natural ou por um Comparator. Devido
 * à navegação pelos nós da árvore, as operações de busca, inserção e remoção operam
 * com desempenho de O(log n), com consumo de memória moderado a alto.
 */

/*
 * ArrayDeque:
 * Organiza os elementos em um array circular dinâmico, permitindo operação nas duas
 * pontas (fila e pilha). Ele não permite elementos nulos e oferece inserções e
 * remoções no início e no fim em O(1), com consumo de memória baixo e desempenho geral
 * superior ao LinkedList.
 */

/*
 * PriorityQueue:
 * Estrutura os dados como uma árvore do tipo Heap (Min-Heap por padrão) sobre um array
 * dinâmico, organizando os elementos por ordem de prioridade. A inserção e a remoção
 * do elemento de maior prioridade operam em O(log n), enquanto a consulta ao topo é de
 * O(1), com baixo consumo de memória.
 */

/*
 * ConcurrentHashMap:
 * Organiza os dados em uma tabela Hash thread-safe segmentada, permitindo leituras
 * concorrentes sem bloqueio e escritas com locks granulares por bucket. Ele garante o
 * mesmo desempenho de O(1) em média para busca, inserção e remoção em cenários
 * multi-thread, com uso moderado de memória.
 */

/*
 * CopyOnWriteArrayList:
 * Armazena os dados em um array interno que é totalmente recopiado a cada alteração para
 * garantir segurança entre threads. As leituras são instantâneas em O(1) e sem
 * bloqueios, mas as inserções e remoções são muito lentas em O(n) e exigem alto consumo
 * de memória devido à clonagem contínua do array.
 */