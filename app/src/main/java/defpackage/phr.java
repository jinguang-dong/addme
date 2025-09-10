package defpackage;

import android.media.Image;
import android.util.Log;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phr implements pof {
    final /* synthetic */ phj a;
    final /* synthetic */ pmv b;

    public phr(phj phjVar, pmv pmvVar) {
        this.a = phjVar;
        this.b = pmvVar;
    }

    @Override // defpackage.pof
    public final /* bridge */ /* synthetic */ void a(Object obj) throws pco {
        if (obj == null) {
            Log.w("CPRP", "Unable to submit the reprocessing request. Final ownership lost.");
            Iterator it = this.a.d.iterator();
            while (it.hasNext()) {
                ((ojl) it.next()).dH(null);
            }
            return;
        }
        Image image = (Image) obj;
        image.getFormat();
        image.getWidth();
        image.getHeight();
        image.getTimestamp();
        this.b.i(ske.bj(this.a));
    }
}
