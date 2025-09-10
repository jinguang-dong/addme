package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class htz implements uiq {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ htz(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        gos gosVar;
        int i = this.b;
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
            layoutParams.getClass();
            layoutParams.height = this.a;
            return ufg.a;
        }
        if (i != 1) {
            if (i == 2) {
                ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) obj;
                layoutParams2.getClass();
                layoutParams2.height = this.a;
                return ufg.a;
            }
            if (i != 3) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.a + ".");
            }
            ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) obj;
            layoutParams3.getClass();
            int i2 = this.a;
            layoutParams3.height = i2;
            layoutParams3.width = (i2 * 3) / 4;
            return ufg.a;
        }
        ddw ddwVarA = ((ddo) obj).a("SELECT * FROM EnumerationErrorCounts WHERE errorCode = ?");
        try {
            ddwVarA.e(1, this.a);
            int iW = cgh.w(ddwVarA, "errorCode");
            int iW2 = cgh.w(ddwVarA, "failuresBeforeReboot");
            int iW3 = cgh.w(ddwVarA, HHdu.oGiY);
            int iW4 = cgh.w(ddwVarA, "rebootCount");
            int iW5 = cgh.w(ddwVarA, "lastFailureTimestamp");
            if (ddwVarA.j()) {
                gosVar = new gos((int) ddwVarA.b(iW));
                gosVar.b = (int) ddwVarA.b(iW2);
                gosVar.c = (int) ddwVarA.b(iW3);
                gosVar.d = (int) ddwVarA.b(iW4);
                gosVar.e = ddwVarA.b(iW5);
            } else {
                gosVar = null;
            }
            return gosVar;
        } finally {
            ddwVarA.close();
        }
    }
}
