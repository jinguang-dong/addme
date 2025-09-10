package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qav {
    public final rwc a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public qav(Context context, pzc pzcVar, qag qagVar, qai qaiVar, qbq qbqVar, prh prhVar, lat latVar, rwc rwcVar, pwt pwtVar, Executor executor, puu puuVar) {
        this.i = context;
        this.h = pzcVar;
        this.e = qagVar;
        this.j = qaiVar;
        this.k = qbqVar;
        this.b = prhVar;
        this.f = latVar;
        this.a = rwcVar;
        this.c = pwtVar;
        this.g = executor;
        this.d = puuVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, qbq] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, qbq] */
    public final int a(Uri uri, List list) {
        Object obj;
        int iA = 0;
        try {
            obj = this.f;
        } catch (IOException e) {
            this.k.l(1059);
            qbu.g(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
        }
        if (!((lat) obj).r(uri)) {
            return 0;
        }
        for (Uri uri2 : ((lat) obj).l(uri)) {
            try {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                            break;
                        }
                    } else if (((lat) obj).s(uri2)) {
                        iA += a(uri2, list);
                    } else {
                        uri2.getPath();
                        int i = qbu.a;
                        ((lat) obj).p(uri2);
                        iA++;
                    }
                }
            } catch (IOException e2) {
                this.k.l(1059);
                qbu.g(e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
            }
        }
        return iA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pzc] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final syu b() {
        syu syuVarE = this.h.e();
        jmx jmxVar = new jmx(this, 18);
        ?? r2 = this.g;
        return qsz.n(qsz.n(syuVarE, jmxVar, r2), new jmx(this, 16), r2);
    }

    public qav(lat latVar, qdf qdfVar, qbq qbqVar, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, rwc rwcVar5, puu puuVar, rwc rwcVar6, rwc rwcVar7) {
        this.b = latVar;
        this.c = qdfVar;
        this.d = qbqVar;
        this.e = rwcVar;
        this.a = rwcVar2;
        this.f = rwcVar3;
        this.g = rwcVar4;
        this.h = rwcVar5;
        this.i = puuVar;
        this.j = rwcVar6;
        this.k = rwcVar7;
    }
}
