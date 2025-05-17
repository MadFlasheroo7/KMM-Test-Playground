package pro.jayeshseth.kmmPlayground

import org.gradle.api.Project
import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType

val Project.libs
    get(): VersionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

fun DependencyHandler.commonMain(dependencyNotation: Any): Dependency? =
    add("commonMainImplementation", dependencyNotation)

fun DependencyHandler.androidMain(dependencyNotation: Any): Dependency? =
    add("androidMainImplementation", dependencyNotation)

fun DependencyHandler.desktopMain(dependencyNotation: Any): Dependency? =
    add("desktopMainImplementation", dependencyNotation)

fun DependencyHandler.implementation(dependencyNotation: Any): Dependency? =
    add("implementation", dependencyNotation)

fun DependencyHandler.debugImplementation(dependencyNotation: Any): Dependency? =
    add("debugImplementation", dependencyNotation)
