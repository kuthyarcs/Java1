class BankAccount{
  private double balance;
  private double minbalance;
  BankAccount(double amount){
    this.balance=amount;}
  public void depositAmt(double amt,String income){
    balance=balance+amt;
    System.out.println(balance);}
  public void withdrawAmt(double amt, String expense){
    if(balance-amt<0){
    System.out.println("Insufficient balance");}
    else{
      balance=balance-amt;
      System.out.println(balance);}}
  public void penalty(){
    if (balance<500){
      double penalty=100.00;
      balance=balance-penalty;}}
  public void interest(){
    balance=balance+(balance*(1/12)*(5/100));}
  public void getBalance(){
    System.out.println("Balance is: " +balance);}}
      
public class K83{
  public static void main(String[] args){
    BankAccount acc1=new BankAccount(500);
    acc1.getBalance();
    acc1.depositAmt(12000, "Salary");
    acc1.withdrawAmt(5000, "House Rent");
    acc1.withdrawAmt(2000, "Grocery");
    acc1.withdrawAmt(1000, "Milk");
    acc1.withdrawAmt(4100, "Gift");
    acc1.penalty();
    acc1.interest();
    acc1.getBalance();}}  




