package com.luizalebs.comunicacao_api.business.mapper;

import com.luizalebs.comunicacao_api.api.dto.ComunicacaoInDTO;
import com.luizalebs.comunicacao_api.api.dto.ComunicacaoOutDTO;
import com.luizalebs.comunicacao_api.infraestructure.entities.ComunicacaoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ComunicacaoMapStruct {

    ComunicacaoEntity paraComunicacaoEntity(ComunicacaoInDTO comunicacaoInDTO);
    ComunicacaoOutDTO paraComunicacaoDTO(ComunicacaoEntity comunicacaoEntity);
}
