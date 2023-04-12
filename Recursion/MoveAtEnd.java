public class MoveAtEnd {
    public static void main(String[] args) {
        moveAllXToEnd("abxxabxc", "", 0, 0);
    }

    static void moveAllXToEnd(String s, String ans, int index, int count){
        
        if(index == s.length()-1){
            for(int i=0; i<count; i++){
                ans += 'x';
            }
            System.out.println(ans);
            return;
        }

        char currChar = s.charAt(index);
        
        if(currChar == 'x'){
            moveAllXToEnd(s, ans, index+1, count+1);
        } 
        else{
            ans += currChar;
            moveAllXToEnd(s, ans, index+1, count);
        }
    }
}
