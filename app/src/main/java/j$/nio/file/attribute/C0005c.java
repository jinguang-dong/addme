package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0005c implements InterfaceC0007e {
    public final /* synthetic */ BasicFileAttributeView a;

    public /* synthetic */ C0005c(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    @Override // j$.nio.file.attribute.InterfaceC0007e
    public final /* synthetic */ void a(u uVar, u uVar2, u uVar3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.B(uVar), j$.desugar.sun.nio.fs.g.B(uVar2), j$.desugar.sun.nio.fs.g.B(uVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0005c) {
            obj = ((C0005c) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
