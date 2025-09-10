package j$.adapter;

import android.os.StrictMode;
import j$.nio.file.spi.d;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* loaded from: classes3.dex */
public abstract class c {
    public static final d a;

    static {
        d bVar;
        if (a.b) {
            FileSystemProvider fileSystemProviderProvider = FileSystems.getDefault().provider();
            int i = j$.nio.file.spi.b.c;
            bVar = fileSystemProviderProvider == null ? null : fileSystemProviderProvider instanceof j$.nio.file.spi.c ? ((j$.nio.file.spi.c) fileSystemProviderProvider).a : new j$.nio.file.spi.b(fileSystemProviderProvider);
        } else {
            if (a.c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            bVar = j$.desugar.sun.nio.fs.d.a;
        }
        a = bVar;
        bVar.j(URI.create("file:///"));
    }
}
