# SBT Tomcat Example

This an example project of SBT with the plugin [xsbt-web-plugin](https://github.com/earldouglas/xsbt-web-plugin/blob/master/docs/2.1.md).

* `project` is an SBT folder that contains all the configuration related to SBT, for example plugins, version of SBT to use...
* `build.sbt`  is the SBT file that contains all the configuration related to your project, for example the name, the Scala 
* `target` is where SBT puts all the outputs, for example your application compiled, your application packaged...

Available commands:
* `sbt compile` to compile
* `sbt clean` to clean
* `sbt test` to run the tests
* `sbt tomcat:start` to run the app and then just visit localhost:8080
* `sbt ~tomcat:start` (notice the ~) the same as `tomcat:start` but will compile incrementally when ever you do a change.

Each commands have dependencies on others if they are needed, for example `tomcat:start` will `compile` first, so no need to run compile before.