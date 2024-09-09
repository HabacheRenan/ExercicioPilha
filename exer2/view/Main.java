package view;
import javax.swing.JOptionPane;
import model.Pilha;

public class Main {

	public static void main(String[] args) {
		
		int[] num1 = { 10, 25, 30, 40};
		int[] num2 = { 15, 28, 60, 34};
		int[] num3 = { 35, 20};
		
		Pilha p1 = new Pilha();
		Pilha p2 = new Pilha();
		Pilha p3 = new Pilha();
		
		for(int i : num1) {
			p1.push(i);
		}
		for(int i : num2) {
			p1.push(i);
		}
		for(int i : num3) {
			p1.push(i);
		}
		
		try {
			exibePilha(p1,p2,p3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void exibePilha(Pilha p1, Pilha p2, Pilha p3) {
		Pilha a1 = new Pilha();
		Pilha a2 = new Pilha();
		
		for(int i = 0; i < 4; i++) {
			
			try {
				a1.push(p1.pop());
				a1.push(p2.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 2; i++) {
			try {
				a1.push(p3.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int tamanho = a1.size();
		for(int i = 0; i < tamanho; i ++) {
			try {
				a2.push(a1.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for(int i = 0; i < 4; i++) {
			try {
				System.out.println(a2.pop());
			}catch(Exception e) {}
		}
	}
}
