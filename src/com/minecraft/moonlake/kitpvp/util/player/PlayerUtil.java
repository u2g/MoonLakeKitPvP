package com.minecraft.moonlake.kitpvp.util.player;

import com.minecraft.moonlake.api.nms.packet.PacketPlayOutChat;
import com.minecraft.moonlake.kitpvp.api.occupa.Occupa;
import com.minecraft.moonlake.kitpvp.api.occupa.OccupaType;
import com.minecraft.moonlake.kitpvp.api.player.KitPvPPlayer;
import com.minecraft.moonlake.util.Util;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

/**
 * Created by MoonLake on 2016/7/9.
 */
public class PlayerUtil implements KitPvPPlayer {

    private final String name;
    private final Player player;
    private Occupa occupa;
    private OccupaType occupaType;

    public PlayerUtil(String name) {

        this.name = name;
        this.player = Bukkit.getServer().getPlayer(name);
    }

    /**
     * 获取此玩家的名称
     *
     * @return 名称
     */
    @Override
    public String getName() {

        return name;
    }

    /**
     * 获取此玩家的 Bukkit 玩家对象
     *
     * @return Bukkit 玩家对象
     */
    @Override
    public Player getBukkitPlayer() {

        return player;
    }

    /**
     * 获取此玩家的职业
     *
     * @return 职业对象
     */
    @Override
    public Occupa getOccupa() {

        return occupa;
    }

    /**
     * 获取此玩家的职业类型
     *
     * @return 职业类型
     */
    @Override
    public OccupaType getOccupaType() {

        return occupaType;
    }

    /**
     * 设置此玩家的职业
     *
     * @param occupa 职业对象
     */
    @Override
    public void setOccupa(Occupa occupa) {

        this.occupa = occupa;
        this.occupaType = occupa.getType();
    }

    /**
     * 给玩家发送中心聊天数据包
     *
     * @param message 消息
     */
    @Override
    public void sendMainChatPacket(String message) {

        new PacketPlayOutChat(Util.color(message), PacketPlayOutChat.Mode.MAIN).send(getName());
    }

    /**
     * 获取此玩家的当前所在位置
     *
     * @return 位置
     */
    @Override
    public Location getLocation() {

        return getBukkitPlayer().getLocation();
    }

    /**
     * 获取此玩家的物品栏背包
     *
     * @return 物品栏
     */
    @Override
    public PlayerInventory getInventory() {

        return getBukkitPlayer().getInventory();
    }

    /**
     * 获取此玩家的主手中物品
     *
     * @return 主手中物品
     */
    @Override
    public ItemStack getItemInMainHand() {

        return getInventory().getItemInMainHand();
    }

    /**
     * 获取此玩家的副手中物品
     *
     * @return 副手中物品
     */
    @Override
    public ItemStack getItemInOffHand() {

        return getInventory().getItemInOffHand();
    }

    /**
     * 设置此玩家的主手中物品
     *
     * @param item 物品栈
     */
    @Override
    public void setItemInMainHand(ItemStack item) {

        getInventory().setItemInMainHand(item);
    }

    /**
     * 设置此玩家的副手中物品
     *
     * @param item 物品栈
     */
    @Override
    public void setItemInOffHand(ItemStack item) {

        getInventory().setItemInOffHand(item);
    }

    /**
     * 给此玩家打开指定物品栏对象
     *
     * @param inv 物品栏对象
     */
    @Override
    public void openInventory(Inventory inv) {

        getBukkitPlayer().openInventory(inv);
    }

    /**
     * 获取此玩家打开的上面物品栏对象
     *
     * @return 上面物品栏对象
     */
    @Override
    public Inventory getTopInventory() {

        return getBukkitPlayer().getOpenInventory() != null ? getBukkitPlayer().getOpenInventory().getTopInventory() : null;
    }

    @Override
    public boolean equals(Object object) {

        if(object != null) {

            if(object instanceof KitPvPPlayer) {

                KitPvPPlayer obj = (KitPvPPlayer)object;

                return obj.getName().equals(this.getName());
            }
        }
        return false;
    }

    /**
     * 获取此玩家是否之前玩过服务器
     *
     * @return true 之前玩过 else 第一次玩服务器
     */
    @Override
    public boolean hasBeforePlayed() {

        return getBukkitPlayer().hasPlayedBefore();
    }

    /**
     * 获取此玩家是否在地面
     *
     * @return 是否在地面
     */
    @Override
    public boolean isOnGround() {

        return getBukkitPlayer().isOnGround();
    }

    /**
     * 获取此玩家的所在世界对象
     *
     * @return 世界
     */
    @Override
    public World getWorld() {

        return getBukkitPlayer().getWorld();
    }

    /**
     * 更新此玩家的物品栏背包
     */
    @Override
    public void updateInventory() {

        getBukkitPlayer().updateInventory();
    }

    /**
     * 将此玩家正在打开的物品栏关闭
     */
    @Override
    public void closeInventory() {

        getBukkitPlayer().closeInventory();
    }

    /**
     * 获取此玩家的当前位置 X 坐标
     *
     * @return X 坐标
     */
    @Override
    public int getX() {

        return getLocation().getBlockX();
    }

    /**
     * 获取此玩家的当前位置 Y 坐标
     *
     * @return Y 坐标
     */
    @Override
    public int getY() {

        return getLocation().getBlockY();
    }

    /**
     * 获取此玩家的当前位置 Z 坐标
     *
     * @return Z 坐标
     */
    @Override
    public int getZ() {

        return getLocation().getBlockZ();
    }

    /**
     * 获取此玩家的当前位置 X 坐标
     *
     * @return X 坐标
     */
    @Override
    public double getDoubleX() {

        return getLocation().getX();
    }

    /**
     * 获取此玩家的当前位置 Y 坐标
     *
     * @return Y 坐标
     */
    @Override
    public double getDoubleY() {

        return getLocation().getY();
    }

    /**
     * 获取此玩家的当前位置 Z 坐标
     *
     * @return Z 坐标
     */
    @Override
    public double getDoubleZ() {

        return getLocation().getZ();
    }

    /**
     * 将此玩家传送到指定实体身边
     *
     * @param entity 实体
     */
    @Override
    public void teleport(Entity entity) {

        getBukkitPlayer().teleport(entity);
    }

    /**
     * 将此玩家传送到指定位置
     *
     * @param location 位置
     */
    @Override
    public void teleport(Location location) {

        getBukkitPlayer().teleport(location);
    }

    /**
     * 将此玩家传送到玩家当前世界的指定 xyz 坐标
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     */
    @Override
    public void teleport(int x, int y, int z) {

        teleport(new Location(getWorld(), x, y, z));
    }

    /**
     * 将此玩家传送到玩家当前世界的指定 xyz 坐标
     *
     * @param x X 坐标
     * @param y Y 坐标
     * @param z Z 坐标
     */
    @Override
    public void teleport(double x, double y, double z) {

        teleport(new Location(getWorld(), x, y, z));
    }

    /**
     * 将此玩家传送到指定世界的指定 xyz 坐标
     *
     * @param world 指定世界
     * @param x     X 坐标
     * @param y     Y 坐标
     * @param z     Z 坐标
     */
    @Override
    public void teleport(World world, int x, int y, int z) {

        teleport(new Location(world, x, y, z));
    }

    /**
     * 将此玩家传送到指定世界的指定 xyz 坐标
     *
     * @param world 指定世界
     * @param x     X 坐标
     * @param y     Y 坐标
     * @param z     Z 坐标
     */
    @Override
    public void teleport(World world, double x, double y, double z) {

        teleport(new Location(world, x, y, z));
    }

    /**
     * 给此玩家在当前位置播放音效
     *
     * @param sound  音效
     * @param volume 音量
     * @param pitch  音调
     */
    @Override
    public void playSound(Sound sound, float volume, float pitch) {

        getBukkitPlayer().playSound(getLocation(), sound, volume, pitch);
    }
}
