package com.minecraft.moonlake.kitpvp.api.occupa;

import com.minecraft.moonlake.kitpvp.api.occupa.skill.type.*;
import com.minecraft.moonlake.kitpvp.manager.SkillComboManager;
import com.minecraft.moonlake.util.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoonLake on 2016/7/9.
 */
public enum OccupaInfo {

    ASSASSIN(
            " \n"
                    + "&f血量: &d20  &8|  &f是否持盾: &a否\n"
                    + "&f装备: &a暗影双刺、皮革头、锁链甲、皮革腿、皮革鞋\n"
                    + "&f效果: &a无\n"
                    + "&f技能列表: \n"
    ),
    MAGICIAN(
            " \n"
                    + "&f血量: &d20  &8|  &f是否持盾: &a否\n"
                    + "&f装备: &a炎之法杖、金头盔、铁甲、金腿、金鞋\n"
                    + "&f效果: &a无\n"
                    + "&f被动: &a无\n"
                    + "&f技能列表: \n"
                    + "  &c炎龙之息: &6向前方射出大量火焰灼烧单位并伤害\n"
                    + "    &f冷却时间: &a40s  &8|  &f持续时间: &a4s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new FlameDragonBreath().getCombo()) + "\n"
                    + "  &c雷龙之力: &6召唤雷龙并向准星位置雷击数道闪电\n"
                    + "    &f冷却时间: &a25s  &8|  &f持续时间: &a3s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new ThunderDragonForce().getCombo()) + "\n"
    ),
    RANGER(
            " \n"
                    + "&f血量: &d20  &8|  &f是否持盾: &a否\n"
                    + "&f装备: &a枯叶灵弓、皮革头盔、皮革甲、皮革腿、皮革鞋\n"
                    + "&f效果: &a无\n"
                    + "&f被动: &a30% 几率攻击翻倍\n"
                    + "&f技能列表: \n"
                    + "  &c枯叶之怒: &6一段时间中发射出的箭增加火焰效果\n"
                    + "    &f冷却时间: &a60s  &8|  &f持续时间: &a12s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new WitheredLeafAnger().getCombo()) + "\n"
    ),
    TANK(
            " \n"
                    + "&f血量: &d20  &8|  &f是否持盾: &a是\n"
                    + "&f装备: &a迷之板砖、铁甲、锁链腿、锁链鞋\n"
                    + "&f效果: &a无\n"
                    + "&f被动: &a无\n"
                    + "&f技能列表: \n"
                    + "  &cRKO!: &6\n"
                    + "    &f冷却时间: &a45s  &8|  &f持续时间: &a3s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new RKO().getCombo()) + "\n"
                    + "  &c山崩地裂: &6跃进并跳起将落地附近单位伤害并击飞\n"
                    + "    &f冷却时间: &a58s  &8|  &f持续时间: &a5s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new Shake().getCombo()) + "\n"
    ),
    WARRIOR(
            " \n"
                    + "&f血量: &d20  &8|  &f是否持盾: &a否\n"
                    + "&f装备: &a碧水剑、皮革头、锁链甲、锁链腿、钻石鞋\n"
                    + "&f效果: &a无\n"
                    + "&f被动: &a无\n"
                    + "&f技能列表: \n"
                    + "  &c旋风斩: &6Hasaki 面对疾风吧~~~\n"
                    + "    &f冷却时间: &a50s  &8|  &f持续时间: &a16s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new Hasaki().getCombo()) + "\n"
                    + "  &c鬼影闪 · 爆: &6急速跃进冲刺途中单位后爆炸单位并伤害\n"
                    + "    &f冷却时间: &a45s  &8|  &f持续时间: &a5s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new GhostFlashBurst().getCombo()) + "\n"
    ),
    GUNNER(
            " \n"
                    + "&f血量: &d20  &8|  &f是否持盾: &a否\n"
                    + "&f装备: &a95式自动步枪、铁头盔、铁护甲、皮革腿、皮革鞋\n"
                    + "&f效果: &a无\n"
                    + "&f被动: &a无\n"
                    + "&f技能列表: \n"
                    + "  &c闪光弹: &6投掷出闪光弹将落地位置单位造成失明和耳鸣效果\n"
                    + "    &f冷却时间: &a45s  &8|  &f持续时间: &a5s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new FlashBang().getCombo()) + "\n"
                    + "  &c燃烧弹: &6投掷出燃烧弹将落地位置单位长时间造成燃烧伤害\n"
                    + "    &f冷却时间: &a50s  &8|  &f持续时间: &a8s\n"
                    + "    &f技能组合键: &b" + SkillComboManager.getComboString(new Molotov().getCombo()) + "\n"
    ),
    ;

    private String lores;

    OccupaInfo(String lores) {

        this.lores = lores;
    }

    public List<String> getLore() {

        List<String> loreList = new ArrayList<>();

        if(this.lores.contains("\n")) {

            String[] arr = this.lores.split("\n");

            for(String str : arr) {

                loreList.add(Util.color(str));
            }
            return loreList;
        }
        else {

            loreList.add(this.lores);

            return loreList;
        }
    }
}
