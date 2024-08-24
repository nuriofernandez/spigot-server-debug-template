# Spigot debug project template

This is a template project to document how to enable Minecraft plugin debugging easily.

### Before starting

You should execute BuildTools to obtain the latest Spigot Jar file you want to
work with, after that, update pom.xml dependencies to match the Spigot version you are working with.

More info: https://www.spigotmc.org/wiki/buildtools/

![](https://i.imgur.com/74c6834.png)

### First steps

Set up your development server on the `./server` folder, place your desired spigot jar file there,
and all the plugins you will need during development, such as dependencies of your plugin.

### Update Spigot jar file name at the `.run` settings

Go to `./.run/Spigot.run.xml` and replace the following line:

```xml
    <option name="JAR_PATH" value="$PROJECT_DIR$/server/paper-1.21-123.jar" />
```

with the proper path of your desired Paper jar file.

### Write some code and test the debugging option!

- Go to `./src/main/...` and add whatever you want to try, an event listener, whatever.

![](https://i.imgur.com/Ghy1KUC.png)

- Place a debugging point in your code.

![](https://i.imgur.com/VPXOOP5.png)

- Execute the server with the debug function on IntelliJ

![](https://i.imgur.com/WAizWvW.png)

## Enjoy!

![](https://i.imgur.com/5wPezcx.png)
