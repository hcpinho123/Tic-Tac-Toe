import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.geom.Line2D;


//Henrique Pinho and Gabriel Rodrigues


@SuppressWarnings("serial")
class TicTacToePanel extends GamePanel {

	public TicTacToePanel() {
		super(600, 600); 
	}

	public int colun = 0;
	public int colun_1 = 0;
	public int colun_2 = 0;
	public int colun_3 = 0;
	public int colun_4 = 0;
	public int colun_5 = 0;
	public int colun_6 = 0;
	public int colun_7 = 0;
	public int colun_8 = 0;

	public boolean player_x = false;
	public boolean gamewon = false;
	public int victory_x = 0;
	public int victory_O = 0;

	@Override
	public void handleMouseRelease(int x, int y) {
		System.out.println("Mouse pressed at (" + x + ", " + y + ")");
		// primeiro bloco em cima esquerda
		if (gamewon == false) {
			if (colun == 0) {
				if (x > 0 && x < 200 && y > 0 && y < 200 && player_x == false) {
					colun = 1;
					player_x = true;
				}

				else if (x > 0 && x < 200 && y > 0 && y < 200 && player_x == true) {
					colun = 2;
					player_x = false;
				}
			}

			// esquerda bloco do meio
			if (colun_1 == 0) {
				if (x < 200 && y > 200 && y < 400 && player_x == false) {
					colun_1 = 1;
					player_x = true;

				}

				else if (x < 200 && y > 200 && y < 400 && player_x == true) {
					colun_1 = 2;
					player_x = false;

				}
			}

			// esquerda de baixo inferior
			if (colun_2 == 0) {
				if (x < 200 && y > 400 && y < 600 && player_x == false) {
					colun_2 = 1;
					player_x = true;

				}

				else if (x < 200 && y > 400 && y < 600 && player_x == true) {
					colun_2 = 2;
					player_x = false;

				}
			}

			if (colun_3 == 0) {
				// em cima meio
				if (x > 200 && x < 400 && y < 200 && player_x == false) {
					colun_3 = 1;
					player_x = true;
				}

				else if (x > 200 && x < 400 && y < 200 && player_x == true) {
					colun_3 = 2;
					player_x = false;
				}
			}

			// meio do meio
			if (colun_4 == 0) {
				if (x > 200 && x < 400 && y > 200 && y < 400 && player_x == false) {
					colun_4 = 1;
					player_x = true;
				}

				else if (x > 200 && x < 400 && y > 200 && y < 400 && player_x == true) {
					colun_4 = 2;
					player_x = false;
				}
			}

			if (colun_5 == 0) {
				// meio inferior
				if (x > 200 && x < 400 && y > 400 && y < 600 && player_x == false) {
					colun_5 = 1;
					player_x = true;
				}

				else if (x > 200 && x < 400 && y > 400 && y < 600 && player_x == true) {
					colun_5 = 2;
					player_x = false;
				}
			}

			if (colun_6 == 0) {
				// direita em cima
				if (x > 400 && x < 600 && y < 200 && player_x == false) {
					colun_6 = 1;
					player_x = true;
				}

				else if (x > 400 && x < 600 && y < 200 && player_x == true) {
					colun_6 = 2;
					player_x = false;
				}
			}

			if (colun_7 == 0) {
				// direita no meio
				if (x > 400 && x < 600 && y > 200 && y < 400 && player_x == false) {
					colun_7 = 1;
					player_x = true;
				}

				else if (x > 400 && x < 600 && y > 200 && y < 400 && player_x == true) {
					colun_7 = 2;
					player_x = false;
				}
			}

			if (colun_8 == 0) {
				// direita em baixo
				if (x > 400 && x < 600 && y > 400 && y < 600 && player_x == false) {
					colun_8 = 1;
					player_x = true;
				}

				else if (x > 400 && x < 600 && y > 400 && y < 600 && player_x == true) {
					colun_8 = 2;
					player_x = false;
				}
			}

			// check for win *******
			// vitoria do x na primeira vertical
			if (colun == 1 && colun_1 == 1 && colun_2 == 1) {
				victory_x = 1;
				gamewon = true;
			}
			// vitoria do O na primeira vertical
			if (colun == 2 && colun_1 == 2 && colun_2 == 2) {
				victory_O = 1;
				gamewon = true;
			}

			// vitoria do x na segunda vertical
			if (colun_3 == 1 && colun_4 == 1 && colun_5 == 1) {
				victory_x = 2;
				gamewon = true;
			}
			// vitoria do O na segunda vertical
			if (colun_3 == 2 && colun_4 == 2 && colun_5 == 2) {
				victory_O = 2;
				gamewon = true;
			}

			// vitoria do x na terceira vertical
			if (colun_6 == 1 && colun_7 == 1 && colun_8 == 1) {
				victory_x = 3;
				gamewon = true;
			}
			// vitoria do O na terceira vertical
			if (colun_6 == 2 && colun_7 == 2 && colun_8 == 2) {
				victory_O = 3;
				gamewon = true;
			}
			// vitoria do x na primeira horizontal
			if (colun == 1 && colun_3 == 1 && colun_6 == 1) {
				victory_x = 4;
				gamewon = true;
			}
			// vitoria do O na primeira horizontal
			if (colun == 2 && colun_3 == 2 && colun_6 == 2) {
				victory_O = 4;
				gamewon = true;
			}

			// vitoria do x na segunda vertical
			if (colun_1 == 1 && colun_4 == 1 && colun_7 == 1) {
				victory_x = 5;
				gamewon = true;
			}
			// vitoria do O na segunda vertical
			if (colun_1 == 2 && colun_4 == 2 && colun_7 == 2) {
				victory_O = 5;
				gamewon = true;
			}

			// vitoria do x na terceira vertical
			if (colun_2 == 1 && colun_5 == 1 && colun_8 == 1) {
				victory_x = 6;
				gamewon = true;
			}
			// vitoria do O na terceira vertical
			if (colun_2 == 2 && colun_5 == 2 && colun_8 == 2) {
				victory_O = 6;
				gamewon = true;
			}

			// vitoria do x na vertical \
			if (colun == 1 && colun_4 == 1 && colun_8 == 1) {
				victory_x = 7;
				gamewon = true;
			}
			// vitoria do O na vertcial \
			if (colun == 2 && colun_4 == 2 && colun_8 == 2) {
				victory_O = 7;
				gamewon = true;
			}

			// vitoria do x na vertical /
			if (colun_2 == 1 && colun_4 == 1 && colun_6 == 1) {
				victory_x = 8;
				gamewon = true;
			}
			// vitoria do O na vertical /
			if (colun_2 == 2 && colun_4 == 2 && colun_6 == 2) {
				victory_O = 8;
				gamewon = true;
			}
		}
	}

	// Create the lines of the game
	@Override
	public void repaintPanel(Graphics g) {

		setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		g.drawLine(200, 0, 200, 600); // vertical lines
		g.drawLine(400, 0, 400, 600);
		g.drawLine(0, 200, 600, 200); // horizontal lines
		g.drawLine(0, 400, 600, 400);

		if (colun == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(20, 20, 180, 180);
			g.drawLine(20, 180, 180, 20);
		}

		if (colun == 2) {
			g.setColor(Color.RED);
			g.drawOval(17, 20, 160, 160);
		}

		if (colun_1 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(20, 220, 180, 380);
			g.drawLine(20, 380, 180, 220);
		}

		if (colun_1 == 2) {
			g.setColor(Color.RED);
			g.drawOval(17, 220, 160, 160);
		}

		if (colun_2 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(20, 420, 180, 580);
			g.drawLine(20, 580, 180, 420);
		}

		if (colun_2 == 2) {
			g.setColor(Color.RED);
			g.drawOval(17, 420, 160, 160);
		}

		if (colun_3 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(220, 20, 380, 180);
			g.drawLine(220, 180, 380, 20);
		}

		if (colun_3 == 2) {
			g.setColor(Color.RED);
			g.drawOval(217, 20, 160, 160);
		}

		if (colun_4 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(220, 220, 380, 380);
			g.drawLine(220, 380, 380, 220);
		}

		if (colun_4 == 2) {
			g.setColor(Color.RED);
			g.drawOval(217, 220, 160, 160);
		}

		if (colun_5 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(220, 420, 380, 580);
			g.drawLine(220, 580, 380, 420);
		}

		if (colun_5 == 2) {
			g.setColor(Color.RED);
			g.drawOval(217, 420, 160, 160);
		}

		if (colun_6 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(420, 20, 580, 180);
			g.drawLine(420, 180, 580, 20);
		}

		if (colun_6 == 2) {
			g.setColor(Color.RED);
			g.drawOval(417, 20, 160, 160);
		}

		if (colun_7 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(420, 220, 580, 380);
			g.drawLine(420, 380, 580, 220);
		}

		if (colun_7 == 2) {
			g.setColor(Color.RED);
			g.drawOval(417, 220, 160, 160);
		}

		if (colun_8 == 1) {
			g.setColor(Color.BLUE);
			g.drawLine(420, 420, 580, 580);
			g.drawLine(420, 580, 580, 420);
		}

		if (colun_8 == 2) {
			g.setColor(Color.RED);
			g.drawOval(417, 420, 160, 160);
		}

		// what needs to be done after victory
		// victory x first vertical
		if (victory_x == 1) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(100, 8, 100, 587);
		}
		// victory O first vertical
		if (victory_O == 1) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(100, 8, 100, 587);
		}

		// victory x second vertical
		if (victory_x == 2) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(300, 8, 300, 587);
		}
		// victory O second vertical
		if (victory_O == 2) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(300, 8, 300, 587);
		}

		// victory x third vertical
		if (victory_x == 3) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(500, 8, 500, 587);
		}
		// victory x third vertical
		if (victory_O == 3) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(500, 8, 500, 587);
		}

		// victory x first horizontal
		if (victory_x == 4) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(4, 100, 596, 100);
		}
		// victory O first horizontal
		if (victory_O == 4) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(4, 100, 596, 100);
		}

		// victory x second horizontal
		if (victory_x == 5) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(4, 300, 596, 300);
		}
		// victory O second horizontal
		if (victory_O == 5) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(4, 300, 596, 300);
		}

		// victory x third horizontal
		if (victory_x == 6) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(4, 500, 596, 500);
		}
		// victory O third horizontal
		if (victory_O == 6) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(4, 500, 596, 500);
		}

		// victory x \
		if (victory_x == 7) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(0, 0, 600, 600);
		}
		// victory O \
		if (victory_O == 7) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(0, 0, 600, 600);
		}

		// victory x \
		if (victory_x == 8) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(0, 600, 600, 0);
		}
		// victory O \
		if (victory_O == 8) {
			Graphics2D g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10));
			g2.setColor(Color.BLACK);
			g2.drawLine(0, 600, 600, 0);
		}

		if (colun != 0 && colun_1 != 0 && colun_2 != 0 && colun_3 != 0 && colun_4 != 0 && colun_5 != 0
				&& colun_6 != 0 && colun_7 != 0 && colun_8 != 0 && victory_x == 0 && victory_O == 0 && 
				gamewon == false) {
			JOptionPane.showMessageDialog(null, "game tied");
			gamewon = true;
		}

	}

}