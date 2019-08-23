import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DES
{
	public static void main(String[] argv) {

		try{

		    // TODO
		    SecretKey myDesKey = keygenerator.generateKey();

		    Cipher desCipher;

		    // Create the cipher
		    desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

		    // Initialize the cipher for encryption
		    // TODO

		    //sensitive information
		    // TODO

		    System.out.println("Text [Byte Format] : " + text);
		    System.out.println("Text : " + new String(text));

		    // Encrypt the text
		    // TODO

		    System.out.println("Text Encryted : " + textEncrypted);

		    // Initialize the same cipher for decryption
		    // TODO

		    // Decrypt the text
		    byte[] textDecrypted = desCipher.doFinal(textEncrypted);

		    System.out.println("Text Decryted : " + new String(textDecrypted));

		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}catch(NoSuchPaddingException e){
			e.printStackTrace();
		}catch(InvalidKeyException e){
			e.printStackTrace();
		}catch(IllegalBlockSizeException e){
			e.printStackTrace();
		}catch(BadPaddingException e){
			e.printStackTrace();
		}

	}
}
