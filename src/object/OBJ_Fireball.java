package object;

import entity.Entity;
import entity.Projectile;
import main.GamePanel;

public class OBJ_Fireball extends Projectile
{
	GamePanel gp;

	public OBJ_Fireball(GamePanel gp)
	{
		super( gp );
		this.gp = gp;

		name = "Fireball";
		speed = 8;
		maxLife = 80;
		life = maxLife;
		attack = 2;
		useCost = 1;
		alive = false;
		getImage();
	}

	public void getImage()
	{
		up1 = setup( "/objects/fireball_up_1", gp.getTileSize(), gp.getTileSize() );
		up2 = setup( "/objects/fireball_up_2", gp.getTileSize(), gp.getTileSize() );
		down1 = setup( "/objects/fireball_down_1", gp.getTileSize(), gp.getTileSize() );
		down2 = setup( "/objects/fireball_down_2", gp.getTileSize(), gp.getTileSize() );
		left1 = setup( "/objects/fireball_left_1", gp.getTileSize(), gp.getTileSize() );
		left2 = setup( "/objects/fireball_left_2", gp.getTileSize(), gp.getTileSize() );
		right1 = setup( "/objects/fireball_right_1", gp.getTileSize(), gp.getTileSize() );
		right2 = setup( "/objects/fireball_right_2", gp.getTileSize(), gp.getTileSize() );
	}

	public boolean haveResource(Entity user)
	{
		return user.mana >= useCost;
	}

	public void subtractResource(Entity user)
	{
		user.mana -= useCost;
	}
}