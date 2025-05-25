package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame  implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textpan,textaadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;

    String formno;

    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/PI.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,10,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,14));
        l1.setBounds(760,680,600,20);
        add(l1);

        JLabel l2 = new JLabel("ADDITIONAL DETAILS");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Relegion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String relegion [] ={"Hindu","Muslim","Sikh","Christian","Others"};
        comboBox = new JComboBox(relegion);
        comboBox.setBackground(new Color(19,181,230));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category [] ={"General","OBC","SC","ST","Others"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(19,181,230));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income [] ={"Null","<5,00,000","Up to 5,00,000","up to 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(19,181,230));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Qualifications :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,200,30);
        add(l6);

        String Qualifications [] ={"None","Matric","Intermediate","Graduate","Post Graduate","Others"};
        comboBox4 = new JComboBox(Qualifications);
        comboBox4.setBackground(new Color(19,181,230));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,200,30);
        add(l7);

        String Occupation [] ={"salaried","Self-Employed","Bussiness","Student","Others"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(19,181,230));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        textpan =new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,14));
        textpan.setBounds(350,370,320,30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,200,30);
        add(l9);

        textaadhar =new JTextField();
        textaadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textaadhar.setBounds(350,420,320,30);
        add(textaadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,200,30);
        add(l10);

        r1 = new JRadioButton("yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(19,181,230));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(19,181,230));
        r2.setBounds(460,470,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,520,200,30);
        add(l11);

        e1 = new JRadioButton("yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(19,181,230));
        e1.setBounds(350,520,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(19,181,230));
        e2.setBounds(460,520,100,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup.add(e1);
        buttonGroup.add(e2);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,200,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next>>>");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(19, 181, 230));
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel =(String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String qual = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pin = (String) textpan.getText();
        String  aadhar = (String) textaadhar.getText();

        String scitizen = null;
        if((r1.isSelected())){
            scitizen = "yes";
        }else if (r2.isSelected()){
            scitizen = "No";
        }

        String eaccount = null;
        if (e1.isSelected()){
            eaccount = "yes";
        } else if (e2.isSelected()) {
            eaccount = "No";

        }

        try{
            if (textpan.getText().equals("") || textaadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null," * Fill all the fields");
            }else {
                Con c1= new Con();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+qual+"', '"+occ+"', '"+pin+"', '"+aadhar+"', '"+scitizen+"', '"+eaccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);


            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
