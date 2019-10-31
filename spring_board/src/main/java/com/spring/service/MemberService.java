package com.spring.service;
 
import java.util.List;
 
import com.spring.vo.MemberVO;
 
public interface MemberService {
    
    public List<MemberVO> selectMember() throws Exception;
}
