package thymeleafexamples.layouts.dropdown;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class DropdownRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(DropdownRepository.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Dropdown save(Dropdown dropdown) {
        entityManager.persist(dropdown);
        return dropdown;
    }

    public List<Dropdown> findAll() {
        return entityManager.createQuery("SELECT t FROM Dropdown t", Dropdown.class).getResultList();
    }

    public Dropdown findById(Long id) {
        return entityManager.find(Dropdown.class, id);
    }
}
