package member.controller;

import lombok.RequiredArgsConstructor;
import member.controller.dto.JoinRequest;
import member.repository.entity.Member;
import member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest) {
        String result = memberService.join(joinRequest);

        if ("success".equalsIgnoreCase(result)) {
            return "success";
        } else {
            return "fail";
        }

    }

    @GetMapping("/join")
    public List<Member> getMembers() {
        return memberService.getMembers();
    }

}
