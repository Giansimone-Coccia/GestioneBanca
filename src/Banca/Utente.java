package Banca;
import java.util.Scanner;
/**
 * Classe utente con tutte le caratteristiche di un normale utente
 * che desidera interfacciarsi con il terminale per eseguire delle
 * operazioni
 * @author gians_ji5genm
 *
 */
public class Utente {
	Scanner input = new Scanner(System.in);
	
	private int id;
	private static int idUltimo = 1000;
	private String utente;
	private String password;
	private String tipoUtente;
	private ContoCorrente primoConto;
	
	/**
	 * Costruttore
	 * @param u Utente
	 * @param type tipo utente(Family o Business)
	 * @param p Password
	 * @param primoSaldo Primo saldo
	 */
	public Utente(String u, String type, String p, double primoSaldo) {
		idUltimo++;
		id = idUltimo;
		utente = u;
		tipoUtente = type;
		password = p;
		primoConto = new ContoCorrente(primoSaldo);

	}
	
	/**
	 * Metodo per il cambio password
	 * @param pwd Password attuale
	 * @param newPwd Nuova password da impostare
	 * @return true se operazione esguita con successo, false altrimenti
	 */
	public boolean cambiaPassword(String pwd, String newPwd) {
		if(password.equals(pwd)) {
			pwd = newPwd;
			this.password = pwd;
			System.out.println("La tua password è stata cambiata con successo");
			return true;
		}
		else {
			System.out.println("Vecchia password errata, il procedimento di cambio password è fallito");
		return false;
		}
	}
	
	/**
	 * Vari metodi get e set
	 * @return primo conto
	 */
	public ContoCorrente getConto() {
		return primoConto;
	}
	/**
	 * 
	 * @return tipo utente
	 */
	public String getTipoUtente() {
		return tipoUtente;
	}
	/**
	 * 
	 * @return utente
	 */
	public String getUtente() {
		return utente;
	}
	/**
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
}
