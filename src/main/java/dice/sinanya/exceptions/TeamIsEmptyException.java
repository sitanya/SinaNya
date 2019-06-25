package dice.sinanya.exceptions;

import dice.sinanya.entity.EntityTypeMessages;

import static dice.sinanya.tools.getinfo.GetMessagesSystem.MESSAGES_SYSTEM;
import static dice.sinanya.tools.makedata.Sender.sender;

/**
 * @author SitaNya
 * 日期: 2019-06-15
 * 电子邮箱: sitanya@qq.com
 * 维护群(QQ): 162279609
 * 有任何问题欢迎咨询
 * 类说明: 小队为空报错
 * 错误发生时会打印详细日志，并原渠道回复错误信息，内容会优先根据配置文件，配置文件没写则根据默认值，都没写会报错（反正我会写默认值的）
 */
public class TeamIsEmptyException extends Exception {
    public TeamIsEmptyException(EntityTypeMessages entityTypeMessages) {
        super(MESSAGES_SYSTEM.get("teamIsEmpty"));
        sender(entityTypeMessages, MESSAGES_SYSTEM.get("teamIsEmpty"));
    }
}
