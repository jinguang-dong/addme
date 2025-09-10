package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lyd implements lyo {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lyd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, pjo] */
    @Override // defpackage.lyo
    public final void a(Object obj) {
        if (this.b == 0) {
            ((lyy) obj).a(this.a);
            return;
        }
        float[] fArr = (float[]) this.a;
        new Point((int) fArr[0], (int) fArr[1]);
        lyy lyyVar = (lyy) obj;
        rnt.L(lyyVar.d);
        if (lyyVar.e) {
            lzh lzhVar = lyyVar.a;
            if (lzhVar instanceof lzf) {
                ((lzf) lzhVar).d();
            }
        }
    }
}
