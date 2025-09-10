package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes3.dex */
public interface Path extends Comparable<Path>, Iterable<Path> {

    /* renamed from: j$.nio.file.Path$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Path of(String str, String... strArr) {
            return k.a.b(str, strArr);
        }
    }

    I H(J j, G... gArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    I g(J j, G[] gArr, H... hArr);

    Path getFileName();

    AbstractC0015i getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    int hashCode();

    Path i(Path path);

    boolean isAbsolute();

    Iterator iterator();

    Path j(LinkOption... linkOptionArr);

    int n(Path path);

    Path normalize();

    boolean p(Path path);

    boolean r(Path path);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path t(Path path);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    Path z(Path path);
}
