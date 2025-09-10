package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qdc implements rdw, qda {
    public final Executor a;
    public final qcy b;
    public final HashMap c;
    public final HashMap d;
    private final prh e;

    public qdc(Executor executor) {
        prh prhVar = new prh();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = prhVar;
        this.a = new szg(executor);
        this.b = new qcy(executor);
    }

    @Override // defpackage.rdw
    public final rdv a(Uri uri) {
        synchronized (qdc.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return this.b.a(uri);
            }
            HashMap map = this.d;
            if (map.get(str) == null) {
                int i = qbu.a;
                return null;
            }
            return (rdv) map.get(str);
        }
    }

    public final void c(String str, puo puoVar) {
        synchronized (qdc.class) {
            HashMap map = this.d;
            if (!map.containsKey(str)) {
                map.put(str, new rdj(new qdb(this, str, puoVar), new qdd(1), 1000L, TimeUnit.MILLISECONDS));
            }
        }
    }

    public final void d(String str, long j) {
        synchronized (qdc.class) {
            HashMap map = this.d;
            if (map.containsKey(str)) {
                ((rdj) map.get(str)).a.a(j);
            }
        }
    }

    public final void e(String str) {
        synchronized (qdc.class) {
            this.d.remove(str);
        }
    }

    @Override // defpackage.rdw
    public final void b() {
    }
}
