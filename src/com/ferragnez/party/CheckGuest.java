package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
				"Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei",
				"Martina Maccherone", "Rachel Zeilic"};
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Inserisci il tuo nome:");
			String nomeUtente = scan.nextLine();
		}

	}
}