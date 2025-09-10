package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aop implements bbo {
    private final azr a;
    private int b;

    public aop(int i) {
        this.a = new azz(byi.ap(i), bap.c);
        this.b = i;
    }

    @Override // defpackage.bbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ukv a() {
        return (ukv) this.a.a();
    }

    public final void c(int i) {
        if (i != this.b) {
            this.b = i;
            this.a.b(byi.ap(i));
        }
    }
}
