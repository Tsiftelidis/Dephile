package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_PotionBlue extends Entity
{
	GamePanel gp;

	public OBJ_PotionBlue(GamePanel gp)
	{
		super( gp );
		this.gp = gp;

		name = "Blue Potion";
		type = type_consumable;
		value = 5;
		down1 = setup( "/objects/potion_blue", gp.getTileSize(), gp.getTileSize() );
		description = "[" + name + "]\nRestores " + value + "  Mana.";
	}

	@Override
	public boolean use(Entity entity)
	{
		gp.gameState = gp.dialogueState;
		gp.ui.currentDialogue = "You drink the " + name + ".\nYou restore " + value + " HP!";
		entity.mana += value;
		gp.playSE( 3 );
		return true;
	}
}