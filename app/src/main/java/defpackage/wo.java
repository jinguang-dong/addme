package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wo {
    public final int a;
    public final Size b;
    public final int c;
    public final String d;
    public final qu e;
    public final qz f;
    public final qt g;
    public final qx h;
    public final qv i;
    public final qy j;
    public pv k;

    public wo(int i, Size size, int i2, String str, qu quVar, qz qzVar, qt qtVar, qx qxVar, qv qvVar, qy qyVar) {
        this.a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = quVar;
        this.f = qzVar;
        this.g = qtVar;
        this.h = qxVar;
        this.i = qvVar;
        this.j = qyVar;
    }

    public final /* synthetic */ boolean a() {
        qx qxVar = this.h;
        if (qxVar != null) {
            long j = qxVar.a;
            if (!a.q(j, 0L) && !a.q(j, 1L) && !a.q(j, 3L) && this.j != null && !a.q(1L, 0L) && !a.q(1L, 1L)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return qo.a(this.a);
    }
}
