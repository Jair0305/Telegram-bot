package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
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
//        if(getMessageText().equals("/start")) {
//
//            sendPhotoMessageAsync("step_1_pic");
//            sendTextMessageAsync(STEP_1_TEXT,
//                    Map.of("Hacekear la nevera", "step_1_btn"));
//
//            setUserGlory(0);
//        }
//
//        if(getCallbackQueryButtonKey().equals("step_1_btn")) {
//            addUserGlory(20);
//            sendPhotoMessageAsync("step_2_pic");
//            sendTextMessageAsync(STEP_2_TEXT,
//                    Map.of("Tomar una salchichona +20 de fama", "step_2_btn",
//                            "Tomar un pescado +20 de fama", "step_2_btn",
//                            "Tomar una lata de pepinillos +20 de fama", "step_2_btn"));
//        }
//        if(getCallbackQueryButtonKey().equals("step_2_btn")) {
//            sendPhotoMessageAsync("step_3_pic");
//            setUserGlory(20);
//            sendTextMessageAsync(STEP_3_TEXT,
//                    Map.of("HRomper el robot aspiradora", "step_3_btn"));
//        }
//        if(getCallbackQueryButtonKey().equals("step_3_btn")) {
//            addUserGlory(30);
//            sendPhotoMessageAsync("step_4_pic");
//            sendTextMessageAsync(STEP_4_TEXT,
//                    Map.of("enviar al robotg aspiradora a por comida", "step_4_btn",
//                            "dar un paseo en  el robot aspiradora", "step_4_btn",
//                            "Huir del robot aspiradora", "step_4_btn"));
//        }
//        if(getCallbackQueryButtonKey().equals("step_4_btn")) {
//            addUserGlory(30);
//            sendPhotoMessageAsync("step_5_pic");
//            sendTextMessageAsync(STEP_5_TEXT,
//                    Map.of( "Ponerse la GoPro +40 de fama", "step_5_btn"));
//        }
//        if(getCallbackQueryButtonKey().equals("step_5_btn")) {
//            addUserGlory(40);
//            sendPhotoMessageAsync("step_6_pic");
//            sendTextMessageAsync(STEP_6_TEXT,
//                    Map.of(
//                            "Hacer un video", "step_6_btn"
//                    ));
//        }
//        if(getCallbackQueryButtonKey().equals("step_7_btn")) {
//            addUserGlory(50);
//            sendPhotoMessageAsync("step_7_pic");
//            sendTextMessageAsync(STEP_7_TEXT,
//                    Map.of( "Hackear la computadora", "step_7_btn"));
//        }
//        if(getCallbackQueryButtonKey().equals("step_8_btn")) {
//            addUserGlory(60);
//            sendPhotoMessageAsync("step_8_pic");
//            sendTextMessageAsync(STEP_8_TEXT,
//                    Map.of( "Subir el video a YouTube +70 de fama", "step_8_btn"));
//        }
//        if(getCallbackQueryButtonKey().equals("")) {
//            addUserGlory(70);
//            sendPhotoMessageAsync("final_pic");
//            sendTextMessageAsync(FINAL_TEXT,
//                    Map.of( ));
//        }

        //Enviar el texto, la imagen y los botones en el mismo mensaje

        if(getMessageText().equals("/start")) {
            sendPhotoWithCaptionAsync("step_1_pic", STEP_1_TEXT, Map.of("Hacekear la nevera", "step_1_btn"));
            setUserGlory(0);
        }

        if(getCallbackQueryButtonKey().equals("step_1_btn")) {
            addUserGlory(20);
            sendPhotoWithCaptionAsync("step_2_pic", STEP_2_TEXT, Map.of("Tomar una salchichona +20 de fama", "step_2_btn",
                    "Tomar un pescado +20 de fama", "step_2_btn",
                    "Tomar una lata de pepinillos +20 de fama", "step_2_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_2_btn")) {
            setUserGlory(20);
            sendPhotoWithCaptionAsync("step_3_pic", STEP_3_TEXT, Map.of("HRomper el robot aspiradora", "step_3_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_3_btn")) {
            addUserGlory(30);
            sendPhotoWithCaptionAsync("step_4_pic", STEP_4_TEXT, Map.of("enviar al robotg aspiradora a por comida", "step_4_btn",
                    "dar un paseo en  el robot aspiradora", "step_4_btn",
                    "Huir del robot aspiradora", "step_4_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_4_btn")) {
            addUserGlory(30);
            sendPhotoWithCaptionAsync("step_5_pic", STEP_5_TEXT, Map.of("Ponerse la GoPro +40 de fama", "step_5_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_5_btn")) {
            addUserGlory(40);
            sendPhotoWithCaptionAsync("step_6_pic", STEP_6_TEXT, Map.of("Hacer un video", "step_6_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_6_btn")) {
            addUserGlory(50);
            sendPhotoWithCaptionAsync("step_8_pic", STEP_7_TEXT, Map.of("Hackear la computadora", "step_7_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_7_btn")) {
            addUserGlory(60);
            sendPhotoWithCaptionAsync("step_8_pic", STEP_8_TEXT, Map.of("Subir el video a YouTube +70 de fama", "step_8_btn"));
        }

        if(getCallbackQueryButtonKey().equals("step_8_btn")) {
            addUserGlory(70);
            sendPhotoWithCaptionAsync("final_pic", FINAL_TEXT, Map.of());
        }

    }

    //Funcion para enviar el texto, la imagen y los botones en el mismo mensaje
    public void sendPhotoWithCaptionAsync(String photoKey, String caption, Map<String, String> buttons) {
        SendPhoto photo = createPhotoMessage(photoKey);
        photo.setCaption(caption);
        if (buttons != null && !buttons.isEmpty()) {
            InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
            List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
            for (String buttonName : buttons.keySet()) {
                String buttonValue = buttons.get(buttonName);
                InlineKeyboardButton button = new InlineKeyboardButton();
                button.setText(new String(buttonName.getBytes(), StandardCharsets.UTF_8));
                button.setCallbackData(buttonValue);
                keyboard.add(List.of(button));
            }
            markup.setKeyboard(keyboard);
            photo.setReplyMarkup(markup);
        }
        executeAsync(photo);
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}