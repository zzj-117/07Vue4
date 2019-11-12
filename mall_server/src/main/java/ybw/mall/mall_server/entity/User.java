package ybw.mall.mall_server.entity;

public class User {
    private String username;
    private String password;
    public User(){
        this.username = "";
        this.password = "";
    }
    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public boolean equals(Object obj){
        boolean bRet;
        User  u =(User)obj;
        bRet = (u.getUsername().equals(username))&&(u.getPassword().equals(password));
        return bRet;
    }
}
