
<h3 align="center"> <samp>⚙️ GRADLE</samp> </h3>

```kotlin
repositories {
    // JitPack
    maven("https://jitpack.io")
}

dependencies {
    // TokensAPI 
    compileOnly("com.github.SilexMC-T:TokensAPI:1.0.0")
}
```

<br />

<h3 align="center"> <samp>⚙️ MAVEN</samp> </h3>

```xml
<repositories>
    <!-- JitPack -->
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <!-- TokensAPI -->
    <dependency>
        <groupId>com.github.SilexMC-T</groupId>
        <artifactId>TokensAPI</artifactId>
        <version>1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

<br />

<h3 align="center"> <samp>🖥 EXAMPLE ON HOW TO USE</samp> </h3>

```java
public class PluginClass extends JavaPlugin {
    @Override
    public void onEnable() {
        if (!Bukkit.getPluginManager().isPluginEnabled("Tokens")) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        RegisteredServiceProvider<TokensAPI> service = Bukkit.getServicesManager().getRegistration(TokensAPI.class);
        if (service == null) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }
        this.tokensAPI = service.getProvider();
    }
}
```