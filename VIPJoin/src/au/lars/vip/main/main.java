/*
 *
 *  *     Programmiert von
 *  *                                  _      _
 *  *           /\                   | |    | |
 *  *          /  \     _   _   ___  | | __ | |   __ _   _ __     __ _
 *  *         / /\ \   | | | | / __| | |/ / | |  / _` | | '_ \   / _` |
 *  *        / ____ \  | |_| | \__ \ |   <  | | | (_| | | | | | | (_| |
 *  *       /_/    \_\  \__,_| |___/ |_|\_\ |_|  \__,_| |_| |_|  \__, |
 *  *          http://hirnmunity.net    Copyright by Ausklang     __/ |
 *  *                                                            |___/
 *
 */

package au.lars.vip.main;

import au.lars.vip.events.Login;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(Data.prefix + "§dPlugin §aaktiviert");
        Bukkit.getPluginManager().registerEvents(new Login(), this);

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(Data.prefix + "§dPlugin §cdeaktiviert");

    }
}
