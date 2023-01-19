package esercizio1;

public class Esercizio1 {

	public static void main(String[] args) {

		Schiavo conteggio = new Schiavo();
		ThreadList t1 = new ThreadList("*", conteggio);
		ThreadList t2 = new ThreadList("#", conteggio);
		
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();

	}

}

class Schiavo {
	static int conteggio = 1;

	synchronized public static void conta(String nome) {

		for (int j = 0; j < 10; j++) {
			conteggio++;
			System.out.println((1 + j) + ") Thread: " + nome);
		}
		System.out.println("---------------");
	}
}

class ThreadList extends Thread {
	Schiavo cose;

	ThreadList(String tn, Schiavo x) {
		this.setName(tn);
		this.cose = x;
	}

	@Override
	public void run() {
		Schiavo.conta(getName());
	}

}
/* L'esercizio #1 è mirato ad acquisire dimesitchezza con la programmazione
 * multithread e alla manipolazione dei files in Java. Esercizio #1 Creare
 * un'applicazione con due thread figli. Ciascuno dei due thread ha associato un
 * simbolo (ad es. * o #). Fare in modo che ciascun thread stampi su console il
 * proprio simbolo per 10 volte, attendendo 1 secondo tra una stampa e l'altra.*/