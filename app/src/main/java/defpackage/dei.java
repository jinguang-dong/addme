package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dei {
    public static final /* synthetic */ int a = 0;
    private static final ThreadLocal b = new ThreadLocal();

    public static final Object a(dco dcoVar, boolean z, boolean z2, uiq uiqVar) {
        dcoVar.j();
        dcoVar.k();
        uhf uhfVar = (uhf) b.get();
        if (uhfVar == null) {
            uhfVar = uhg.a;
        }
        return cwy.g(new ded(uhfVar, dcoVar, z2, z, uiqVar, null));
    }
}
