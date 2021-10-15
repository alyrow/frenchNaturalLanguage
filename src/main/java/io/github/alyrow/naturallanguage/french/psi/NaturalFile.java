package io.github.alyrow.naturallanguage.french.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import io.github.alyrow.naturallanguage.french.NaturalFileType;
import io.github.alyrow.naturallanguage.french.NaturalLanguage;
import org.jetbrains.annotations.NotNull;

public class NaturalFile extends PsiFileBase {
    public NaturalFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NaturalLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NaturalFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Natural language File";
    }
}
