
package com.wuhancredit.www;

public class PermissonWHBean {
    public static String id;// 用于数据传输发生错误时记录传输失败的数据

    public static String XK_XDR;// 行政相对人名称

    public static String XK_FR;// 法定代表人姓名

    public static String XK_XDR_SHXYM;// 行政相对人代码_1(统一社会信用代码)

    public static String XK_XDR_ZDM;// 行政相对人代码_2(组织机构代码)

    public static String XK_XDR_GSDJ;// 行政相对人代码_3(工商登记码)

    public static String XK_XDR_SWDJ;// 行政相对人代码_4(税务登记号)

    public static String XK_XDR_SFZ;// 行政相对人代码_5 (居民身份证号)

    public static String XK_XMMC;// 项目名称

    public static String XK_SPLB;// 审批类别

    public static String XK_WSH;// 行政许可决定书文号

    public static String XK_NR;// 许可内容

    public static String XK_JDRQ;// 许可生效期

    public static String XK_JZQ;// 许可截止期

    public static String XK_XZJG;// 许可机关

    public static String XK_ZT;// 当前状态

    public static String DFBM;// 地方编码

    public static String SJC;// 数据更新时间戳

    public static String BZ;// 备注

    public static String QTXX;// 其他信息

    public static String SJMC;// 事件名称

    public static void setX(int i, String contents) {
        contents = contents.replace("'", "");
        if (contents.equals("/") || contents.equals("") || contents.equals("无")) {
            contents = "null";
        } else {
            contents = "'" + contents + "'";
        }
        switch (i) {
            case 0:
                XK_XDR = contents;
                break;
            case 1:
                XK_FR = contents;
                break;
            case 2:
                XK_XDR_SHXYM = contents;
                break;
            case 3:
                XK_XDR_ZDM = contents;
                break;
            case 4:
                XK_XDR_GSDJ = contents.replace("�", "");
                break;
            case 5:
                XK_XDR_SWDJ = contents;
                break;
            case 6:
                XK_XDR_SFZ = contents.replace("�", "");
                break;
            case 7:
                XK_XMMC = contents;
                break;
            case 8:
                XK_SPLB = contents;
                break;
            case 9:
                XK_WSH = contents;
                break;
            case 10:
                XK_NR = contents;
                break;
            case 11:
                if (contents.equals("null")) {
                    XK_JDRQ = contents;
                } else {
                    XK_JDRQ = Common.sToDate(contents.substring(1, contents.length() - 1));
                }
                break;
            case 12:
                if (contents.equals("null")) {
                    XK_JZQ = "null";
                } else {
                    XK_JZQ = Common.sToDate(contents.substring(1, contents.length() - 1));
                }
                break;
            case 13:
                XK_XZJG = contents;
                break;
            case 14:
                if (contents.equals("null")) {
                    XK_ZT = contents;
                } else {
                    XK_ZT = Common.toState(contents.substring(1, contents.length() - 1));
                }
                break;
            case 15:
                DFBM = contents;
                break;
            case 16:
                if (contents.equals("null")) {
                    SJC = contents;
                } else {
                    SJC = Common.sToDate(contents.substring(1, contents.length() - 1));
                }
                break;
            case 17:
                BZ = contents;
                break;
            case 18:
            case 19:
            case 20:
                QTXX = contents;
                break;
            case 21:
                SJMC = contents;
                break;
            default:
                break;
        }
    }

    public static String toValues() {
        String s = "";
        s = "(" + XK_XDR + "," + XK_FR + "," + XK_XDR_SHXYM + "," + XK_XDR_ZDM + "," + XK_XDR_GSDJ + "," + XK_XDR_SWDJ + "," + XK_XDR_SFZ + "," + XK_XMMC + "," + XK_SPLB + "," + XK_WSH + "," + XK_NR
                + "," + XK_JDRQ + "," + XK_JZQ + "," + XK_XZJG + "," + XK_ZT + "," + DFBM + "," + SJC + "," + BZ + "," + QTXX + "," + SJMC + ")";
        return s;
    }

    public static void clean() {
        XK_XDR = XK_FR = XK_XDR_SHXYM = XK_XDR_ZDM = XK_XDR_GSDJ = XK_XDR_SWDJ = XK_XDR_SFZ = XK_XMMC = XK_SPLB = XK_WSH = XK_NR = XK_JDRQ = XK_JZQ = XK_XZJG = XK_ZT = DFBM = SJC = BZ = QTXX = SJMC = null;
    }

    public static boolean isEmpty() {
        // TODO Auto-generated method stub
        return (XK_XDR == null || XK_XDR.equals("null")) && (XK_FR == null || XK_FR.equals("null"));
    }

}
