---
name: Java source-file launcher
description: A Java source-file launch may select the first top-level class rather than a later class containing main.
---

For single-file Java programs with multiple top-level classes, prefer `javac file.java && java Main` unless the entry-point class is placed first. The source-file launcher selected the first declared class in this environment, which did not contain `main`.

For package-based programs, compile the related `.java` sources together and clear stale `.class` outputs when package declarations change. A stale class in the package directory can be read instead of the current source and trigger misleading package/class errors.

**Why:** The source-file launcher failed when an abstract base class preceded the entry point, and a stale class file from the unnamed package caused a package import failure despite a correct source declaration.

**How to apply:** Keep the compile-then-run workflow for examples with multiple classes; compile all related package sources together and use a clean output location after package changes.
