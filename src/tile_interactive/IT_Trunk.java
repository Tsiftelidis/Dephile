package tile_interactive;

import main.GamePanel;

public class IT_Trunk extends InteractiveTile
{
	GamePanel gp;

	public IT_Trunk(GamePanel gp, int col, int row)
	{
		super( gp, col, row );
		this.gp = gp;
		this.worldX = gp.getTileSize() * col;
		this.worldY = gp.getTileSize() * row;

		name = "Trunk";
		down1 = setup( "/tiles_interactive/trunk", gp.getTileSize(), gp.getTileSize() );

		// Custom solid area so player can walk beside it
		solidArea.x = 0;
		solidArea.y = 0;
		solidArea.width = 0;
		solidArea.height = 0;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
	}
}