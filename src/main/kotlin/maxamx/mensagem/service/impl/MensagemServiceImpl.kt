package maxamx.mensagem.service.impl

import io.quarkus.arc.DefaultBean
import maxamx.mensagem.dto.MensagemEventDTO
import maxamx.mensagem.service.MensagemService
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter
import org.eclipse.microprofile.reactive.messaging.Incoming
import java.util.logging.Logger
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
@DefaultBean
class MensagemServiceImpl(@Channel("mensagem-saida") private val emitter: Emitter<MensagemEventDTO>) : MensagemService {

    private val logger = Logger.getLogger(MensagemService::class.java.name)

    private var contador = 0;

    override fun envia(mensagem: String) {
        emitter.send(MensagemEventDTO(mensagem, contador++))
    }

    @Incoming("mensagem-entrada")
    fun recebe(eventoDTO: MensagemEventDTO){
        logger.info("Mensagem recebida: $eventoDTO")
    }
}