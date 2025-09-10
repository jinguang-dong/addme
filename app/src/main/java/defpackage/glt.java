package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glt implements mng {
    public final out a;
    public final gnt b;
    public final owf c;
    public final owf d;
    public final owf e;
    public nan f;
    public boolean g = false;
    public final imi h;
    private final Timer i;
    private final Context j;
    private final mni k;
    private paq l;

    public glt(imi imiVar, Context context, out outVar, Timer timer, mni mniVar, gnt gntVar, owq owqVar, owf owfVar, owf owfVar2) {
        this.h = imiVar;
        this.j = context;
        this.a = outVar;
        this.i = timer;
        this.k = mniVar;
        this.b = gntVar;
        this.c = owqVar;
        this.d = owfVar;
        this.e = owfVar2;
    }

    public final void a() {
        this.g = false;
        nan nanVar = this.f;
        nanVar.getClass();
        this.h.f(nanVar);
    }

    public final void b() {
        gls glsVar = new gls(this);
        this.g = true;
        this.i.schedule(glsVar, 500L);
    }

    public final void c(nkw nkwVar) {
        nkw nkwVar2 = nkw.VIDEO;
        nao naoVar = new nao();
        Context context = this.j;
        naoVar.e = context.getResources().getString(nkwVar == nkwVar2 ? R.string.vid_chip_takes_time_to_process_p11 : R.string.vid_chip_takes_time_to_process_vns);
        naoVar.h = context;
        naoVar.j = 5;
        naoVar.b = 5000;
        this.f = naoVar.a();
        this.k.f(this);
        this.l = this.d.dK(new gej(this, 16), this.a);
    }

    public final void d() {
        this.k.i(this);
        this.l.close();
        a();
    }

    @Override // defpackage.mng
    public final void e(int i) {
        if (i == 36) {
            b();
        }
    }

    @Override // defpackage.mng
    public final void eE(int i) {
        a();
    }
}
