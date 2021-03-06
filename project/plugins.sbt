
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.sonatypeRepo("public")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

