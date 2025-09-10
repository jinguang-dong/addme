package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhe implements ayw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bhe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ayw
    public final void a() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ayg aygVar = (ayg) obj;
            aygVar.l--;
        } else {
            bhf bhfVar = (bhf) obj;
            bhfVar.f--;
        }
    }

    @Override // defpackage.ayw
    public final void b() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((ayg) obj).l++;
        } else {
            ((bhf) obj).f++;
        }
    }
}
