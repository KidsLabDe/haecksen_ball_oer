
package net.mcreator.haecksenball.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.haecksenball.procedures.SchlaegerWennLebewesenMitGegenstandGetroffenWirdProcedure;
import net.mcreator.haecksenball.procedures.SchlaegerBeimTickDesGegenstandesInDerHandProcedure;

public class SchlaegerItem extends Item {
	public SchlaegerItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SchlaegerWennLebewesenMitGegenstandGetroffenWirdProcedure.execute(

		);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			SchlaegerBeimTickDesGegenstandesInDerHandProcedure.execute(world, itemstack);
	}
}
