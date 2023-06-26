class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        int dbLen = db.length;
        int idCheck = 0;
        
        for (int i = 0; i < dbLen; i++) {
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                answer = "login";
                break;
                // 로그인 성공 "login" 리턴
            } else if (id_pw[0].equals(db[i][0]) && !id_pw[0].equals(db[i][1])) {
                idCheck++;
                // id가 같은 계정 확인
            }
            
            if (i == dbLen - 1) {
                if (idCheck != 0) {
                    answer = "wrong pw";
                    break;
                    // id는 같지만 pw가 다른 계정이 있다면 "wrong pw" 리턴
                }
                answer = "fail";
                // idCheck 카운트가 증가하지 않고 반복문을 마지막까지 수행했다면 fail리턴
            }
        }
        
        return answer;
    }
}