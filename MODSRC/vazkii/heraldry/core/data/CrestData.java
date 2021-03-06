package vazkii.heraldry.core.data;

import net.minecraft.nbt.NBTTagCompound;

public class CrestData {

	private static final String TAG_COLOR_1 = "color1";
	private static final String TAG_COLOR_2 = "color2";
	private static final String TAG_ICON = "icon";

	public int color1;
	public int color2;
	public short icon;

	public CrestData(int color1, int color2, short icon) {
		this.color1 = color1;
		this.color2 = color2;
		this.icon = icon;
	}

	public void writeToCmp(NBTTagCompound cmp) {
		cmp.setInteger(TAG_COLOR_1, color1);
		cmp.setInteger(TAG_COLOR_2, color2);
		cmp.setShort(TAG_ICON, icon);
	}

	public static CrestData readFromCmp(NBTTagCompound cmp) {
		int color1 = cmp.getInteger(TAG_COLOR_1);
		int color2 = cmp.getInteger(TAG_COLOR_2);
		short icon = cmp.getShort(TAG_ICON);

		return new CrestData(color1, color2, icon);
	}

}
