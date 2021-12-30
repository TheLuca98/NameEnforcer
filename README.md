# NameEnforcer

A Spigot plugin that ensures that players cannot join with an invalid username.

In particular, the plugin will prevent players from joining if their username
does not conform to the regular expression `\w` (i.e. letters, numbers and
underscores).

This was made as an immediate response to what seems to be an exploit that
enables players to connect to **servers that have online-mode/authentication
enabled** using a modified version of their username that contains whitespace
characters. This exploit(?) was first witnessed by the author the Noxcrew
Community SMP on December 30th, 2021.
