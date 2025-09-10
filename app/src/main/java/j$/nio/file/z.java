package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements PathMatcher {
    public final /* synthetic */ A a;

    public /* synthetic */ z(A a) {
        this.a = a;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        A a = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.a(s.h(path));
    }
}
