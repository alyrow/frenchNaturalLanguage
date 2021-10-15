package io.github.alyrow.naturallanguage.french.psi;

import com.intellij.psi.tree.IElementType;
import io.github.alyrow.naturallanguage.french.NaturalLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NaturalTokenType extends IElementType {
    public NaturalTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NaturalLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NaturalTokenType." + super.toString();
    }
}
