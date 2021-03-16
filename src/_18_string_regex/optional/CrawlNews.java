package _18_string_regex.optional;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static String getContentfrom(String link) throws IOException {
        URL url=new URL(link);
        Scanner scanner=new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\\\Z");
        String content=scanner.next();
        scanner.close();
        content=content.replaceAll("\\\\R","");
        return content;
    }

    public static void main(String[] args) throws IOException {
        String content=getContentfrom("http://dantri.com.vn/the-gioi.htm ");
        Pattern pattern=Pattern.compile("Cate_TheGioi\">(.*?)</a>");
        Matcher matcher=pattern.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}
