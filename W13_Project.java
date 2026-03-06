import javax.swing.JOptionPane;
public class W13_Project extends W13_Function {
    static W13_Project P = new W13_Project();
    public static void main(String[] args) {
        int ch;
        ch = P.menu();
        do {
            switch(ch) {
                case 1  : P.InputDataCustomer(); break;
                case 2  : P.ShowProduct(); break;
                case 3  : P.ChooseProductAndPay(); break;
                default : break;
            }ch = P.menu();
        }while(ch!=0);
    }
    public int menu() {
        int ch = Integer.parseInt(JOptionPane.showInputDialog("*******Select Menu*********"
                                                                + "\n1.InputDataCustomer"
                                                                + "\n2.ShowProduct"
                                                                + "\n3.ChooseProductAndPay"
                                                                + "\n0.Exit"));
        return ch;
    }
    
}