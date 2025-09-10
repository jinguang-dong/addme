package defpackage;

import android.os.Trace;
import androidx.wear.ambient.AmbientMode;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rar {
    public final int a;
    public final boolean b;
    public final Object c;

    public rar(int i, dme dmeVar, boolean z) {
        this.a = i;
        this.c = dmeVar;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List a() {
        return DesugarCollections.unmodifiableList(this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void b(raq raqVar) {
        this.c.add(raqVar);
    }

    public final long c() {
        dln dlnVar;
        Object obj;
        Trace.beginSection("wear-compose:tlc:scrollProgress");
        try {
            List list = ((dme) this.c).k().d;
            int size = list.size();
            int i = 0;
            while (true) {
                dlnVar = null;
                if (i >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i);
                if (((dlr) obj).a == this.a) {
                    break;
                }
                i++;
            }
            dlr dlrVar = (dlr) obj;
            long j = 9205357640488583168L;
            if (dlrVar != null) {
                dml dmlVar = dlrVar.n;
                if (dmlVar != null) {
                    long j2 = dmlVar.c;
                    dlnVar = new dln(!a.q(j2, 9223372034707292159L) ? AmbientMode.AmbientCallback.d(chy.b(j2) + chy.b(dmlVar.a()), dmlVar.d, dmlVar.a) : 9205357640488583168L);
                }
                if (dlnVar != null && a.q(dlnVar.a, 9205357640488583168L)) {
                    dlnVar = new dln(dlrVar.h);
                }
                j = dlnVar != null ? dlnVar.a : dlrVar.h;
            }
            return j;
        } finally {
            Trace.endSection();
        }
    }

    public rar() {
        this(1);
    }

    public rar(int i) {
        this.c = new ArrayList();
        this.a = i;
        this.b = i > 1;
    }
}
