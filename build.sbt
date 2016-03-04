name := "SbtTomcatExample"

version := "1.0"

// Libraries to fetch from Maven central
// (if you have libs as jars you can put them in the `lib` folder at the root of the project)
libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)

enablePlugins(TomcatPlugin)