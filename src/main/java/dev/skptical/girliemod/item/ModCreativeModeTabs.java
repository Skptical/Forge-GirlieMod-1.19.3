package dev.skptical.girliemod.item;

import dev.skptical.girliemod.GirlieMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GirlieMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {

    public static CreativeModeTab GIRLIE_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        GIRLIE_TAB = event.registerCreativeModeTab(new ResourceLocation(GirlieMod.MOD_ID, "girlie_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL_SHARD.getItem().get())).title(Component.translatable("creativemodetab.girlie_tab")));

    }

}
