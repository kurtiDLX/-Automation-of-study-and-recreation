package myPack;

public class MainWindow {
    public static void main(String[] args) {
        MyComponents myProgram = new MyComponents();
        myProgram.setSize(400, 300);
        myProgram.setLocation(450, 300);
        myProgram.setDefaultCloseOperation(MyComponents.EXIT_ON_CLOSE);
        myProgram.setVisible(true);
    }
}
