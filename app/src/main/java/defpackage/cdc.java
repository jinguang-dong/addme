package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdc {
    public static final long a = cid.a;

    public static final cdb a(cdb cdbVar, int i, int i2, long j, chi chiVar, cde cdeVar, chb chbVar, int i3, int i4, chj chjVar) {
        long j2;
        long j3;
        int i5 = i;
        int i6 = i2;
        chi chiVar2 = chiVar;
        chb chbVar2 = chbVar;
        int i7 = i3;
        int i8 = i4;
        chj chjVar2 = chjVar;
        if (a.p(i5, Integer.MIN_VALUE) || a.p(i5, cdbVar.a)) {
            if (cid.a(j) == 0) {
                j2 = 0;
                j3 = j;
            } else {
                j2 = 0;
                j3 = j;
                if (a.q(j3, cdbVar.c)) {
                }
            }
            if ((chiVar2 == null || a.ao(chiVar2, cdbVar.d)) && ((a.p(i6, Integer.MIN_VALUE) || a.p(i6, cdbVar.b)) && ((cdeVar == null || a.ao(cdeVar, cdbVar.e)) && ((chbVar2 == null || a.ao(chbVar2, cdbVar.f)) && ((a.p(i7, 0) || a.p(i7, cdbVar.g)) && ((a.p(i8, Integer.MIN_VALUE) || a.p(i8, cdbVar.h)) && (chjVar2 == null || a.ao(chjVar2, cdbVar.i)))))))) {
                return cdbVar;
            }
        } else {
            j2 = 0;
            j3 = j;
        }
        if (cid.a(j3) == j2) {
            j3 = cdbVar.c;
        }
        if (chiVar2 == null) {
            chiVar2 = cdbVar.d;
        }
        if (a.p(i5, Integer.MIN_VALUE)) {
            i5 = cdbVar.a;
        }
        if (a.p(i6, Integer.MIN_VALUE)) {
            i6 = cdbVar.b;
        }
        cde cdeVar2 = cdbVar.e;
        if (cdeVar2 == null || cdeVar != null) {
            cdeVar2 = cdeVar;
        }
        if (chbVar2 == null) {
            chbVar2 = cdbVar.f;
        }
        if (a.p(i7, 0)) {
            i7 = cdbVar.g;
        }
        if (a.p(i8, Integer.MIN_VALUE)) {
            i8 = cdbVar.h;
        }
        if (chjVar2 == null) {
            chjVar2 = cdbVar.i;
        }
        return new cdb(i5, i6, j3, chiVar2, cdeVar2, chbVar2, i7, i8, chjVar2);
    }
}
