package ua.sumdu.edu.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Встановлення для спільного атрибуту (кількості надсилань) для всіх користувачів
        sce.getServletContext().setAttribute("attempts", (long) 0);
    }
}
