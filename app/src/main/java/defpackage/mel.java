package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mel extends mex {
    private static mel a;

    public mel(long j, pql pqlVar) {
        super(pqlVar, j, mek.values());
    }

    public static synchronized mel d() {
        mel melVar;
        melVar = a;
        melVar.getClass();
        return melVar;
    }

    public static synchronized void e(long j) {
        rnt.B(a == null, "CameraAppTiming shouldn't have been set before.");
        a = new mel(j, new pql());
    }

    public final synchronized long a() {
        long jI;
        mek mekVar = mek.CAMERA_IMAGE_ACTIVITY_ONCREATE_START;
        jI = i(mekVar);
        this.n[mekVar.ordinal()] = -1;
        return jI;
    }
}
