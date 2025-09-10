package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfr implements fyw {
    private final hbj a;
    private final /* synthetic */ int b;

    public gfr(hbj hbjVar, int i) {
        this.b = i;
        this.a = hbjVar;
    }

    @Override // defpackage.fyw
    public final nkw a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? nkw.AMBER : nkw.VIDEO_NIGHT_SIGHT : nkw.VIDEO : nkw.ROOSTER : nkw.SLOW_MOTION;
    }

    @Override // defpackage.fyw
    public final rwc b() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? rwc.j(pka.BACK) : rwc.j(pka.BACK) : rvk.a : this.a.p(gym.U) ? rvk.a : rwc.j(pka.BACK) : rwc.j(pka.BACK);
    }

    @Override // defpackage.fyw
    public final boolean c() {
        int i = this.b;
        if (i == 0) {
            return this.a.p(gym.ac);
        }
        if (i == 1) {
            return this.a.p(gym.ac);
        }
        if (i == 2) {
            return this.a.p(gym.ac);
        }
        hbj hbjVar = this.a;
        return i != 3 ? hbjVar.p(gym.ac) : hbjVar.p(gym.ac);
    }

    @Override // defpackage.fyw
    public final boolean d() {
        int i = this.b;
        return (i == 0 || i == 1) ? false : true;
    }

    @Override // defpackage.fyw
    public final boolean e() {
        int i = this.b;
        if (i == 0) {
            return this.a.p(gym.p);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.a.p(gym.q);
        }
        if (i != 3) {
            return this.a.p(gym.q);
        }
        return true;
    }

    @Override // defpackage.fyw
    public final boolean f() {
        return this.b == 0;
    }

    @Override // defpackage.fyw
    public final boolean g() {
        int i = this.b;
        if (i == 2) {
            hbj hbjVar = this.a;
            return hbjVar.p(haq.a) && hbjVar.p(gym.aa);
        }
        if (i != 3) {
            return false;
        }
        hbj hbjVar2 = this.a;
        return hbjVar2.p(haq.a) && hbjVar2.p(gym.aa);
    }

    @Override // defpackage.fyw
    public final boolean h() {
        return this.b == 2;
    }

    @Override // defpackage.fyw
    public final boolean i() {
        if (this.b != 2) {
            return false;
        }
        return this.a.p(gym.Z);
    }

    @Override // defpackage.fyw
    public final boolean j() {
        return true;
    }

    @Override // defpackage.fyw
    public final boolean k() {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return this.a.p(gym.Q);
        }
        if (i == 2) {
            return this.a.p(gym.Q);
        }
        hbj hbjVar = this.a;
        return i != 3 ? hbjVar.p(gym.Q) : hbjVar.p(gym.Q);
    }

    @Override // defpackage.fyw
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fyw
    public final boolean m() {
        int i = this.b;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return this.a.p(gym.W);
        }
        if (i == 2) {
            return this.a.p(gym.W);
        }
        hbj hbjVar = this.a;
        return i != 3 ? hbjVar.p(gym.W) : hbjVar.p(gym.W);
    }

    @Override // defpackage.fyw
    public final boolean n() {
        return true;
    }

    @Override // defpackage.fyw
    public final boolean o() {
        return true;
    }

    @Override // defpackage.fyw
    public final boolean p() {
        return this.b != 0;
    }
}
