package projectx.services;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Random;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Hash{
	   public static byte[] hashPassword( final char[] password, final byte[] salt, final int iterations, final int keyLength ) {
		   
	       try {
	           SecretKeyFactory skf = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA512" );
	           PBEKeySpec spec = new PBEKeySpec( password, salt, iterations, keyLength );
	           SecretKey key = skf.generateSecret( spec );
	           byte[] res = key.getEncoded( );
	           return res;
	 
	       } catch( NoSuchAlgorithmException e ) {
	           throw new RuntimeException( e );
	       }catch(InvalidKeySpecException e){
	    	   throw new RuntimeException(e);
	       }
	   }
	   
	   public static byte[] getNextSalt() {
			  final Random RANDOM = new Random();
			    byte[] salt = new byte[32];
			    RANDOM.nextBytes(salt);
			    return salt;
			  }
}