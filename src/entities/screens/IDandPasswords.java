package entities.screens;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<>();

    public IDandPasswords() {
        loginInfo.put("Raphael", "123");
        loginInfo.put("Beck", "pass");
        loginInfo.put("Maristella", "321");
    }

    public HashMap getLoginInfo() {
        return loginInfo;
    }

}
