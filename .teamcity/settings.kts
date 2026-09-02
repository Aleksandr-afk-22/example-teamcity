import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.*

version = "2024.07"

project {
    buildType {
        id("Build")
        name = "Build"

        vcs {
            root(GitVcsRoot {
                name = "example-teamcity"
                url = "https://github.com/Aleksandr-afk-22/example-teamcity.git"
            })
        }

        steps {
            maven {
                name = "Maven Deploy"
                goals = "clean deploy"
                conditions {
                    equals("teamcity.build.branch", "master")
                }
            }
            maven {
                name = "Maven Test"
                goals = "clean test"
                conditions {
                    notEquals("teamcity.build.branch", "master")
                }
            }
        }
    }
}