package user11681.numerusromani.mixin;

import net.minecraft.util.Language;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @see Language
 */
@Mixin(targets = "net.minecraft.util.Language$1")
abstract class LanguageDummyMixin {}
