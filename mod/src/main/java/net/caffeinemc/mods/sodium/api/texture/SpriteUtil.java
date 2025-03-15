package net.caffeinemc.mods.sodium.api.texture;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class SpriteUtil {

    SpriteUtil INSTANCE = new SpriteUtil();

    public static void markSpriteActive(TextureAtlasSprite sprite) {
        org.embeddedt.embeddium.api.render.texture.SpriteUtil.markSpriteActive(sprite);
    }
}
