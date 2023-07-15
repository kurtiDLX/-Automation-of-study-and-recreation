package myPack;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URI;
import javax.swing.ImageIcon;

public class MyComponents extends JFrame {
    private JLabel textOne;
    private JButton buttonProgramming, buttonRest;
    private JLabel gifAdd;
    public MyComponents(){
        super("AOSAR");
        setLayout(new FlowLayout());
        textOne = new JLabel("Choose:");
        buttonProgramming = new JButton("programming");
        buttonRest = new JButton("rest");
        ImageIcon gitIcon = new ImageIcon("src/myPack/gif.gif");
        gifAdd = new JLabel(gitIcon);
        add(textOne);
        add(buttonProgramming);
        add(buttonRest);
        add(gifAdd);
        buttonProgramming.addActionListener(e -> {
            String ideRun = "F:/IntelliJ IDEA Community Edition 2022.3.2/bin/idea64.exe";
            String ideProjectsFile = "C://Users//Марк//IdeaProjects";
            String spotifyRun = "C:/Users/Марк/AppData/Roaming/Spotify/Spotify.exe";
             try {
               Desktop.getDesktop().browse(new URI("https://github.com/"));
               Desktop.getDesktop().browse(new URI("https://elearn.epam.com/courses/course-v1:RD_CEE+Fundamentals+0922/courseware/845eb83b5db047dc801b6ace9482ebf6/f271092003984b1b937a883662dab207/2?tpa_hint=oa2-prod-elearn-iam"));
               Desktop.getDesktop().browse(new URI("https://login.neurodub.ai/u/login?state=hKFo2SB5aTloV2xCNHJQVmtzc3U0WFE2RVZRMXk0TlNubUZCeaFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIDJkNy1manJfdlFtZWhXbmpwNGsza0JqUHNnT292QXBOo2NpZNkgOVcwRGl2NnAyNGcwWUhnWVMzVUZ5SGltVWZQV1FxRGk"));
               Desktop.getDesktop().browse(new URI("https://www.youtube.com/"));
               Desktop.getDesktop().open(new File(ideRun));
               Desktop.getDesktop().open(new File(ideProjectsFile));
               Desktop.getDesktop().open(new File(spotifyRun));
               System.exit(0);
             }catch (Exception ex){
                 ex.printStackTrace();
             }
        });
    }
}
