package maxamx.mensagem.controller

import maxamx.mensagem.service.MensagemService
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/mensagens")
class MessagemResource(private val mensagemService: MensagemService) {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    fun envia(mensagem:String) {
        mensagemService.envia(mensagem)
    }
}