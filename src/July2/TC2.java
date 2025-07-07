package July2;

import java.sql.SQLOutput;

public class TC2 extends Common{
    public static void main(String[] args) {
        System.out.println("Testcase 2");
        TC2 t2 = new TC2();
        t2.startBrowser();
        t2.closeBrowser();
        t2.outputReport();
        System.out.println();
        Common t3 = new TC2();
        System.out.println("Testcase 3");
        t3.startBrowser();


    }
}
