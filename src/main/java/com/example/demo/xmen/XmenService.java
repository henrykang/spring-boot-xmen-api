package com.example.demo.xmen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class XmenService {

    private final XmenRepository xmenRepository;

    @Autowired
    public XmenService(XmenRepository xmenRepository) {
        this.xmenRepository = xmenRepository;
    }

    public List<Xmen> getXmen() {
        return xmenRepository.findAll();
    }

    public void addNewXmen(Xmen xmen) {
        Optional<Xmen> xmenByAlias = xmenRepository.findXmenByAlias(xmen.getAlias());
        if (xmenByAlias.isPresent()) {
            throw new IllegalStateException("alias taken");
        }
        xmenRepository.save(xmen);
    }

    public void deleteXmen(Long xmenId) {
        boolean exists = xmenRepository.existsById(xmenId);
        if (!exists) {
            throw new IllegalStateException("xmen with id " + xmenId + " does not exist");
        }
        xmenRepository.deleteById(xmenId);
    }

    @Transactional
    public void updateXmen(Long xmenId, String name, String alias) {
        Xmen xmen = xmenRepository.findById(xmenId).orElseThrow(() -> new IllegalStateException(
                "xmen with id " + xmenId + " does not exist"));

        if (name != null && name.length() > 0 && !Objects.equals(xmen.getName(), name)) {
            xmen.setName(name);
        }

        if (alias != null && alias.length() > 0 && !Objects.equals(xmen.getAlias(), alias)) {
            Optional<Xmen> xmenOptional = xmenRepository.findXmenByAlias(alias);
            if (xmenOptional.isPresent()) {
                throw new IllegalStateException("alias taken");
            }
            xmen.setAlias(alias);
        }
    }
}
