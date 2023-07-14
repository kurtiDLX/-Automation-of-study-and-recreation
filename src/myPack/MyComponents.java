package myPack;

import javax.swing.*;
import java.awt.*;
import java.net.URI;

public class MyComponents extends JFrame {
    private JLabel textOne;
    private JButton buttonProgramming, buttonVacation;
    public MyComponents(){
        super("AOSAR");
        setLayout(new FlowLayout());
        textOne = new JLabel("Choose:");
        buttonProgramming = new JButton("programming");
        buttonVacation = new JButton("vacation");
        add(textOne);
        add(buttonProgramming);
        add(buttonVacation);
        buttonProgramming.addActionListener(e -> {
             try {
               Desktop.getDesktop().browse(new URI("https://chat.openai.com/"));
               Desktop.getDesktop().browse(new URI("https://github.com/"));
               Desktop.getDesktop().browse(new URI("https://elearn.epam.com/courses/course-v1:RD_CEE+Fundamentals+0922/courseware/845eb83b5db047dc801b6ace9482ebf6/f271092003984b1b937a883662dab207/2?tpa_hint=oa2-prod-elearn-iam"));
               Desktop.getDesktop().browse(new URI("https://login.neurodub.ai/u/login?state=hKFo2SB5aTloV2xCNHJQVmtzc3U0WFE2RVZRMXk0TlNubUZCeaFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIDJkNy1manJfdlFtZWhXbmpwNGsza0JqUHNnT292QXBOo2NpZNkgOVcwRGl2NnAyNGcwWUhnWVMzVUZ5SGltVWZQV1FxRGk"));
               Desktop.getDesktop().browse(new URI("https://www.youtube.com/ "));
             }catch (Exception ex){
                 ex.printStackTrace();
             }
        });
    }
}
