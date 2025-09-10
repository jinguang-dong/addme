package defpackage;

import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qok implements qol {
    private final boolean a;
    private final Instant b;
    private final /* synthetic */ int c;
    private final tph d;

    private qok(tph tphVar, boolean z, Instant instant, int i) {
        this.c = i;
        this.d = tphVar;
        this.a = z;
        this.b = instant;
    }

    public static qok c(vaa vaaVar) {
        Instant instant = Instant.EPOCH;
        trn trnVar = vaaVar.c;
        if (trnVar == null) {
            trnVar = trn.a;
        }
        Instant instantP = thu.p(trnVar);
        boolean z = false;
        for (uzz uzzVar : vaaVar.b) {
            tou touVar = uzzVar.c;
            if (touVar == null) {
                touVar = tou.a;
            }
            Instant instantPlus = instantP.plus(thu.o(touVar));
            tou touVar2 = uzzVar.d;
            if (touVar2 == null) {
                touVar2 = tou.a;
            }
            Instant instantPlus2 = instantPlus.plus(thu.o(touVar2));
            if (true == instantPlus2.isAfter(instant)) {
                instant = instantPlus2;
            }
            z |= !((uzzVar.b & 16) != 0);
        }
        return new qok(vaaVar, z, instant, 0);
    }

    public static qok d(uys uysVar) {
        Instant instant = Instant.EPOCH;
        trn trnVar = uysVar.b;
        if (trnVar == null) {
            trnVar = trn.a;
        }
        Instant instantP = thu.p(trnVar);
        HashSet hashSet = new HashSet();
        for (uyw uywVar : uysVar.c) {
            tou touVar = uywVar.d;
            if (touVar == null) {
                touVar = tou.a;
            }
            Instant instantPlus = instantP.plus(thu.o(touVar));
            if (true == instantPlus.isAfter(instant)) {
                instant = instantPlus;
            }
            int i = uywVar.b;
            int i2 = i != 0 ? i != 3 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1 : 4;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(Long.valueOf(uywVar.c));
            } else if (i3 == 1) {
                hashSet.remove(Long.valueOf(uywVar.c));
            }
        }
        return new qok(uysVar, !hashSet.isEmpty(), instant, 1);
    }

    @Override // defpackage.qol
    public final long a() {
        int iK;
        int iK2;
        if (this.c != 0) {
            tph tphVar = this.d;
            if (tphVar.C()) {
                iK2 = tphVar.k(null);
                if (iK2 < 0) {
                    throw new IllegalStateException(a.bv(iK2, "serialized size must be non-negative, was "));
                }
            } else {
                int iK3 = tphVar.aV & Integer.MAX_VALUE;
                if (iK3 == Integer.MAX_VALUE) {
                    iK3 = tphVar.k(null);
                    if (iK3 < 0) {
                        throw new IllegalStateException(a.bv(iK3, "serialized size must be non-negative, was "));
                    }
                    tphVar.aV = (Integer.MIN_VALUE & tphVar.aV) | iK3;
                }
                iK2 = iK3;
            }
            return iK2;
        }
        tph tphVar2 = this.d;
        if (tphVar2.C()) {
            iK = tphVar2.k(null);
            if (iK < 0) {
                throw new IllegalStateException(a.bv(iK, "serialized size must be non-negative, was "));
            }
        } else {
            int iK4 = tphVar2.aV & Integer.MAX_VALUE;
            if (iK4 == Integer.MAX_VALUE) {
                iK4 = tphVar2.k(null);
                if (iK4 < 0) {
                    throw new IllegalStateException(a.bv(iK4, "serialized size must be non-negative, was "));
                }
                tphVar2.aV = (Integer.MIN_VALUE & tphVar2.aV) | iK4;
            }
            iK = iK4;
        }
        return iK;
    }

    @Override // defpackage.qol
    public final /* synthetic */ Object b() {
        int i = this.c;
        return this.d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.c != 0) {
            qok qokVar = (qok) obj;
            boolean z = qokVar.a;
            boolean z2 = this.a;
            return z2 != z ? !z2 ? 1 : -1 : qokVar.b.compareTo(this.b);
        }
        qok qokVar2 = (qok) obj;
        boolean z3 = qokVar2.a;
        boolean z4 = this.a;
        return z4 != z3 ? !z4 ? 1 : -1 : qokVar2.b.compareTo(this.b);
    }
}
