// This is a generated file. Not intended for manual editing.
package io.github.alyrow.naturallanguage.french.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.alyrow.naturallanguage.french.psi.NaturalTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.alyrow.naturallanguage.french.psi.*;

public class NaturalPropertyImpl extends ASTWrapperPsiElement implements NaturalProperty {

  public NaturalPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NaturalVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NaturalVisitor) accept((NaturalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public NaturalOperationForLazy getOperationForLazy() {
    return findChildByClass(NaturalOperationForLazy.class);
  }

}
