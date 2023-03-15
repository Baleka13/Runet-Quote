package ry.syn.quotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ry.syn.quotes.models.Chat;
import ry.syn.quotes.models.Quoet;

import java.util.Optional;

public interface ChatRepository extends JpaRepository <Chat, Long> {
    Optional <Chat> findByChatIDEquals (Long chatid);
}
