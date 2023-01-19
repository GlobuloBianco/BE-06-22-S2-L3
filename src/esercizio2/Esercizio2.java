package esercizio2;

public class Esercizio2 {
	
	 public static void main(String[] args) {
		 	Calcolo calcolo = new Calcolo();
		 	calcolo.avvio();
		 	
		 	MultiThread t1 = new MultiThread("Thread #1", calcolo);
		 	MultiThread t2 = new MultiThread("Thread #2", calcolo);
		 	MultiThread t3 = new MultiThread("Thread #3", calcolo);
		 	
		 	t1.start();
		 	t2.start();
		 	t3.start();
	 }
}
/* ﻿

Esercizio #2
Scrivere un programma multithread in Java che dato un array di 3000 valori numerici generati casualmente ne esegue la somma in modo parallelo.Creare 3 thread e assegnare ad ogni thread una partizione dell'array (1000 valori). Ogni thread esegue la somma dei propri valori e mettere il risultato in una struttura dati del thread main contenente i risultati parziali. Il thread main deve sincronizzarsi sulla terminazione (join) dei thread figli dopodiché somma i risultati parziali e li stampa su console. */