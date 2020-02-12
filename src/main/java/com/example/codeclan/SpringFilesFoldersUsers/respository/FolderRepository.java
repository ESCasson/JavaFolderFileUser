package com.example.codeclan.SpringFilesFoldersUsers.respository;

import com.example.codeclan.SpringFilesFoldersUsers.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
