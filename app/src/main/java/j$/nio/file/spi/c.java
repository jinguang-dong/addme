package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.AbstractC0011e;
import j$.nio.file.C0008b;
import j$.nio.file.C0010d;
import j$.nio.file.C0014h;
import j$.nio.file.D;
import j$.nio.file.EnumC0002a;
import j$.nio.file.attribute.C0003a;
import j$.nio.file.attribute.C0005c;
import j$.nio.file.attribute.C0006d;
import j$.nio.file.attribute.InterfaceC0007e;
import j$.nio.file.attribute.h;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.w;
import j$.nio.file.attribute.z;
import j$.nio.file.s;
import j$.nio.file.t;
import j$.nio.file.v;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class c extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ d a;

    public /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        d dVar = this.a;
        j$.nio.file.Path pathH = s.h(path);
        EnumC0002a[] enumC0002aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC0002a[] enumC0002aArr2 = new EnumC0002a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                enumC0002aArr2[i] = accessMode == null ? null : accessMode == AccessMode.READ ? EnumC0002a.READ : accessMode == AccessMode.WRITE ? EnumC0002a.WRITE : EnumC0002a.EXECUTE;
            }
            enumC0002aArr = enumC0002aArr2;
        }
        dVar.a(pathH, enumC0002aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path pathH = s.h(path);
        j$.nio.file.Path pathH2 = s.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0008b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.b(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(s.h(path), g.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(s.h(path), s.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(s.h(path), s.h(path2), g.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(s.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(s.h(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return dVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        o oVarH = this.a.h(s.h(path), D.c(cls), D.i(linkOptionArr));
        if (oVarH == null) {
            return null;
        }
        if (oVarH instanceof m) {
            return ((m) oVarH).a;
        }
        if (oVarH instanceof InterfaceC0007e) {
            InterfaceC0007e interfaceC0007e = (InterfaceC0007e) oVarH;
            return interfaceC0007e instanceof C0005c ? ((C0005c) interfaceC0007e).a : interfaceC0007e instanceof h ? ((h) interfaceC0007e).a : interfaceC0007e instanceof w ? ((w) interfaceC0007e).a : new C0006d(interfaceC0007e);
        }
        if (!(oVarH instanceof j$.nio.file.attribute.s)) {
            return oVarH instanceof z ? ((z) oVarH).a : new n(oVarH);
        }
        j$.nio.file.attribute.s sVar = (j$.nio.file.attribute.s) oVarH;
        return sVar instanceof q ? ((q) sVar).a : sVar instanceof C0003a ? ((C0003a) sVar).a : sVar instanceof w ? ((w) sVar).a : new r(sVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C0010d c0010dI = this.a.i(s.h(path));
        int i = AbstractC0011e.a;
        if (c0010dI == null) {
            return null;
        }
        return c0010dI.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0014h.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return t.h(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(s.h(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(s.h(path), s.h(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path pathH = s.h(path);
        j$.nio.file.Path pathH2 = s.h(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0008b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.o(pathH, pathH2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a aVarP = this.a.p(s.h(path), D.g(set), executorService, g.J(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (aVarP == null) {
            return null;
        }
        return aVarP.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(s.h(path), D.g(set), g.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new v(this.a.r(s.h(path), new j$.desugar.sun.nio.fs.h(1, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(s.h(path), D.g(set), g.J(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0014h.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.o[] oVarArr;
        d dVar = this.a;
        j$.nio.file.Path pathH = s.h(path);
        if (openOptionArr == null) {
            oVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.o[] oVarArr2 = new j$.nio.file.o[length];
            for (int i = 0; i < length; i++) {
                oVarArr2[i] = j$.nio.file.m.a(openOptionArr[i]);
            }
            oVarArr = oVarArr2;
        }
        return dVar.v(pathH, oVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.o[] oVarArr;
        d dVar = this.a;
        j$.nio.file.Path pathH = s.h(path);
        if (openOptionArr == null) {
            oVarArr = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.o[] oVarArr2 = new j$.nio.file.o[length];
            for (int i = 0; i < length; i++) {
                oVarArr2[i] = j$.nio.file.m.a(openOptionArr[i]);
            }
            oVarArr = oVarArr2;
        }
        return dVar.w(pathH, oVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return j$.nio.file.attribute.g.a(this.a.x(s.h(path), D.d(cls), D.i(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return t.h(this.a.z(s.h(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(s.h(path), str, D.f(obj), D.i(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0014h.a(this.a.t(s.h(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return D.e(this.a.y(s.h(path), str, D.i(linkOptionArr)));
    }
}
