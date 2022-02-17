
package net.apucsw.industrial_deco.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.apucsw.industrial_deco.item.IronStickItem;
import net.apucsw.industrial_deco.IndustrialDecoModElements;

@IndustrialDecoModElements.ModElement.Tag
public class IndustrialDecoTabItemGroup extends IndustrialDecoModElements.ModElement {
	public IndustrialDecoTabItemGroup(IndustrialDecoModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabindustrial_deco_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IronStickItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
