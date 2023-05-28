package dev.skptical.girliemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModdedItem {

    private final String NAME;
    private RegistryObject<Item> ITEM;

    public ModdedItem(final String name){
        this.NAME = name;
        register(name);
        ModItems.ITEM_LIST.add(ITEM);

    }

    protected void register(final String name){
        this.ITEM = ModItems.ITEMS.register(name,
                () -> new Item(new Item.Properties()));

    }
    protected String getName(){
        return this.NAME;
    }
    protected RegistryObject<Item> getItem(){
        return this.ITEM;
    }


}
