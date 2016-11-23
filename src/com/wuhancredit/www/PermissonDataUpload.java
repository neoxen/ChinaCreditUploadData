
package com.wuhancredit.www;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class PermissonDataUpload {

    private static String url = "jdbc:mysql://localhost:3306/db_credit_test?useSSL=false";

    private static String user = "root";

    private static String password = "ShanShi@1989";

    private static Connection con;

    private static ArrayList<PermissonBean> pblist = new ArrayList<PermissonBean>();

    private static String sPath = "/Users/zerov1989/Downloads/permisson.xls";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void main(String[] args) {
        // 连接数据库
        initDataBase();
        // 读取数据
        readData();
        // 加工数据
        processDataToXml();
        processDataToXls();
        // 上传数据

    }

    private static void processDataToXls() {
        try {
            WritableWorkbook book = Workbook.createWorkbook(new File(sPath));
            WritableSheet sheet = book.createSheet("page one", 0);
            for (int i = 0; i < PermissonBean.sNameGBK.length; i++) {
                sheet.addCell(new Label(i, 0, PermissonBean.sNameGBK[i]));
            }
            int tag = 1;
            for (PermissonBean pb : pblist) {
                for (int i = 0; i < PermissonBean.sName.length; i++) {
                    sheet.addCell(new Label(i, tag, pb.getX(PermissonBean.sName[i])));
                }
                tag++;
            }
            book.write();
            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processDataToXml() {
        String sHead = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
        String sRowDataBegin = "<ROWDATA>";
        String sRowDataEnd = "</ROWDATA>";
        String string = "";
        for (PermissonBean pb : pblist) {
            string = string + pb;
        }
        System.out.println(sHead + sRowDataBegin + string + sRowDataEnd);
    }

    private static void readData() {
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from tab_permission");
            while (rs.next()) {
                // System.out.println(rs.getObject("id") + "," +
                // rs.getObject("XK_WSH") + "," + rs.getObject("XK_XMMC") + ","
                // + rs.getObject("XK_SPLB") + "," + rs.getObject("XK_NR") + ","
                // + rs.getObject("XK_XDR") + "," + rs.getObject("XK_XDR_SHXYM")
                // + "," + rs.getObject("XK_XDR_ZDM") + "," +
                // rs.getObject("XK_XDR_GSDJ") + "," +
                // rs.getObject("XK_XDR_SWDJ") + ","
                // + rs.getObject("XK_XDR_SFZ") + "," + rs.getObject("XK_FR") +
                // "," + rs.getObject("XK_JDRQ") + "," + rs.getObject("XK_JZQ")
                // + "," + rs.getObject("XK_XZJG") + ","
                // + rs.getObject("XK_ZT") + "," + rs.getObject("DFBM") + "," +
                // rs.getObject("SJC") + "," + rs.getObject("BZ"));
                pblist.add(PermissonBean.build().setId(rs.getObject("id").toString()).setXK_WSH(rs.getObject("XK_WSH").toString()).setXK_XMMC(rs.getObject("XK_XMMC").toString())
                        .setXK_SPLB(rs.getObject("XK_SPLB").toString()).setXK_NR(rs.getObject("XK_NR").toString()).setXK_XDR(rs.getObject("XK_XDR").toString())
                        .setXK_XDR_SHXYM(rs.getObject("XK_XDR_SHXYM").toString()).setXK_XDR_ZDM(rs.getObject("XK_XDR_ZDM").toString()).setXK_XDR_GSDJ(rs.getObject("XK_XDR_GSDJ").toString())
                        .setXK_XDR_SWDJ(rs.getObject("XK_XDR_SWDJ").toString()).setXK_XDR_SFZ(rs.getObject("XK_XDR_SFZ").toString()).setXK_FR(rs.getObject("XK_FR").toString())
                        .setXK_JDRQ(rs.getObject("XK_JDRQ").toString()).setXK_JZQ(rs.getObject("XK_JZQ").toString()).setXK_XZJG(rs.getObject("XK_XZJG").toString())
                        .setXK_ZT(rs.getObject("XK_ZT").toString()).setDFBM(rs.getObject("DFBM").toString()).setSJC(rs.getObject("SJC").toString()).setBZ(rs.getObject("BZ").toString()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            free(rs, st);
        }
    }

    private static void initDataBase() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void free(ResultSet rs, Statement st) {
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (con != null)
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }
        }
    }

}
