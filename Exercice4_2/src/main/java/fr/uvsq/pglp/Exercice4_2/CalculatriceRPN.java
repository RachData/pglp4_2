package fr.uvsq.pglp.Exercice4_2;

import java.util.EmptyStackException;

public class CalculatriceRPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		saisirRpn cal = new saisirRpn();
		try {
			cal.reception();
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}catch(EmptyStackException e) {
			
		}
	}

}
