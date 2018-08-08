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

package au.lars.vip.events;

import au.lars.vip.main.Data;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Login implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent e) {

        if (e.getPlayer().hasPermission("klausucht.vip")) {

            e.allow();

        } else {

            e.disallow(PlayerLoginEvent.Result.KICK_OTHER, Data.novip);

        }

    }

}
