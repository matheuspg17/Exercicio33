# Resolução Exercicio33

## Descrição do problema
Escreva um programa em Java que leia um conjunto indeterminado de números inteiros
positivos informados pelo usuário. O programa deverá continuar solicitando valores até
que o usuário indique que deseja encerrar a entrada de dados. Após finalizar a leitura, o
programa deverá apresentar na tela o menor valor, o maior valor, a soma de todos os
valores lidos e a média aritmética dos números informados.

## Como Funciona
1. **Primeira Leitura:** O programa lê o primeiro número fora do laço para testar a condição de parada inicial.
2. **Laço de Repetição (`while`):** O loop executa continuamente contanto que a variável `numero >= 0`:
   - Acumula o valor na variável `soma`.
   - Se for o primeiro número válido (`cont == 1`), define-o como `maiornum` e `menornum`. Nas rodadas seguintes, estruturas `if` atualizam esses limites dinamicamente.
   - Faz o incremento do contador de leituras (`cont++`).
   - Solicita o próximo número antes de reiniciar a checagem do loop.
3. **Validação de Entrada:** Fora do laço, a variável `contnum` calcula quantos valores válidos foram inseridos (`cont - 1`).
4. **Cálculo da Média e Saída:** Se houver valores válidos (`contnum > 0`), calcula a média utilizando um cast explícito para `(double)` e exibe as quatro métricas calculadas. Caso contrário, exibe que nenhum valor foi digitado.