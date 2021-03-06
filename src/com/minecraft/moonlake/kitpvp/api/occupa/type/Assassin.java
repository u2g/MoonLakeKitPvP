package com.minecraft.moonlake.kitpvp.api.occupa.type;

import com.minecraft.moonlake.api.itemlib.ItemBuilder;
import com.minecraft.moonlake.api.itemlib.Itemlib;
import com.minecraft.moonlake.kitpvp.api.occupa.AbstractOccupa;
import com.minecraft.moonlake.kitpvp.api.occupa.OccupaType;
import com.minecraft.moonlake.kitpvp.api.occupa.skill.combo.SkillComboType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by MoonLake on 2016/7/9.
 */
public class Assassin extends AbstractOccupa {

    public Assassin() {

        super(OccupaType.ASSASSIN);
    }

    /**
     * 获取此职业的武器攻击力
     *
     * @return 武器攻击力
     */
    public double getWeaponDamage() {

        return 5d;
    }

    /**
     * 获取此职业的武器
     *
     * @return 武器
     */
    @Override
    public ItemStack getWeapon() {

        return new ItemBuilder(getWeaponType(), 0, "&a暗影双刺")
                .setAttackDamage(getWeaponDamage(), false, Itemlib.AttributeType.Slot.MAIN_HAND)
                .setAttackSpeed(-2.0d, false, Itemlib.AttributeType.Slot.MAIN_HAND)
                .setUnbreakable(true)
                .build();
    }

    /**
     * 获取此职业的护甲
     *
     * @return 护甲
     */
    @Override
    public ItemStack[] getArmors() {

        return new ItemStack[] {

                new ItemBuilder(Material.LEATHER_BOOTS).setUnbreakable(true).build(),
                new ItemBuilder(Material.LEATHER_LEGGINGS).setUnbreakable(true).build(),
                new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setUnbreakable(true).build(),
                new ItemBuilder(Material.LEATHER_HELMET).setUnbreakable(true).build(),
        };
    }

    /**
     * 检测此职业的第一次组合
     *
     * @param type 组合类型
     * @return true 则通过 else 不通过
     */
    @Override
    public boolean checkComboFirst(SkillComboType type) {

        return type != SkillComboType.LEFT;
    }
}
