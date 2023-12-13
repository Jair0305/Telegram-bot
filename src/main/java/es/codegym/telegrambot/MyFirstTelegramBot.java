package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Map;

import static es.codegym.telegrambot.TelegramBotContent.*;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public String name = "Jair";
    public static final String NAME = "Jair0305_bot";
    public static final String TOKEN = "6868022770:AAFgODmxU5rrzvd3Pk03hibRuSM25vqbzCY";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
//        sendTextMessageAsync( "Hola, futuro programador, "+ name);
//        sendTextMessageAsync( "_Hola, futuro programador, "+ name + " Con letra incursiva_");
//        sendTextMessageAsync( "*Hola, futuro programador, "+ name + " Con letra en negritas*");

//        if(getMessageText().equals("/start")) {
//            sendTextMessageAsync("Hola, _futuro_ *programador*, " + name);
//        }
//
//        if(getMessageText().contains("hola")) {
//            sendTextMessageAsync("Como estas?" + name);
//        }
//        if (getMessageText().contains("me llamo")) {
//            sendTextMessageAsync("Mucho gusto, soy *Gato    *" + name);
//        }
        if(getMessageText().equals("/start")) {
            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hacekear la nevera", "step_1_btn"));

            setUserGlory(0);
        }

        if(getCallbackQueryButtonKey().equals("step_1_btn")) {
            addUserGlory(20);
            sendTextMessageAsync(STEP_2_TEXT,
                    Map.of("Tomar una salchichona +20 de fama", "step_2_btn",
                            "Tomar un pescado +20 de fama", "step_2_btn",
                            "Tomar una lata de pepinillos +20 de fama", "step_2_btn"));
        }
        if(getCallbackQueryButtonKey().equals("step_2_btn")) {
            setUserGlory(20);
            sendTextMessageAsync(STEP_3_TEXT,
                    Map.of("HRomper el robot aspiradora", "step_3_btn"));
        }
        if(getCallbackQueryButtonKey().equals("step_3_btn")) {
            addUserGlory(30);
            sendTextMessageAsync(STEP_4_TEXT,
                    Map.of("enviar al robotg aspiradora a por comida", "step_4_btn",
                            "dar un paseo en  el robot aspiradora", "step_4_btn",
                            "Huir del robot aspiradora", "step_4_btn"));
        }
        if(getCallbackQueryButtonKey().equals("step_4_btn")) {
            addUserGlory(30);
            sendTextMessageAsync(STEP_5_TEXT,
                    Map.of( "Ponerse la GoPro +40 de fama", "step_5_btn"));
        }
        if(getCallbackQueryButtonKey().equals("step_5_btn")) {
            addUserGlory(40);
            sendTextMessageAsync(STEP_6_TEXT,
                    Map.of(
                            "Hacer un video", "step_6_btn"
                    ));
        }
        if(getCallbackQueryButtonKey().equals("step_6_btn")) {
            addUserGlory(50);
            sendTextMessageAsync(STEP_7_TEXT,
                    Map.of( "Hackear la computadora", "step_7_btn"));
        }
        if(getCallbackQueryButtonKey().equals("step_7_btn")) {
            addUserGlory(60);
            sendTextMessageAsync(STEP_8_TEXT,
                    Map.of( "Subir el video a YouTube +70 de fama", "step_8_btn"));
        }
        if(getCallbackQueryButtonKey().equals("step_8_btn")) {
            addUserGlory(70);
            sendTextMessageAsync(FINAL_TEXT,
                    Map.of( ));
        }

    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}