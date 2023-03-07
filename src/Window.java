import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    // Attri
    int rows = 3;
    int cols = 3;
    final int SIZE = 700;
    // Const
    public Window(){
        this.setTitle("Grids");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(SIZE, SIZE+20));
        this.setResizable(false);

        JPanel multi = new JPanel();
        LayoutManager layout = new GridLayout(rows, cols);
        multi.setLayout(layout);

        // Window content
        for (int i = 0; i<9; i++){
            multi.add(new Panel());
        }


        this.getContentPane().add(multi);

        this.pack();
        this.setVisible(true);
    }

    // Meths
    // G/Set
}
