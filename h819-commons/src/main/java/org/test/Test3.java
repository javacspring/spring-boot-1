package org.test;

import org.apache.commons.collections4.ListUtils;
import org.h819.commons.MyJsonUtils;
import org.h819.commons.net.html.parser.jsoup.ElementSelector;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.util.Arrays;
import java.util.List;

/**
 * Description : TODO()
 * User: h819
 * Date: 2017/3/3
 * Time: 9:58
 * To change this template use File | Settings | File Templates.
 */
public class Test3 {

    public static void main(String[] args) {

        Test3 t = new Test3();
        //t.testJsoup();

        t.subList();
    }

    private void testJsoup() {

      //  String html0 = "<iframe id=\"frame_content\" name=\"frame_content\" height=\"600px\" width=\"730px\" frameborder=\"0\" scrolling=\"yes\"  src='/temp/ws-23500573617169017-1.html'>";
        String html = "<div class=\"cover\">" +
                "<a class=\"CDcover185\" id=\"albumCover\" href=\"/album/2100226190\" title=\"Hello\">" +
                "<img class=\"cdCDcover185\" src=\"http://img.xiami.net/images/album/img85/23485/21002261901445585261_2.jpeg\"/>" +
                "</a>" +
                "<iframe id=\"frame_content\" name=\"frame_content\" height=\"600px\" width=\"730px\" frameborder=\"0\" scrolling=\"yes\"  src='/temp/ws-23500573617169017-1.html' />" +
                "</div>";
       // String html = html0 + html1;
        Elements elements = new ElementSelector(Jsoup.parse(html)).byTagAndAttr("a","class").select();

        System.out.println(elements);
    }

    private void subList(){

        List<Integer> largeList = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        List<List<Integer>> output = ListUtils.partition(largeList, 3);

        MyJsonUtils.prettyPrint(output);

    }

}

