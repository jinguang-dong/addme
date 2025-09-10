package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.M;
import j$.util.Spliterator;
import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ s(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path h(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof t ? ((t) path).a : new s(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ I H(J j, G[] gArr) {
        return I.a(this.a.register(j == null ? null : j.a, D.l(gArr)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo((java.nio.file.Path) D.b(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof s) {
            obj = ((s) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ I g(J j, G[] gArr, H[] hArr) {
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = j == null ? null : j.a;
        WatchEvent.Kind[] kindArrL = D.l(gArr);
        if (hArr != null) {
            int length = hArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                H h = hArr[i];
                modifierArr2[i] = h == null ? null : h.a;
            }
            modifierArr = modifierArr2;
        }
        return I.a(path.register(watchService, kindArrL, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return h(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ AbstractC0015i getFileSystem() {
        return C0013g.k(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return h(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return h(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return h(this.a.getRoot());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path i(Path path) {
        return h(this.a.resolve(t.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new x(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path j(LinkOption[] linkOptionArr) {
        return h(this.a.toRealPath(D.k(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    /* renamed from: n */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(t.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return h(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean p(Path path) {
        return this.a.startsWith(t.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean r(Path path) {
        return this.a.endsWith(t.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return h(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return h(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return M.a(this.a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return h(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path t(Path path) {
        return h(this.a.resolveSibling(t.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return h(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path z(Path path) {
        return h(this.a.relativize(t.h(path)));
    }
}
