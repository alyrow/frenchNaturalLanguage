package io.github.alyrow.naturallanguage.french;

import com.intellij.lexer.FlexAdapter;

public class NaturalLexerAdapter extends FlexAdapter {
    public NaturalLexerAdapter() {
        super(new NaturalLexer(null));
    }
}
