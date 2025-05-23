package net.caffeinemc.mods.sodium.api.texture;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public interface SpriteUtil {

    SpriteUtil INSTANCE = new SpriteUtil() {};

    default void markSpriteActive(TextureAtlasSprite sprite) {
        org.embeddedt.embeddium.api.render.texture.SpriteUtil.markSpriteActive(sprite);
    }
}
