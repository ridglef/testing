package com.example.addon.mixin;

import meteordevelopment.meteorclient.utils.network.OnlinePlayers;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Environment(EnvType.CLIENT)
@Mixin(value = OnlinePlayers.class, remap = false)
public abstract class OnlinePlayersMixin {
    /**
     * @author ridglef
     * @reason cope
     */
    @Overwrite
    public static void update() {}
    /**
     * @author ridglef
     * @reason cope
     */
    @Overwrite
    public static void leave() {}
}
