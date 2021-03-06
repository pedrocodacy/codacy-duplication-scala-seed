name := """codacy-duplication-scala-seed"""

organization := "com.codacy"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.10.5"

crossScalaVersions := Seq("2.10.5", "2.11.7")

scalacOptions := Seq("-deprecation", "-feature", "-unchecked", "-Ywarn-adapted-args", "-Xlint", "-Xfatal-warnings")

resolvers += "Bintray Typesafe Repo" at "http://dl.bintray.com/typesafe/maven-releases/"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json"  % "2.3.10",
  "org.scalatest"     %% "scalatest"  % "2.2.4" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.3.14"
)

organizationName := "Codacy"

organizationHomepage := Some(new URL("https://www.codacy.com"))

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

startYear := Some(2016)

description := "Library to develop Codacy duplication plugins"

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("http://www.github.com/codacy/codacy-duplication-scala-seed/"))

pomExtra :=
  <scm>
    <url>http://www.github.com/codacy/codacy-duplication-scala-seed</url>
    <connection>scm:git:git@github.com:codacy/codacy-duplication-scala-seed.git</connection>
    <developerConnection>scm:git:https://github.com/codacy/codacy-duplication-scala-seed.git</developerConnection>
  </scm>
    <developers>
      <developer>
        <id>rtfpessoa</id>
        <name>Rodrigo Fernandes</name>
        <email>rodrigo [at] codacy.com</email>
        <url>https://github.com/rtfpessoa</url>
      </developer>
    </developers>
