package org.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
        // フレームタイトルを指定したフレームの生成
        JFrame frame = new JFrame("Proman");
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.validate();
		
		// 上に入力エリアをつける
		var t = new JTextField();
		frame.add("North",t);
		frame.validate();
		t.setText("Hello");
		System.out.println(t.getText());
		
		// 下に入力エリアをつける
		var t2 = new JTextField();
		frame.add("South",t2);
		frame.validate();
		t2.setText("Good Night");
		
		// ボタンをつける
		var b=new JButton("Upper");
		frame.add("Center",b);
		frame.validate();
		b.addActionListener(ae->t.setText(t2.getText().toUpperCase()));
		
		
	}

}
