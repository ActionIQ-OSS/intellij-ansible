package lv.kid.vermut.intellij.yaml.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class VaultParserDefinition implements ParserDefinition {
  private final NeonParserDefinition neonParserDefinition = new NeonParserDefinition();

  @NotNull
  @Override
  public Lexer createLexer(Project project) {
    return neonParserDefinition.createLexer(project);
  }

  @Override
  public PsiParser createParser(Project project) {
    return new VaultParser(neonParserDefinition.createParser(project));
  }

  @Override
  public IFileElementType getFileNodeType() {
    return neonParserDefinition.getFileNodeType();
  }

  @NotNull
  @Override
  public TokenSet getWhitespaceTokens() {
    return neonParserDefinition.getWhitespaceTokens();
  }

  @NotNull
  @Override
  public TokenSet getCommentTokens() {
    return neonParserDefinition.getCommentTokens();
  }

  @NotNull
  @Override
  public TokenSet getStringLiteralElements() {
    return neonParserDefinition.getStringLiteralElements();
  }

  @NotNull
  @Override
  public PsiElement createElement(ASTNode astNode) {
    return neonParserDefinition.createElement(astNode);
  }

  @Override
  public PsiFile createFile(FileViewProvider fileViewProvider) {
    return neonParserDefinition.createFile(fileViewProvider);
  }

  @Override
  public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
    return neonParserDefinition.spaceExistanceTypeBetweenTokens(astNode, astNode1);
  }
}
