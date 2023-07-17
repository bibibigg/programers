class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id_pwstr = id_pw[0] + id_pw[1];
        boolean loggedIn = false;
        
        for (int i = 0; i < db.length; i++) {
            String dbStr = db[i][0] + db[i][1];
            String idStr = db[i][0];
            
            for (int j = 0; j < db[0].length; j++) {
            if (id_pwstr.equals(dbStr)) {
                answer = "login";
                loggedIn = true;
                break;
                
            } else if (idStr.equals(id_pw[0])) {
                answer = "wrong pw";
                loggedIn = true;
                break;
            } 
                }
            
            if (loggedIn) {
                break;
            } else {
                answer = "fail";
            }
            
            }
        return answer;
        
    }
}