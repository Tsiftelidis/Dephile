package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Coin_Bronze extends Entity
{
	GamePanel gp;

	public OBJ_Coin_Bronze(GamePanel gp)
	{
		super( gp );
		this.gp = gp;

		name = "Bronze Coin";
		type = type_pickupOnly;
		value = 1;
		down1 = setup( "/objects/coin_bronze", gp.getTileSize(), gp.getTileSize() );
	}

	@Override
	public boolean use(Entity entity)
	{
		gp.playSE( 3 );
		gp.ui.addMessage( "Coin +" + value );
		gp.player.coin += value;
		return true;
	}
}