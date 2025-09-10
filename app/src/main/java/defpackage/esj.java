package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esj {
    private volatile ett a;
    private final ejt b;

    public esj(ejt ejtVar) {
        this.b = ejtVar;
    }

    public final ett a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b.a;
                    File cacheDir = ((Context) ((oge) obj).b).getCacheDir();
                    etv etvVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, (String) ((oge) obj).a);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        etvVar = new etv(file);
                    }
                    this.a = etvVar;
                }
                if (this.a == null) {
                    this.a = new etu();
                }
            }
        }
        return this.a;
    }
}
