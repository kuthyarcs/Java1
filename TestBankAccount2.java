package pkg1;
class BankAccount2{
	private double balance;
	private double minbalance;
	BankAccount2(double amt){
		this.balance=amt;}
	public void depositAmt(double amt, String income) {
		balance=balance+amt;
		System.out.println(balance);}
	public void withdrawAmt(double amt, String expense) {
		if(balance-amt<0) {
			System.out.println("Insufficient Balance");}
		else {
			balance=balance-amt;
			System.out.println(balance);}}
	public void getPenalty() {
		if(balance<500) {
			double penalty=100.00;
			balance=balance-penalty;}}
	public void getInterest() {
		double time=1.00/12.00;
		double rate=5.00/100.00;
		double interest=balance*time*rate;
		balance=balance+interest;}
	public void getBalance() {
		System.out.println("Balance is: "+ balance);}}
public class TestBankAccount2 {
	private double balance;
	public static void main(String[] args) {
		BankAccount2 acc1=new BankAccount2(500);
		acc1.depositAmt(12000,"Salary");
		acc1.withdrawAmt(5000,"HouseRent");
		acc1.withdrawAmt(2000,"Grocery");
		acc1.withdrawAmt(1000,"Milk");
		acc1.withdrawAmt(4100,"Gift");
		acc1.getPenalty();
		acc1.getInterest();
		acc1.getBalance();}}
		
