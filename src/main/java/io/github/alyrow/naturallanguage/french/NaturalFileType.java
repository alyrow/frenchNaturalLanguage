package io.github.alyrow.naturallanguage.french;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NaturalFileType extends LanguageFileType {
    public static final NaturalFileType INSTANCE = new NaturalFileType();

    private NaturalFileType() {
        super(NaturalLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Natural language File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Natural language File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "algo";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NaturalIcons.FILE;
    }
}
