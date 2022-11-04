import Order.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Product_List_Servlet", value = "/product_List_Servlet")
public class Product_List_Servlet extends HttpServlet {
   private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Product> productList = new ArrayList<>(10);

        logger.info("Creat product list");

            productList.add(new Product(1,"title", "cost"));
            productList.add(new Product(2,"title", "cost"));
            productList.add(new Product(3,"title", "cost"));
            productList.add(new Product(4,"title", "cost"));
            productList.add(new Product(5,"title", "cost"));
            productList.add(new Product(6,"title", "cost"));
            productList.add(new Product(7,"title", "cost"));
            productList.add(new Product(8,"title", "cost"));
            productList.add(new Product(9,"title", "cost"));
            productList.add(new Product(10,"title", "cost"));
// Подскажите, как сделать вывод в столбец?
            resp.getWriter().println("<h1>" + productList.toString() + "</h1>");

        resp.getWriter().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
