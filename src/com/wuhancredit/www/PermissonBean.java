
package com.wuhancredit.www;

public class PermissonBean {
    private static PermissonBean pb;

    private static String id;// 用于数据传输发生错误时记录传输失败的数据

    private static String XK_WSH;// 行政许可决定书文号

    private static String XK_XMMC;// 项目名称

    private static String XK_SPLB;// 审批类别

    private static String XK_NR;// 许可内容

    private static String XK_XDR;// 行政相对人名称

    private static String XK_XDR_SHXYM;// 行政相对人代码_1(统一社会信用代码)

    private static String XK_XDR_ZDM;// 行政相对人代码_2(组织机构代码)

    private static String XK_XDR_GSDJ;// 行政相对人代码_3(工商登记码)

    private static String XK_XDR_SWDJ;// 行政相对人代码_4(税务登记号)

    private static String XK_XDR_SFZ;// 行政相对人代码_5 (居民身份证号)

    private static String XK_FR;// 法定代表人姓名

    private static String XK_JDRQ;// 许可决定日期

    private static String XK_JZQ;// 许可截止期

    private static String XK_XZJG;// 许可机关

    private static String XK_ZT;// 当前状态

    private static String DFBM;// 地方编码

    private static String SJC;// 数据更新时间戳

    private static String BZ;// 备注

    public static final String[] sName = {
        "XK_WSH", "XK_XMMC", "XK_SPLB", "XK_NR", "XK_XDR", "XK_XDR_SHXYM", "XK_XDR_ZDM", "XK_XDR_GSDJ", "XK_XDR_SWDJ", "XK_XDR_SFZ", "XK_FR", "XK_JDRQ", "XK_JZQ", "XK_XZJG", "XK_ZT", "DFBM", "SJC",
        "BZ"
    };

    public static final String[] sNameGBK = {
        "行政许可决定书文号", "项目名称", "审批类别", "许可内容", "行政相对人名称", "行政相对人代码_1(统一社会信用代码)", "行政相对人代码_2(组织机构代码)", "行政相对人代码_3(工商登记码)", "行政相对人代码_4(税务登记号)", "行政相对人代码_5 (居民身份证号)", "法定代表人姓名", "许可决定日期", "许可截止期", "许可机关",
        "当前状态", "地方编码", "数据更新时间戳", "备注"
    };

    public static PermissonBean setId(String id) {
        pb.id = id;
        return pb;
    }

    public static PermissonBean setXK_WSH(String xK_WSH) {
        pb.XK_WSH = xK_WSH;
        return pb;
    }

    public static PermissonBean setXK_XMMC(String xK_XMMC) {
        pb.XK_XMMC = xK_XMMC;
        return pb;
    }

    public static PermissonBean setXK_SPLB(String xK_SPLB) {
        pb.XK_SPLB = xK_SPLB;
        return pb;
    }

    public static PermissonBean setXK_NR(String xK_NR) {
        pb.XK_NR = xK_NR;
        return pb;
    }

    public static PermissonBean setXK_XDR(String xK_XDR) {
        pb.XK_XDR = xK_XDR;
        return pb;
    }

    public static PermissonBean setXK_XDR_SHXYM(String xK_XDR_SHXYM) {
        pb.XK_XDR_SHXYM = xK_XDR_SHXYM;
        return pb;
    }

    public static PermissonBean setXK_XDR_ZDM(String xK_XDR_ZDM) {
        pb.XK_XDR_ZDM = xK_XDR_ZDM;
        return pb;
    }

    public static PermissonBean setXK_XDR_GSDJ(String xK_XDR_GSDJ) {
        pb.XK_XDR_GSDJ = xK_XDR_GSDJ;
        return pb;
    }

    public static PermissonBean setXK_XDR_SWDJ(String xK_XDR_SWDJ) {
        pb.XK_XDR_SWDJ = xK_XDR_SWDJ;
        return pb;
    }

    public static PermissonBean setXK_XDR_SFZ(String xK_XDR_SFZ) {
        pb.XK_XDR_SFZ = xK_XDR_SFZ;
        return pb;
    }

    public static PermissonBean setXK_FR(String xK_FR) {
        pb.XK_FR = xK_FR;
        return pb;
    }

    public static PermissonBean setXK_JDRQ(String xK_JDRQ) {
        pb.XK_JDRQ = xK_JDRQ;
        return pb;
    }

    public static PermissonBean setXK_JZQ(String xK_JZQ) {
        pb.XK_JZQ = xK_JZQ;
        return pb;
    }

    public static PermissonBean setXK_XZJG(String xK_XZJG) {
        pb.XK_XZJG = xK_XZJG;
        return pb;
    }

    public static PermissonBean setXK_ZT(String xK_ZT) {
        pb.XK_ZT = xK_ZT;
        return pb;
    }

    public static PermissonBean setDFBM(String dFBM) {
        pb.DFBM = dFBM;
        return pb;
    }

    public static PermissonBean setSJC(String sJC) {
        pb.SJC = sJC;
        return pb;
    }

    public static PermissonBean setBZ(String bZ) {
        pb.BZ = bZ;
        return pb;
    }

    public static PermissonBean build() {
        pb = new PermissonBean();
        return pb;
    }

    public String getX(String s) {
        String reString = "";
        switch (s) {
            case "XK_WSH":
                reString = XK_WSH;
                break;
            case "XK_XMMC":
                reString = XK_XMMC;
                break;
            case "XK_SPLB":
                reString = XK_SPLB;
                break;
            case "XK_NR":
                reString = XK_NR;
                break;
            case "XK_XDR":
                reString = XK_XDR;
                break;
            case "XK_XDR_SHXYM":
                reString = XK_XDR_SHXYM;
                break;
            case "XK_XDR_ZDM":
                reString = XK_XDR_ZDM;
                break;
            case "XK_XDR_GSDJ":
                reString = XK_XDR_GSDJ;
                break;
            case "XK_XDR_SWDJ":
                reString = XK_XDR_SWDJ;
                break;
            case "XK_XDR_SFZ":
                reString = XK_XDR_SFZ;
                break;
            case "XK_FR":
                reString = XK_FR;
                break;
            case "XK_JDRQ":
                reString = XK_JDRQ;
                break;
            case "XK_JZQ":
                reString = XK_JZQ;
                break;
            case "XK_XZJG":
                reString = XK_XZJG;
                break;
            case "XK_ZT":
                reString = XK_ZT;
                break;
            case "DFBM":
                reString = DFBM;
                break;
            case "SJC":
                reString = SJC;
                break;
            case "BZ":
                reString = BZ;
                break;
            default:
                break;
        }
        return reString;
    }

    @Override
    public String toString() {
        String sRowBegin = "<ROW>";
        String sRowEnd = "</ROW>";
        String s = "";
        for (String string : sName) {
            s = s + "<" + string + ">" + getX(string) + "</" + string + ">";
        }
        return sRowBegin + s + sRowEnd;
    }
}
