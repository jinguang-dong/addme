package j$.nio.file;

import java.nio.file.WatchEvent;

/* loaded from: classes3.dex */
public final /* synthetic */ class H {
    public final /* synthetic */ WatchEvent.Modifier a;

    public final /* synthetic */ boolean equals(Object obj) {
        WatchEvent.Modifier modifier = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return modifier.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
