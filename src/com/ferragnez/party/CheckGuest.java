package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		
		//stringa listaInvitati
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
				"Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei",
				"Martina Maccherone", "Rachel Zeilic"};
		
		//chiedi all'utente il proprio nome utilizzando lo Scanner input
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Inserisci il tuo nome:");
			String nomeUtente = scan.nextLine();
			
		/*crea condizione per capire se l'utente è invitato o meno, ciclando con il ciclo
		for ogni nome*/
		boolean presente = false;
	    for (String invitato : listaInvitati) {
	    if (invitato.equalsIgnoreCase(nomeUtente)) {
			presente = true;
			break;
			}
		}
	    
	    // Stampa il risultato controllando con le condizionali la condizione di presenza
		if (presente) {
		System.out.println("Benvenuto alla festa!");
		} else {
		System.out.println("Mi dispiace, non sei nella lista degli invitati.");
		}
		
	}
		
  }
}
