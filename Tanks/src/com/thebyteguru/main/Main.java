package com.thebyteguru.main;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import com.thebyteguru.display.Display;

public class Main {

	public static void main(String[] args) {

		Display.create(800, 600, "Tanks");

		Timer t = new Timer(1000 / 60, new AbstractAction() {

			public void actionPerformed(ActionEvent e) {
				Display.render();
			}

		});

		t.setRepeats(true);
		t.start();

	}
}
