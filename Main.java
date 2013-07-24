import java.io.*;

public class Main {
    public static void main (String[] args) {
        try{
        
            //read parameters
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
            
                //get integer from readline()
                int a = Integer.valueOf(line.trim());
                boolean find=false;
                int count=0;
                while(!find){
                
                    //add two numbers
                    String num = String.valueOf(a);            
                    StringBuilder numbuf = new StringBuilder(String.valueOf(a)) ;            
                    String num2=numbuf.reverse().toString();
                    a=Integer.valueOf(num)+Integer.valueOf(num2);
                    count++;
                    if (isPali(a)){
                        find=true;
                    }
                }
                System.out.println(count+" "+a);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.exit(0);
    }
    
    static boolean isPali(int num){
        char[] number = String.valueOf(num).toCharArray();
        int lt=0;
        int rt=number.length-1;
        
        //check pali from left and right side
        while (lt<rt){
            if(number[lt]==number[rt]){
                lt++;
                rt--;
            } else {
                return false;
            }
        }
        return true;
    }
}
