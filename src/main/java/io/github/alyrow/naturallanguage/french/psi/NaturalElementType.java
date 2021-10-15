package io.github.alyrow.naturallanguage.french.psi;

import com.intellij.psi.tree.IElementType;
import io.github.alyrow.naturallanguage.french.NaturalLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NaturalElementType extends IElementType {

    public NaturalElementType(@NotNull @NonNls String debugName) {
        super(debugName, NaturalLanguage.INSTANCE);
    }

}