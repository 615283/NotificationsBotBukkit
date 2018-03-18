# Info 
Minecraft bukkit/spigot plugin for NotificationsBot. Note, this bot does not send notifications, webhooks do that, it merely adds and removes a role from a user.
Also note that you need to precreate the role for your notifications users.

# Usage
1. Place the .jar file from the releases page into your plugins folder
2. Run the server once, then stop it
3. Edit the config file in the plugin data folder (config.properties) for token see bot setup below
4. Make the channel that you send notifications to, not the commands one, only accessable by people with the role in the config file
5. Run the server again
6. The bot will auto start on server start and you can use the commands /disablenotificationsbot and /enablenotificationsbot to change the status of the bot NB: /enablenotificationsbot can take a few second to complete (see permissions below)

# Bot setup
1. Go to https://discordapp.com/developers/applications/me and create a new app
2. Press create bot user and copy the token
3. Use this token in the config file under botToken

# Commands & Permissions
/disablenotificationsbot - disables the bot - Permission: notificationsbot.disable
/enablenotificationsbot - enables the bot - Permission: notificationsbot.enable