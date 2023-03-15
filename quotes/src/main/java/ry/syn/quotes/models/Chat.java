package ry.syn.quotes.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "\"Chats\"")
public class Chat {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "chatid", nullable = false)
    private Long chatid;

    @Column(name = "lastid", nullable = false)
    private Integer lastid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getChatid() {
        return chatid;
    }

    public void setChatid(Long chatid) {
        this.chatid = chatid;
    }

    public Integer getLastid() {
        return lastid;
    }

    public void setLastid(Integer lastid) {
        this.lastid = lastid;
    }

}