package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class w implements InterfaceC0007e, s {
    public final /* synthetic */ PosixFileAttributeView a;

    public /* synthetic */ w(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ void a(u uVar, u uVar2, u uVar3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.B(uVar), j$.desugar.sun.nio.fs.g.B(uVar2), j$.desugar.sun.nio.fs.g.B(uVar3));
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ void b(C c) throws IOException {
        this.a.setOwner(B.a(c));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof w) {
            obj = ((w) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ C getOwner() {
        return A.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return f.a(this.a.readAttributes());
    }
}
