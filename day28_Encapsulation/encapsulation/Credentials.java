package day28_Encapsulation.encapsulation;

public class Credentials {
    private String userName, password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        if (!isPasswordValid(password)) {
            System.out.println("invalid password :" + password);
            System.exit(1);
        }
        this.password = password;
    }

    private boolean isPasswordValid(String password) {
        if (password.length() >= 8) {
            char[] chars = password.toCharArray();
            int letter = 0;
            int digit = 0;
            int special = 0;
            for (char each : chars) {
                if (each == ' ') return false;
                if (Character.isLetter(each)) letter++;
                if (Character.isDigit(each)) digit++;
                if (!Character.isLetterOrDigit(each)) special++;
            }
            if (letter >= 1 && digit >= 1 && special >= 1) return true;

        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String toString() {
        return "User name: " + getUserName() + " Password: " + getPassword();
    }
}
