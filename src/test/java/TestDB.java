import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class TestDB {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println("테스트");
        System.out.println("ㅁㄴㅇ");


        String img0,img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,
                img15,img16,img17;

        Statement st;
        PreparedStatement pstmt;
        ResultSet rs;
        Connection conn;

        try { // DB 연결 구문
            // 드라이버 로딩.
            Class.forName("com.mysql.cj.jdbc.Driver"); // 객체화 하는 과정 , 메모리상에 잡히게 된다.
            // 연결하기.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nawa", "root", "QhrtnswoTkddl1!6");
            System.out.println(" ");
            System.out.println("연결 됐습니다.");
            System.out.println(" ");
            st = conn.createStatement();
            String sql = "SELECT * FROM CRAWLING";
            rs = st.executeQuery(sql);

            // while (rs.next())
            // {
            rs.next();
            img0 = rs.getString(5);

            System.out.println(img0);



      /* out.println
       (
               rs.getString(1) + "\t" +
               rs.getString(2) + "\t" +
               rs.getString(3) + "\t" +
               rs.getString(4) + "\t" +
               rs.getString(5) + "\t"
       ); */
            //  }


        } catch (ClassNotFoundException e) {
            System.out.println(" 에러가 났습니다. (드라이버 로딩 실패) " + e.getMessage());
            e.printStackTrace(); // 에러가 어디서 났는지 알려주고 전체적인 결과를 노출해준다.
        } catch (SQLException e) {
            System.out.println("에러: " + e);
            e.printStackTrace();
        } catch (Exception e)
        {
            System.out.println("데이터베이스 검색 오류 : " + e.getMessage());
        }


    }
}
