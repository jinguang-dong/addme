package j$.nio.file.attribute;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements o {
    public final /* synthetic */ UserDefinedFileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.o
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
