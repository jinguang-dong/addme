package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cca extends ujq implements uiu {
    private final /* synthetic */ int c;
    public static final cca b = new cca(1);
    public static final cca a = new cca(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cca(int i) {
        super(2);
        this.c = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c == 0) {
            cbn cbnVar = ((cbr) obj).c;
            cbz cbzVar = cbu.s;
            return Integer.valueOf(Float.compare(((Number) cbnVar.c(cbzVar, bre.e)).floatValue(), ((Number) ((cbr) obj2).c.c(cbzVar, bre.f)).floatValue()));
        }
        String str = (String) obj;
        bii biiVar = (bii) obj2;
        if (str.length() == 0) {
            return biiVar.toString();
        }
        return str + ", " + biiVar;
    }
}
