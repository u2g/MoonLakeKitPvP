package com.minecraft.moonlake.kitpvp.listeners.entity;

import com.minecraft.moonlake.kitpvp.api.KitPvP;
import com.minecraft.moonlake.kitpvp.api.event.entity.EntityDamageBySkillEvent;
import com.minecraft.moonlake.kitpvp.manager.DataManager;
import org.bukkit.GameMode;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ProjectileHitEvent;

/**
 * Created by MoonLake on 2016/7/9.
 */
public class EntityBaseListener implements Listener {

    private final KitPvP main;

    public EntityBaseListener(KitPvP main) {

        this.main = main;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onSkillDamage(EntityDamageBySkillEvent event) {

        if((event.isPlayer() && DataManager.contains(event.getEntity().getLocation())) ||
           (event.isPlayer() && (event.asPlayer().getGameMode() == GameMode.SPECTATOR ||
                                 event.asPlayer().getGameMode() == GameMode.CREATIVE))) {

            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onLobbyDamage(EntityDamageEvent event) {

        Entity entity = event.getEntity();

        if(entity instanceof Player) {

            if(DataManager.contains(entity.getLocation())) {

                event.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onHit(ProjectileHitEvent event) {

        if(event.getEntity() instanceof Arrow) {

            event.getEntity().remove();
        }
    }
}
