Actual behavior:

```
mvn clean test
```

produces following:

```
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.469 s - in org.RepositoryTest
[INFO] Running org.NoSuchMethodTest
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.001 s <<< FAILURE! - in org.NoSuchMethodTest
[ERROR] testNoSuchMethodError  Time elapsed: 0.001 s  <<< ERROR!
java.lang.NoSuchMethodError: org.redhat.Invoice.setAccountId(Ljava/lang/String;)V
  at org.NoSuchMethodTest.testNoSuchMethodError(NoSuchMethodTest.java:38)

[INFO] H2 database was shut down
2019-06-24 15:53:36,353 INFO  [io.quarkus] (main) Quarkus stopped in 0.012s
[INFO]
[INFO] Results:
[INFO]
[ERROR] Errors:
[ERROR]   NoSuchMethodTest.testNoSuchMethodError:38 » NoSuchMethod org.redhat.Invoice.se...
[INFO]
[ERROR] Tests run: 2, Failures: 0, Errors: 1, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 6.855 s
[INFO] Finished at: 2019-06-24T15:53:36+02:00
[INFO] ------------------------------------------------------------------------
```

Expected behavior:

```
mvn clean test
```

will finish successfully