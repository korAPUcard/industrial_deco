
package net.apucsw.industrial_deco.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.apucsw.industrial_deco.itemgroup.IndustrialDecoTabItemGroup;
import net.apucsw.industrial_deco.IndustrialDecoModElements;

@IndustrialDecoModElements.ModElement.Tag
public class IronStickItem extends IndustrialDecoModElements.ModElement {
	@ObjectHolder("industrial_deco:iron_stick")
	public static final Item block = null;

	public IronStickItem(IndustrialDecoModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(IndustrialDecoTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("iron_stick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
