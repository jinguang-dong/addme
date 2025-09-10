package defpackage;

import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffj implements pau {
    final /* synthetic */ pjp a;
    final /* synthetic */ ffm b;
    final /* synthetic */ AmbientDelegate c;

    public ffj(pjp pjpVar, ffm ffmVar, AmbientDelegate ambientDelegate) {
        this.a = pjpVar;
        this.b = ffmVar;
        this.c = ambientDelegate;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.g().iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.d((pjr) it.next()));
        }
        ggg gggVar = (ggg) this.c.b;
        gggVar.d();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ffl) it2.next()).a(gggVar.e());
        }
        gzi gziVar = gyg.a;
    }
}
