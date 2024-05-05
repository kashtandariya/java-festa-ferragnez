package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		
		//stringa invitati
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
				"Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei",
				"Martina Maccherone", "Rachel Zeilic"};
		
		//chiedi nome utente
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Inserisci il tuo nome:");
			String nomeUtente = scan.nextLine();
		
		//check condizione, se l'utente è nella listaInvitati
		//cicla tutta la lista
		boolean presente = false;
	    for (String invitato : listaInvitati) {
	        if (invitato.equalsIgnoreCase(nomeUtente)) {
	            presente = true;
	            break;
	        }
	    }

	}
}