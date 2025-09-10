package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements A {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ y(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    @Override // j$.nio.file.A
    public final /* synthetic */ boolean a(Path path) {
        return this.a.matches(t.h(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
