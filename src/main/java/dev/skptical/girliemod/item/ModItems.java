package dev.skptical.girliemod.item;

import dev.skptical.girliemod.GirlieMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;

public class ModItems {

    public final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GirlieMod.MOD_ID);

    public static ArrayList<RegistryObject<Item>> ITEM_LIST = new ArrayList<>();

    public static ModdedItem BLACK_OPAL_SHARD = new ModdedItem("black_opal_shard");
    public static ModdedItem RAW_BLACK_OPAL = new ModdedItem("raw_black_opal");
    public static ModdedItem BLACK_OPAL_GEM = new ModdedItem("black_opal_gem");


    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

    


}
