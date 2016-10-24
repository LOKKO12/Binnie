package binnie.botany.proxy;

import binnie.Constants;
import binnie.core.models.ModelManager;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ProxyClient extends Proxy implements IBotanyProxy {
	public static ModelManager modelManager = new ModelManager(Constants.BOTANY_MOD_ID);
    
    public static ModelManager getModelManager() {
		return modelManager;
	}
    
	@Override
	public Item registerItem(Item item) {
		getModelManager().registerItemClient(item);
		return super.registerItem(item);
	}
	
	@Override
	public Block registerBlock(Block block) {
		getModelManager().registerBlockClient(block);
		return super.registerBlock(block);
	}
	
	@Override
	public void registerModels() {
		getModelManager().registerModels();
	}
	
	@Override
	public void registerItemAndBlockColors() {
		getModelManager().registerItemAndBlockColors();
	}
}