package defpackage;

import com.google.android.apps.camera.ui.views.ViewfinderCover;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juh {
    public int a;
    public int b;
    public int c;
    public boolean d;
    public muj e;
    private final boolean f;
    private final ngw g;
    private final out h;
    private final owf i;
    private final owf j;
    private final luj k;

    public juh(hbj hbjVar, luj lujVar, ngw ngwVar, out outVar, owf owfVar, owf owfVar2) {
        this.f = hbjVar.p(gza.b);
        this.k = lujVar;
        this.g = ngwVar;
        this.h = outVar;
        this.a = ((Integer) lujVar.b(luf.e)).intValue();
        this.b = ((Integer) lujVar.b(luf.f)).intValue();
        this.c = ((Integer) lujVar.b(luf.g)).intValue();
        this.e = (muj) owfVar.dL();
        this.i = owfVar;
        this.j = owfVar2;
        this.d = ((Boolean) ((ovx) owfVar2).d).booleanValue();
    }

    public final void a(fqf fqfVar, nkw nkwVar) {
        if (fqfVar.t) {
            ngw ngwVar = this.g;
            ((ViewfinderCover) ngwVar.e).o(nkwVar, new juc(fqfVar, 3));
        }
    }

    public final void b(fqf fqfVar, nkw nkwVar, our ourVar) {
        boolean z = true;
        if (nkwVar != nkw.VIDEO && nkwVar != nkw.VIDEO_INTENT && nkwVar != nkw.SLOW_MOTION && nkwVar != nkw.TIME_LAPSE && nkwVar != nkw.AMBER && nkwVar != nkw.ROOSTER && nkwVar != nkw.VIDEO_NIGHT_SIGHT) {
            z = false;
        }
        int i = 6;
        if (!z) {
            ourVar.d(this.k.a(luf.e).dK(new fcd(this, fqfVar, nkwVar, i), this.h));
        }
        if (this.f) {
            owf owfVar = this.i;
            gcf gcfVar = new gcf(this, fqfVar, nkwVar, i);
            out outVar = this.h;
            ourVar.d(owfVar.dK(gcfVar, outVar));
            ourVar.d(this.j.dK(new gcf(this, fqfVar, nkwVar, 7), outVar));
            if (z) {
                ourVar.d(this.k.a(luf.f).dK(new gcf(this, fqfVar, nkwVar, 8), outVar));
            } else {
                ourVar.d(this.k.a(luf.g).dK(new gcf(this, fqfVar, nkwVar, 9), outVar));
            }
        }
    }
}
