package org.knit.lab2.Task5;

public interface FileSystemComponent {
    String getName();
    long getSize();
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
    void display(String indent);
}