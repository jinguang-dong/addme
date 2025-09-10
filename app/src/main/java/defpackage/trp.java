package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class trp {
    private static volatile int a = 100;

    public static trq f(Object obj) {
        return ((tph) obj).aW;
    }

    public static void g(Object obj, trq trqVar) {
        ((tph) obj).aW = trqVar;
    }

    final boolean a(Object obj, too tooVar, int i) throws tpz {
        int i2 = tooVar.b;
        int iA = tsa.a(i2);
        int iB = tsa.b(i2);
        if (iB == 0) {
            d(obj, iA, tooVar.k());
            return true;
        }
        if (iB == 1) {
            trq trqVar = (trq) obj;
            trqVar.e(tsa.c(iA, 1), Long.valueOf(tooVar.j()));
            return true;
        }
        if (iB == 2) {
            c(obj, iA, tooVar.o());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                if (i != 0) {
                    return false;
                }
                throw new tpz("Protocol message end-group tag did not match expected tag.");
            }
            if (iB != 5) {
                throw new tpy();
            }
            trq trqVar2 = (trq) obj;
            trqVar2.e(tsa.c(iA, 5), Integer.valueOf(tooVar.e()));
            return true;
        }
        trq trqVar3 = new trq();
        int iC = tsa.c(iA, 4);
        int i3 = i + 1;
        if (i3 >= a) {
            throw new tpz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (tooVar.c() != Integer.MAX_VALUE && a(trqVar3, tooVar, i3)) {
        }
        if (iC != tooVar.b) {
            throw new tpz("Protocol message end-group tag did not match expected tag.");
        }
        trqVar3.d();
        ((trq) obj).e(tsa.c(iA, 3), trqVar3);
        return true;
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        trq trqVarF = f(obj);
        if (trqVarF != trq.a) {
            return trqVarF;
        }
        trq trqVar = new trq();
        g(obj, trqVar);
        return trqVar;
    }

    public final /* bridge */ /* synthetic */ void c(Object obj, int i, toj tojVar) {
        ((trq) obj).e(tsa.c(i, 2), tojVar);
    }

    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((trq) obj).e(tsa.c(i, 0), Long.valueOf(j));
    }

    public final void e(Object obj) {
        f(obj).d();
    }
}
