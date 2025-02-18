package com.syndicatemc.mint;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Mint.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Mint {
    public static final String MODID = "mint";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Mint() {}
}
