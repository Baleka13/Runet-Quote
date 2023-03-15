package ry.syn.quotes.controllers;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ry.syn.quotes.repositories.ChatRepository;

@Service
public class BotController {
    //5824425758:AAHmOeTVyxdYLFo_y9r2ZUtVfVAcwhs2YQU
    //BalekaBot
@Autowired
    ChatRepository chatRepository;
    private final TelegramBot bot;
    public BotController (){
        String botToken = "5824425758:AAHmOeTVyxdYLFo_y9r2ZUtVfVAcwhs2YQU"
         bot = new TelegramBot(botToken);

// Register for updates
        bot.setUpdatesListener(updates -> {
            for (Update update: updates){
                handleUpdate (update);

            }
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });




}

    private void handleUpdate(Update update) {
        String text = update.message().text();
        long chatid = update.message().chat().id();
        var rowchat = chatRepository.findByChatIDEquals(chatid);
        ry.syn.quotes.models.Chat chat;
        if (rowchat.isPresent()) {
            chat = rowchat.get();
        }else {
            var _chat = new Chat();

        }
        switch (text){
            case "/start":
            case "/next":

                break;
        }
    }

    private void sendNextQuote (Chat chat){

    }
    }
