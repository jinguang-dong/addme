package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class bqx extends ujn implements uiu {
    public static final bqx a = new bqx();

    public bqx() {
        super(2, ukj.class, "max", "max(II)I", 1);
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
