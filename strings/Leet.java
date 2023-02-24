public class Leet{
    public static void main(String[] args) {

        String name = "alex";
        String typed = "aaleex";

        int length = name.length();
        int Length = typed.length();

        int[] freq1 = new int[length];
        int[] freq2 = new int[Length];

        char[] nameArr = name.toCharArray();
        char[] typedArr = typed.toCharArray();

        for(int i=0; i<length; i++){
            freq1[i]=1;
            for(int j=i+1; j<length; j++){
                if(nameArr[i]==nameArr[j]){
                    freq1[i]++;
                    nameArr[j]='0';
                }
            }
        }

        for(int i=0; i<Length; i++){
            freq2[i]=1;
            for(int j=i+1; j<Length; j++){
                if(typedArr[i]==typedArr[j]){
                    freq2[i]++;
                    typedArr[j]='0';
                }
            }
        }

        System.out.println("Frequencies of the characters in the string are as below: "); 
        System.out.println("Characters  frequencies");  

        for(int i = 0; i <freq1.length; i++) 
        {  
            if(nameArr[i]!= ' ' && nameArr[i] != '0')  
                System.out.println(nameArr[i] + "              " + freq1[i]);  
        } 

        for(int i = 0; i <freq2.length; i++) 
        {  
            if(typedArr[i]!= ' ' && typedArr[i] != '0')  
                System.out.println(typedArr[i] + "              " + freq2[i]);  
        }  

        boolean check = true;

        for(int i=0; i<freq1.length; i++){
            if(freq1[i]>freq2[i]){
                check=false;
                break;
            }
        }

        if(check){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}