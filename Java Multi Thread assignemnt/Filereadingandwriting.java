import java.io.*;
public class bytestream
{
public static void main(String[] args) throws IOException
{
FileInputStream sourceStream = null;
FileOutputStream targetStream = null;

try
{
sourceStream = new FileInputStream("C:/Users/HTC/Desktop/sourcefile.txt");
targetStream = new FileOutputStream ("C:/Users/HTC/Desktop/targetfile.txt");

// Reading source file and writing content to target
// file byte by byte
int temp;
while ((temp = sourceStream.read()) != -1)
targetStream.write((byte)temp);
}
finally
{
if (sourceStream != null)
sourceStream.close();
if (targetStream != null)
targetStream.close();
}
}
}
