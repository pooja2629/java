package variablesAndData;

public class SwitchCase {
    void show() {
        int casenumber = 1;

        switch (casenumber) {
            case 1:
                if (casenumber == 1) {
                    System.out.println("in case 1");
                }
                break;

            case 2:
                System.out.println("in case 2");

                break;

            case 3:

                System.out.println("in case 3");

                break;

            default:
                System.out.println("not available");
        }
    }

    public static void main(String[] args) {
SwitchCase switchcase=new SwitchCase();
switchcase.show();
    }
}
