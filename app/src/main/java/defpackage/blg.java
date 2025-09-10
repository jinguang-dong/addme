package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blg extends blh {
    public final bkh a;
    public final bkn b;

    public blg(bkh bkhVar) {
        this.a = bkhVar;
        long j = bkhVar.e;
        bkn bknVar = null;
        if ((j >>> 32) != (4294967295L & j) || j != bkhVar.f || j != bkhVar.g || j != bkhVar.h) {
            bkn bknVar2 = new bkn((byte[]) null);
            blb.i(bknVar2, bkhVar);
            bknVar = bknVar2;
        }
        this.b = bknVar;
    }

    @Override // defpackage.blh
    public final bkg a() {
        bkh bkhVar = this.a;
        return new bkg(bkhVar.a, bkhVar.b, bkhVar.c, bkhVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blg) && a.ao(this.a, ((blg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
