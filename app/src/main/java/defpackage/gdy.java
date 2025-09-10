package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gdy implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gdy(Object obj, boolean z, long j, int i) {
        this.d = i;
        this.c = obj;
        this.a = z;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws TimeoutException {
        int i = this.d;
        if (i == 0) {
            boolean z = this.a;
            Object obj = this.c;
            if (z) {
                ((ged) obj).m.j();
            } else {
                ((ged) obj).m.i(this.b);
            }
            return null;
        }
        if (i == 1) {
            boolean z2 = this.a;
            Object obj2 = this.c;
            if (z2) {
                ((ged) obj2).l.j();
            } else {
                ((ged) obj2).l.i(this.b);
            }
            return null;
        }
        if (i == 2) {
            ged gedVar = (ged) this.c;
            rwc rwcVar = gedVar.e;
            if (rwcVar.h()) {
                boolean z3 = this.a;
                Object objC = rwcVar.c();
                if (z3) {
                    ((oys) objC).h();
                } else {
                    ((oys) objC).g(this.b);
                }
                ges gesVar = gedVar.n;
                if (gesVar != null) {
                    gesVar.c();
                }
                ((oys) objC).c();
            }
            return null;
        }
        if (i == 3) {
            ozh ozhVar = ((ozk) this.c).j;
            if (ozhVar != null) {
                if (this.a) {
                    ozhVar.j();
                } else {
                    ozhVar.i(this.b);
                }
            }
            return null;
        }
        ozk ozkVar = (ozk) this.c;
        oys oysVar = ozkVar.k;
        if (oysVar != null) {
            if (this.a) {
                oysVar.h();
            } else {
                oysVar.g(this.b);
            }
            ges gesVar2 = ozkVar.l;
            if (gesVar2 != null) {
                gesVar2.c();
            }
            oysVar.c();
        }
        return null;
    }
}
