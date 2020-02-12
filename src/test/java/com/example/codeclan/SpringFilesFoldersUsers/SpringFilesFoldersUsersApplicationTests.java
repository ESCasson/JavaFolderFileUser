package com.example.codeclan.SpringFilesFoldersUsers;

import com.example.codeclan.SpringFilesFoldersUsers.models.ExtType;
import com.example.codeclan.SpringFilesFoldersUsers.models.File;
import com.example.codeclan.SpringFilesFoldersUsers.models.Folder;
import com.example.codeclan.SpringFilesFoldersUsers.models.User;
import com.example.codeclan.SpringFilesFoldersUsers.respository.FileRepository;
import com.example.codeclan.SpringFilesFoldersUsers.respository.FolderRepository;
import com.example.codeclan.SpringFilesFoldersUsers.respository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringFilesFoldersUsersApplicationTests {
@Autowired
private FileRepository fileRepository;

@Autowired
private UserRepository userRepository;

@Autowired
private FolderRepository folderRepository;
	@Test
	void contextLoads() {
	}

@Test
	public void canCreateFile(){
		User user = new User("Jane");
		userRepository.save(user);
	Folder folder = new Folder("New Start", user);
	folderRepository.save(folder);
	File file = new File("Billy Bob", "ppt", 45, folder);
	fileRepository.save(file);

}



}
