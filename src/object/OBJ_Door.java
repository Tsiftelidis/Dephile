package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Door extends Entity
{
	GamePanel gp;

	public OBJ_Door(GamePanel gp)
	{
		super( gp );
		this.gp = gp;

		type = type_obstacle;
		name = "Door";
		down1 = setup( "/objects/door", gp.getTileSize(), gp.getTileSize() );
		collision = true;
	}

	public void interact()
	{
		gp.gameState = gp.dialogueState;
		gp.ui.currentDialogue = "You need a key to open this door.";
	}
}