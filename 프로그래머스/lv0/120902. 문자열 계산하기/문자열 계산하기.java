import java.util.ArrayList;

class Solution {
    public int solution(String my_string) {
        int len = my_string.length();
        char[] myChar = my_string.toCharArray();
        
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Character> operatorList = new ArrayList<>();
        
        int tempNum = 0;
        for (int i = 0; i < len; i++) {
            if (myChar[i] >= '0' && myChar[i] <= '9') {
                tempNum = tempNum * 10 + (myChar[i] - '0');
            } else if (myChar[i] == '+' || myChar[i] == '-') {
                numList.add(tempNum);
                operatorList.add(myChar[i]);
                tempNum = 0;
            }
        }
        numList.add(tempNum);
        
        int result = numList.get(0);
        for (int i = 0; i < operatorList.size(); i++) {
            if (operatorList.get(i) == '+') {
                result = result + numList.get(i + 1);
            } else if (operatorList.get(i) == '-') {
                result = result - numList.get(i + 1);
            }
        }
        return result;
    }
}

