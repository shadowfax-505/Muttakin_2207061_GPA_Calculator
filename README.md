# GPA Calculator

JavaFX desktop app that calculates a student's GPA from their courses.

Enter a student's name and roll, then add courses (code, name, credit hours,
grade, and up to two teachers). The result screen lists every course and the
credit-weighted GPA. Records are saved to a local SQLite database.

## Stack

Java 25 · JavaFX 21 · SQLite (`sqlite-jdbc`) · Maven

## Run

```bash
./mvnw javafx:run
```

Run from the repository root — the database path
(`src/main/resources/database/identifier.sqlite`) is relative to it.
