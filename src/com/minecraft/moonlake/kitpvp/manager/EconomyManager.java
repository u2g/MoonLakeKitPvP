package com.minecraft.moonlake.kitpvp.manager;

import com.minecraft.moonlake.economy.data.PlayerEconomy;

/**
 * Created by MoonLake on 2016/7/9.
 */
public final class EconomyManager extends KitPvPManager {

    /**
     * 获取指定玩家的经济系统数据
     *
     * @param name 玩家名
     * @return 经济数据 异常或没有返回 null
     */
    public static PlayerEconomy getEconomy(String name) {

        return getMain().getMoonLakeEconomy().getData(name);
    }

    /**
     * 获取指定玩家的经济金币数据
     *
     * @param name 玩家名
     * @return 金币数据
     */
    public static double getMoney(String name) {

        return getMain().getMoonLakeEconomy().getMoney(name);
    }

    /**
     * 将指定玩家的经济金币数据添加指定金币
     *
     * @param name 玩家名
     * @param money 添加的金币
     */
    public static void addMoney(String name, double money) {

        getMain().getMoonLakeEconomy().giveMoney(name, money);
    }

    /**
     * 将指定玩家的经济金币数据拿走指定金币
     *
     * @param name 玩家名
     * @param money 拿走的金币
     */
    public static void takeMoney(String name, double money) {

        getMain().getMoonLakeEconomy().takeMoney(name, money);
    }
}
