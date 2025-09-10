package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC0015i;
import j$.nio.file.B;
import j$.nio.file.C0010d;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0002a;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.o;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public abstract class d {
    public static final Set a = g.I(new Object[]{B.CREATE, B.TRUNCATE_EXISTING, B.WRITE});

    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    public abstract void a(Path path, EnumC0002a... enumC0002aArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, FileAttribute... fileAttributeArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, FileAttribute... fileAttributeArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract o h(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract C0010d i(Path path);

    public abstract AbstractC0015i j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, FileAttribute... fileAttributeArr);

    public abstract SeekableByteChannel q(Path path, Set set, FileAttribute... fileAttributeArr);

    public abstract DirectoryStream r(Path path, DirectoryStream.Filter filter);

    public abstract FileChannel s(Path path, Set set, FileAttribute... fileAttributeArr);

    public AbstractC0015i t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC0015i u(URI uri, Map map);

    public InputStream v(Path path, j$.nio.file.o... oVarArr) {
        Set set;
        if (oVarArr.length > 0) {
            for (j$.nio.file.o oVar : oVarArr) {
                if (oVar == B.APPEND || oVar == B.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(oVar) + "' not allowed");
                }
            }
        }
        Set set2 = Files.a;
        if (oVarArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, oVarArr);
            set = hashSet;
        }
        return Channels.newInputStream(Files.c(path).q(path, set, new FileAttribute[0]));
    }

    public OutputStream w(Path path, j$.nio.file.o... oVarArr) {
        Set set;
        if (oVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (j$.nio.file.o oVar : oVarArr) {
                if (oVar == B.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(oVar);
            }
            hashSet.add(B.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new FileAttribute[0]));
    }

    public abstract BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract Map y(Path path, String str, LinkOption... linkOptionArr);

    public abstract Path z(Path path);
}
