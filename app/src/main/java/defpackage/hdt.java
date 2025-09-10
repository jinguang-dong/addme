package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hdt implements paq {
    public static final /* synthetic */ int e = 0;
    private static final scn f = scn.L(ltf.NORMAL, ltf.HDR_PLUS, ltf.HDR_PLUS_AUTO, ltf.IMAGE_INTENT, ltf.LONG_SHOT, ltf.AUTO_LONG_SHOT, ltf.TAXI, ltf.SQUAD, ltf.SQUAD_BURST, ltf.SQUAD_PRIMARY);
    public final boolean a;
    public boolean b;
    public final hbj c;
    public final cxb d;

    public hdt(hbj hbjVar, cxb cxbVar, ltf ltfVar) {
        this.c = hbjVar;
        this.d = cxbVar;
        this.a = f.contains(ltfVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b = true;
    }
}
