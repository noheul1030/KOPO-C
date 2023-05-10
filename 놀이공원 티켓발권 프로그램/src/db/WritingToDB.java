package db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.TicketDTO;

public class WritingToDB {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test";

    // MySQL 데이터베이스 계정 정보
    static final String USER = "root";
    static final String PASS = "shdmf1030@";

    public void writeToDB() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

//		 // 삽입할 데이터를 정의합니다.
//		 int id = 1;
//		 String name = "John";
//		 int age = 30;

            // SQL INSERT 문을 생성하고 실행합니다.
            File csvFile = new File("SaveFile/save.csv");
            String sql = "INSERT INTO orderlist VALUES (" + csvFile + ")";

            stmt.executeUpdate(sql);
            System.out.println(sql);
        } catch (Exception e) {

        }
    }

    private List<TicketDTO> selectSample(Connection conn, int score) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String query = "select ... from example where kor = ?";

        List<TicketDTO> list = new ArrayList<TicketDTO>();
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, score);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                TicketDTO dto1 = new TicketDTO();
                dto1.setPersonGroup(rs.getString("option1"));
                dto1.setBuyTicket(rs.getInt("num_orders"));
                list.add(dto1);
            }

        } catch (SQLException e) {

        } finally {
            if (pstmt != null)
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
            if (rs != null)
                try {
                    rs.close();
                } catch (SQLException e) {
                }
        }
        return list;
    }

    private void insertSample(Connection conn, int score) {
        PreparedStatement pstmt = null;

        String query = "insert into ...";

        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, score);
            pstmt.executeUpdate();
        } catch (SQLException e) {

        } finally {
            if (pstmt != null)
                try {
                    pstmt.close();
                } catch (SQLException e) {
                }
        }
    }
}

// DB연결 교수님 방식
/**
 * package ParkTicketProgram;
 * 
 * import java.sql.*;
 * 
 * public class WritingToDB { static final String JDBC_DRIVER =
 * "com.mysql.cj.jdbc.Driver"; static final String DB_URL =
 * "jdbc:mysql://localhost/test";
 * 
 * // MySQL 데이터베이스 계정 정보 static final String USER = "root"; static final String
 * PASS = "123456"; private Connection conn = null; private Statement stmt =
 * null;
 * 
 * WritingToDB() { try { Class.forName(JDBC_DRIVER); conn =
 * DriverManager.getConnection(DB_URL, USER, PASS); stmt =
 * conn.createStatement(); } catch (Exception e) { // TODO Auto-generated catch
 * block e.printStackTrace(); } }
 * 
 * public void getAmountFromDB() { // 권종별 판매 갯수 try { String sql = "SELECT
 * option1, COUNT(amount) AS num_orders FROM orderlist GROUP BY option1;";
 * System.out.println("SQL : " + sql); ResultSet rs = stmt.executeQuery(sql); //
 * 결과셋 처리 while (rs.next()) { String option = rs.getString("option1"); String
 * num_orders = rs.getString("num_orders"); System.out.println("option: " +
 * option + ", num_orders: " + num_orders); } } catch (SQLException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } }
 * 
 * public void writeToDB(ListSaving ls) { try { // 삽입할 데이터를 정의합니다. // int id =
 * 1; // String name = "John"; // int age = 30; // // SQL INSERT 문을 생성하고 실행합니다.
 * for (OrderList order : ls.getData()) { order.setGenderNum(); String sql =
 * "INSERT INTO orderlist VALUES (" + order.getCSV() + ")";
 * System.out.println(sql); stmt.executeUpdate(sql); } } catch (Exception e) {
 * 
 * } } }
 * 
 * 
 */

// 다른 학생 DB연결 코드

/**
 * 
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.ResultSet; import java.sql.Statement; import java.util.List;
 * 
 * public class JDBCconnector {
 * 
 * static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; static final
 * String DB_URL = "jdbc:mysql://localhost/test";
 * 
 * static final String USER = "root"; static final String PASS = "123456";
 * 
 * public void writeToDB(List<OrderListClass> list) {
 * 
 * Connection conn = null; Statement stmt = null;
 * 
 * try { Class.forName(JDBC_DRIVER); conn = DriverManager.getConnection(DB_URL,
 * USER, PASS); stmt = conn.createStatement();
 * 
 * // 반복을 통해 리스트 값을 하나씩 꺼내서 문자열에 담는다. for (OrderListClass order : list) {
 * 
 * String str = order.getDate() + "," + order.getDayOrNight() + "," +
 * order.getAdultOrChild() + "," + order.getHowManyTickets() + "," +
 * order.getTotalPrice() + "," + order.getBenefitNumber(); String sql = "INSERT
 * INTO orderlist VALUES (" + str + ")";
 * 
 * // 데이터 베이스 저장 명령어로 문자열 안에 저장된 sql언어를 날린 stmt.executeUpdate(sql); }
 * 
 * } catch (Exception e) {
 * 
 * } } }
 */

// 추후에 DB충돌이 나면 WAMP 찾아서 삭제
