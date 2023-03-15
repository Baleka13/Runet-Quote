package ry.syn.quotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ry.syn.quotes.models.Quoet;

public interface QuoteRepository extends JpaRepository <Quoet, Integer> {
}
