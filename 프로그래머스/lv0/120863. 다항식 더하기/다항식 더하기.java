class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int constantTerm = 0; 
        int xTerm = 0;

        for (String term : terms) {
            if (term.contains("x")) { 
                term = term.replace("x", ""); 
                if (term.isEmpty()) { 
                    xTerm += 1;
                } else { 
                    xTerm += Integer.parseInt(term);
                }
            } else { 
                constantTerm += Integer.parseInt(term);
            }
        }

        String result = "";
        if (xTerm > 0) {
            result += (xTerm > 1) ? xTerm + "x" : "x"; 
        }
        if (constantTerm > 0) {
            result += (result.isEmpty()) ? constantTerm : " + " + constantTerm; 
        }

        return result;
    }
}
