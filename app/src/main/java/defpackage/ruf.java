package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruf {
    public final rug a;
    public final rug b;

    public ruf() {
        this.a = new rug();
        this.b = rug.b();
    }

    public final rug a() {
        return new rug(this.b);
    }

    public final String toString() {
        return "[Origin:" + this.a.toString() + ", Direction:" + this.b.toString() + "]";
    }

    public ruf(rug rugVar, rug rugVar2) {
        rug rugVar3 = new rug();
        this.a = rugVar3;
        rug rugVarB = rug.b();
        this.b = rugVarB;
        rugVar3.e(rugVar);
        rugVarB.e(rugVar2.c());
    }
}
