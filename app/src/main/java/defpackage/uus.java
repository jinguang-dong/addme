package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uus extends usx implements utj {
    public uus(int i) {
        super(1, Integer.MAX_VALUE, 2);
        d(Integer.valueOf(i));
    }

    @Override // defpackage.utj
    public final /* bridge */ /* synthetic */ Object c() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) g()).intValue());
        }
        return numValueOf;
    }

    public final void n(int i) {
        synchronized (this) {
            d(Integer.valueOf(((Number) g()).intValue() + i));
        }
    }
}
