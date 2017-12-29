package designSystems;

public class StringIterator {
    String inputString;
    int currIndex;
    public StringIterator(String compressedString) {
        inputString = compressedString;
        currIndex = 0;
    }
    
    public char next() {
        if(currIndex+1 < inputString.length())
        {
            int count = inputString.charAt(currIndex+1) - '0';
            if(count > 0){
                char res = inputString.charAt(currIndex);
                count--;
                if(count <= 0)
                    currIndex +=2;
                else
                    inputString = inputString.substring(0,currIndex+1)+(char)count+inputString.substring(currIndex+1);
                return res;
            }
            else{
                 currIndex +=2;
                return next();
            }
        }
       
        return ' ';
    }
    
    public boolean hasNext() {
        if(currIndex >= inputString.length())
            return false;
        return true;
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
class StringIteratorSolution {
    String res;
    int ptr = 0, num = 0;
    char ch = ' ';
    public StringIteratorSolution(String s) {
        res = s;
    }
    public char next() {
        if (!hasNext())
            return ' ';
        if (num == 0) {
            ch = res.charAt(ptr++);
            while (ptr < res.length() && Character.isDigit(res.charAt(ptr))) {
                num = num * 10 + res.charAt(ptr++) - '0';
            }
        }
        num--;
        return ch;
    }
    public boolean hasNext() {
        return ptr != res.length() || num != 0;
    }
}
