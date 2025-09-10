package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejf implements eis {
    public final eif a;
    public final eif b;
    public final eif c;
    public final boolean d;
    public final int e;

    public ejf(int i, eif eifVar, eif eifVar2, eif eifVar3, boolean z) {
        this.e = i;
        this.a = eifVar;
        this.b = eifVar2;
        this.c = eifVar3;
        this.d = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egx(ejhVar, this);
    }

    public final String toString() {
        eif eifVar = this.c;
        eif eifVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(eifVar2) + ", offset: " + String.valueOf(eifVar) + "}";
    }
}
