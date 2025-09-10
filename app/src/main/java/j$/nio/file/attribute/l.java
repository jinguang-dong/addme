package j$.nio.file.attribute;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class l implements java.nio.file.attribute.FileAttribute {
    public final /* synthetic */ FileAttribute a;

    public l(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(j$.nio.file.D.h((Set) this.a.value()));
    }
}
