package j$.nio.file.attribute;

/* loaded from: classes3.dex */
public interface BasicFileAttributes {
    u creationTime();

    Object fileKey();

    boolean isDirectory();

    boolean isOther();

    boolean isRegularFile();

    boolean isSymbolicLink();

    u lastAccessTime();

    u lastModifiedTime();

    long size();
}
