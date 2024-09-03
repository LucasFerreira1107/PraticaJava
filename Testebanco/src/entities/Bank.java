package entities;

public class Bank {
	
	private int numberAccount;
	private double saldoAccount = 0;
	private String nameAccount;
	private static final double TAXA = 5.00;
	
	// Construtor
	public Bank() {
	}
	
	public Bank(int numberAccount, String nameAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
	}
	
	public Bank(int numberAccount, double initialDeposit, String nameAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		depositAccount(initialDeposit);
		
	}
	
	// Metodos get e set
	public String getNameAccount() {
		return nameAccount;
		
	}
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	public double getSaldoAccount() {
		return saldoAccount;
	}
	
	public double getNumberAccount() {
		return numberAccount;
	}
	
	// Funcoes da classe
	public void depositAccount(double value) {
		saldoAccount += value;
	}
	
	public void saqueAccount(double value) {
		saldoAccount -= value + TAXA ;
	}
	
	public String toString() {
		return "Account "
				+ numberAccount
				+ ", Holder: "
				+ nameAccount
				+ ", Balance: $ "
				+ String.format("%.2f", saldoAccount);
	}
	
}
