package com.example.taobao20.fragment.fragmentshouye.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by 姜天赐 on 2017/11/9.
 */

public class SYBean {


    /**
     * ver : 1510290900000
     * goods_list : [{"normal_price":4200,"cnt":6193,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-27/c9cfd5826c0ed89b4f1ddbb3e14bb83b.jpeg","event_type":0,"country":"","short_name":"天天特价秋冬加绒加厚纯棉长袖T恤 男大码运动保暖卫衣套头宽松版","group":{"customer_num":2,"price":2990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509117870,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-27/75adcf653183207514fba24fe5d1a4c6.jpeg","market_price":16580,"goods_name":"天天特价秋冬加绒加厚纯棉长袖T恤 男大码运动保暖卫衣套头宽松版","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-27/1f77fe3601a152a8266f2985cfd7721a.jpeg","quantity":312,"is_onsale":true,"goods_id":149376629,"is_app":0,"mall_id":605679,"region_limit":0},{"normal_price":15990,"cnt":59,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-17/91cdc6d55b0f418466a72f1e5e022db0.jpeg","event_type":0,"country":"","short_name":"【新品特惠 高质量】韩版女装双面呢子羊绒大衣女毛呢外套中长款过膝宽松名媛风毛呢大衣女毛呢外套女毛呢女潮","group":{"customer_num":2,"price":9590},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1510266572,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-17/62263490679516d89802b6a38bfde3b4.jpeg","market_price":69900,"goods_name":"【新品特惠 高质量】韩版女装双面呢子羊绒大衣女毛呢外套中长款过膝宽松名媛风毛呢大衣女毛呢外套女毛呢女潮","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-17/e1e2d10b6037b3a61011becc978936d8.jpeg","quantity":693,"is_onsale":true,"goods_id":124685154,"is_app":0,"mall_id":787090,"region_limit":0},{"normal_price":7300,"cnt":2277,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/54f7d726ef89579ada07fa8588714b6d.jpeg","event_type":0,"country":"","short_name":"【温碧霞代言】蜗牛原液护肤品套装五件套六件套6件套礼盒化妆品女士美白补水保湿洁面乳爽肤水乳液面霜BB霜去黄淡斑抗皱紧致","group":{"customer_num":2,"price":6800},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509453871,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/56222b9a30b4eb667914ca237a73061d.jpeg","market_price":59900,"goods_name":"【温碧霞代言】蜗牛原液护肤品套装五件套六件套6件套礼盒化妆品女士美白补水保湿洁面乳爽肤水乳液面霜BB霜去黄淡斑抗皱紧致","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-08-03/527d92f840acefb878d6b484557f60d9.jpeg","quantity":4025,"is_onsale":true,"goods_id":43235575,"is_app":0,"mall_id":358595,"region_limit":0},{"normal_price":1480,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/2005f9276e1bb45dcee21ab33a727049.jpeg","event_type":0,"country":"","short_name":"【一件送防水饭兜，无差价】1-2-3岁宝宝儿童罩衣防水长袖婴儿反穿衣画画衣秋冬季加厚加大水晶绒罩衣男女童装儿童新款","group":{"customer_num":2,"price":1380},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1510286683,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/39923161b6786e0f545020e93fc26048.jpeg","market_price":1490,"goods_name":"【一件送防水饭兜，无差价】1-2-3岁宝宝儿童罩衣防水长袖婴儿反穿衣画画衣秋冬季加厚加大水晶绒罩衣男女童装儿童新款","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/6fb3317430057e04e2ff355422f7ca39.jpeg","quantity":1050,"is_onsale":true,"goods_id":181911281,"is_app":0,"mall_id":386318,"region_limit":0},{"normal_price":2190,"cnt":152,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-23/6c55587fc36681d8c765e1e68a0a5711.jpeg","event_type":0,"country":"","short_name":"【今日特价】2017新款男童牛仔裤加绒加厚保暖冬季冬款长裤子宝宝棉裤外穿小孩男孩加棉夹棉中大小童休闲直筒迷彩3~12岁","group":{"customer_num":2,"price":990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1510244074,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-23/2a7b361032eb05a72020054ba3cf353c.jpeg","market_price":4900,"goods_name":"【今日特价】2017新款男童牛仔裤加绒加厚保暖冬季冬款长裤子宝宝棉裤外穿小孩男孩加棉夹棉中大小童休闲直筒迷彩3~12岁","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-23/a8250494709114261aed41763247596e.jpeg","quantity":180,"is_onsale":true,"goods_id":138748455,"is_app":0,"mall_id":826356,"region_limit":0},{"normal_price":3650,"cnt":73,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-06/94a1451ac99aeae97f92766fef514be5.jpeg","event_type":12,"country":"","short_name":"2017新款宝宝秋衣秋裤纯棉男童女童长袖儿童保暖内衣套装秋季睡衣小孩全棉棉毛衫家居服可开档","group":{"customer_num":2,"price":2880},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1510284583,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-18/c7e2a4367a12da022a47bd029ba108a8.jpeg","market_price":8800,"goods_name":"2017新款宝宝秋衣秋裤纯棉男童女童长袖儿童保暖内衣套装秋季睡衣小孩全棉棉毛衫家居服可开档","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-06/e160b6532fb0e279db0464e42bad486e.jpeg","quantity":1887,"is_onsale":true,"goods_id":127546288,"is_app":0,"mall_id":797679,"region_limit":0},{"normal_price":4600,"cnt":1226,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-05/6b01209be106a9352c30ee6031e4edff.jpeg","event_type":0,"country":"","short_name":"【前1000名29.9，活动结束恢复原价】2017秋冬新款毛衣女宽松套头短款百搭针织衫圆领灯笼袖学生上衣","group":{"customer_num":2,"price":2990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509969368,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-05/4de26205066a8aac0b252ab6dfc582c2.jpeg","market_price":5900,"goods_name":"【前1000名29.9，活动结束恢复原价】2017秋冬新款毛衣女宽松套头短款百搭针织衫圆领灯笼袖学生上衣","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-05/1a6b5e8fed9b11dbe9be55ed0d2f7f9f.jpeg","quantity":1096,"is_onsale":true,"goods_id":26120484,"is_app":0,"mall_id":14640,"region_limit":1},{"normal_price":1100,"cnt":6,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/5008b50b78cd9e0995eb6bfe7aebfa08.jpeg","event_type":0,"country":"","short_name":"【99%丰满增大 正品保证】【15天A罩升D罩】持国家功效特证 强效丰胸增大防止下垂 告别飞机场 爱肤宜丰胸精油30ml","group":{"customer_num":2,"price":990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,30,31,32","time":1510279486,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/eb669469d1106075219728541da21db7.jpeg","market_price":18800,"goods_name":"【99%丰满增大 正品保证】【15天A罩升D罩】持国家功效特证 强效丰胸增大防止下垂 告别飞机场 爱肤宜丰胸精油30ml","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/7a537938c59a0f83390955e1a8318f38.jpeg","quantity":993,"is_onsale":true,"goods_id":182605427,"is_app":0,"mall_id":835326,"region_limit":1},{"normal_price":5990,"cnt":133,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/4c40392257613d7bfc12a239c2c268fa.jpeg","event_type":0,"country":"","short_name":"【新品上线M-4XL】2017秋冬新款时尚呢子连衣裙女圆领大码宽松显瘦打底裙过膝长裙","group":{"customer_num":2,"price":5550},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509764970,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/b8761a6a60e6227125c8953d54c4969f.jpeg","market_price":88800,"goods_name":"【新品上线M-4XL】2017秋冬新款时尚呢子连衣裙女圆领大码宽松显瘦打底裙过膝长裙","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-17/75dbc308ce97426c943001ac7aa134c0.jpeg","quantity":631,"is_onsale":true,"goods_id":171093778,"is_app":0,"mall_id":790708,"region_limit":0},{"normal_price":1590,"cnt":5824,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/9d7d07fe9a67147e6d4975416d4379d5.jpeg","event_type":0,"country":"","short_name":"【老板说亏本卖 食品级不锈钢】企鹅304不锈钢内胆保温杯300ml创意呆萌卡通新款企鹅杯水壶创意杯礼品杯学生儿童杯情侣杯","group":{"customer_num":2,"price":930},"allowed_region":"2,3,4,5,6,7,8,10,11,12,13,14,15,16,17,18,19,20,22,23,24,25,26,27,30,31,32,9","time":1509883490,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/3dce8789bde7f125adbb9344439196b3.jpeg","market_price":1990,"goods_name":"【老板说亏本卖 食品级不锈钢】企鹅304不锈钢内胆保温杯300ml创意呆萌卡通新款企鹅杯水壶创意杯礼品杯学生儿童杯情侣杯","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/a74a795de7cb04750bf72f716b653c4b.jpeg","quantity":1480,"is_onsale":true,"goods_id":172334000,"is_app":0,"mall_id":795823,"region_limit":1},{"normal_price":8900,"cnt":647,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-12/f520bacf4622bcfd5c3e4b5866a6e94c.jpeg","event_type":0,"country":"","short_name":"【优质】2017秋冬季新款女装加绒修身PU皮衣长袖中长款连衣裙秋装打底衫","group":{"customer_num":2,"price":5900},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509162265,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-12/a6a8e2ead26b0414799516b43509b299.jpeg","market_price":19800,"goods_name":"【优质】2017秋冬季新款女装加绒修身PU皮衣长袖中长款连衣裙秋装打底衫","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-12/6150a1356ab77891bb3bf411d13c1e57.jpeg","quantity":2775,"is_onsale":true,"goods_id":117117636,"is_app":0,"mall_id":119468,"region_limit":0},{"normal_price":4990,"cnt":3074,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-14/e4496272b7fd98148464a6d9e71ab85f.jpeg","event_type":0,"country":"","short_name":"【39.9抢500件，抢完恢复49..9】【加绒不加价】【大码200斤】松紧腰牛仔裤女哈伦宽松大码显瘦中腰小脚长裤","group":{"customer_num":2,"price":3990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509870579,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-09-04/bde99f2acd3b45470b384bb7e99657e6.jpeg","market_price":29900,"goods_name":"【39.9抢500件，抢完恢复49..9】【加绒不加价】【大码200斤】松紧腰牛仔裤女哈伦宽松大码显瘦中腰小脚长裤","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-14/4a0b3a1dbbc0a3da4a74948b6c195fbf.jpeg","quantity":11414,"is_onsale":true,"goods_id":10566814,"is_app":0,"mall_id":213423,"region_limit":0},{"normal_price":5900,"cnt":2082,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-14/e0164647df035c1ab2138d507c21c677.jpeg","event_type":12,"country":"","short_name":"【亏本促销】【每人限购一件】2017秋冬新款女装水貂绒毛衣女中长款韩版宽松套头泡泡袖显瘦针织衫时尚百搭打底衫加绒加厚","group":{"customer_num":2,"price":4880},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509951884,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-14/b51b6161061b4bbab3d58112a6ed7950.jpeg","market_price":19900,"goods_name":"【亏本促销】【每人限购一件】2017秋冬新款女装水貂绒毛衣女中长款韩版宽松套头泡泡袖显瘦针织衫时尚百搭打底衫加绒加厚","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-14/7bc7f20097bbdb55fd1408733a3c9b14.jpeg","quantity":1653,"is_onsale":true,"goods_id":119520491,"is_app":0,"mall_id":475066,"region_limit":0},{"normal_price":5280,"cnt":153,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/316c902eb5232639c09dedc6155caee0.jpeg","event_type":0,"country":"","short_name":"【冬季新品】保暖金丝绒上衣女2017秋冬新款修身显瘦气质加厚长袖打底衫复古长袖t恤潮","group":{"customer_num":2,"price":4990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509886190,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/e699562910b73f1b838773ecda786d37.jpeg","market_price":14800,"goods_name":"【冬季新品】保暖金丝绒上衣女2017秋冬新款修身显瘦气质加厚长袖打底衫复古长袖t恤潮","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/19235e7a579b6291f09301309735e942.jpeg","quantity":837,"is_onsale":true,"goods_id":174213779,"is_app":0,"mall_id":234455,"region_limit":0},{"normal_price":4580,"cnt":5258,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/733b39a9d1e8a6547884af0ec5462cf1.jpeg","event_type":0,"country":"","short_name":"【95%棉男童加绒加厚卫衣打底衫】男童棉质卫衣中高领加绒加厚打底衫上衣外套外穿","group":{"customer_num":2,"price":2980},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509961609,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/140952de5c92b8bd102b8b7ab3320943.jpeg","market_price":12800,"goods_name":"【95%棉男童加绒加厚卫衣打底衫】男童棉质卫衣中高领加绒加厚打底衫上衣外套外穿","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-04/da6f0d52190aaf32423c5d0a9ef6eaa2.jpeg","quantity":760,"is_onsale":true,"goods_id":173762959,"is_app":0,"mall_id":136195,"region_limit":0},{"normal_price":3990,"cnt":0,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/60c362b800143f8bb58e9068c103bdd4.jpeg","event_type":0,"country":"","short_name":"【真兔毛】【26.9限1000件！抢完恢复35.9】豆鞋女秋2017新款韩版百搭女鞋蝴蝶结低跟平底尖头毛毛鞋","group":{"customer_num":2,"price":2690},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1510289979,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/0edca28a514b0b77f52fea88f61661e4.jpeg","market_price":11900,"goods_name":"【真兔毛】【26.9限1000件！抢完恢复35.9】豆鞋女秋2017新款韩版百搭女鞋蝴蝶结低跟平底尖头毛毛鞋","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-08/aa7817dd4ab6383eece19924e36aea6a.jpeg","quantity":2400,"is_onsale":true,"goods_id":182958008,"is_app":0,"mall_id":39291,"region_limit":0},{"normal_price":6100,"cnt":2081,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-25/734330b8a029ae78f2a7bf4795ea4b39.jpeg","event_type":0,"country":"","short_name":"【花花公子贵宾正品】【7色可选薄款和加绒俩款长袖衬衫】中年男装2017秋冬季新款百搭男士印花休闲免烫衬衣潮爸爸装","group":{"customer_num":2,"price":4800},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509190169,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-25/697d6c9fb880df0a09392e657c2e4b0c.jpeg","market_price":22800,"goods_name":"【花花公子贵宾正品】【7色可选薄款和加绒俩款长袖衬衫】中年男装2017秋冬季新款百搭男士印花休闲免烫衬衣潮爸爸装","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-10-25/13888250936fbc40d46998540d2dec5d.jpeg","quantity":4093,"is_onsale":true,"goods_id":145291420,"is_app":0,"mall_id":465982,"region_limit":0},{"normal_price":1090,"cnt":331,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/8f9c39eb3a63900e9b2767d3f7860336.jpeg","event_type":0,"country":"","short_name":"【1天去脚气】天怡去脚气包 特效去除脚臭脚痒脚脱皮脚汗烂脚丫 快速见效 永不复发 治脚气 烂脚丫 脱皮水泡裂口脚痒脚臭","group":{"customer_num":2,"price":990},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1510053877,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/4133a478fd8b7ef3f718d7727ae9571a.jpeg","market_price":11200,"goods_name":"【1天去脚气】天怡去脚气包 特效去除脚臭脚痒脚脱皮脚汗烂脚丫 快速见效 永不复发 治脚气 烂脚丫 脱皮水泡裂口脚痒脚臭","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/6f51628fd0b7fb58bfc2f68f44569d67.jpeg","quantity":2294,"is_onsale":true,"goods_id":170126123,"is_app":0,"mall_id":127079,"region_limit":0},{"normal_price":6990,"cnt":1480,"thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/a14bc79a629d9ac0a18b90628db7972a.jpeg","event_type":12,"country":"","short_name":"【38-45码】2017冬季新款男鞋品牌运动鞋男士加绒保暖棉鞋防滑气垫跑步鞋子韩版耐磨休闲鞋学生系带青少年皮面旅游鞋子男","group":{"customer_num":2,"price":6800},"allowed_region":"2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32","time":1509866378,"image_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/872e30b10516c31e636aecefc6206f60.jpeg","market_price":16900,"goods_name":"【38-45码】2017冬季新款男鞋品牌运动鞋男士加绒保暖棉鞋防滑气垫跑步鞋子韩版耐磨休闲鞋学生系带青少年皮面旅游鞋子男","hd_thumb_url":"http://omsproductionimg.yangkeduo.com/images/2017-11-03/d97dee698e46ce7816e02608b36e176e.jpeg","quantity":28920,"is_onsale":true,"goods_id":171136865,"is_app":0,"mall_id":240025,"region_limit":0}]
     * server_time : 1510291064
     */

    public long ver;
    public int server_time;
    public List<GoodsListBean> goods_list;

    public static SYBean objectFromData(String str) {

        return new Gson().fromJson(str, SYBean.class);
    }

    public static class GoodsListBean {
        /**
         * normal_price : 4200
         * cnt : 6193
         * thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-10-27/c9cfd5826c0ed89b4f1ddbb3e14bb83b.jpeg
         * event_type : 0
         * country :
         * short_name : 天天特价秋冬加绒加厚纯棉长袖T恤 男大码运动保暖卫衣套头宽松版
         * group : {"customer_num":2,"price":2990}
         * allowed_region : 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32
         * time : 1509117870
         * image_url : http://omsproductionimg.yangkeduo.com/images/2017-10-27/75adcf653183207514fba24fe5d1a4c6.jpeg
         * market_price : 16580
         * goods_name : 天天特价秋冬加绒加厚纯棉长袖T恤 男大码运动保暖卫衣套头宽松版
         * hd_thumb_url : http://omsproductionimg.yangkeduo.com/images/2017-10-27/1f77fe3601a152a8266f2985cfd7721a.jpeg
         * quantity : 312
         * is_onsale : true
         * goods_id : 149376629
         * is_app : 0
         * mall_id : 605679
         * region_limit : 0
         */

        public int normal_price;
        public int cnt;
        public String thumb_url;
        public int event_type;
        public String country;
        public String short_name;
        public GroupBean group;
        public String allowed_region;
        public int time;
        public String image_url;
        public int market_price;
        public String goods_name;
        public String hd_thumb_url;
        public int quantity;
        public boolean is_onsale;
        public int goods_id;
        public int is_app;
        public int mall_id;
        public int region_limit;

        public static GoodsListBean objectFromData(String str) {

            return new Gson().fromJson(str, GoodsListBean.class);
        }

        public static class GroupBean {
            /**
             * customer_num : 2
             * price : 2990
             */

            public int customer_num;
            public int price;

            public static GroupBean objectFromData(String str) {

                return new Gson().fromJson(str, GroupBean.class);
            }
        }
    }
}
