package pkg1;
class BankAccount1{
	private double balance;
	BankAccount1(double amt){
		this.balance=amt;}
	public void depositAmt(double amt) {
		balance=balance+amt;
		System.out.println(balance);}
	public void withdrawAmt(double amt) {
		if(balance-amt<0) {
			System.out.println("Insufficient Balance");}
		else {
			balance=balance-amt;
			System.out.println(balance);}}}
public class TestBankAccount1 {
	private double balance;
	public static void main(String[] args) {
		BankAccount1 acc1=new BankAccount1(500);
		BankAccount1 acc2=new BankAccount1(5000);
		acc1.depositAmt(200);
		acc1.withdrawAmt(800);
		
		acc2.depositAmt(300);
		acc2.withdrawAmt(900);}}
