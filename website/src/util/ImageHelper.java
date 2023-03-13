package util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Base64;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

public class ImageHelper {

    private ImageHelper() {
    }

    public static String encodeImage(HttpServlet servlet, String path) throws IOException {
        ServletContext context = servlet.getServletContext();
        InputStream inputStream = context.getResourceAsStream(path);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        outputStream.flush();

        byte[] imageData = outputStream.toByteArray();

        String result = Base64.getEncoder().encodeToString(imageData);

        return result;
    }
}
