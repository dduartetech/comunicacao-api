## Endpoints da Aplicação

Abaixo, detalho os contratos de entrada e saída para cada operação da API:

### Agendamento
* **`POST`**
    * **Descrição:** Realiza o agendamento de uma nova comunicação.
    * **Corpo da Requisição (JSON):** Deve conter os campos:
        * `dataHoraEnvio` (Formato: **`yyyy-MM-dd HH:mm:ss`**)
        * `nomeDestinatario`
        * `emailDestinatario`
        * `telefoneDestinatario`
        * `mensagem`
        * `modoDeEnvio` (E-MAIL, SMS, PUSH, WHATSAPP)

### 🔍 Consulta
* **`GET`**
    * **Descrição:** Consulta o status e os detalhes de um agendamento específico através do email do destinatário.

### ❌ Cancelamento
* **`DELETE`**
    * **Descrição:** Cancela um agendamento existente através do email do destinatário, alterando seu status para **CANCELADO**.
