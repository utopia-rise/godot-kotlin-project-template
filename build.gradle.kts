plugins {
    id("com.utopia-rise.godot-kotlin-jvm") version "0.9.1-4.2.2"
}

repositories {
    mavenLocal()
    mavenCentral()
    google()
}

godot {
    registrationFileBaseDir.set(projectDir.resolve("scripts"))
    isRegistrationFileHierarchyEnabled.set(true)
	
	// To enable Android Export.
    //isAndroidExportEnabled.set(true) 
	
	// To enable iOS export and Graal Native Image export.
    //isGraalNativeImageExportEnabled.set(true)
}