package dice.sinanya.system;

public interface MessagesHelp {
    StringBuilder normalHelp = new StringBuilder()
            .append(".r\t")
            .append(".r|.r3d6|.rd6|.r3d6+5*3d6-12/6\n")
            .append("普通骰掷，支持数学计算，不支持判定")
            .append("----------------------------------- ")

            .append(".ra\t")
            .append(".ra 50|.ra 50+10|.ra 力量|.ra 侦查|.ra 力量+10|.ra 力量*2\n")
            .append("房规判定，支持数学计算，支持技能和数值判定")
            .append("----------------------------------- ")

            .append(".rc\t")
            .append(".rc 50|.rc 50+10|.rc 力量|.rc 侦查|.rc 力量+10|.rc 力量*2\n")
            .append("规则书判定，支持数学计算，支持技能和数值判定")
            .append("----------------------------------- ")

            .append(".rb\t")
            .append(".rb 50|.rb 50+10|.rb 力量|.rb 力量+10|.rb2 力量\n")
            .append("奖励骰判定，紧跟在.rb后面的数字代表奖励骰的个数。空格后的数字或文字将被视为技能进行判定。支持数学计算")
            .append("----------------------------------- ")

            .append(".rp\t")
            .append(".rp 50|.rp 50+10|.rp 力量|.rp 力量+10|.rp2 力量\n")
            .append("惩罚骰判定，紧跟在.rb后面的数字代表奖励骰的个数。空格后的数字或文字将被视为技能进行判定。支持数学计算")
            .append("----------------------------------- ")

            .append(".sc\t")
            .append(".sc 1/1d6|.sc 1/1d6 50\n")
            .append("理智检定，可以直接输入数值进行判定，也可以不输入数值调用当前人物卡进行判定。需要注意的是当调用当前人物卡时，结果会自动更新到人物卡中。")
            .append("----------------------------------- ")

            .append(".en\t")
            .append(".en 侦查\n")
            .append("技能成长，必须输入技能名，不可以是技能值。结果会自动更新到当前人物卡。");

    StringBuilder makeHelp = new StringBuilder()
            .append(".coc\r")
            .append(".coc|.coc7|.coc7 5|.coc 5\n")
            .append("生成7版简易人物卡")
            .append("----------------------------------- ")

            .append(".coc6\r")
            .append(".coc6|.coc6 5\n")
            .append("生成6版简易人物卡")
            .append("----------------------------------- ")

            .append(".coc7d\n")
            .append("生成7版详细人物卡")
            .append("----------------------------------- ")

            .append(".coc6d\n")
            .append("生成6版详细人物卡")
            .append("----------------------------------- ")

            .append(".gas\n")
            .append("生成基于6版coc的煤气灯特质")
            .append("----------------------------------- ")

            .append(".tz\n")
            .append("生成非官方的玩家定义特质(不推荐)")
            .append("----------------------------------- ")

            .append(".getbook card\n")
            .append("获取最新版人物卡，非常好用！")
            .append("----------------------------------- ")

            .append(".getbook make\n")
            .append("获取车卡指南，新手花点时间准能看懂，能帮kp省很多事")
            .append("----------------------------------- ")

            .append(".st\r")
            .append(".st缇娜-力量30|.st安娜-智力80\n")
            .append("录入多人物卡档位，本骰子不支持普通人物卡录入，请务必录入多人物卡，注意是减号分割。此功能与本骰子多项其余功能联动，忘记录入的话可能会影响其它功能的效果。")
            .append("----------------------------------- ")

            .append(".st list\n")
            .append("查看当前已录入哪些人物卡")
            .append("----------------------------------- ")

            .append(".st人物\r")
            .append(".st缇娜|.st安娜\n")
            .append("选择人物卡，当不带有减号分割时将会视为选择你的人物卡。每个人同一时间仅能激活一张人物卡")
            .append("----------------------------------- ")

            .append(".st move\r")
            .append(".st move 缇娜|.st move 安娜\n")
            .append("移除某一张人物卡，无法移除已选择的人物卡")
            .append("----------------------------------- ")

            .append(".st show\n")
            .append("查看当前选定的人物卡的属性");

    StringBuilder groupHelp = new StringBuilder()
            .append(".team set\r")
            .append(".team set @缇娜|.team set @安娜 @茶茶不想再摸鱼\n")
            .append("将对方加入队伍，加入后可以方便的对团队血量、理智值进行管理并查看状态，需要at对方（可以at多个）。此团队是以群为最小单位的。")
            .append("----------------------------------- ")

            .append(".team\n")
            .append("查看团队状态")
            .append("----------------------------------- ")

            .append(".team desc\n")
            .append("查看团队所有角色的技能情况，需要使用.kp设定本群kp后才可以使用,结果会私聊发送给kp")
            .append("----------------------------------- ")

            .append(".team hp\r")
            .append(".team hp @缇娜 5|.team hp @安娜 @茶茶不想再摸鱼 +5\n")
            .append("可以对成员的血量进行调整，可以at多个人。默认为降低血量，使用+号为恢复血量，会自动报告对方的重伤和死亡情况。这个操作会更新对方的人物卡数据。")
            .append("----------------------------------- ")

            .append(".team san\r")
            .append(".team san @缇娜 5|.team san @缇娜 @安娜 3D6|.team san @安娜 @茶茶不想再摸鱼 +3D6|.team san @安娜 @谢伟 1d3/1d6\n")
            .append("可以对成员的理智值进行调整，可以at多个人。默认为降低理智值，使用+号为恢复理智值，会自动报告对方的疯狂情况," +
                    "这个操作会更新对方的人物卡数据。\n数值可以是类似于3D6的多重投掷，更可以是sanCheck表达式，系统会自动计算对方的人物卡属性，强制对方进行SanCheck\n" +
                    "“所有人，san check”这种话已经过时了kp们，现在一条命令就让他们知道什么叫身不由己！")
            .append("----------------------------------- ")

            .append(".team rm\r")
            .append(".team rm @缇娜\n")
            .append("将某人移出队伍，在队伍期间改变的人物卡属性不会还原")
            .append("----------------------------------- ")

            .append(".team clr\n")
            .append("清空队伍")
            .append("----------------------------------- ")

            .append(".log on\n")
            .append(".log on test|.log on 卡森德拉\n")
            .append("开始日志记录")
            .append("----------------------------------- ")

            .append(".log off\n")
            .append(".log off test|.log off 卡森德拉\n")
            .append("终止日志记录，日志名必须和开始时一致，但开始和关闭不需要是同一个人")
            .append("----------------------------------- ")

            .append(".log list\n")
            .append(".log list\n")
            .append("查看当前群组的日志列表")
            .append("----------------------------------- ")

            .append(".log del\n")
            .append(".log del test|.log del 卡森德拉\n")
            .append("删除某个日志，基本很少会用到，删除后就再也找不回来了")
            .append("----------------------------------- ")

            .append(".npc\n")
            .append("生成一个NPC，部分发送到群里给PC，部分私聊KP，注意这可不是车卡用的！")
            .append("----------------------------------- ")

            .append(".rav\n")
            .append(".rav 50|.rav 50+10|.rav 力量|.rav 力量+10|.rav 力量*3\n")
            .append("对抗骰掷，有2种使用方法:\n")
            .append("1.在群中使用，第一次使用被称为先手，第二次使用会成为后手。骰娘会自动给出对抗结论，采用对抗等级->投出点数->技能等级的顺序进行比较")
            .append("2.当您已经在群中使用.kp进行kp身份设定后。可以私聊骰子.rav命令进行骰掷，视为在群中骰掷。骰掷技能和结果不会暴露给PL")
            .append("----------------------------------- ")

            .append(".rcv\n")
            .append(".rcv 50|.rcv 50+10|.rcv 力量|.rcv 力量+10|.rcv 力量*3\n")
            .append("对抗骰掷，与rav相同，不过使用的是规则书判定");

    StringBuilder bookHelp = new StringBuilder()
            .append(".getbook card\n")
            .append("获取最新版人物卡，非常好用！")
            .append("----------------------------------- ")

            .append(".getbook make\n")
            .append("获取车卡指南，新手花点时间准能看懂，能帮kp省很多事")
            .append("----------------------------------- ")

            .append(".getbook kp\n")
            .append("读规则书是好文明！")
            .append("----------------------------------- ")

            .append(".getbook rp\n")
            .append("角色扮演365问，不过只有问没有答，估计还是要读的人自己思考吧");

    StringBuffer dndHelp = new StringBuffer()
            .append(".dnd\n")
            .append(".dnd|.dnd 10\n")
            .append("生成dnd英雄人物卡")
            .append("----------------------------------- ")

            .append(".ri\n")
            .append(".ri|.ri 5|.ri+5|.ri-5\n")
            .append("先攻骰掷，目前只支持加减，有其它需要再联系我")
            .append("----------------------------------- ")

            .append(".init\n")
            .append("先攻骰掷列表")
            .append("----------------------------------- ")

            .append(".init clr\n")
            .append("清空先攻骰掷列表");
}
