package org.academidadecodigo.mycartel.converters;

import org.academidadecodigo.mycartel.command.GangMemberDto;
import org.academidadecodigo.mycartel.persistence.model.GangMember;
import org.academidadecodigo.mycartel.services.GangMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GangMemberDtoToGangMember implements Converter<GangMemberDto, GangMember> {

    private GangMemberService gangMemberService;

    public void setGangMemberService(GangMemberService gangMemberService) {
        this.gangMemberService = gangMemberService;
    }

    @Override
    public GangMember convert(GangMemberDto gangMemberDto) {

        GangMember gangMember = (gangMemberDto.getId() != null ? gangMemberService.get(gangMemberDto.getId()) : new GangMember());

        gangMember.setFirstName(gangMemberDto.getFirstName());
        gangMember.setLastName(gangMemberDto.getLastName());
        gangMember.setEmail(gangMemberDto.getEmail());
        gangMember.setPhone(gangMemberDto.getPhone());

        return gangMember;
    }
}