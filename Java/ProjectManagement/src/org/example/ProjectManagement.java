package org.example;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ProjectManagement {
    public static void main(String[] args) {
        // フレームの作成
        JFrame frame = new JFrame("プロジェクト登録");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        // パネルの作成
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        // ラベルとフィールドの作成
        JLabel departmentLabel = new JLabel("事業部/部門*:");
        JComboBox<String> departmentField = new JComboBox<>(new String[]{"部門1", "部門2", "部門3"});
        
        JLabel projectNameLabel = new JLabel("PJ名*:");
        JTextField projectNameField = new JTextField(20);
        
        // プロジェクト名エラーメッセージ
        JLabel projectNameErrorLabel = new JLabel("");  // 空のエラーメッセージラベル
        projectNameErrorLabel.setForeground(Color.RED); // 赤色で表示
        
        JLabel projectTypeLabel = new JLabel("PJ種別*:");
        JComboBox<String> projectTypeField = new JComboBox<>(new String[]{"種別1", "種別2", "種別3"});
        
        JLabel projectClassLabel = new JLabel("PJ分類*:");
        JRadioButton rbS = new JRadioButton("S");
        JRadioButton rbA = new JRadioButton("A");
        JRadioButton rbB = new JRadioButton("B");
        JRadioButton rbC = new JRadioButton("C");
        JRadioButton rbD = new JRadioButton("D");
        ButtonGroup projectClassGroup = new ButtonGroup();
        projectClassGroup.add(rbS);
        projectClassGroup.add(rbA);
        projectClassGroup.add(rbB);
        projectClassGroup.add(rbC);
        projectClassGroup.add(rbD);
        JPanel projectClassPanel = new JPanel();
        projectClassPanel.add(rbS);
        projectClassPanel.add(rbA);
        projectClassPanel.add(rbB);
        projectClassPanel.add(rbC);
        projectClassPanel.add(rbD);
        
        JLabel salesLabel = new JLabel("売上高(千円):");
        JTextField salesField = new JTextField(20);
        
        JLabel customerLabel = new JLabel("顧客*:");
        JTextField customerField = new JTextField(20);
        JButton customerButton = new JButton("選択");
        
        JLabel pmLabel = new JLabel("PM*:");
        JTextField pmField = new JTextField(20);
        
        JLabel plLabel = new JLabel("PL*:");
        JTextField plField = new JTextField(20);
        
        JLabel startDateLabel = new JLabel("開始日*:");
        JTextField startDateField = new JTextField(20);
        
        JLabel endDateLabel = new JLabel("終了日*:");
        JTextField endDateField = new JTextField(20);
        
        JLabel noteLabel = new JLabel("備考:");
        JTextArea noteArea = new JTextArea(3, 20);
        
        JButton submitButton = new JButton("確認");
        
        // GroupLayoutの水平グループを設定
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(departmentLabel)
                    .addComponent(projectNameLabel)
                    .addComponent(projectNameErrorLabel)  // エラーメッセージをここに追加
                    .addComponent(projectTypeLabel)
                    .addComponent(projectClassLabel)
                    .addComponent(salesLabel)
                    .addComponent(customerLabel)
                    .addComponent(pmLabel)
                    .addComponent(plLabel)
                    .addComponent(startDateLabel)
                    .addComponent(endDateLabel)
                    .addComponent(noteLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(departmentField)
                    .addComponent(projectNameField)
                    .addComponent(projectTypeField)
                    .addComponent(projectClassPanel)
                    .addComponent(salesField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customerField)
                        .addComponent(customerButton))
                    .addComponent(pmField)
                    .addComponent(plField)
                    .addComponent(startDateField)
                    .addComponent(endDateField)
                    .addComponent(noteArea)
                    .addComponent(submitButton))
        );
        
        // GroupLayoutの垂直グループを設定
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel)
                    .addComponent(departmentField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(projectNameLabel)
                    .addComponent(projectNameField))
                .addComponent(projectNameErrorLabel)  // エラーメッセージをここに追加
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(projectTypeLabel)
                    .addComponent(projectTypeField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(projectClassLabel)
                    .addComponent(projectClassPanel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(salesLabel)
                    .addComponent(salesField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(customerLabel)
                    .addComponent(customerField)
                    .addComponent(customerButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(pmLabel)
                    .addComponent(pmField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(plLabel)
                    .addComponent(plField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateLabel)
                    .addComponent(startDateField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(endDateLabel)
                    .addComponent(endDateField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(noteLabel)
                    .addComponent(noteArea))
                .addComponent(submitButton)
        );
        
        // ボタンのアクションリスナーを設定
        submitButton.addActionListener(e -> {
            String projectName = projectNameField.getText().trim();
            if (projectName.isEmpty()) {
                projectNameErrorLabel.setText("プロジェクト名を入力してください");
            } else if (projectName.length() > 128) {
                projectNameErrorLabel.setText("128文字以内で入力してください");
            } else {
                projectNameErrorLabel.setText("");  // エラーメッセージをクリア
                // その他の処理（例：フォームの送信など）
            }
        });

        // フレームにパネルを追加して表示
        frame.add(panel);
        frame.setVisible(true);
    }
}
