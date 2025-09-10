package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eiw implements eis {
    public final String a;
    public final eif b;
    public final eip c;
    public final eif d;
    public final eif e;
    public final eif f;
    public final eif g;
    public final eif h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public eiw(String str, int i, eif eifVar, eip eipVar, eif eifVar2, eif eifVar3, eif eifVar4, eif eifVar5, eif eifVar6, boolean z, boolean z2) {
        this.a = str;
        this.k = i;
        this.b = eifVar;
        this.c = eipVar;
        this.d = eifVar2;
        this.e = eifVar3;
        this.f = eifVar4;
        this.g = eifVar5;
        this.h = eifVar6;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egr(efsVar, ejhVar, this);
    }
}
