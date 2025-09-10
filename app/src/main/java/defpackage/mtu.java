package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtu implements ezr {
    public final /* synthetic */ mtv a;
    private final /* synthetic */ int b;

    public mtu(mtv mtvVar, int i) {
        this.b = i;
        this.a = mtvVar;
    }

    @Override // defpackage.ezr
    public final void k(ess essVar) {
        int i = this.b;
        if (i == 0) {
            mtv mtvVar = this.a;
            mtvVar.b.a.setOnClickListener(new mlk(this, 7));
            mtvVar.c();
        } else {
            if (i == 1) {
                this.a.b.a.setImportantForAccessibility(2);
                return;
            }
            mtv mtvVar2 = this.a;
            mtvVar2.b.a.setOnClickListener(new eor(3));
            mtvVar2.c();
        }
    }

    @Override // defpackage.ezr
    public final /* synthetic */ void m(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.a();
        } else if (i != 1) {
            this.a.a();
        } else {
            this.a.a();
        }
    }
}
