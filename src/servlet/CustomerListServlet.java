package servlet;

import models.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyễn Nam Tùng", "03-4-1993", "Thái Nguyên", "https://ivcdn.vnecdn.net/vnexpress/images/web/2019/09/06/trung-quoc-nhan-ban-vo-tinh-meo-thanh-cong-1567736782_500x300.jpg"));
        customers.add(new Customer("Đỗ Quốc Dư", "20-6-1992", "Bắc Ninh", "https://azpet.com.vn/wp-content/uploads/2019/01/cho-corgi-7-e1560234421982.jpg"));
        customers.add(new Customer("Bùi Khắc Tùng", "08-3-1991", "Hòa Bình", "https://i.ytimg.com/vi/6tuDaXF2bPk/maxresdefault.jpg"));
        customers.add(new Customer("Đặng Thiên Hoàng", "27-7-1996", "Hưng Yên", "http://kenh14cdn.com/2017/40-amazing-hairless-sphynx-cat-pictures-20-1500910678350.jpg"));
        customers.add(new Customer("Lương Văn Quý", "29-11-1993", "Thái Nguyên", "https://cdn.tuoitre.vn/thumb_w/640/2019/9/2/gau-me-meng-meng-afp-15674147731661811584447.jpg"));

        request.setAttribute("customers", customers);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }
}
