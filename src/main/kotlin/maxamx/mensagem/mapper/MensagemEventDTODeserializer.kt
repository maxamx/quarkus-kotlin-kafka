package maxamx.mensagem.mapper

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer
import maxamx.mensagem.dto.MensagemEventDTO

class MensagemEventDTODeserializer: ObjectMapperDeserializer<MensagemEventDTO>(MensagemEventDTO::class.java) {
}