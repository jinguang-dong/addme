package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements InterfaceC0007e {
    public final /* synthetic */ DosFileAttributeView a;

    public /* synthetic */ h(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ void a(u uVar, u uVar2, u uVar3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.B(uVar), j$.desugar.sun.nio.fs.g.B(uVar2), j$.desugar.sun.nio.fs.g.B(uVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof h) {
            obj = ((h) obj).a;
        }
        return dosFileAttributeView.equals(obj);
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
