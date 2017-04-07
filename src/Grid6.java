import java.awt.*;
import javax.swing.*;

public class Grid6 extends JFrame {

 public static void main(String arg[]) {
  new Grid6();
 }

 public Grid6() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(430, 200);
  JLabel facelabel = new JLabel("����");
  JLabel sizelabel = new JLabel("�ֺ�");
  String str[] = GraphicsEnvironment.getLocalGraphicsEnvironment()
    .getAvailableFontFamilyNames();
  JComboBox face = new JComboBox(str);
  
  face.setPreferredSize(new Dimension(200,20)) ;

// ���ô��������ѡ��С��
  JComboBox size = new JComboBox(new String[] { "8", "10", "12", "15",
    "18", "24", "36", "48" });
  int wsize = size.getWidth();
  int hsize = size.getHeight();
  // size.setSize(wsize*2,hsize);
  JCheckBox ch1 = new JCheckBox("Bold");
  JCheckBox ch2 = new JCheckBox("Italic");
  JTextArea area = new JTextArea();
  area.setLineWrap(true);
  area.setBorder(BorderFactory.createEtchedBorder());
  area.setText("��ô��д������Ĵ�С��������");
  GridBagLayout layout = new GridBagLayout();
  GridBagConstraints b = new GridBagConstraints();
  setLayout(layout);
  b.anchor = GridBagConstraints.NORTHWEST;
  b.insets = new Insets(5, 5, 5, 5);
  b.gridx = 0;
  b.gridy = 0;
  add(facelabel, b);

  b.ipadx = 20;
  b.gridx = 1;
  b.gridy = 0;
  add(face, b);

  b.ipadx = 0;
  b.gridx = 0;
  b.gridy = 1;
  add(sizelabel, b);
  b.gridx = 1;
  b.gridy = 1;
  add(size, b);
  b.gridx = 0;
  b.gridy = 2;
  add(ch1, b);
  b.gridx = 0;
  b.gridy = 3;
  add(ch2, b);
  b.gridx = 2;
  b.gridy = 0;
  b.gridwidth = 3;
  b.gridheight = 4;
  b.weighty = 3;
  b.fill = GridBagConstraints.BOTH;
  add(area, b);

  setVisible(true);

 }

}