package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0014h extends FileSystem {
    public final /* synthetic */ AbstractC0015i a;

    public /* synthetic */ C0014h(AbstractC0015i abstractC0015i) {
        this.a = abstractC0015i;
    }

    public static /* synthetic */ FileSystem a(AbstractC0015i abstractC0015i) {
        if (abstractC0015i == null) {
            return null;
        }
        return abstractC0015i instanceof C0013g ? ((C0013g) abstractC0015i).a : new C0014h(abstractC0015i);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0015i abstractC0015i = this.a;
        if (obj instanceof C0014h) {
            obj = ((C0014h) obj).a;
        }
        return abstractC0015i.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return t.h(this.a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        A aC = this.a.c(str);
        if (aC == null) {
            return null;
        }
        return aC instanceof y ? ((y) aC).a : new z(aC);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new w(this.a.d());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.D dF = this.a.f();
        int i = j$.nio.file.attribute.E.a;
        if (dF == null) {
            return null;
        }
        return dF.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        J jH = this.a.h();
        if (jH == null) {
            return null;
        }
        return jH.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.d dVarI = this.a.i();
        int i = j$.nio.file.spi.c.b;
        if (dVarI == null) {
            return null;
        }
        return dVarI instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) dVarI).b : new j$.nio.file.spi.c(dVarI);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.j();
    }
}
