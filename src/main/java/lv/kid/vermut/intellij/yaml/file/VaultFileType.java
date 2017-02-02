package lv.kid.vermut.intellij.yaml.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.PlainTextLanguage;
import lv.kid.vermut.intellij.yaml.VaultLanguage;
import lv.kid.vermut.intellij.yaml.Yaml;
import lv.kid.vermut.intellij.yaml.YamlIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class VaultFileType extends LanguageFileType {
	public static final VaultFileType INSTANCE = new VaultFileType();
	public static final String DEFAULT_EXTENSION = "vault";
	public static final String EXTENSIONS = "vlt;vault";

	protected VaultFileType() { super(VaultLanguage.INSTANCE); }

	@NotNull
	public String getName() {
		return Yaml.LANGUAGE_NAME;
	}

	@NotNull
	public String getDescription() {
		return Yaml.LANGUAGE_DESCRIPTION;
	}

	@NotNull
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@NotNull
	public Icon getIcon() {
		return YamlIcons.FILETYPE_ICON;
	}
}
