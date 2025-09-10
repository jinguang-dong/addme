package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfu implements fyw {
    private final hbj a;
    private final cxb b;

    public gfu(cxb cxbVar, hbj hbjVar) {
        this.b = cxbVar;
        this.a = hbjVar;
    }

    @Override // defpackage.fyw
    public final nkw a() {
        return nkw.VIDEO_INTENT;
    }

    @Override // defpackage.fyw
    public final rwc b() {
        Intent intentG = this.b.g();
        return (intentG != null && fdo.g(intentG) && fdo.i(intentG)) ? rwc.j(pka.FRONT) : rvk.a;
    }

    @Override // defpackage.fyw
    public final boolean c() {
        return this.a.p(gym.ac);
    }

    @Override // defpackage.fyw
    public final boolean d() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fyw
    public final boolean f() {
        return true;
    }

    @Override // defpackage.fyw
    public final boolean g() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean h() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean i() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean j() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean k() {
        return this.a.p(gym.Q);
    }

    @Override // defpackage.fyw
    public final boolean l() {
        return true;
    }

    @Override // defpackage.fyw
    public final boolean m() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean n() {
        Intent intentG = this.b.g();
        if (intentG == null) {
            return false;
        }
        return intentG.getBooleanExtra("include_location_in_exif", false);
    }

    @Override // defpackage.fyw
    public final boolean o() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean p() {
        return false;
    }
}
