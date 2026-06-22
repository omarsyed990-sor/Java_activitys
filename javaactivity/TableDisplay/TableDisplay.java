import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class TableDisplay extends JFrame {

    public TableDisplay() {

        setTitle("Table Display");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<String[]> rows = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Table.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                rows.add(line.split(","));
            }

            br.close();

        } catch (Exception e) {
            System.out.println("File Error");
        }

        int rowCount = rows.size();
        int colCount = rows.get(0).length;

        setLayout(new GridLayout(rowCount, colCount));

        for (String[] row : rows) {
            for (String data : row) {

                JLabel label = new JLabel(data, JLabel.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                add(label);
            }
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new TableDisplay();
    }
}