package com.luizalebs.comunicacao_api.infraestructure.client;

import com.luizalebs.comunicacao_api.api.dto.TarefasDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Notificacao", url = "${notificacao.url}")
public interface NotificacaoClient {

    @PostMapping
    public ResponseEntity<Void> enviaEmail (@RequestBody TarefasDTO tarefasDTO);
}
