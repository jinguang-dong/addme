package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.ar.core.R;
import j$.util.Comparator$CC;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fld implements fko {
    public static final float[] a = {0.2f, 0.4f, 2.0f, 1.5f};
    public static final float b = (float) (1.0d / Math.sqrt(3.0d));
    public final qko c;
    public final float[] d = new float[16];
    public final float[] e = new float[16];
    public final float[] f = new float[4];
    public final float[] g = new float[3];
    public final qkl h;
    public final obu i;
    private final owf j;

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, qin] */
    public fld(qin qinVar, fkw fkwVar, owf owfVar) {
        obu obuVar = (obu) fkwVar.a(qinVar);
        this.i = obuVar;
        this.j = owfVar;
        this.h = obuVar.t(R.raw.plane_vert, R.raw.plane_frag);
        try {
            this.c = qko.d(obuVar.b, BitmapFactory.decodeStream(((Context) obuVar.a).getAssets().open("trigrid.png")), 33648);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.fko
    public final void a(fon fonVar, tfn tfnVar, float[] fArr, qjn qjnVar, qim qimVar) {
        foy foyVar = (foy) ((Optional) this.j.dL()).orElse(null);
        if (foyVar == null) {
            return;
        }
        sbp sbpVar = (sbp) ezh.k(new foj((Object) foyVar, (Object) fnm.class, 8));
        new smt(smz.n(sbpVar), new fik(13), new fiy(fonVar, 4)).h(new smq(new fla(1), 0)).i(new fla(0)).l(Comparator$CC.reverseOrder()).o().forEach(new flb(this, fArr, qjnVar, qimVar, 0));
    }

    @Override // defpackage.fko, defpackage.paq, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
