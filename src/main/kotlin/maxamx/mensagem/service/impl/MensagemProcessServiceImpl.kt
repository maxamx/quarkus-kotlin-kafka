package maxamx.mensagem.service.impl

import maxamx.mensagem.service.MensagemService
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter
import org.eclipse.microprofile.reactive.messaging.Incoming
import org.eclipse.microprofile.reactive.messaging.Outgoing
import java.util.logging.Logger
import javax.enterprise.context.ApplicationScoped

class MensagemProcessServiceImpl (){

}
//@ApplicationScoped

//class MensagemProcessServiceImpl(@Channel("mensagem-processing") private val emitter: Emitter<String>) : MensagemService {
//
//    private val logger = Logger.getLogger(MensagemService::class.java.name)
//
//    override fun envia(mensagem: String) {
//        emitter.send(mensagem)
//    }
//    @Incoming("mensagem-processing")
//    @Outgoing("mensagem-saida")
//    fun processa(mensagem:String):String{
//        return "Mensagem processada: $mensagem"
//    }
//
//    @Incoming("mensagem-entrada")
//    fun recebe(mensagem: String){
//        logger.info("Mensagem recebida: $mensagem")
//    }
//}