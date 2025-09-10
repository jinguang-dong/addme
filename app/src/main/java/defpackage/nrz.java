package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nrz implements uiq {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ nrz(nsk nskVar, boolean z, int i) {
        this.c = i;
        this.b = nskVar;
        this.a = z;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.c != 0) {
            cbn cbnVar = (cbn) obj;
            cbnVar.getClass();
            cbw.h(cbnVar, this.a);
            cbw.d(cbnVar, (String) this.b);
            return ufg.a;
        }
        cbn cbnVar2 = (cbn) obj;
        cbnVar2.getClass();
        if (this.b != nsk.a) {
            cbw.h(cbnVar2, this.a);
        }
        return ufg.a;
    }

    public /* synthetic */ nrz(boolean z, String str, int i) {
        this.c = i;
        this.a = z;
        this.b = str;
    }
}
