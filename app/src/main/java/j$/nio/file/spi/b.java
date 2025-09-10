package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC0015i;
import j$.nio.file.C0010d;
import j$.nio.file.C0013g;
import j$.nio.file.CopyOption;
import j$.nio.file.D;
import j$.nio.file.EnumC0002a;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.AbstractC0004b;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.C0003a;
import j$.nio.file.attribute.C0005c;
import j$.nio.file.attribute.C0006d;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.h;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.w;
import j$.nio.file.attribute.z;
import j$.nio.file.r;
import j$.nio.file.s;
import j$.nio.file.t;
import j$.nio.file.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends d {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ b(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void A(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.b.setAttribute(t.h(path), str, D.f(obj), D.k(linkOptionArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void a(Path path, EnumC0002a[] enumC0002aArr) throws IOException {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = t.h(path);
        AccessMode[] accessModeArr = null;
        if (enumC0002aArr != null) {
            int length = enumC0002aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0002a enumC0002a = enumC0002aArr[i];
                accessModeArr2[i] = enumC0002a == null ? null : enumC0002a == EnumC0002a.READ ? AccessMode.READ : enumC0002a == EnumC0002a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathH, accessModeArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.copy(t.h(path), t.h(path2), g.K(copyOptionArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void c(Path path, FileAttribute[] fileAttributeArr) throws IOException {
        this.b.createDirectory(t.h(path), g.L(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(t.h(path), t.h(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void e(Path path, Path path2, FileAttribute[] fileAttributeArr) throws IOException {
        this.b.createSymbolicLink(t.h(path), t.h(path2), g.L(fileAttributeArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof b) {
            obj = ((b) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void f(Path path) throws IOException {
        this.b.delete(t.h(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(t.h(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ o h(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(t.h(path), D.c(cls), D.k(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof n) {
            return ((n) fileAttributeView).a;
        }
        if (AbstractC0004b.z(fileAttributeView)) {
            BasicFileAttributeView basicFileAttributeViewI = AbstractC0004b.i(fileAttributeView);
            return basicFileAttributeViewI instanceof C0006d ? ((C0006d) basicFileAttributeViewI).a : r.r(basicFileAttributeViewI) ? new h(r.i(basicFileAttributeViewI)) : r.v(basicFileAttributeViewI) ? new w(AbstractC0004b.p(basicFileAttributeViewI)) : new C0005c(basicFileAttributeViewI);
        }
        if (!AbstractC0004b.B(fileAttributeView)) {
            return AbstractC0004b.D(fileAttributeView) ? new z(AbstractC0004b.r(fileAttributeView)) : new m(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeViewM = AbstractC0004b.m(fileAttributeView);
        return fileOwnerAttributeViewM instanceof j$.nio.file.attribute.r ? ((j$.nio.file.attribute.r) fileOwnerAttributeViewM).a : p.s(fileOwnerAttributeViewM) ? new C0003a(p.i(fileOwnerAttributeViewM)) : r.v(fileOwnerAttributeViewM) ? new w(AbstractC0004b.p(fileOwnerAttributeViewM)) : new q(fileOwnerAttributeViewM);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ C0010d i(Path path) throws IOException {
        FileStore fileStore = this.b.getFileStore(t.h(path));
        if (fileStore == null) {
            return null;
        }
        return new C0010d(fileStore);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0015i j(URI uri) {
        return C0013g.k(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path k(URI uri) {
        return s.h(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(t.h(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(t.h(path), t.h(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.move(t.h(path), t.h(path2), g.K(copyOptionArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(t.h(path), D.g(set), executorService, g.L(fileAttributeArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.b.newByteChannel(t.h(path), D.g(set), g.L(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, DirectoryStream.Filter filter) {
        return new v(this.b.newDirectoryStream(t.h(path), new j$.desugar.sun.nio.fs.h(1, filter)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileChannel s(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.b.newFileChannel(t.h(path), D.g(set), g.L(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0015i t(Path path, Map map) {
        return C0013g.k(this.b.newFileSystem(t.h(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ AbstractC0015i u(URI uri, Map map) {
        return C0013g.k(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InputStream v(Path path, j$.nio.file.o[] oVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = t.h(path);
        if (oVarArr == null) {
            openOptionArr = null;
        } else {
            int length = oVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.n.a(oVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathH, openOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ OutputStream w(Path path, j$.nio.file.o[] oVarArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathH = t.h(path);
        if (oVarArr == null) {
            openOptionArr = null;
        } else {
            int length = oVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.n.a(oVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathH, openOptionArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ BasicFileAttributes x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return f.a(this.b.readAttributes(t.h(path), D.d(cls), D.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Map y(Path path, String str, LinkOption[] linkOptionArr) {
        return D.e(this.b.readAttributes(t.h(path), str, D.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path z(Path path) {
        return s.h(this.b.readSymbolicLink(t.h(path)));
    }
}
