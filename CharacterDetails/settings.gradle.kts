pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal() // Optional
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CharacterDetails"
include(":app")

 