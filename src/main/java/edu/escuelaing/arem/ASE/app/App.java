package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.framework.http.HttpServer;

import java.io.File;

import static edu.escuelaing.arem.ASE.app.framework.http.HttpServer.get;

public class App {
    private static String staticFilesDirectory = "src/main/java/resources";

    /**
     * Método principal que inicia el servidor y configura servicios.
     */
    public static void main(String[] args) throws Exception {
        staticfiles("src/main/java/resources");
        HttpServer.loadComponents();
        HttpServer.startServer();

    }


    /**
     * Define el directorio donde se encuentran los archivos estáticos.
     * @param directory El directorio de archivos estáticos.
     */
    public static void staticfiles(String directory) {
        staticFilesDirectory = directory;
    }

    public static String getStaticFilesDirectory() {
        return staticFilesDirectory;
    }
}
