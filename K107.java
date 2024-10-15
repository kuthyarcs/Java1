public class K107 {
    public static void main(String[] args){
        String usn1="4MW23CS";
        String usn2="";
        String usn="";
        for(int i=1;i<66;i++){
            usn2=String.format("%03d",i);
            usn=usn1+usn2;
            System.out.println(usn);
        }
    }
}
