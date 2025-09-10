package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements BasicFileAttributes {
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes a;

    public /* synthetic */ f(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ BasicFileAttributes a(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof g) {
            return ((g) basicFileAttributes).a;
        }
        if (AbstractC0004b.t(basicFileAttributes)) {
            DosFileAttributes dosFileAttributesL = AbstractC0004b.l(basicFileAttributes);
            if (dosFileAttributesL == null) {
                return null;
            }
            return new i(dosFileAttributesL);
        }
        if (!AbstractC0004b.w(basicFileAttributes)) {
            return new f(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributesQ = AbstractC0004b.q(basicFileAttributes);
        if (posixFileAttributesQ == null) {
            return null;
        }
        return new x(posixFileAttributesQ);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ u creationTime() {
        return j$.desugar.sun.nio.fs.g.A(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.attribute.BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return basicFileAttributes.equals(obj);
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
