package defpackage;

import android.media.SoundPool;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mbo implements syf {
    final /* synthetic */ int[] a;
    final /* synthetic */ float b;
    final /* synthetic */ mbq c;
    final /* synthetic */ ggg d;

    public mbo(mbq mbqVar, ggg gggVar, int[] iArr, float f) {
        this.d = gggVar;
        this.a = iArr;
        this.b = f;
        this.c = mbqVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        sgt sgtVar = (sgt) ((sgt) mbq.a.b().i(th)).M(4635);
        ggg gggVar = this.d;
        sgtVar.E("Sound resource %s failed to load: %s", gggVar, th);
        Object obj = gggVar.a;
        if (obj instanceof Integer) {
            this.c.j(((Integer) obj).intValue());
        } else {
            this.c.k((String) obj);
        }
    }

    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ggg gggVar;
        mbp mbpVarL;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            sgt sgtVar = (sgt) mbq.a.b().M(4636);
            ggg gggVar2 = this.d;
            sgtVar.v("Sound resource %s failed to load.", gggVar2);
            Object obj2 = gggVar2.a;
            if (obj2 instanceof Integer) {
                this.c.j(((Integer) obj2).intValue());
                return;
            }
            mbq mbqVar = this.c;
            obj2.getClass();
            mbqVar.k((String) obj2);
            return;
        }
        mbq mbqVar2 = this.c;
        synchronized (mbqVar2.b) {
            if (!mbqVar2.d && (mbpVarL = mbqVar2.l((gggVar = this.d))) != null) {
                int[] iArr = this.a;
                SoundPool soundPoolA = mbqVar2.a();
                int i = mbpVarL.a;
                float f = this.b;
                int iPlay = soundPoolA.play(i, f, f, 0, 0, 1.0f);
                iArr[0] = iPlay;
                mbqVar2.e.add(new Pair(Integer.valueOf(iPlay), gggVar));
            }
        }
    }
}
