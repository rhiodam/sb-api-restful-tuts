package com.rhiodamuthie.sbapirestful.repository;

import com.rhiodamuthie.sbapirestful.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILanguageRepository extends JpaRepository<Language, Long> {
}
