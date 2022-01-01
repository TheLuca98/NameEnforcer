# NameEnforcer

A Spigot plugin that prevents players from entering the server if they have an
invalid username. It will check that the username matches the regular
expression `\w+` (which only allows letters, numbers and underscores).

This was made to mitigate a bug with Minecraft's authentication system that has
been exploited by griefing groups to connect to online-mode servers with a
version of their username surrounded by whitespace characters, making it harder
for server admins to ban them. Until it is patched by Mojang, **this exploit
will affect servers that have online-mode/authentication enabled**.

This exploit has been patched in Paper 1.18.x build #121 and in Paper 1.17.x
build #405. If you are using Paper and your server is up to date, you do not
need this plugin.
