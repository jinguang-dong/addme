package defpackage;

import android.graphics.Bitmap;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkz implements fko {
    public static final qkt a = qkt.b(0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    public final Map b = new HashMap();
    public final float[] c = new float[16];
    public final qkl d;
    public final obu e;

    public fkz(qin qinVar, fkw fkwVar) {
        obu obuVar = (obu) fkwVar.a(qinVar);
        this.e = obuVar;
        this.d = obuVar.t(R.raw.bitmap_vert, R.raw.bitmap_frag);
    }

    @Override // defpackage.fko
    public final void a(fon fonVar, tfn tfnVar, float[] fArr, qjn qjnVar, qim qimVar) {
        scn scnVarG;
        scn scnVar = (scn) Collection.EL.stream(tfnVar.a).map(new teb(this, fArr, qjnVar, qimVar, 1)).collect(ryv.b);
        scl sclVar = new scl();
        synchronized (this) {
            Map map = this.b;
            Set setKeySet = map.keySet();
            setKeySet.getClass();
            scnVar.getClass();
            sfi sfiVar = new sfi(setKeySet, scnVar);
            int iA = sfiVar.a();
            if (iA == 0) {
                scnVarG = sfd.a;
            } else {
                scl sclVarD = scn.D(iA);
                sgj it = sfiVar.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    sclVarD.d(next);
                }
                scnVarG = sclVarD.g();
            }
            sgj sgjVarListIterator = scnVarG.listIterator();
            while (sgjVarListIterator.hasNext()) {
                fky fkyVar = (fky) map.remove((Bitmap) sgjVarListIterator.next());
                fkyVar.getClass();
                sclVar.d(fkyVar);
            }
        }
        Iterable$EL.forEach(sclVar.g(), new fkj(2));
    }

    @Override // defpackage.fko, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        scn scnVarF;
        synchronized (this) {
            Map map = this.b;
            scnVarF = scn.F(map.values());
            map.clear();
        }
        Iterable$EL.forEach(scnVarF, new fkj(2));
    }
}
