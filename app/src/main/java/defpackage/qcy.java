package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qcy implements rdw, qda {
    public final HashMap a = new HashMap();

    public qcy(Executor executor) {
        new szg(executor);
    }

    @Override // defpackage.rdw
    public final rdv a(Uri uri) {
        synchronized (qcy.class) {
            HashMap map = this.a;
            if (map.get(uri) == null) {
                return null;
            }
            return (rdv) map.get(uri);
        }
    }

    @Override // defpackage.rdw
    public final void b() {
    }
}
