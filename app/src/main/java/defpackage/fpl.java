package defpackage;

import android.content.Context;
import android.view.View;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpl implements jhh, jhe, jhc {
    public static final sbv a;
    public final owq b;
    private final Context c;
    private final out d;
    private final owf e;
    private final owf f;
    private final owf g;
    private final owf h;
    private nan i = null;
    private our j = new our();
    private final imi k;
    private final mwq l;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(fpa.EXCESSIVE_MOTION, Integer.valueOf(R.string.tracking_status_bad_motion));
        sbrVar.f(fpa.INSUFFICIENT_FEATURES, Integer.valueOf(R.string.tracking_status_bad_scene));
        sbrVar.f(fpa.INSUFFICIENT_LIGHT, Integer.valueOf(R.string.tracking_status_bad_lighting));
        fpa fpaVar = fpa.NOT_RELIABLE_TOO_FEW_LANDMARKS;
        Integer numValueOf = Integer.valueOf(R.string.tracking_status_not_reliable);
        sbrVar.f(fpaVar, numValueOf);
        sbrVar.f(fpa.NOT_RELIABLE_LANDMARKS_TOO_FAR, numValueOf);
        sbrVar.f(fpa.NOT_RELIABLE_MISSING_MAP, numValueOf);
        sbrVar.f(fpa.PERSISTENT_NOT_RELIABLE, Integer.valueOf(R.string.error_desc_unsupported_scene));
        sbrVar.f(fpa.UNKNOWN, Integer.valueOf(R.string.tracking_status_unknown));
        a = sbrVar.b();
    }

    public fpl(Context context, out outVar, imi imiVar, owf owfVar, owf owfVar2, owf owfVar3, owf owfVar4, owq owqVar, mwq mwqVar) {
        this.c = context;
        this.d = outVar;
        this.k = imiVar;
        this.e = owfVar;
        this.f = owfVar2;
        this.g = owfVar3;
        this.h = owfVar4;
        this.b = owqVar;
        this.l = mwqVar;
    }

    public final synchronized void a(View view) {
        this.i = new fpk(view, this.h, this.l);
    }

    public final void d(Optional optional) {
        nan nanVar = this.i;
        if (nanVar == null) {
            return;
        }
        if (optional.isEmpty()) {
            this.k.f(nanVar);
        } else {
            nanVar.l(this.c.getString(((fpj) optional.get()).a));
            this.k.a(nanVar);
        }
    }

    @Override // defpackage.jhc
    public final synchronized void ea() {
        this.j.close();
    }

    @Override // defpackage.jhe
    public final synchronized void eb() {
        our ourVar = new our();
        this.j = ourVar;
        owf owfVarA = owl.a(this.e, this.f, this.g);
        fpe fpeVar = new fpe(this, 2);
        out outVar = this.d;
        ourVar.d(owfVarA.dK(fpeVar, outVar));
        this.j.d(owb.a(this.b).dK(new fpe(this, 3), outVar));
        this.j.d(new fis(this, 6));
    }
}
