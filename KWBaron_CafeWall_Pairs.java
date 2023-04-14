/*
Kevin Baron
11/2/12
Cafe Wall*/
import java.awt.*;
public class KWBaron_CafeWall_Pairs {
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
	public static void row(Graphics g, int x0, int y0, int numberOfPairs, int boxSize) {
		for (int pair = 0; pair < numberOfPairs; pair++) {
			int pairX = x0 + pair * 2 * boxSize;
			g.setColor(Color.BLACK);
			g.fillRect(pairX, y0, boxSize, boxSize);
			g.setColor(Color.BLUE);
			g.drawLine(pairX, y0, pairX + boxSize, y0 + boxSize);
			g.drawLine(pairX, y0 + boxSize, pairX + boxSize, y0);
			g.setColor(Color.WHITE);
			g.fillRect(pairX + boxSize, y0, boxSize, boxSize);
		}//eofor
		g.setColor(Color.BLACK);
		g.drawRect(x0, y0, numberOfPairs * 2 * boxSize, boxSize);
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