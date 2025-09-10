package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements BasicFileAttributes {
    public final /* synthetic */ DosFileAttributes a;

    public /* synthetic */ i(DosFileAttributes dosFileAttributes) {
        this.a = dosFileAttributes;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ u creationTime() {
        return j$.desugar.sun.nio.fs.g.A(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof i) {
            obj = ((i) obj).a;
        }
        return dosFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ u lastAccessTime() {
        return j$.desugar.sun.nio.fs.g.A(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ u lastModifiedTime() {
        return j$.desugar.sun.nio.fs.g.A(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
