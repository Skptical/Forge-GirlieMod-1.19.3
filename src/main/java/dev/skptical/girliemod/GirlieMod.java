package dev.skptical.girliemod;

import com.mojang.logging.LogUtils;
import dev.skptical.girliemod.block.ModBlocks;
import dev.skptical.girliemod.item.ModCreativeModeTabs;
import dev.skptical.girliemod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GirlieMod.MOD_ID)
public class GirlieMod
{
    public static final String MOD_ID = "girliemod";
    private static final Logger LOGGER = LogUtils.getLogger();


    public GirlieMod(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event){

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == ModCreativeModeTabs.GIRLIE_TAB){
            for(RegistryObject<Item> item : ModItems.ITEM_LIST){
                event.accept(item);
            }
            for(RegistryObject<Block> block : ModBlocks.BLOCK_LIST){
                event.accept(block);
            }

        }
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
