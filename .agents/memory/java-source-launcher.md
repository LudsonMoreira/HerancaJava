---
name: Java source-file launcher
description: A Java source-file launch may select the first top-level class rather than a later class containing main.
---

For single-file Java programs with multiple top-level classes, prefer `javac file.java && java Main` unless the entry-point class is placed first. The source-file launcher selected the first declared class in this environment, which did not contain `main`.

**Why:** Running the source-file launcher on a file with an abstract base class before the entry-point class failed to locate the intended `main` method.

**How to apply:** Keep the compile-then-run workflow for examples with multiple classes, or order the entry-point class first when using `java file.java`.
