import java.time.LocalDateTime;
class BankAccount{
  private double balance;
  BankAccount(double amount){
    this.balance=amount;}
  public void depositAmt(double amt){
    balance=balance+amt;
    System.out.println(balance);}
  public void withdrawAmt(double amt){
    if(balance-amt<0){
    System.out.println("Insufficient balance");}
    else{
      balance=balance-amt;
      System.out.println(balance);}}}
      
class SMS{
  private long senderNumber;
  private long receiverNumber;
  private String message;
  int amount;
  public String sendSMS(long sender, long receiver, int amount){
    this.senderNumber=sender;
    this.receiverNumber=receiver;
    String message1="Dear Customer,you have withdrawn Rs "+amount;
    String message2=" from the ATM at ";
    return (message1+message2);}}
  
public class K84{
  public static void main(String[] args){
    LocalDateTime time1=LocalDateTime.now();
    BankAccount acc1=new BankAccount(500);
    SMS sms1 = new SMS();
    acc1.depositAmt(200);
    int amount1=300;
    acc1.withdrawAmt(amount1); 
    String msg=sms1.sendSMS(9988776655l, 9481851276l, amount1);
    System.out.println(msg+time1);
  }
}  




