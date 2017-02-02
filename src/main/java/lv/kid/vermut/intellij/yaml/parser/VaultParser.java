package lv.kid.vermut.intellij.yaml.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class VaultParser implements PsiParser {
  private final PsiParser neonParser;

  public VaultParser(PsiParser neonParser) {
    this.neonParser = neonParser;
  }

  @NotNull
  @Override
  public ASTNode parse(@NotNull IElementType iElementType, @NotNull PsiBuilder psiBuilder) {
    psiBuilder.getTokenText();
    return neonParser.parse(iElementType, psiBuilder);
  }
}
