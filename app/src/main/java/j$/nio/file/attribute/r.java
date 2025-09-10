package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements FileOwnerAttributeView {
    public final /* synthetic */ s a;

    public final /* synthetic */ boolean equals(Object obj) {
        s sVar = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return sVar.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return B.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(A.a(userPrincipal));
    }
}
