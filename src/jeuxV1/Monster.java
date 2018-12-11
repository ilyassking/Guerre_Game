package jeuxV1;

import java.io.FileInputStream;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Monster extends GraphicObject{
		
	public Monster(Zone zone){
		
		Image image=null;
		try {
			image = new Image(new FileInputStream("photosJeu/monster.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		corps=new ImageView(image);
		((ImageView)corps).setX(0);
		((ImageView)corps).setY(0);
		
		//doit appartenir zone
		double x=zone.getX1()+(zone.getX2()-zone.getX1())*Math.random();
		double y=zone.getY1()+(zone.getY2()-zone.getY1())*Math.random();
		corps.setTranslateX(x);
		corps.setTranslateY(y);
		
	}

}
