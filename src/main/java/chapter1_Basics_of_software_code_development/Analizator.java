package chapter1_Basics_of_software_code_development;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analizator {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        String xmlAnalysis = xmlAnalyzer(xml);
        System.out.println(xmlAnalysis);

    }

    private static String xmlAnalyzer (String xml){
        StringBuilder strBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String [] lines = xml.split("\n\\s*");
//        List<String> liness = new ArrayList<>(Arrays.asList(lines));
//        liness.forEach();
        for (String line : lines){
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()){
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - tag without body\n");
            } else if (mBody.find()){
                strBuilder.append(mBody.group());
                strBuilder.append(" - tag consists\n");
            } else if (mOpen.find()){
                strBuilder.append(mOpen.group());
                strBuilder.append(" - opened tag\n");
            } else if (mClose.find()){
                strBuilder.append(mClose.group());
                strBuilder.append(" - closed tag\n");
            }
        }
        return strBuilder.toString();
    }
}
