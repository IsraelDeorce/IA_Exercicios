package p1_2017.israel;

public class P1_2017 {

	/*
	 * 1) C=Cognitivo; R=Puramente Reativo; A=Ambos
	 * 
	 * a)( C ) 
	 * b)( A ) 
	 * c)( C )
	 * d)( C ) 
	 * e)( A )
	 * f)( C ) 
	 * g)( R ) 
	 * h)( R ) 
	 * i)( C )
	 * j)( R )
	 */

	/*
	 * 2) Sobre Algoritmos, V=Verdadeiro; F=Falso
	 * 
	 * a) (V) O A* pode atingir a solu��o �tima quando a busca � em �rvore e as
	 * fun��es heur�sticas usadas por ele s�o admissiveis. 
	 * 
	 * b) (V) Algoritmos de busca com informa��o s�o recomendados quando o espa�o
	 *  de busca � muito grande. 
	 *  
	 * c) (F) O Hill Climbing constroi uma �rvore de busca para encontrar a
	 * solu��o, escolhendo em amplitude o melhor estado sucessor. 
	 * 
	 * d) (V) O Simulated Anneling, diferente do Hill Climbing, possui um mecanismo
	 * de perturba��o da solu��o que procura evitar m�ximos (ou m�nimos) locais. 
	 * 
	 * e) (F) O algoritmo gen�tico escolhe o estado vizinho sucessor aleatoriamente.
	 */
	
	/*
	 * 3) Problema dos casais
	 * ---
	 * Eu escolheria fazer o algoritmo com o Gen�tico. Representando os �ndices dos
	 * cromossomos (arrays de genes/inteiros) como mulheres, e cada gene bin�rio
	 * como identificador dos homens, � possivel criar cromossomos de diferentes
	 * combina��es e aptid�es. Essa aptid�o poderia ser uma fun��o que calcula o
	 * n�vel de felicidade m�dio do pareamento dos homens e mulheres. 
	 * 
	 * Fazendo assim, e passando pela sele��o, reprodu��o, e muta��o, para garantir
	 * que haver�o diferentes popula��es com n�meros cada vez melhores de aptid�o,
	 * � possivel atingir uma solu��o boa ou �tima por converg�ncia, ou seja, aquela
	 * que apresenta a maior m�dia de felicidade/aptid�o. 	 * 
	 * ----------------------------------------------------------------------------	 * 
	 * Tamb�m seria possivel via Simulated annealing, da mesma forma que o Gen�tico,
	 * haveria uma fun��o heur�stica que calcularia o �ndice de felicidade do estado,
	 * ele ent�o moveria-se para um estado superior que gerasse maior felicidade
	 * (alterando um casal que resultasse em maior ponto). Para evitar problemas de 
	 * m�ximo local, o simulated annealing implementaria uma chance pequena de um
	 * estado pr�ximo piorar o estado atual. Chance essa que diminui a cada vez que
	 * ela acontece, e futuramente convergindo para um prov�vel m�ximo global. 
	 * ---
	 * 
	 * 4)
	 * 		D)
	 * 
	 * 5) 
	 * Elitismo: O elitismo passa o melhor indiv�duo da popula��o atual direto para 
	 * a intermedi�ria. � utilizado para evitar a perda do melhor indiv�duo at� o
	 * momento buscando melhorar a pontua��o da pr�xima popula��o.
	 * 
	 * Torneio: Seleciona dois indiv�duos de forma rand�mica, e escolhe o melhor
	 * para ser o pai. Repete a opera��o selecionando a m�e. Tendo o indiv�duo
	 * pai e m�e selecionados, estes podem ser utilizados para reproduzir filhos,
	 * executando crossover, que integrar�o a popula��o.
	 * 
	 * 6)
	 * A��o: Empurrar(X,Y)
	 * Pre.Cond: Em(Macaco, X), Em(Caixa, X), Altura(Caixa, Baixa), Altura(Macaco, Baixo)
//	 * Pos.Cond: Em(Macaco, Y), Em(Caixa, Y), �Em(Macaco, X), �Em(Caixa, X)
	 */
	public static void main(String[] args) {

	}

}
