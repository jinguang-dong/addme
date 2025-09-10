package j$.nio.file;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0013g extends AbstractC0015i {
    public final /* synthetic */ FileSystem a;

    public C0013g(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC0015i k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0014h ? ((C0014h) fileSystem).a : new C0013g(fileSystem);
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ Iterable a() {
        return this.a.getFileStores();
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ Path b(String str, String[] strArr) {
        return s.h(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ A c(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof z ? ((z) pathMatcher).a : new y(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    @Override // j$.nio.file.AbstractC0015i
    public final Iterable d() {
        return new w(this.a.getRootDirectories());
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ String e() {
        return this.a.getSeparator();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C0013g) {
            obj = ((C0013g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ j$.nio.file.attribute.D f() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new j$.nio.file.attribute.D(userPrincipalLookupService);
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ boolean g() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ J h() {
        return J.a(this.a.newWatchService());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ j$.nio.file.spi.d i() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = j$.nio.file.spi.b.c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.c ? ((j$.nio.file.spi.c) fileSystemProviderProvider).a : new j$.nio.file.spi.b(fileSystemProviderProvider);
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.AbstractC0015i
    public final /* synthetic */ Set j() {
        return this.a.supportedFileAttributeViews();
    }
}
