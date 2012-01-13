// see https://github.com/sbt/sbt-assembly
import AssemblyKeys._ // put this at the top of the file

organization := "Micronautics Research"

name := "MeetupRoll"

version := "0.1"

scalacOptions ++= Seq("-deprecation")

resolvers ++= Seq(
  "Typesafe Snapshots"    at "http://repo.typesafe.com/typesafe/snapshots",
  "Typesafe Releases"     at "http://repo.typesafe.com/typesafe/releases",
  "Scala-Tools Snapshots" at "http://scala-tools.org/repo-snapshots",
  "Scala Tools Releases"  at "http://scala-tools.org/repo-releases"
)

libraryDependencies ++= Seq(
  "com.github.scala-incubator.io" %% "scala-io-core" % "latest.integration" % "compile" withSources(),
  "com.github.scala-incubator.io" %% "scala-io-file" % "latest.integration" % "compile" withSources(),
  "javax.mail"                    %  "mail"          % "latest.milestone"   % "compile" withSources(),
  "org.scalatest"                 %% "scalatest"     % "latest.integration" % "test"    withSources()
)

seq(assemblySettings: _*)
