package org.knit.lab1.Task2;

public class Task2 {
    public void execute() {

        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        SimpleUrl simpleUrl = new SimpleUrl(urlValue);
        System.out.println(simpleUrl.toString());
    }
}
