package com.company;

import java.io.*;

public class CopyDirOrFile {

    public CopyDirOrFile(String origen, String desti) throws Exception {
        File fOrigen = new File(origen, desti);
        File fDesti = new File(desti);



        BufferedReader inputStream = new BufferedReader( new FileReader(fOrigen) );
        BufferedWriter outputStream = new BufferedWriter( new FileWriter(fDesti) );


    }
}
