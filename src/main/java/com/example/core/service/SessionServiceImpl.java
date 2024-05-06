package com.example.core.service;

import com.example.core.entity.Session;
import com.example.core.repository.SessionRepository;
import org.springframework.stereotype.Service;

@Service("sessionService")
public class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;

    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public Session addSession(Session session) {
        return sessionRepository.insert(session);
    }

//    @Override
//    public Session findByAccountId(String accountId) {
//        Session session = sessionRepository.findByAccountId(accountId);
//        return session;
//    }
}
