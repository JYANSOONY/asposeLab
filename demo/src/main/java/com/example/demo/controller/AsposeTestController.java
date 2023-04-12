package com.example.demo.controller;

import com.aspose.words.Document;
import com.aspose.words.HtmlLoadOptions;
import com.aspose.words.SaveFormat;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class AsposeTestController {
    @GetMapping("/test")
    public Document boardDouwnload() throws Exception {
        // URL 생성 및 초기화
        URL oracleURL = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");

        // 웹 페이지를 입력 스트림으로 가져오기
                InputStream is = oracleURL.openStream();

        // HTML 로드 옵션 초기화
                HtmlLoadOptions htmloptions = new HtmlLoadOptions();

        // 문서 객체에 스트림 로드
                Document doc = new Document(is, htmloptions);

        // DOCX로 저장
                doc.save("output.docx", SaveFormat.DOCX);

                return  doc;
    }

    @GetMapping("/test2")
    public void boardDouwnload2() throws Exception {
        Document doc = new Document("https://products.aspose.com/pdf/java/conversion/html-to-docx/");
        doc.save("C:\\Users\\tenth\\Downloads\\Out 123.docx");
       // doc.save("E:\Outv3456.docx");
    }

    @GetMapping("/test3")
    public void boardDouwnload3() throws Exception {
        // Create and initialize URL
                URL oracleURL = new URL("https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html");

        // Get web page as input stream
                InputStream is = oracleURL.openStream();

        // Initialize HTML load options
                HtmlLoadOptions htmloptions = new HtmlLoadOptions();

        // Load stream into Document object
                Document doc = new Document(is, htmloptions);

        // Save as DOCX
               // doc.save("output.docx", SaveFormat.DOCX);
        doc.save("C:\\Users\\tenth\\Downloads\\Out 1233.docx");
    }

    @GetMapping("/hwp/test1")
    public void boardHwpDouwnload1() throws Exception {
                String urlStr = "https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html";

                URL url = new URL(urlStr);

                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);

        // 타입 설정
                connection.setRequestProperty("CONTENT-TYPE","text/xml");

        //openStream() : URL페이지 정보를 읽어온다.
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

                String inputLine;
                String buffer = "";

        // 페이지의 정보를 저장한다.
                while ((inputLine = in.readLine()) != null){
                    buffer += inputLine.trim();
                }

        System.out.println(buffer);

                in.close();
    }


}
