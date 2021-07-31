package objeto2;

public class Grilo extends Thread {
	
	private String nome;
	
	//Construtor
	public Grilo(String nome) {
		this.nome = nome;
		start();
	}

	public void run() {
		//Log de exibi��o da Thread 
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		//Log de dist�ncia percorrida pelo Grilo
		System.out.println(nome + " pulou " + "10cm");
		
	}
}
