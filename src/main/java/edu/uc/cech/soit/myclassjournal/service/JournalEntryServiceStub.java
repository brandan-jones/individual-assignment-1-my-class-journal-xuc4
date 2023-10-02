package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalEntryServiceStub implements IJournalService {

    @Override
    public void save(JournalEntry journalEntry) {

    }

    @Override
    public List<JournalEntry> fetchAll() {

        return null;
    }
}
