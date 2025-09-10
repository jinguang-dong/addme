package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0003a implements s {
    public final /* synthetic */ AclFileAttributeView a;

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ void b(C c) throws IOException {
        this.a.setOwner(B.a(c));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C0003a) {
            obj = ((C0003a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
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
}
