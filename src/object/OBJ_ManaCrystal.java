package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_ManaCrystal extends Entity
{
	GamePanel gp;

	public OBJ_ManaCrystal(GamePanel gp)
	{
		super( gp );
		this.gp = gp;

		type = type_pickupOnly;
		name = "Mana Crystal";
		value = 1;
		image = setup( "/objects/manacrystal_full", gp.getTileSize(), gp.getTileSize() );
		down1 = image;
		image2 = setup( "/objects/manacrystal_blank", gp.getTileSize(), gp.getTileSize() );
	}

	public boolean use(Entity entity)
	{
		gp.playSE( 3 );
		gp.ui.addMessage( "Mana +" + value );
		entity.mana += value;
		return true;
	}
}