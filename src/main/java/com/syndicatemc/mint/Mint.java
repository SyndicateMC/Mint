package com.syndicatemc.mint;

import com.mojang.logging.LogUtils;
import com.syndicatemc.mint.init.MintItems;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Mint.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Mint {
    public static final String MOD_ID = "mint";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Mint() {
        MintItems.init();
    }
}
