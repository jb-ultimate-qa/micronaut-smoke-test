## micronaut-smoke-test

The test project for the Micronaut smoke UI tests in IntelliJ IDEA
(`com.intellij.driver.tests.idea.ultimate.micronaut.MicronautSmokeTest`).

The UI tests find gutter icons by the text of a line. Do not change these lines without a change in the tests:

| File | Line | Check |
|---|---|---|
| `DBService.java` | `class DBService` | The bean gutter icon navigates to the injection point in `StartupListener`. |
| `StartupListener.java` | `private DBService DBService` | The injection gutter icon navigates to `DBService`. |
| `PersonController.java` | `List<Person> getAll()`, `List<Person> getByName(` | The HTTP mapping gutter icons. |
| `PersonController.java` | `eventPublisher.publishEvent` | The publisher gutter icon navigates to `PersonSearchListener`. |
| `PersonSearchListener.java` | `void onPersonSearched` | The listener gutter icon navigates to the `publishEvent` call. |

The Endpoints tool window shows `/person/all` and `/person/byName/{name}`.
The application starts on port 9091 and fills an in-memory H2 database on startup.
