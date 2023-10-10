package com.example.demo.hwp.controller;

import com.example.demo.hwp.service.HwpService;
import kr.dogfoot.hwplib.object.HWPFile;
import kr.dogfoot.hwplib.reader.HWPReader;
import kr.dogfoot.hwplib.tool.textextractor.TextExtractMethod;
import kr.dogfoot.hwplib.tool.textextractor.TextExtractor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@Slf4j
public class HwpController {

    private final HwpService hwpService;

    // 한글 화면
    @RequestMapping("/")
    public String hwpView() {
        return "index";
    }

    // 한글 파일 실행
    @PostMapping("/start")
    @ResponseBody
    public int start() {
        hwpService.hwp();
        return 1;
    }

}
