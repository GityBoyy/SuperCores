package org.chubby.github.supercores.neoforge;

import org.chubby.github.supercores.Constants;
import org.chubby.github.supercores.SuperCores;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public final class SuperCoresNeoForge {
    public SuperCoresNeoForge() {
        SuperCores.init();
    }
}
