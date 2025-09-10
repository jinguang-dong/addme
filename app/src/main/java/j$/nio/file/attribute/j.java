package j$.nio.file.attribute;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements FileAttribute {
    public final /* synthetic */ java.nio.file.attribute.FileAttribute a;

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.attribute.FileAttribute fileAttribute = this.a;
        if (obj instanceof j) {
            obj = ((j) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
