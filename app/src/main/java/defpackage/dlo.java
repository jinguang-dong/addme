package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dlo implements uif {
    public final /* synthetic */ bbo a;
    public final /* synthetic */ dme b;
    public final /* synthetic */ boolean c;
    private final /* synthetic */ int d;

    public /* synthetic */ dlo(bbo bboVar, dme dmeVar, boolean z, int i) {
        this.d = i;
        this.a = bboVar;
        this.b = dmeVar;
        this.c = z;
    }

    @Override // defpackage.uif
    public final Object a() {
        if (this.d != 0) {
            ebn ebnVar = (ebn) this.a.a();
            dme dmeVar = this.b;
            return new dlm(ebnVar, dmeVar, new tym((ukv) dmeVar.e.a(), ebnVar), this.c);
        }
        boolean z = this.c;
        return new dlo(this.a, this.b, z, 1);
    }
}
