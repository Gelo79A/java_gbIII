import Order.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Product_List_Servlet", value = "/product_List_Servlet")
public class Product_List_Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Product> productList = new ArrayList<>(10);
        //for (Product product: productList) {
            productList.add(new Product(1,"title", "cost"));


       // }


        resp.getWriter().println("<h1>" + productList.toString() + "</h1>");

        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
