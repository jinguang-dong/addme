package j$.nio.file;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.WatchService;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements Closeable {
    public final /* synthetic */ WatchService a;

    public /* synthetic */ J(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ J a(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new J(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
