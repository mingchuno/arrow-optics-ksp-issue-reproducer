# arrow-optics ksp issue reproducer

Latest arrow-optics with ksp cannot compile. `kspKotlin` task success but nothing is generated under `build/generated/ksp/main`. 
Switching to `1.0.1` will show `Could not find io.arrow-kt:arrow-optics-ksp-plugin:1.0.1.` when running `./gradlew assemble`. 
In `1.0.2-alpha.28`, it will show `Unresolved reference: name` instead.