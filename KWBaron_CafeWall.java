/*
Kevin Baron
11/2/12
Cafe Wall*/
import java.awt.*;
public class KWBaron_CafeWall {
	public static final int MORTAR = 2;
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(650, 400);
		Graphics g = panel.getGraphics();
		panel.setBackground(Color.GRAY);
		row(g, 0, 0, 4, 20);
		row(g, 50, 70, 5, 30);
		grid(g, 10, 150, 4, 25, 0);
		grid(g, 250, 200, 3, 25, 10);
		grid(g, 425, 180, 5, 20, 10);
		grid(g, 400, 20, 2, 35, 35);
	}//eomain
	public static void pair(Graphics g, int x, int y, int size) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, size, size);
		g.drawRect(x, y, size, size);
		g.setColor(Color.BLUE);
		g.drawLine(x, y, x + size, y + size);
		g.drawLine(x, y + size, x + size, y);
		g.setColor(Color.WHITE);
		g.fillRect(x + size, y, size, size);
		g.setColor(Color.BLACK);
		g.drawRect(x + size, y, size, size);
	}//eopair
	/*public static void blackBox(Graphics g, int x, int y, int size) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, size, size);
		g.drawRect(x, y, size, size);
		g.setColor(Color.BLUE);
		g.drawLine(x, y, x + size, y + size);
		g.drawLine(x, y + size, x + size, y);
	}//eoblackBox
	public static void whiteBox(Graphics g, int x, int y, int size) {
		g.setColor(Color.WHITE);
		g.fillRect(x, y, size, size);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, size, size);
	}//eowhiteBox*/
	public static void row(Graphics g, int x0, int y0, int numberOfPairs, int boxSize) {
		for (int i = 0; i < numberOfPairs; i++) {
			int pairX = x0 + i * 2 * boxSize;
			pair(g, pairX, y0, boxSize);
			/*int blackBoxX = x0 + (2 * i) * boxSize;
			blackBox(g, blackBoxX, y0, boxSize);
			int whiteBoxX = x0 + (2 * i + 1) * boxSize;
			whiteBox(g, whiteBoxX, y0, boxSize);*/
		}//eofor
	}//eorow
	public static void grid(Graphics g, int x0, int y0, int numberOfPairs, int boxSize, int offset) {
		for (int set = 0; set < numberOfPairs; set++) {
			int yTop = y0 + (2 * set) * (boxSize + MORTAR);
			row(g, x0, yTop, numberOfPairs, boxSize);
			int yBottom = y0 + (2 * set + 1) * (boxSize + MORTAR);
			int xBottom = x0 + offset;
			row(g, xBottom, yBottom, numberOfPairs, boxSize);
		}//eofor
	}//eogrid
}//eoclass