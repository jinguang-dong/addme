package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bre extends ujq implements uif {
    private final /* synthetic */ int h;
    public static final bre g = new bre(6);
    public static final bre f = new bre(5);
    public static final bre e = new bre(4);
    public static final bre d = new bre(3);
    public static final bre c = new bre(2);
    public static final bre b = new bre(1);
    public static final bre a = new bre(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bre(int i) {
        super(0);
        this.h = i;
    }

    @Override // defpackage.uif
    public final /* synthetic */ Object a() {
        int i = this.h;
        if (i != 0) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? a.af() : Float.valueOf(0.0f) : Float.valueOf(0.0f) : a.af() : a.af() : a.af();
        }
        return null;
    }
}
