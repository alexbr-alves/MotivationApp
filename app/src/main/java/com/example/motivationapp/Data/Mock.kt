package com.example.motivationapp.Data

import com.example.motivationapp.Infra.MotivationConstants
import kotlin.random.Random


data class Phrase(val description: String, val category: Int)
class Mock {

    private val all = MotivationConstants.PHRASEFILTER.ALL
    private val happy = MotivationConstants.PHRASEFILTER.HAPPY
    private val sunny = MotivationConstants.PHRASEFILTER.SUNNY

    private val listPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez.", happy),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", happy),
        Phrase("Quando está mais escuro, vemos mais estrelas!", happy),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", happy),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", happy),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", happy),
        Phrase("A alegria não está em coisas, está em nós.", happy),
        Phrase("Cada novo dia é uma nova oportunidade para ser feliz.", happy),
        Phrase("A felicidade não é algo pronto. Ela vem de suas próprias ações.", happy),
        Phrase("Seja a mudança que você deseja ver no mundo.", happy),
        Phrase("A vida é curta demais para ser anything but happy.", happy),
        Phrase("A felicidade é uma jornada, não um destino.", happy),
        Phrase("A gratidão transforma o que temos em suficiente.", happy),
        Phrase("A felicidade não é ter o que você quer, é querer o que você tem.", happy),
        Phrase("O sorriso é a curva mais bonita do corpo humano.", happy),
        Phrase("Felicidade não é algo que você adia para o futuro, é algo que você projeta para o presente.", happy),
        Phrase("A verdadeira felicidade é quando suas preocupações são menores do que seus sonhos.", happy),
        Phrase("A vida é feita de momentos, escolha ser feliz em todos eles.", happy),
        Phrase("A alegria de viver está na simplicidade do coração.", happy),
        Phrase("A felicidade não é medida por dinheiro, mas sim pelo amor que você compartilha.", happy),
        Phrase("Não há chave para a felicidade, a porta está sempre aberta.", happy),
        Phrase("A alegria está na jornada, não no destino final.", happy),
        Phrase("A felicidade é uma decisão, não uma condição.", happy),
        Phrase("A felicidade é contagiosa, espalhe-a por onde você passar.", happy),
        Phrase("Sorria, você não sabe quem pode se apaixonar pelo seu sorriso.", happy),
        Phrase("A felicidade é a poção mais poderosa que existe.", happy),
        Phrase("Encontre a alegria nas pequenas coisas e a vida se tornará mais bela.", happy),
        Phrase("A alegria não é algo que você encontra, é algo que você cria.", happy),
        Phrase("A felicidade é a música da alma, todos podem ouvi-la.", happy),
        Phrase("A vida é um presente e cada novo dia é uma oportunidade de desfrutar esse presente.", happy),
        Phrase("A felicidade não depende do que acontece ao seu redor, mas do que acontece dentro de você.", happy),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Phrase("Você perde todas as chances que você não aproveita.", sunny),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Phrase("Se você acredita, faz toda a diferença.", sunny),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny),
        Phrase("A vida é uma aventura ousada ou nada.", sunny),
        Phrase("Nunca é tarde demais para ser o que você poderia ter sido.", sunny),
        Phrase("A imaginação é o começo da criação.", sunny),
        Phrase("A única maneira de fazer um ótimo trabalho é amar o que você faz.", sunny),
        Phrase("A sorte favorece a mente preparada.", sunny),
        Phrase("A persistência é o caminho do êxito.", sunny),
        Phrase("O único limite para nossas realizações de amanhã são nossas dúvidas de hoje.", sunny),
        Phrase("O segredo para ficar à frente é começar.", sunny),
        Phrase("Tudo o que você sempre quis está do outro lado do medo.", sunny),
        Phrase("A melhor época para plantar uma árvore foi há 20 anos. A segunda melhor é agora.", sunny),
        Phrase("A verdadeira liberdade está em ser livre de qualquer coisa que nos impeça de sermos quem somos.", sunny),
        Phrase("O maior erro que você pode cometer é o de estar constantemente com medo de cometer um.", sunny),
        Phrase("Não importa o quão devagar você vá, desde que não pare.", sunny),
        Phrase("Grandes coisas nunca vêm de zonas de conforto.", sunny),
        Phrase("A única maneira de fazer um bom trabalho é amar o que você faz.", sunny),
        Phrase("Não tenha medo de desistir do bom para perseguir o ótimo.", sunny),
        Phrase("A felicidade é uma jornada, não um destino.", sunny),
        Phrase("O sucesso é a soma de pequenos esforços repetidos diariamente.", sunny),
        Phrase("Não é o que você olha que importa, é o que você vê.", sunny),
        Phrase("Acredite que você pode e você está no meio do caminho.", sunny),
        Phrase("A melhor vingança é um sucesso estrondoso.", sunny),
        Phrase("A motivação é o que te faz começar. O hábito é o que te faz continuar.", sunny),
        Phrase("Quando você quer alguma coisa, todo o universo conspira para que você realize seu desejo.", sunny),
        Phrase("O verdadeiro heroísmo consiste em persistir por mais um momento, quando parece que tudo está perdido.", sunny),
        Phrase("Você é mais corajoso do que acredita, mais forte do que parece e mais inteligente do que pensa.", sunny)

    )


    fun getPhrase(value: Int): Phrase {
        val filtered = listPhrases.filter { (it.category == value || value == all) }


        val rand = Random.nextInt(filtered.size)


        return filtered[rand]
    }

}