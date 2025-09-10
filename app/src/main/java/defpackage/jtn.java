package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jtn {
    private static final sgv a = sgv.g("jtn");

    public static void a(lss lssVar, uh uhVar) {
        if (lssVar == null) {
            ((sgt) a.c().M(3066)).s("No active capture session to interrupt.");
        } else {
            if (!((Boolean) ((ovx) uhVar.a).d).booleanValue()) {
                throw new IllegalStateException("Capture is not on-going, hence cannot interrupt");
            }
            lssVar.I();
        }
    }
}
