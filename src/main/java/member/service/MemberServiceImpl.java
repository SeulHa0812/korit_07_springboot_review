package member.service;

import lombok.RequiredArgsConstructor;
import member.controller.dto.JoinRequest;
import member.repository.MemberRepository;
import member.repository.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public String join(JoinRequest joinRequest) {
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();
        memberRepository.save(member);
        return "success";
    }

    @Override
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }

}
