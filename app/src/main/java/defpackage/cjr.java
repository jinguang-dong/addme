package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cjr extends cjn {
    public cjn[] ar = new cjn[4];
    public int as = 0;

    public final void T(ArrayList arrayList, int i, ckg ckgVar) {
        for (int i2 = 0; i2 < this.as; i2++) {
            ckgVar.d(this.ar[i2]);
        }
        for (int i3 = 0; i3 < this.as; i3++) {
            chx.d(this.ar[i3], i, arrayList, ckgVar);
        }
    }
}
