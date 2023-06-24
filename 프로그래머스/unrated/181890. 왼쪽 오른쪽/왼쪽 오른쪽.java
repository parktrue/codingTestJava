class Solution {
    public String[] solution(String[] str_list) {
        int len = str_list.length;
        int indexL = -1, indexR = -1;

        for (int i = 0; i < len; i++) {
            if (str_list[i].equals("l") && indexL == -1) {
                indexL = i;
            } else if (str_list[i].equals("r") && indexR == -1) {
                indexR = i;
            }
            if (indexL != -1 || indexR != -1) {
                break;
            }
        }

        if (indexL == -1 && indexR == -1) {
            return new String[] {};
        }
        
        if ((indexR != -1 && (indexR < indexL || indexL == -1))) {
            String[] answer = new String[len - indexR - 1];
            System.arraycopy(str_list, indexR + 1, answer, 0, len - indexR - 1);
            return answer;
        } else if (indexL != -1) {
            String[] answer = new String[indexL];
            System.arraycopy(str_list, 0, answer, 0, indexL);
            return answer;
        }
        
        return new String[] {};
    }
}