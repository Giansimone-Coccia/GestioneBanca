package Banca;
import java.util.Scanner;
/**
 * Classe contocorrente
 * @author gians_ji5genm
 *
 */
public class ContoCorrente {
	Scanner input = new Scanner(System.in);

	private double saldo;
	private int idConto;
	private static int idUltimoConto = 1000;

	public static double tasso = 0.10;
	private static double tassoFamily = 0.12;
	private static double tassoBusiness = 0.15;
	
	/**
	 * Costruttore 
	 * @param primoSaldo Saldo iniziale
	 */
	ContoCorrente(double primoSaldo) {
		saldo = primoSaldo;
		idUltimoConto++;
		idConto = idUltimoConto;
	}
	
	/**
	 * Metodo per versare una certa somma nel conto corrente
	 * @param versamento Somma da versare
	 */
	public void versa(double versamento) {
		saldo += versamento ;
		System.out.println(" Versati: " + versamento + "euro");
	}
	
	/**
	 * Metodo per prelevare dal conto corrente
	 * @param prelievo Somma da prelevare
	 * @return true se operazione andata a buon fine, false altrimenti
	 */
	public boolean preleva(double prelievo) {
		if ( saldo < prelievo ) 
			return false ;
		else {
			saldo -= prelievo;
			System.out.println("Prelevati: " + prelievo + "euro");
			return true ;
		}
	}
	
	/**
	 * Vari metodi get e set
	 * @return saldo
	 */
	public double getSaldo () {
		return saldo ;
	}
	/**
	 * 
	 * @return idConto
	 */
	public double getNumero() {
		return idConto;
	}
	
	/**
	 * Metodo per il calcolo degli interessi
	 * @param cliente
	 */
	public void maturaInteressi(String cliente) {
		if(cliente.equals("family") || cliente.equals("Family"))
			saldo += saldo*tassoFamily;
		else if(cliente.equals("business") || cliente.equals("Business"))
			saldo += saldo*tassoBusiness;
	}
	/**
	 * 
	 * @param tF tasso family
	 */
	public void setTassoFamily(double tF) {
		tassoFamily = tF;		
	}
	/**
	 * 
	 * @param tB tasso business
	 */
	public void setTassoBusiness(double tB) {
		tassoBusiness = tB;		
	}

}
