package probelm_java;



import java.util.StringTokenizer;
public class EtcProblems {
	public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", ",=");
        int temp=0;
        while (st.hasMoreTokens()) {
        	String a = st.nextToken();
        	System.out.println(a);
        	try{

               temp += Integer.parseInt(a) ;

            }catch(Exception e){
            }

        }
        System.out.println(temp);
            
    }
}