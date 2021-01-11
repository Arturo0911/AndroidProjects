package com.example.carcompany.process;

import android.content.Intent;

public class Credential {
    /**
     *
     * @param credential the credential to be tested
     *  if is correct retrurn true, otherwise return false
     */
    public boolean checkCredential(String credential){

        String [] credentials = credential.split("");

        try {

            int thirdDigit = Integer.parseInt(credentials[2]);
            int verifyDigit = Integer.parseInt(credentials[9]);
            int totalSum = 0;
            if (credentials.length == 10 && thirdDigit < 6){

                for (int x = 0; x < credentials.length - 1; x++){
                    if (x % 2 ==0){
                        if(Integer.parseInt(credentials[x]) * 2 >= 10){

                            totalSum += (Integer.parseInt(credentials[x]) * 2) - 9;
                        }else{
                            totalSum += Integer.parseInt(credentials[x]) * 2;
                        }
                    }else{
                        totalSum += Integer.parseInt(credentials[x]);
                    }
                }

                String [] lastArray = String.valueOf(totalSum).split("");
                int finalDigit = Integer.parseInt(lastArray[lastArray.length - 1]);

                if (10 - finalDigit  == verifyDigit){
                    return true;
                }else{
                    return false;
                }

            }else{
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }


    }
}
