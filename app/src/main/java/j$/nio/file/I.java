package j$.nio.file;

import java.nio.file.WatchKey;

/* loaded from: classes3.dex */
public final /* synthetic */ class I {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ I(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ I a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new I(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
