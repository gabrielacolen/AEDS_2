# Pesquisa Sequencial
Pesquisa sequencialmente até encontrar a chave procurada e ao final emite a resposta sucesso/fracasso. 
### Análise de Custo
**Melhor caso:** f(n) = 1 (o elemento está no primeira posição)
**Pior caso:** f(n) = n (o elemento está na última posição ou não está no vetor)

*a operação mais relevante é a comparação entre elementos*

# Pesquisa Binária
Aplica o paradigma de divisão e conquista, o que reduz significamente o universo de busca e, consequentemente, o custo da pesquisa. Lembre que o vetor deve estar em ordem. 

1. A chave será comparada com o elemento do meio.
2. Caso não for, será verificado se ela é menor ou maior.
3. Se for menor, o elemento estará na primeira metade do vetor.
4. Se for maior, estará na segunda metade do vetor.

### Análise de Custo
**Melhor caso:** f(n)=1 (o elemento está no meio do vetor)
**Pior caso:** f(n) = 2 (lg n) (o elemento está na última posição de procura ou não está no vetor - teste no if e no else if, por isso a multiplicação por 2)

*a operação mais relevante é a comparação entre elementos*

# Quicksort
Algoritmo de ordenação do tipo divisão e conquista.
O array será dividido em duas partes, os quais serão ordenados independentemente. A parte da esquerda vai ter elementos menores ou iguais ao pivô e a parte da direita vai ter elementos maiores ou igauis o pivô. A escolha do pivô pode ser arbitraria, no caso dos exemplos de AEDS 2, o pivô será o número do meio do vetor.
### Análise de Comparações

**Melhor caso:** C(n) = n (lg n)

O array será dividido sempre pela metade (8 -> 4 4 -> 2 2 2 2 -> 1 1 1 1 1 1 1 1).
Cada linha vai ter n comparações (nesse caso vai ser 8), vezes a quantidade de divisões (ln n, que vai ser igual a 3 em um array com 8 elementos).

**Pior caso:** C(n) = (n^2)

O array será separado em uma unidade por vez (8 -> 1 7 -> 1 1 6 -> 1 1 1 5 -> 1 1 1 1 4 -> 1 1 1 1 1 3 -> 1 1 1 1 1 1 2 -> 1 1 1 1 1 1 1 1 1). A posição do pivô impacta a quantidade de comparações que são feitas.

 
 
 ### Análise de Movimentações
**Melhor caso:** teremos só a movimentação do (i == j), logo teremos 3 movimentações a cada chamada recursiva

**Pior caso:** Ocorre quando o pivô está no meio e os elementos maiores estão a esquerda e os menores a direita (invertidos). Teremos (n/2 swaps -> 3* n/2, lembrando que cada swap tem 3 movimentações).
 
