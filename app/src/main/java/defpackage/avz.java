package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class avz extends ujn implements uiu {
    public static final avz a = new avz();

    public avz() {
        super(2, ukj.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
