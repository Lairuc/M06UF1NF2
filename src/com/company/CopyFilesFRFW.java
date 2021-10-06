package com.company;

import java.io.*;

public class CopyFilesFRFW {
    public CopyFilesFRFW( String origen, String desti ) throws Exception {
        BufferedReader inputStream = new BufferedReader( new FileReader(new File( origen ) ) );
        BufferedWriter outputStream= new BufferedWriter( new FileWriter(new File( desti ), true ) );

        String line = "";
        while ( (line=inputStream.readLine()) != null ) {
            outputStream.write( line );
        }
        outputStream.close();
        inputStream.close();
    }

    public CopyFilesFRFW( String[] params ) throws Exception {
        BufferedReader inputStream = new BufferedReader( new FileReader(new File( params[0] ) ) );
        BufferedWriter outputStream= new BufferedWriter( new FileWriter(new File( params[1] ), true ) );

        String line = "";
        while ( (line=inputStream.readLine()) != null ) {
            outputStream.write( line );
        }
        outputStream.close();
        inputStream.close();
    }

}
