package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hmw implements hmr {
    private final /* synthetic */ int a;

    @Override // defpackage.hmr
    public final boolean a(hms hmsVar) {
        if (this.a != 0) {
            return false;
        }
        synchronized (hmsVar.a) {
            hmsVar.c = 0;
        }
        return true;
    }
}
