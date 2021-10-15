package io.github.alyrow.naturallanguage.french;

import com.intellij.lang.Language;

public class NaturalLanguage extends Language {
    public static final NaturalLanguage INSTANCE = new NaturalLanguage();

    private NaturalLanguage() {
        super("FrenchNaturalLanguage");
    }
}
