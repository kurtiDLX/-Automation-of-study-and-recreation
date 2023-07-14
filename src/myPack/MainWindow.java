package myPack;

public class MainWindow {
    public static void main(String[] args) {
        MyComponents myProgram = new MyComponents();
        myProgram.setVisible(true);
        myProgram.setDefaultCloseOperation(MyComponents.EXIT_ON_CLOSE);
        myProgram.setSize(400, 300);
        myProgram.setLocation(450, 300);
    }
}
