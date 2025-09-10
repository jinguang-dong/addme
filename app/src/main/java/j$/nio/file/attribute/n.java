package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements FileAttributeView {
    public final /* synthetic */ o a;

    public final /* synthetic */ boolean equals(Object obj) {
        o oVar = this.a;
        if (obj instanceof n) {
            obj = ((n) obj).a;
        }
        return oVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
