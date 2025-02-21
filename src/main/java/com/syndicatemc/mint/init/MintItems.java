package com.syndicatemc.mint.init;

import com.syndicatemc.mint.Mint;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

public class MintItems {
    public static final Registrate REGISTRATE = Registrate.create(Mint.MOD_ID);

    public static final ItemEntry<Item> BALLPEEN_HAMMER = REGISTRATE.item("ballpeen_hammer", Item::new)
            .lang("Ball-Peen Hammer")
            .model((d, m) -> {
                m.handheld(d);
            })
            .properties((p) -> p
                    .stacksTo(1)
                    .durability(250))
            .register();

    public static void init() {}
}
