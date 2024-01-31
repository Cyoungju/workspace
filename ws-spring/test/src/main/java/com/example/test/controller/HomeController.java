package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/result")
    public String result(Model model, @RequestParam("name") /*파라미터의 이름 작성*/ String name2, @RequestParam String age){// 파라미터 이름과 동일하게 사용 - 데이터를 받아야하는곳에서 사용
        System.out.println(name2); // 데이터 이름과 다르게 작성
        System.out.println(age); // 데이터 이름과 동일하게 작성
        model.addAttribute("name2", name2);
        return "result";
    }
    //form을 파라미터로 받아야함
    // 파라미터를 처맇는게 기본 문자열
    

    // 컨테이너
    // 컨트롤러 - home -> 응답 (화면 ,페이지 or 그냥 데이터)
    // 페이지일 경우
    // 데이터일 경우 - @responsBody - reruen에 순수 데이터로 읽히게됨
    // 사용자는 브라우저를 통해서 - 페이지가 나옴
    //
}
