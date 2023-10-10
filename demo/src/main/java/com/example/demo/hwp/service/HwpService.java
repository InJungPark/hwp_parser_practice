package com.example.demo.hwp.service;

import kr.dogfoot.hwplib.object.HWPFile;
import kr.dogfoot.hwplib.reader.HWPReader;
import kr.dogfoot.hwplib.tool.textextractor.TextExtractMethod;
import kr.dogfoot.hwplib.tool.textextractor.TextExtractor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HwpService {

    public void hwp() {

        HWPFile hwpFile;
        String hwpText;

        try {
            hwpFile = HWPReader.fromFile(getStaticResourcePath());
            hwpText = TextExtractor.extract(hwpFile, TextExtractMethod.InsertControlTextBetweenParagraphText);

            System.out.println("hwpText = " + hwpText);
        } catch (Exception e) {
            log.error("hwp Exception ==> {}",e.getMessage());
        }

    }

    public String getStaticResourcePath() {
        try {
            Resource resource = new ClassPathResource("static/file/과제문서.hwp");
            return resource.getFile().getAbsolutePath();
        } catch (Exception e) {
            log.error("getStaticResourcePath ==> {}", e.getMessage());
            return e.getMessage();
        }

    }
}
