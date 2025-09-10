package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dne {
    public final dmi a = new dmi();
    private Object b;
    private dmi c;
    private final zu d;

    public dne() {
        long[] jArr = zv.a;
        this.d = new zu((byte[]) null);
    }

    public final dmi a(Object obj) {
        dmi dmiVar = this.c;
        if (this.b == obj && dmiVar != null) {
            return dmiVar;
        }
        zu zuVar = this.d;
        Object objA = zuVar.a(obj);
        if (objA == null) {
            dmi dmiVar2 = this.a;
            dmi dmiVar3 = new dmi();
            dmiVar3.a = dmiVar2.a;
            dmiVar3.b = dmiVar2.b;
            zuVar.j(obj, dmiVar3);
            objA = dmiVar3;
        }
        dmi dmiVar4 = (dmi) objA;
        this.b = obj;
        this.c = dmiVar4;
        return dmiVar4;
    }
}
