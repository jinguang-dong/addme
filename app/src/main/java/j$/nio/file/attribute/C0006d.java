package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0006d implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC0007e a;

    public /* synthetic */ C0006d(InterfaceC0007e interfaceC0007e) {
        this.a = interfaceC0007e;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0007e interfaceC0007e = this.a;
        if (obj instanceof C0006d) {
            obj = ((C0006d) obj).a;
        }
        return interfaceC0007e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return g.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(j$.desugar.sun.nio.fs.g.A(fileTime), j$.desugar.sun.nio.fs.g.A(fileTime2), j$.desugar.sun.nio.fs.g.A(fileTime3));
    }
}
