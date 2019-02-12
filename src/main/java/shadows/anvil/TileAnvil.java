package shadows.anvil;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileAnvil extends TileEntity {

	int unbreaking = 0;

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound tag) {
		tag.setInteger("ub", unbreaking);
		return super.writeToNBT(tag);
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		unbreaking = tag.getInteger("ub");
	}

	public void setUnbreaking(int level) {
		unbreaking = level;
	}

	public int getUnbreaking() {
		return unbreaking;
	}

}