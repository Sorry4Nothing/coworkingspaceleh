package com.lehmann.coworkingspaceleh.service;

import com.lehmann.coworkingspaceleh.exception.MemberNotFoundException;
import com.lehmann.coworkingspaceleh.model.MemberEntity;
import com.lehmann.coworkingspaceleh.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public List<MemberEntity> all(){
        log.info("Executing get all clients from database");
        return (List<MemberEntity>) this.memberRepository.findAll();
    }

    public MemberEntity oneById(UUID memberId){
        log.info("Executing get a specific client by their id {}", memberId);
        return this.memberRepository.findById(memberId)
                .orElseThrow(
                        () -> new MemberNotFoundException("Client with id " + memberId + " not found" )
                );
    }

    @Transactional
    public MemberEntity update(MemberEntity member, UUID memberId){
        log.info("Update client by their Id {}", memberId);
        return this.memberRepository.save(member);
    }

    @Transactional
    public void delete(UUID memberId){
        MemberEntity member = oneById(memberId);
        this.memberRepository.delete(member);
    }

}
