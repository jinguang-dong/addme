package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdf implements rdw {
    public final Context a;
    public final Object b;
    public final HashMap c;
    public final HashMap d;
    public final prh e;

    public qdf(Context context) {
        prh prhVar = new prh();
        this.b = new Object();
        this.c = new HashMap();
        this.d = new HashMap();
        this.a = context;
        this.e = prhVar;
    }

    @Override // defpackage.rdw
    public final rdv a(Uri uri) {
        rdv rdvVar;
        synchronized (this.b) {
            rdvVar = (rdv) this.d.get(uri);
        }
        return rdvVar;
    }

    @Override // defpackage.rdw
    public final void b() {
    }
}
