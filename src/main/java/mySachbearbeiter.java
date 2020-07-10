import java.io.Serializable;


public class mySachbearbeiter{
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String bday;
        private Boolean adminState;

        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public String getBday() { return bday; }
        public void setBday(String bday) { this.bday = bday; }
        public Boolean getAdminState() { return adminState; }
        public void setAdminState(Boolean adminState) { this.adminState = adminState; }



        public mySachbearbeiter(String username, String password, String firstName, String lastName, String bday, Boolean adminState){
            this.username=username;
            this.password=password;
            this.firstName=firstName;
            this.lastName=lastName;
            this.bday=bday;
            this.adminState=adminState;
        }




}
