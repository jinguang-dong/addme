package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eiy implements eis {
    public final String a;
    public final eif b;
    public final eif c;
    public final eio d;
    public final boolean e;

    public eiy(String str, eif eifVar, eif eifVar2, eio eioVar, boolean z) {
        this.a = str;
        this.b = eifVar;
        this.c = eifVar2;
        this.d = eioVar;
        this.e = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egt(efsVar, ejhVar, this);
    }
}
