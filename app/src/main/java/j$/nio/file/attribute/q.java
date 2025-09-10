package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements s {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ void b(C c) throws IOException {
        this.a.setOwner(B.a(c));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof q) {
            obj = ((q) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
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
