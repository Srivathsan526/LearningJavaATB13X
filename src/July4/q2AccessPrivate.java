package July4;

public class q2AccessPrivate {
    public static void main(String[] args) {
        hnbBank h1 = new hnbBank("Amit", 345345);
        System.out.println("Current balance is " + h1.getBal());
        h1.setBal(454343, true);
        System.out.println("Updated balance  is " + h1.getBal());
        h1.setBal(1231, false);
        System.out.println("Updated balance  is " +h1.getBal());

    }
}

class hnbBank{


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public long getBal() {
        return bal;
    }


    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin == true) {
            this.bal = bal;
        } else {
            System.out.println("You cannot update the balance. Please reach out to the reception. Thanks.");

        }
    }

    private String UserName;
    private long bal;
    hnbBank(String UserName, long bal){
        this.UserName = UserName;
        this.bal = bal;

    }
}
