public class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        if((x1 == true || x2 == true) && (x3 == true || x4 == true)){
             return true; 
         } else {
             return false;
         }
    }
}
//x ∨ y 는 둘중 하나가 true면 true 
//x ∧ y 는 둘다 true여야 true