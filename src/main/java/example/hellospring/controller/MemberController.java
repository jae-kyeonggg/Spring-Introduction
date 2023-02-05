package example.hellospring.controller;

import example.hellospring.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    /*@Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }*/

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
