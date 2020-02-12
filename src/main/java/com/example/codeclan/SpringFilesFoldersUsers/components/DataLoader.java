package com.example.codeclan.SpringFilesFoldersUsers.components;

import com.example.codeclan.SpringFilesFoldersUsers.models.File;
import com.example.codeclan.SpringFilesFoldersUsers.models.Folder;
import com.example.codeclan.SpringFilesFoldersUsers.models.User;
import com.example.codeclan.SpringFilesFoldersUsers.respository.FileRepository;
import com.example.codeclan.SpringFilesFoldersUsers.respository.FolderRepository;
import com.example.codeclan.SpringFilesFoldersUsers.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicReference;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
private UserRepository userRepository;

    @Autowired
    private FolderRepository folderRepository;
    @Autowired
    private FileRepository fileRepository;


    @Override
    public void run(ApplicationArguments args) {
    User phil = new User("Phil");
    userRepository.save(phil);
    User pam = new User("Pam");
    userRepository.save(pam);
    User ellie = new User("Ellie");
    userRepository.save(ellie);

    Folder newStart = new Folder("New Starts", phil);
    folderRepository.save(newStart);
    Folder sales = new Folder("Sales", phil);
    folderRepository.save(sales);
    Folder onBoarding = new Folder("On Boarding", phil);
    folderRepository.save(onBoarding);
    Folder projectSales = new Folder("Sales Projects", pam);
    folderRepository.save(projectSales);
    Folder projectProc = new Folder("Procurement Project", pam);
    folderRepository.save(projectProc);
    Folder frontEnd = new Folder ("New Front End", ellie);
    folderRepository.save(frontEnd);

    File guss = new File("Guss","ppt" ,56, newStart  );
    fileRepository.save(guss);
    File susan = new File ("Susan", "txt", 12, newStart);
    fileRepository.save(susan);
    File dell = new File( "Dell", "ppt", 345, onBoarding);
    fileRepository.save(dell);




    }
}
