package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ubb implements uba {
    public static final qzh a;
    public static final qzh b;
    public static final qzh c;

    static {
        qzn qznVar = uay.a;
        a = qzi.c("CollectionBasisVerifierFeatures__enable_cbv_v2", false, "com.google.android.libraries.consentverifier", qznVar);
        b = qzi.c("CollectionBasisVerifierFeatures__enable_google_signature_check", false, "com.google.android.libraries.consentverifier", qznVar);
        c = qzi.c("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false, "com.google.android.libraries.consentverifier", qznVar);
    }

    @Override // defpackage.uba
    public final boolean a() {
        return ((Boolean) a.fr()).booleanValue();
    }

    @Override // defpackage.uba
    public final boolean b() {
        return ((Boolean) b.fr()).booleanValue();
    }

    @Override // defpackage.uba
    public final void c() {
        ((Boolean) c.fr()).booleanValue();
    }
}
