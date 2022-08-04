package org.academidadecodigo.mycartel.converters;

import org.academidadecodigo.mycartel.command.GangMemberDto;
import org.academidadecodigo.mycartel.persistence.model.GangMember;
import org.springframework.stereotype.Component;

@Component
public class GangMemberToGangMemberDto extends AbstractConverter<GangMember, GangMemberDto> {

    @Override
    public GangMemberDto convert(GangMember gangMember) {

        GangMemberDto GangMemberDto = new GangMemberDto();
        GangMemberDto.setId(gangMember.getId());
        GangMemberDto.setFirstName(gangMember.getFirstName());
        GangMemberDto.setLastName(gangMember.getLastName());
        GangMemberDto.setEmail(gangMember.getEmail());
        GangMemberDto.setPhone(gangMember.getPhone());

        return GangMemberDto;
    }
}
