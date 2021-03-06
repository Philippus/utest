val scalaJSVersion = Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.28")
val scalaNativeVersion = Option(System.getenv("SCALANATIVE_VERSION")).getOrElse("0.3.9")

addSbtPlugin("org.xerial.sbt"     % "sbt-sonatype"                  % "2.5")
addSbtPlugin("com.dwijnand"       % "sbt-dynver"                    % "3.3.0")
addSbtPlugin("com.jsuereth"       % "sbt-pgp"                       % "1.1.2-1")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % scalaJSVersion)
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % scalaNativeVersion)
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.6.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.0")
