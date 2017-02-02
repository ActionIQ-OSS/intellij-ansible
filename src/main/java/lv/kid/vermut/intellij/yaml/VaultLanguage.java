package lv.kid.vermut.intellij.yaml;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class VaultLanguage extends Language {
  // singleton
  public static final VaultLanguage INSTANCE = new VaultLanguage();
  public static final String MIME_TYPE = "application/x-yaml";
  public static final String MIME_TYPE2 = "application/yaml";

  public VaultLanguage() {
    super("vaultEx", MIME_TYPE, MIME_TYPE2);
  }

  @NotNull
  @Override
  public String getDisplayName() {
    return "AnsibleVault";
  }
}
