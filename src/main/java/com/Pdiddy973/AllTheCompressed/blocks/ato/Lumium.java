package com.Pdiddy973.AllTheCompressed.blocks.ato;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Lumium extends Block {
    public Lumium() {
        super(Properties.of(Material.STONE)
                .sound(SoundType.STONE)
                .strength(30f, 15F)
                .requiresCorrectToolForDrops());
    }
}
