package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avr implements uif {
    private final /* synthetic */ int f;
    public static final avr e = new avr(4);
    public static final avr d = new avr(3);
    public static final avr c = new avr(2);
    public static final avr b = new avr(1);
    public static final avr a = new avr(0);

    public avr(int i) {
        this.f = i;
    }

    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        int i = this.f;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new bkv(bkv.b) : new bkv(bkv.a) : new bkv(bkv.a) : new bkv(bkv.a) : new bkv(bkv.a);
    }
}
