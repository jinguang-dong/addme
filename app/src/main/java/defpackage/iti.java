package defpackage;

import android.os.Trace;
import com.google.android.apps.camera.async.tt.CpuSets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iti implements paq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ iti(int i, jal jalVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = jalVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        int i = this.c;
        if (i == 0) {
            ((itl) this.b).k(this.a);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                ((nap) this.b).a.setImportantForAccessibility(this.a);
                return;
            } else {
                ((kqy) this.b).d.setImportantForAccessibility(this.a);
                return;
            }
        }
        jal jalVar = (jal) this.b;
        rnt.s(jalVar.a != 0);
        long j = jalVar.a;
        jalVar.a = 0L;
        CpuSets.nativeRestoreCpuSet(this.a, j);
        Trace.endSection();
    }

    public /* synthetic */ iti(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
