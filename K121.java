package pkg1;
interface GPS{
	public void getCoordinates();
}
interface Radio{
	public void startRadio();
	public void stopRadio();
}
class Smartphone implements GPS,Radio{
	public void getCoordinates() {
		double x=12.50;
		double y=74.50;
		System.out.println(x +" "+ y);}
		public void startRadio() {
			System.out.println("Radio is playing");}
		public void stopRadio() {
			System.out.println("Radio has stopped");}}

public class K121 {
	public static void main(String[] args) {
		Smartphone vivo = new Smartphone();
		vivo.getCoordinates();
		vivo.startRadio();
		vivo.stopRadio();}}
