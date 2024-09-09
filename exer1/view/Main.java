package view;
import javax.swing.JOptionPane;
import model.Pilha;

public class Main {

	public static void main(String[] args) {
		
		int opc = 0;
		
		while(opc == 0) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Exercicio A(1) ou Exercicio B(2)?"));
			
			switch(opc) {
			case 1: execA();
			break;
			case 2: execB();
			}
			
		}
		
	}
		static void execA() {
		Pilha pilha = new Pilha();
		
		for(int i  = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				
				pilha.push(i * i);
			} else {
				if(i < 6) {
					pilha.push(i);
				} else {
					try {
					System.out.println(pilha.pop());
					}catch(Exception e) {}
				}	
			}
			try {
				System.out.println(pilha.pop());
			}catch(Exception e) {}

		}try {
			System.out.println(pilha.pop());
		}catch(Exception e) {}
		
	}
	
	static void execB() {
		Pilha p = new Pilha();
		for (int i = 100; i < 155; i++) {
			if(p.isEmpty()) {
				p.push(i + 100);
			} else {
				if(p.size() <= 4) {
					p.push(i + 50);
				} else {
					try {
						System.out.println(p.pop());
					} catch (Exception e) {}
				}
			}
			try {
				System.out.println(p.top());
			} catch (Exception e) {}
		}
		try {
			System.out.println(p.size());
		} catch (Exception e) {}
	}

}
