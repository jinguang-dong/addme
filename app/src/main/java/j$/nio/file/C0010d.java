package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0010d {
    public final /* synthetic */ FileStore a;

    public C0010d(FileStore fileStore) {
        this.a = fileStore;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof C0010d) {
            obj = ((C0010d) obj).a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
