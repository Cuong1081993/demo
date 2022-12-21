package controller;

import model.Product;
import service.Interface.ICategoryService;
import service.Interface.IProductService;
import service.jdbc.CategoryServiceJDBC;
import service.jdbc.ProductServiceJDBC;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    private IProductService productService;
    private ICategoryService categoryService;

    @Override
    public void init() throws ServletException {
        productService = new ProductServiceJDBC();
        categoryService = new CategoryServiceJDBC();

        List<Product> products = productService.getAllProduct();
        if (getServletContext().getAttribute("products")==null){
            getServletContext().setAttribute("products",products);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showFormCreateProduct(req, resp);
                break;
            case "edit":
                showEditProduct(req, resp);
                break;
            case "delete":
                showDeleteProduct(req, resp);
                break;
            default:
                showListProduct(req, resp);
        }
    }

    private void showListProduct(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showDeleteProduct(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showEditProduct(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showFormCreateProduct(HttpServletRequest req, HttpServletResponse resp) {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertProduct(req, resp);
                break;
            case "edit":
                editProduct(req, resp);
                break;
            case "delete":
                deleteProduct(req, resp);
                break;
            default:
        }
    }

    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void editProduct(HttpServletRequest req, HttpServletResponse resp) {
        
    }

    private void insertProduct(HttpServletRequest req, HttpServletResponse resp) {
    }
}
