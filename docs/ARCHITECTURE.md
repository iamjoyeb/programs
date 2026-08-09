# Architecture

This repository is a plain coursework collection. There is no application
package, build system, or runtime. Files are organized by academic year and
semester.

## Layout

```
SY/
├── sem-3/
│   ├── C++/        # C++ programming assignments
│   ├── DFS/        # Data structures in C
│   └── ...
TY/
├── sem-5/          # Third year coursework: Java, PHP, web, etc.
└── sem-6/
```

## Languages

- **C/C++**: standalone programs; compile with `gcc`/`g++`.
- **Java**: standalone classes; compile with `javac`.
- **PHP**: standalone scripts; run with `php`.

## Conventions

- One program per file, named after the problem statement.
- Keep line separators and UTF-8 charset.
- No build artifacts are committed (see `.gitignore`).