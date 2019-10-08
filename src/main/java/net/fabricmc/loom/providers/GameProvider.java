package net.fabricmc.loom.providers;

import java.io.File;
import java.util.Collection;

public interface GameProvider {

  File getGameJar();

  String getVersion();

  Collection<File> getLibraries();
}
