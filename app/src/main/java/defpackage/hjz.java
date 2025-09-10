package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hjz implements rvu {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ hjz(boolean z, boolean z2, int i) {
        this.c = i;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        int i = this.c;
        if (i == 0) {
            return Boolean.valueOf(this.a && this.b && ((ltr) obj) != ltr.OFF);
        }
        if (i != 1) {
            return Boolean.valueOf(this.a && this.b && ((ltr) obj) != ltr.OFF);
        }
        Integer num = (Integer) obj;
        return !this.a ? ltr.OFF : (ltr.a(num.intValue()) == ltr.OFF || !this.b) ? ltr.a(num.intValue()) : ltr.DEBUG_MAX;
    }
}
