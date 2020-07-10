

public class sachbearbeiterK {

    static Sachbearbeiter sb = new Sachbearbeiter();

    public boolean checkPassword(String username, String password){
        int userPosition = sb.ArrayPos(username);

        if(sb.getPassword(userPosition).equals(password) && sb.getUserName(userPosition).equals(username)){
            return true;
        }else{
            return false;
        }

    }


   /* // Change UserData
    public void setUsername(String username){

    }
    public void setFirstname(String username){

    }
    public void setLastname(String username){

    }
    public void setBday(String username){

    }
    public void setPassword(String username){

    }
    public void changeAdmin(String username){

    }
*/


}
