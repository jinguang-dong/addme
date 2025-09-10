package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ghr {
    public final rwc b;
    public final owq c;
    public final ghx d;
    public gho f;
    public final hbj h;
    public final List a = new ArrayList();
    public final AtomicBoolean e = new AtomicBoolean(true);
    public boolean g = true;

    public ghr(rwc rwcVar, owq owqVar, ghx ghxVar, hbj hbjVar, fdq fdqVar) {
        this.b = rwcVar;
        this.c = owqVar;
        this.d = ghxVar;
        this.h = hbjVar;
        this.f = (gho) owqVar.dL();
        fdqVar.j().d(a(new ghp(this, 0)));
        fdqVar.j().d(owqVar.dK(new gej(this, 5), ojl.ce()));
    }

    public static final boolean b(gho ghoVar, gho ghoVar2) {
        if (ghoVar2 != ghoVar) {
            return ghoVar.f || ghoVar2.f;
        }
        return false;
    }

    public final paq a(ghq ghqVar) {
        this.a.add(ghqVar);
        return new fid(this, ghqVar, 11);
    }

    public final void c(gho ghoVar) {
        if (this.e.get()) {
            return;
        }
        ghx ghxVar = this.d;
        gho ghoVar2 = gho.OFF;
        int iOrdinal = ghoVar.ordinal();
        if (iOrdinal == 1) {
            ghxVar.d();
            return;
        }
        if (iOrdinal == 2) {
            ghxVar.c();
        } else if (iOrdinal == 3) {
            ghxVar.e();
        } else {
            if (iOrdinal != 4) {
                return;
            }
            ghxVar.f();
        }
    }
}
