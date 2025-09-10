package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffm implements fes {
    public final owq a = new ovx(0);
    public final owq b = new ovx(false);
    public final hbj c;
    public final mwq d;
    private final owf e;

    public ffm(mwq mwqVar, hbj hbjVar, luj lujVar) {
        this.d = mwqVar;
        this.c = hbjVar;
        this.e = lujVar.a(luf.u);
    }

    public static String e(pjr pjrVar, String str) {
        String str2 = pjrVar.a;
        if (str != null) {
            str2 = String.format("%s-%s", str2, str);
        }
        return "pref_camera_dirty_lens_history_key".concat(String.valueOf(str2));
    }

    @Override // defpackage.fes
    public final owf a() {
        return owl.c(this.e);
    }

    @Override // defpackage.fes
    public final owq b() {
        return this.a;
    }

    @Override // defpackage.fes
    public final boolean c() {
        throw null;
    }

    final ffl d(pjr pjrVar) {
        String strE = e(pjrVar, null);
        return new ffl(strE, this.d.o(strE, ""), this.c);
    }
}
