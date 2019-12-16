import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Colorear {

	public static void main(String[] args) {

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("monster.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (img == null) {
			System.out.println("Not read");
		} else {
			System.out.println(img.getHeight());
			System.out.println(img.getWidth());

			int[][] result = new int[img.getHeight()][img.getWidth()];

			for (int row = 0; row < img.getHeight(); row++) {
				for (int col = 0; col < img.getWidth(); col++) {
					result[row][col] = img.getRGB(col, row);
				}
			}
			// TODO Auto-generated method stub

		}
	}

}