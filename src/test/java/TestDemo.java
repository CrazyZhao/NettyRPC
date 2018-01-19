import com.alibaba.fastjson.JSONObject;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jdd on 2017/9/30.
 */
public class TestDemo {

    static class Test<T> {
        private T ob;

        public Test(T ob) {
            this.ob = ob;
        }

        public T getOb() {
            return ob;
        }

        public void setOb(T ob) {
            this.ob = ob;
        }

        public void showType(){
            System.out.println("T的实际类型是：" + ob.getClass().getName());
        }
    }

    /**
     * 泛型方法:只需将泛型参数列表置于返回值前
     * @param x
     * @param <T>
     */
    public <T> void f(T x){
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        /*Test<Integer> intOb = new Test<Integer>(88);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println("value= " + i);
        System.out.println("-----------------------");

        Test<String> strOb = new Test<String>("Hello Gen");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value= " + s);*/

        /*TestDemo testDemo = new TestDemo();
        testDemo.f("");
        testDemo.f(10);
        testDemo.f('a');
        testDemo.f(testDemo);*/

        /*ArrayList a = new ArrayList();
        a.add(1);
        CollectionGenTest<ArrayList> list = new CollectionGenTest<ArrayList>(a);
        System.out.println(list.getX().get(0));
        System.out.println("实例化成功!");*/
        /*String a = "8777.1";
        Long b = Long.valueOf(a.substring(0, a.lastIndexOf(".")));
        System.out.println(b);*/

        /*String a = "/open/coolball/api/checkIn/lotteryAwardList";
        System.out.println(a.substring(a.lastIndexOf("/") + 1, a.length()));*/

//        String a = "<p class=\"MsoNormal\">\t<span style=\"font-size:16px;\"><img src=\"http://fdfs.jdd.com/group1/M00/22/9C/CgoLQ1oqZnWAJ3JBAAEbQpRbgMs818.gif\" alt=\"\" />昨日没有推荐，新的一周新的开始，为各位带来一个女足的2</span><span style=\"font-family:宋体;font-size:16px;\">串</span><span style=\"font-family:Calibri;font-size:16px;\">1</span><span style=\"font-size:16px;\">分析，感谢打赏，欢迎订阅。<img src=\"http://fdfs.jdd.com/group1/M00/22/D1/CgoLQ1ouAE-AKTTyAAD6ys8B9Qg277.jpg\" alt=\"\" /></span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">周</span></b><b><span style=\"font-size:16px;\">一</span></b><b><span style=\"font-size:16px;\">001 </span><span style=\"font-family:宋体;font-size:16px;\">女东亚杯 朝鲜女足</span><span style=\"font-family:Calibri;font-size:16px;\">VS</span><span style=\"font-family:宋体;font-size:16px;\">韩国女足</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-family:宋体;font-size:16px;\">比赛时间：</span><span style=\"font-size:16px;\">2017</span><span style=\"font-family:宋体;font-size:16px;\">年</span><span style=\"font-family:Calibri;font-size:16px;\">12</span><span style=\"font-family:宋体;font-size:16px;\">月</span><span style=\"font-size:16px;\">11日周一15:10</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">比赛地点：日本</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">比赛天气：晴-10</span><span style=\"font-family:宋体;font-size:16px;\">℃</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">朝鲜女足</span></b><b><span style=\"font-family:宋体;font-size:16px;\">近况简析</span><span style=\"font-size:16px;\">:</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-family:宋体;font-size:16px;\">朝鲜女足现国际足联积</span><span style=\"font-size:16px;\">1949</span><span style=\"font-family:宋体;font-size:16px;\">分排名第</span><span style=\"font-family:Calibri;font-size:16px;\">10</span><span style=\"font-family:宋体;font-size:16px;\">，亚洲区排名第</span><span style=\"font-family:Calibri;font-size:16px;\">3</span><span style=\"font-family:宋体;font-size:16px;\">，而本场也是本届东亚杯女足的第二轮比赛，阵容方面本次</span><span style=\"font-family:宋体;font-size:16px;\">朝鲜女足以去年</span><span style=\"font-size:16px;\">U20</span><span style=\"font-family:宋体;font-size:16px;\">夺冠的阵容作为班底，同时还招入了</span><span style=\"font-family:Calibri;font-size:16px;\">U17</span><span style=\"font-family:宋体;font-size:16px;\">世界杯上大放异彩的前锋成香心，全队平均年龄仅有</span><span style=\"font-family:Calibri;font-size:16px;\">21</span><span style=\"font-family:宋体;font-size:16px;\">岁</span><span style=\"font-size:16px;\">，但是对阵中国队，凭借金润美的2</span><span style=\"font-family:宋体;font-size:16px;\">个进球，</span><span style=\"font-size:16px;\">球队</span><span style=\"font-family:宋体;font-size:16px;\">最终是以</span><span style=\"font-size:16px;\">2</span><span style=\"font-family:宋体;font-size:16px;\">比</span><span style=\"font-family:Calibri;font-size:16px;\">0</span><span style=\"font-family:宋体;font-size:16px;\">的比分战胜了</span><span style=\"font-size:16px;\">中国女足，球队整体来看状态不错。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">韩国女足</span></b><b><span style=\"font-family:宋体;font-size:16px;\">近况简析</span><span style=\"font-size:16px;\">:</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-family:宋体;font-size:16px;\">韩国女足如今排名第</span><span style=\"font-size:16px;\">15</span><span style=\"font-family:宋体;font-size:16px;\">名，首轮小组赛球队</span><span style=\"font-family:Calibri;font-size:16px;\">2:3</span><span style=\"font-family:宋体;font-size:16px;\">输给了日本女足，球队在进攻端端表现还是不错的，而且也确实打入了</span><span style=\"font-family:Calibri;font-size:16px;\">2</span><span style=\"font-family:宋体;font-size:16px;\">球，但是他们在最后时刻还是被对手绝杀，整体来看韩国女足也确实是四支球队里面相对实力最弱的。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">球队近期战绩：</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">朝鲜女足：胜胜负胜胜</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">韩国女足：负负负胜胜</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">交战记录：</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-family:宋体;font-size:16px;\">朝鲜女足此前</span><span style=\"font-size:16px;\">12</span><span style=\"font-family:宋体;font-size:16px;\">次与韩国女足交手，战绩</span><span style=\"font-family:Calibri;font-size:16px;\">8</span><span style=\"font-family:宋体;font-size:16px;\">胜</span><span style=\"font-family:Calibri;font-size:16px;\">3</span><span style=\"font-family:宋体;font-size:16px;\">平</span><span style=\"font-family:Calibri;font-size:16px;\">1</span><span style=\"font-family:宋体;font-size:16px;\">负，交锋战绩处在绝对优势，最近</span><span style=\"font-family:Calibri;font-size:16px;\">2</span><span style=\"font-family:宋体;font-size:16px;\">次交手都是平局。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">球队受伤缺阵</span></b><b><span style=\"font-size:16px;\">：</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">朝鲜女足：无&nbsp;</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">韩国女足：无</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">小王子解盘：<img src=\"http://fdfs.jdd.com/group1/M00/00/37/rBACD1ouAE-AQ8LZAAC7IrszCx0712.jpg\" alt=\"\" /></span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">本场比赛非常有特色，朝鲜半岛德比，现时亚盘来看，机构以朝鲜女足让半一开盘初盘上盘超低水，初盘来看机构对于朝鲜女足相当看好，后市上盘水位一路走高，临场已经升到了中水的位置，朝鲜女足本场显然没有得到机构的足够支撑，看起来客队更值得支持。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">竞彩主让一球推荐：</span><span style=\"font-family:宋体;font-size:16px;\">平局</span><span style=\"font-size:16px;\">@3.25</span><span style=\"font-family:宋体;font-size:16px;\">客胜</span><span style=\"font-family:Calibri;font-size:16px;\">2.35<img src=\"http://fdfs.jdd.com/group1/M00/19/09/CgoLd1ouAFiAY3bBAACkJmnfycQ306.jpg\" alt=\"\" /></span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">周</span></b><b><span style=\"font-size:16px;\">一</span></b><b><span style=\"font-size:16px;\">0</span></b><b><span style=\"font-size:16px;\">02</span></b><b><span style=\"font-size:16px;\">&nbsp;</span></b><b><span style=\"font-size:16px;\">女东亚杯</span></b><b><span style=\"font-size:16px;\">&nbsp;</span><span style=\"font-family:宋体;font-size:16px;\">日本女足</span><span style=\"font-size:16px;\">VS</span><span style=\"font-family:宋体;font-size:16px;\">中国女足</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-family:宋体;font-size:16px;\">比赛时间：</span><span style=\"font-size:16px;\">2017</span><span style=\"font-family:宋体;font-size:16px;\">年</span><span style=\"font-family:Calibri;font-size:16px;\">12</span><span style=\"font-family:宋体;font-size:16px;\">月</span><span style=\"font-size:16px;\">11日周一17:55</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">比赛地点：日本</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">比赛天气：晴-10</span><span style=\"font-family:宋体;font-size:16px;\">℃</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">日本女足</span></b><b><span style=\"font-family:宋体;font-size:16px;\">近况简析</span><span style=\"font-size:16px;\">:</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">作为本次东亚杯的东道主，日本女足多位海外主力并未获得征召，大名单中唯一一名海外球员是来自西雅图君主的后卫宇津木瑠美，而日本女足的主帅高仓麻子此前被评选为亚洲最佳女足主帅，首轮比赛日本女足3:2</span><span style=\"font-family:宋体;font-size:16px;\">绝杀了韩国女足，但是纵观整场比赛球队两度领先两度被对手逼平还是凸显了这支球队稳定性相当欠缺，整体来看日本女足防守端还是存在一定的问题。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">中国女足</span></b><b><span style=\"font-family:宋体;font-size:16px;\">近况简析</span><span style=\"font-size:16px;\">:</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-family:宋体;font-size:16px;\">在中国女足新帅埃约尔松上任之后，中国女足战绩为三战三败，更糟糕的是三场比赛下来进</span><span style=\"font-size:16px;\">1</span><span style=\"font-family:宋体;font-size:16px;\">球失</span><span style=\"font-family:Calibri;font-size:16px;\">10</span><span style=\"font-family:宋体;font-size:16px;\">球，球队进攻端出线了非常大的问题，而且三连败的成绩使得球队目前压力非常大，球队急需一场哪怕是平局来止住连败之势。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">交战记录：</span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-family:宋体;font-size:16px;\">双方此前</span><span style=\"font-size:16px;\">17</span><span style=\"font-family:宋体;font-size:16px;\">次交手，中国面对日本战绩</span><span style=\"font-family:Calibri;font-size:16px;\">3</span><span style=\"font-family:宋体;font-size:16px;\">胜</span><span style=\"font-family:Calibri;font-size:16px;\">4</span><span style=\"font-family:宋体;font-size:16px;\">平</span><span style=\"font-family:Calibri;font-size:16px;\">10</span><span style=\"font-family:宋体;font-size:16px;\">负，最近一次交手中国女足客场</span><span style=\"font-family:Calibri;font-size:16px;\">2</span><span style=\"font-size:16px;\">;1</span><span style=\"font-family:宋体;font-size:16px;\">击败对手。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-family:宋体;font-size:16px;\">小王子解盘</span><span style=\"font-size:16px;\">:<img src=\"http://fdfs.jdd.com/group1/M00/19/09/CgoLd1ouAGaAOQJmAACrIXj_p-o535.jpg\" alt=\"\" /></span></b><b><o:p></o:p></b></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">现时亚盘来看初盘给出日本女足主让一球上盘低水，初盘机构对于日本女足还是比较看好的，而从后市走势来看东道主水位一路走低到超低水，指数上明显有降低赔率的需求，本场日本女足完胜可期。</span><o:p></o:p></p><p class=\"MsoNormal\">\t<span style=\"font-size:16px;\">日本女足主让一球推荐：主胜@2.16</span><o:p></o:p></p><p class=\"MsoNormal\">\t<b><span style=\"font-size:16px;\">【版权申明】：本文仅代表作者观点，不代表奖多多官方立场，未经许可，不得转载。</span></b></p>";
//        if (a.indexOf("<br />") > 0){
//            System.out.println(a.substring(a.indexOf("<br />") + 6, a.length()));
//        }else {
//
//        }


        /*String a = "<img src=\\\"http://fdfs.jdd.com/group1/M00/22/9C/CgoLQ1oqZ6WAflypAAG44Lqhp28721.gif\\\" alt=\\\"\\\" />\" +\n" +
                "                \"<span style=\\\"font-size:16px";
        a = a.replaceAll("src", "");
        System.out.println(a);*/

        /*String a = "content=<span style=\"font-size:16px;\"><a href=\"https://h5.jdd.com/common/newfootball/index.html?mid=11836830&firstIndex=1&secondIndex=3\">竞彩足球周一010法乙尼姆vs克莱蒙</a></span><br /><span style=\"font-size:16px;\">比赛时间：2017-12-12星期二03:45</span><br /><span style=\"font-size:16px;\">比赛地点：克西特尔球场（Stade des Costières）</span><br /><span style=\"font-size:16px;\">天气情况：阴6-7℃</span><br /><span style=\"font-size:16px;\">澳门盘口：0.80半球1.00</span><br /><span style=\"font-size:16px;\">平均赔率：1.75 3.38 4.08</span><br /><span style=\"font-size:16px;\">【交战历史】</span><br /><span style=\"font-size:16px;\">双方近16次交锋，尼姆取得4胜3平9负，其中主场2胜3平3负，往绩方面尼姆处于下风。</span><span style=\"font-size:16px;\"><img src=\"http://fdfs.jdd.com/group1/M00/19/00/CgoLd1otYXiAYeR3AAC-QUp0r4k643.jpg\" alt=\"\" />【主队实力状态】</span><br /><span style=\"font-size:16px;\">尼姆上赛季距离升级区只有2分之差，本赛季再度向法甲发起冲击，目前以11胜1平5负的成绩排名第二位，讲究进攻性打法，与对手死拼因而平局不多，得失球比37/17个，进攻火力十足，是进球最多的队伍，防守端稍显薄弱，失球数相对较多，实力属于上游水平，主场6胜1平2负战斗力强劲，上周末法国杯客场大胜一支业余球队，从10月份以来各项赛事取得8胜1负的战绩，状态十分出色。</span><br /><span style=\"font-size:16px;\">【客队实力状态】</span><br /><span style=\"font-size:16px;\">克莱蒙目前以8胜5平4负的成绩排名第8位，与积分榜前列球队交锋胜少负多，欠缺抵抗力，得失球比23/13个，进攻能力尚可，防守相当稳健，失球数仅次于兰斯，是第二少的球队，实力属于中上游水平，客场3胜4平2负有一定战斗力，上轮联赛主场负于布雷斯特，联赛六场不败的走势断缆，士气难免受挫，由于法国杯早被淘汰出局，因而上周末轮休，体能上有保证，本场作客凭借稳固的防线，有能力抵挡对手的进攻。</span><br /><span style=\"font-size:16px;\">【阵容伤停】</span><br /><span style=\"font-size:16px;\">尼姆中场盖坦·帕奎兹（出场10次）、前锋博佐克（出场16次进14球）两名主力累积黄牌停赛；克莱蒙后卫托马斯·丰泰尼（出场16次）累积黄牌停赛，后卫卡夫丹斯基（出场8次）和中场格尔波特（出场0次）因伤缺阵。</span><br /><span style=\"font-size:16px;\">【尼姆】预测首发：瓦莱特、卡达穆罗、瓦尔斯、哈雷克、博斯卡利、阿拉库奇、瓦尔迪维亚、萨维安尼尔、布里昂松、阿利奥伊、德普雷</span><br /><span style=\"font-size:16px;\">【克莱蒙】预测首发：贝尔纳多尼、福若、杜里尼、朱利安·拉博特、加沃里、佩雷斯、伊格莱西亚斯、卢多维克·阿约克、佩雷拉·拉吉、恩迪亚耶、杜基蒙特</span><br /><span style=\"font-size:16px;\">【赔盘指向】</span><span style=\"font-size:16px;\"><img src=\"http://fdfs.jdd.com/group1/M00/00/2E/rBACDlotYg-ASF4LAACJot8wb34759.jpg\" alt=\"\" />目前本场比赛欧洲平均赔率1.75 3.38 4.08，即时欧赔变动不大，主胜赔在1.80以下合理，主流公司平赔在3.50以上，平局空间不大，客胜赔被压低，欧指看好分胜负，竞彩指数1.62 3.60 4.30较为青睐主胜，澳彩开出主让半球低水，主队实力、状态稍胜一筹，尼姆并非传统强队，市场形象不是很高大，从基本面来看，盘口合理高看主队一线，下盘不乏拉力，上盘搭配低水显示了主队优势，结合欧赔，本场上盘可博，推荐胜。</span><br /><span style=\"font-size:16px;\"><strong>竞彩足球胜平负推荐：胜@1.62</strong></span><br /><span style=\"font-size:16px;\"><a href=\"https://h5.jdd.com/common/newfootball/index.html?mid=11868484&firstIndex=1&secondIndex=3\" target=\"_blank\">竞彩足球周一011英冠雷丁vs加的夫城</a></span><br /><span style=\"font-size:16px;\">比赛时间：2017-12-12星期二04:00</span><br /><span style=\"font-size:16px;\">比赛地点：马德伊斯基球场（Madejski Stadium）</span><br /><span style=\"font-size:16px;\">天气情况：多云1-2℃</span><br /><span style=\"font-size:16px;\">澳门盘口：1.00平手0.80</span><br /><span style=\"font-size:16px;\">平均赔率：2.72 3.13 2.39</span><br /><span style=\"font-size:16px;\">【交战历史】</span><br /><span style=\"font-size:16px;\">双方近20次交锋，雷丁取得6胜8平6负，其中主场3胜5平2负，往绩方面势均力敌，但雷丁主场有一定优势。</span><span style=\"font-size:16px;\"><img src=\"http://fdfs.jdd.com/group1/M00/19/00/CgoLd1otYfeAZXKcAACf_ASSoII809.jpg\" alt=\"\" />【主队实力状态】</span><br /><span style=\"font-size:16px;\">雷丁本赛季表现时好时坏，发挥不稳是球队的主要弱点，目前以7胜5平8负的成绩排名第16位，得失球比26/24个，攻守能力一般，实力属于中下游水平，主场3胜3平4负战斗力较差，上轮客场大胜降班马桑德兰，近期取得两连胜，状态方面不错，从11月份以来7场比赛4胜2平1负，仅输给榜首的狼队，与强队交锋欠缺本钱，本场迎战积分榜第二的加的夫城，恐怕难以威胁对手。</span><br /><span style=\"font-size:16px;\">【客队实力状态】</span><br /><span style=\"font-size:16px;\">加的夫城本赛季表现十分神勇，目前以13胜4平3负的成绩排名第二，进30球的同时仅失14球，可谓是攻守兼备，是失球最少的球队，实力层面具备了升级的能力，客场6胜1平3负战斗力强劲，上轮主场3比1大胜诺维奇后取得四连胜，四场比赛打进8球仅失1球，状态十分出色，由于本轮榜首的狼队被逼平，本场取胜即可把积分差距缩小到两分，战意毋庸置疑。</span><br /><span style=\"font-size:16px;\">【阵容伤停】</span><br /><span style=\"font-size:16px;\">雷丁后卫奥比塔（出场2次）、中场麦克莱利（出场9次）和斯威夫特（出场10次进2球）、前锋门德斯（出场3次）因伤缺阵；加的夫城中场贡纳松（出场12次）、前锋佐霍尔（出场12次进3球）因伤缺阵，老伤号门将李坎普、中场哈里斯和前锋希利仍是无法出战。</span><br /><span style=\"font-size:16px;\">【雷丁】预测首发：曼诺内、冈特、麦克沙恩、利亚姆·摩尔、伊洛里、布莱克特、范登伯格、贝伦斯、埃文斯、大卫·爱德华兹、阿鲁科</span><br /><span style=\"font-size:16px;\">【加的夫城】预测首发：埃瑟里奇、佩尔蒂尔、乔·贝内特、西恩·莫里森、布鲁诺·曼加、班巴、莱因、丹穆尔、克雷格·布莱森、凯列特、丹尼·沃德</span><br /><span style=\"font-size:16px;\">【赔盘指向】</span><span style=\"font-size:16px;\"><img src=\"http://fdfs.jdd.com/group1/M00/00/2E/rBACDlotYeKAeM2uAACIINZAABI303.jpg\" alt=\"\" />目前本场比赛欧洲平均赔率2.72 3.13 2.39，即时欧赔主胜小幅上调，而在平和负赔则是升降不够统一，从欧赔开出232的结构上来看，欧指偏向分胜负，竞彩指数2.70 3.10 2.30偏向客队不败，澳彩开出平手盘客队低水，两队都曾征战过英超，名气上相差不大，实力和状态方面客队稍胜一筹，从基本面来看，并没有显示出雷丁的优势，盘口倾向于客队一方，玩家投注心里两分，两边都有人捧场，走势盘有可能变为客让平半高水，结合欧赔态度，本场双选胜负稳妥。</span><br /><span style=\"font-size:16px;\"><strong>竞彩足球胜平负推荐：胜@2.70，负@2.30</strong></span><br /><span style=\"font-size:16px;\"><strong>版权申明：本文仅代表作者观点，不代表球酷官方立场，未经许可，不得转载。</strong></span><br />";

        List<String> link = getLink(a);
        System.out.println(link.toString());*/
        /*String title = "[竞足前瞻]是的法律开奖单数李开复";
        title = title.replaceAll("\\[竞足前瞻\\]", "");
        System.out.println(title);*/

        /*JSONObject obj = new JSONObject();
        obj.put("a", 1);
        obj.put("b", 2);*/

        /*String a = "【多多早班车】胜多负少东方闪电";
        //String a = "[多多早班车]胜多负少东方闪电";
        a= a.replaceAll("【多多早班车】", "");
        a= a.replaceAll("\\[多多早班车\\]", "");
        System.out.println(a);*/
        /*BigDecimal a = new BigDecimal(-500.00);
        System.out.println(a.abs());*/

        /*Random random = new Random();
        for(int i=0;i<10;i++){
            int a = (random.nextInt(5) + 1) * 11;
            System.out.println(a);
        }*/

        //Random random = new Random();
        /*for(int i=0;i<10;i++){
            int a = new Random().nextInt(100) + 100;
            System.out.println(a);
        }*/

        LeftMoneyPackage leftMoneyPackage = new LeftMoneyPackage();
        leftMoneyPackage.setRemainMoney(1000.00); //原始100000
        leftMoneyPackage.setRemainSize(3);
        for (int i =0;i<3;i++){
            System.out.println(BigDecimal.valueOf(getRandomMoney(leftMoneyPackage)).multiply(new BigDecimal(100)).toBigInteger());
        }

    }

    /**
     *
     * @param s
     * @return 获得链接
     */
    public static List<String> getLink(final String s)
    {
        String regex;
        final List<String> list = new ArrayList<String>();
        regex = "(<a[\\\\s+]*([^>h]|h(?!ref\\b))*href[\\\\s+]*=[\\\\s+]*[('|\")]?)([^(\\\\s+|'|\")]*)([^>]*>)";
        final Pattern pa = Pattern.compile(regex, Pattern.DOTALL);
        final Matcher ma = pa.matcher(s);
        while (ma.find())
        {
            list.add(ma.group());
        }
        return list;
    }


    /*public static BigDecimal getRandomMoney(LeftMoneyPackage _leftMoneyPackage) {
        // remainSize 剩余的红包数量
        // remainMoney 剩余的钱
        _leftMoneyPackage.setRemainMoney(_leftMoneyPackage.getRemainMoney().divide(new BigDecimal(100)));
        if (_leftMoneyPackage.remainSize == 1) {
            _leftMoneyPackage.remainSize--;
            return _leftMoneyPackage.remainMoney.multiply(new BigDecimal(100));
        }
        Random r     = new Random();
        double min   = 0.01; //
        BigDecimal max   = _leftMoneyPackage.remainMoney.divide(BigDecimal.valueOf(_leftMoneyPackage.remainSize)).multiply(BigDecimal.valueOf(2));
        BigDecimal money = BigDecimal.valueOf(r.nextLong()).multiply(max);
        money = money.compareTo(BigDecimal.valueOf(min)) <= 0 ? BigDecimal.valueOf(0.01): money;
        _leftMoneyPackage.remainSize--;
        _leftMoneyPackage.remainMoney = _leftMoneyPackage.remainMoney.subtract(money);
        _leftMoneyPackage.setRemainMoney(_leftMoneyPackage.getRemainMoney().multiply(BigDecimal.valueOf(100)));
        return money.multiply(BigDecimal.valueOf(100));
    }*/

    public static double getRandomMoney(LeftMoneyPackage _leftMoneyPackage) {
        // remainSize 剩余的红包数量
        // remainMoney 剩余的钱
        if (_leftMoneyPackage.remainSize == 1) {
            _leftMoneyPackage.remainSize--;
            return (double) Math.round(_leftMoneyPackage.remainMoney * 100) / 100;
        }
        Random r     = new Random();
        double min   = 0.01; //
        double max   = _leftMoneyPackage.remainMoney / _leftMoneyPackage.remainSize * 2;
        double money = r.nextDouble() * max;
        money = money <= min ? 0.01: money;
        money = Math.floor(money * 100) / 100;
        _leftMoneyPackage.remainSize--;
        _leftMoneyPackage.remainMoney -= money;
        return money;
    }

    static class LeftMoneyPackage {
        Integer remainSize;
        Double remainMoney;

        public Integer getRemainSize() {
            return remainSize;
        }

        public void setRemainSize(Integer remainSize) {
            this.remainSize = remainSize;
        }

        public Double getRemainMoney() {
            return remainMoney;
        }

        public void setRemainMoney(Double remainMoney) {
            this.remainMoney = remainMoney;
        }
    }


}
