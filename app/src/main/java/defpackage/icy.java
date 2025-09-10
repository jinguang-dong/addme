package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class icy {
    private static final sgv a = sgv.g("icy");

    public static boolean a(hbj hbjVar) {
        gzr gzrVar;
        try {
            gzrVar = (gzr) hbjVar.a(gzs.a).map(new hci(5)).orElseThrow();
        } catch (RuntimeException e) {
            ((sgt) a.c().M(1865)).v("In getFlagValue caught %s", e);
            gzrVar = gzr.OFF;
        }
        return gzrVar != gzr.OFF;
    }
}
