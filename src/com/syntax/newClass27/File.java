package com.syntax.newClass27;

public abstract class File {
    public abstract void open();
    public void edit(){
        System.out.println("I can edit any file");
    }
    public void close(){
        System.out.println("I can close any file");
    }
}
class JavaFile extends File{
    @Override
    public void open() {
        System.out.println("We need notepad++ to open the Java file");
    }
}
class WordFile extends File{
    @Override
    public void open() {
        System.out.println("To open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    @Override
    public void open() {
        System.out.println("To open PDF file we need some PDF program");
    }
}
class CallFile{
    public static void main(String[] args) {
        File[] allFiles={new JavaFile(),new PdfFile(),new WordFile()};
        for(File file:allFiles){
            file.open();
            file.close();
            file.edit();
        }
    }
}
