import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class sigIRC{
    static Socket socket;
    static PrintWriter out;
    static BufferedReader in;
    public static void main(String[] args) {
        try {
            socket = new Socket("projectdivar.com",6667);
            out = new PrintWriter(socket.getOutputStream(),true);
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("NICK sigonasr2");
            out.println("USER sigonasr2 localhost localhost Sig");
            while (true) {
                String line;
                if ((line=in.readLine())!=null) {
                 System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}