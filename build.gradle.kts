import godot.entrygenerator.settings.RegistrationFileLayoutMode
import godot.gradle.GodotLanguage

plugins {
    id("com.utopia-rise.godot-kotlin-jvm") version "0.16.1-4.6.3"
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
}

godot {
    // --------- Setup ---------

    // JVM source languages that participate in the Godot Kotlin/JVM build pipeline.
    languages.set(setOf(GodotLanguage.KOTLIN, GodotLanguage.JAVA, GodotLanguage.SCALA))

    // Override the toolchain or language versions only when you need something newer than the defaults.
    // javaVersion.set(17)
    // kotlinVersion.set("2.2.0")
    // scalaVersion.set("3.6.3")

    // Only change this if the Gradle project is not the Godot project root containing project.godot.
    // godotProjectDirectory.set(file("."))

    // Directory where .gdj registration files are generated and synchronized.
    registrationFilesDirectory.set(projectDir.resolve("scripts"))

    // HIERARCHICAL mirrors package folders under registrationFilesDirectory.
    registrationFilesLayoutMode.set(RegistrationFileLayoutMode.HIERARCHICAL)

    // Keep the default short registered class names instead of using fully qualified names.
    // registrationNameMode.set(RegisteredNameMode.SIMPLE_NAME)

    // Enables the coroutine support library for Godot lifecycle integration.
    //isGodotCoroutinesEnabled.set(true)

    // --------- Android ---------

    // Path to the Android d8 executable used to build dex artifacts.
    // d8ToolPath.set("${System.getenv("ANDROID_SDK_ROOT")}\\build-tools\\36.0.0\\d8.bat")

    // Path to the Android SDK platform directory used for compilation.
    // androidCompileSdkDirectory.set("${System.getenv("ANDROID_SDK_ROOT")}\\platforms\\android-36")

    // Minimum Android API level passed to d8 during Android export.
    // androidMinApiLevel.set(21)

    // --------- Graal / iOS ---------

    // GraalVM home directory used to locate the native-image tool.
    // graalVmHomeDirectory.set(System.getenv("GRAALVM_HOME"))

    // Windows Visual Studio developer environment script required for native-image on Windows.
    // windowsDeveloperVcVarsPath.set(System.getenv("VC_VARS_PATH"))

    // Extra native-image configuration files if your project needs custom JNI, reflection, or resources.
    // additionalGraalJniConfigurationFiles.set(arrayOf("my-jni-config.json"))
    // additionalGraalReflectionConfigurationFiles.set(arrayOf("my-reflection-config.json"))
    // additionalGraalResourceConfigurationFiles.set(arrayOf("my-resource-config.json"))

    // Enables verbose logging while building the Graal native image.
    // isGraalNativeImageVerboseEnabled.set(true)

    // --------- Library Authors ---------

    // Set this to true when this Gradle project is a reusable Godot Kotlin/JVM library instead of a runnable game project.
    // isLibrary.set(true)

    // Alternative registered-name strategies:
    // - SIMPLE_NAME: MyClass
    // - FQ_NAME: my.package.MyClass
    // - PROJECT_PREFIX: externalProject_MyClass
    // registrationNameMode.set(RegisteredNameMode.FQ_NAME)
}
