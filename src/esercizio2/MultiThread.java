package esercizio2;

public class MultiThread extends Thread {
	Calcolo calcolo;

	MultiThread(String tn, Calcolo x) {
		this.setName(tn);
		this.calcolo = x;
	}

	@Override
	public void run() {
		Calcolo.contaParte(getName());
	}

}
