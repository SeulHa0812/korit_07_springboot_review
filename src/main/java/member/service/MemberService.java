package member.service;

import member.controller.dto.JoinRequest;
import member.repository.MemberRepository;
import member.repository.entity.Member;

import java.util.List;


public interface MemberService {
    String join(JoinRequest joinRequest);


    public List<Member> getMembers();

}
