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
            // Только на master → deploy
            maven {
                name = "Maven Deploy"
                goals = "clean deploy"
                conditions {
                    equals("teamcity.build.branch", "master")
                }
            }
            // На всех ветках → test
            maven {
                name = "Maven Test"
                goals = "clean test"
            }
        }
    }
}