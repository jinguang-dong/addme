package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class gbt {
    private static final sgv a = sgv.g("gbt");
    public int c = 0;

    public static gbs e() {
        gbs gbsVar = new gbs(null);
        gbsVar.a = rvk.a;
        return gbsVar;
    }

    public abstract int a();

    public abstract gcc b();

    public abstract oxh c();

    public abstract rwc d();

    public final boolean f() {
        int i = this.c;
        boolean z = i + i >= c().l;
        if (!z) {
            ((sgt) a.c().M(693)).t("Video file too short. #Frames: %d", this.c);
        }
        return z;
    }
}
