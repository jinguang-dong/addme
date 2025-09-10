package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gup {
    public static final float a = (float) Math.toRadians(15.0d);
    public static final float b = (float) Math.toRadians(15.0d);
    private static final float g = (float) Math.toRadians(15.0d);
    private static final float h = (float) Math.toRadians(15.0d);
    public final float c;
    public final float d;
    public rwc e;
    public rwc f;
    private final long i;

    static {
        Math.toRadians(20.0d);
        Math.toRadians(20.0d);
    }

    public gup(hbj hbjVar) {
        rvk rvkVar = rvk.a;
        this.e = rvkVar;
        this.f = rvkVar;
        gzg gzgVar = gyp.g;
        hbjVar.p(gzgVar);
        rnt.M(true, "camera.coach.fast_up_down and camera.coach.instant_up_down should not be enabled at the same time.");
        this.i = true != hbjVar.p(gzgVar) ? 4000L : 1000L;
        this.c = g;
        this.d = h;
    }

    final synchronized void a(float f, float f2, long j) {
        this.e = rwc.j(new lnw(f, f2));
        if (!this.f.h()) {
            final int i = 1;
            final int i2 = 0;
            this.f = rwc.j(new gvb(new gva(this) { // from class: guo
                public final /* synthetic */ gup a;

                {
                    this.a = this;
                }

                @Override // defpackage.gva
                public final boolean a() {
                    if (i != 0) {
                        gup gupVar = this.a;
                        return gupVar.e.h() && Math.abs(((lnw) gupVar.e.c()).a) < gup.a && Math.abs(((lnw) gupVar.e.c()).b) < gup.b;
                    }
                    gup gupVar2 = this.a;
                    if (!gupVar2.e.h()) {
                        return false;
                    }
                    if (Math.abs(((lnw) gupVar2.e.c()).a) <= gupVar2.c) {
                        return Math.abs(((lnw) gupVar2.e.c()).b) > gupVar2.d;
                    }
                    return true;
                }
            }, new gva(this) { // from class: guo
                public final /* synthetic */ gup a;

                {
                    this.a = this;
                }

                @Override // defpackage.gva
                public final boolean a() {
                    if (i2 != 0) {
                        gup gupVar = this.a;
                        return gupVar.e.h() && Math.abs(((lnw) gupVar.e.c()).a) < gup.a && Math.abs(((lnw) gupVar.e.c()).b) < gup.b;
                    }
                    gup gupVar2 = this.a;
                    if (!gupVar2.e.h()) {
                        return false;
                    }
                    if (Math.abs(((lnw) gupVar2.e.c()).a) <= gupVar2.c) {
                        return Math.abs(((lnw) gupVar2.e.c()).b) > gupVar2.d;
                    }
                    return true;
                }
            }, this.i));
        }
        ((gvb) this.f.c()).b(j);
    }

    public final synchronized void b() {
        rvk rvkVar = rvk.a;
        this.e = rvkVar;
        this.f = rvkVar;
    }
}
